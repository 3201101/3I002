package agent.laby.interf;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

import agent.laby.ChargeurLabyrinthe;
import agent.laby.ContenuCase;
import agent.laby.Labyrinthe;

public class LabyViewer extends JFrame
{
	private static final long serialVersionUID = 1L;

	// Des constantes pour mettre sur les textes des menus
	// Il est recommandé (best practice) au maximum d'utiliser
	// des constantes plutôt que des String en litéral "Toto" enfouies dans le code.
	// private static final String XML_EXPORT_MENU = "Export Maze To XML";
	private static final String SER_EXPORT_MENU = "Sauver labyrinthe";
	private static final String SER_IMPORT_MENU = "Charger labyrinthe";

	// zone boutons
	private JPanel sidePanel;

	// Le labyrinthe sous-jacent
	private Labyrinthe laby;

	// Pour les tests getSource dans le Menu Listener : les sources d'événements menu
	private JMenuItem mi_export;
	private JMenuItem mi_import;

	// La zone montrant le labyrinthe 
	private LabyPanel centerPanel;

	// Les tailles, constantes
	private static final int COLS = 15, LIGNES = 10;

	/**
	 * Main
	 */
	public static void main(String[] args)
	{
		
	}

	/**
	 * Constructeur
	 */
	public LabyViewer(Agent a, Controleur c, int p)
	{
		// Titre de la JFrame
		super("Laby Builder");
		
		// Construire le maze
		laby = new Labyrinthe(COLS, LIGNES);

		// creer les Panel et menus
		createCenterPanel();

		// Positionner la taille de la fenetre
		setSize(800, 758);
		setResizable(false);
		// traiter le clic sur la croix
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		// rendre visible 
		setVisible(true);
	}
	
	/**
	 * Crée le MazePanel responsable d'afficher le Maze courant.
	 */
	private void createCenterPanel() {
		centerPanel = new LabyPanel(laby);
		getContentPane().add(centerPanel, BorderLayout.CENTER);

	}

	/**
	 * Classe interne pour gérer les événements menu
	 */
	private class ExportMenuListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JMenuItem item = (JMenuItem) e.getSource();
			try {
				/**
				 * Attention à la sémantique des classes internes ! mi_export
				 * est membre de la classe englobante.
				 */
				if (item == mi_export) {
					exportMazeData();
				} else if (item == mi_import) {
					chargerLabyrinthe();
				}
				// else if (item == mi_other) {
				// }
			} catch (IOException e1) {
				// une erreur "jolie"
				// Attention encore aux classes interne, on veut passer la
				// JFrame
				// i.e. le parent des JDialog en premier argument.
				// C'est la classe englobante, mais on utilise "getFrame" pour
				// la retrouver.
				JOptionPane.showInternalMessageDialog(getFrame(), e1
						.getMessage(), "Error during export ",
						JOptionPane.ERROR_MESSAGE);
				e1.printStackTrace();
			}
		}

	}

	/**
	 * Pour repasser this au contexte de la classe locale menuListener
	 * 
	 * @return this, typage relaxé en JFrame
	 */
	private JFrame getFrame() {
		return this;
	}

	/**
	 * Export du labyrinthe par la sérialisation
	 * 
	 * @throws IOException
	 */
	public void exportMazeData() throws IOException {
		// Force la remise à jour de l'état du labyrinthe en fonction des boutons
		// affichés dans l'interface graphique de dessin
		// What You See Is What You Get
		centerPanel.modifLaby();

		String fileName = JOptionPane
				.showInputDialog("Please enter a file name to save this maze (extension .mze).");
		ChargeurLabyrinthe.sauverLabyrinthe(fileName, laby);
	}

	/**
	 * Import du labyrinthe sauvé par la sérialisation
	 * 
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public void chargerLabyrinthe() throws IOException {

		// / Code pris directement dans la doc de JFileChooser.
		// L'argument "./" permet de démarrer directement dans le repertoire
		// courant
		// La version par défaut JFilechooser() démarre dans le $home.
		JFileChooser chooser = new JFileChooser(new File("./"));
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
				"Maze files", "mze");
		chooser.setFileFilter(filter);
		chooser.setDialogTitle("Entrez un nom de fichier .mze (avec l'extension");
		int returnVal = chooser.showOpenDialog(this);
		String fileName;
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			fileName = chooser.getSelectedFile().getName();
		} else {
			// Un cancel, click sur la croix...
			return;
		}

		laby = ChargeurLabyrinthe.chargerLabyrinthe(fileName);
		centerPanel.setLaby(laby);
	}

	/**
	 * Export du labyrinthe au format xml
	 * 
	 * @throws IOException
	 */
	public void sauverLabyrintheEnXML() throws IOException {
		centerPanel.modifLaby();
		ChargeurLabyrinthe.sauverLabyrintheEnXML("maze_xml.txt", laby);
	}

	/**
	 * Getter
	 * 
	 * @return : le labyrinthe
	 */
	public Labyrinthe getLaby() {
		return laby;
	}

	/**
	 * Méthode principale
	 * 
	 * @param args
	 *            : non utilisé
	 */
	public static void main(String[] args) {
		new LabyBuilder();
	}

}
