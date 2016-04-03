package agent.laby.interf;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

import agent.Simulation;
import agent.control.ControlFactory;
import agent.control.Controleur;
import agent.laby.ChargeurLabyrinthe;
import agent.laby.Labyrinthe;
import agent.laby.VerificationLaby;

public class LabyViewer extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	// Des constantes pour mettre sur les textes des menus
		// Il est recommandé (best practice) au maximum d'utiliser
		// des constantes plutôt que des String en litéral "Toto" enfouies dans le code.
		// private static final String XML_EXPORT_MENU = "Export Maze To XML";
		private static final String SER_PLAY = "Lancer la simulation";
		private static final String SER_IMPORT_MENU = "Charger labyrinthe";

	// Le labyrinthe sous-jacent
	private Labyrinthe laby;
	private Controleur control;
	private int it;

	// La zone montrant le labyrinthe 
	private LabyActivePanel centerPanel;
	
	// Pour les tests getSource dans le Menu Listener : les sources d'événements menu
	private JMenuItem mi_play;
	private JMenuItem mi_import;

	// Les tailles, constantes
	private static final int COLS = 15, LIGNES = 10;

	/**
	 * Constructeur
	 */
	public LabyViewer(Labyrinthe l, Controleur c, int p)
	{
		// Titre de la JFrame
		super("Laby Viewer");
		
		Labyrinthe t = l;
		VerificationLaby.corrigerConditions(t);
		laby = t;
		control = c;
		it = p;

		// creer les Panel et menus
		createCenterPanel();
		createMenus();

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
		centerPanel = new LabyActivePanel(laby);
		getContentPane().add(centerPanel, BorderLayout.CENTER);
	}
	
	/**
	 * Créée les menus d'import export et y associe le traitement défini par MenuListener.
	 */
	private void createMenus() {
		JMenuBar menubar = new JMenuBar();
		JMenu menu = new JMenu("File");

		ActionListener ml = new ExportMenuListener();
		
		mi_play = new JMenuItem(SER_PLAY);
		mi_play.addActionListener(ml);
		menu.add(mi_play);

		mi_import = new JMenuItem(SER_IMPORT_MENU);
		mi_import.addActionListener(ml);
		menu.add(mi_import);

		menubar.add(menu);
		menubar.setVisible(true);
		
		// positionne la barre
		this.setJMenuBar(menubar);
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

		setLaby(ChargeurLabyrinthe.chargerLabyrinthe(fileName));
	}
	
	/**
	 * Classe interne pour gérer les événements menu
	 */
	private class ExportMenuListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JMenuItem item = (JMenuItem) e.getSource();
			try {
				if (item == mi_play) {
					play();
				} else if (item == mi_import) {
					chargerLabyrinthe();
				}
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
	 * Getter
	 * 
	 * @return : le labyrinthe
	 */
	public Labyrinthe getLaby() {
		return laby;
	}
	
	private void setLaby(Labyrinthe l){
		Labyrinthe t = l;
		VerificationLaby.corrigerConditions(t);
		laby = t;
		centerPanel.setLaby(laby);
	}

	private void play(){
		new Thread(new Runnable(){
			public void run(){
				Simulation sim = new Simulation(laby.clone(), control);
				centerPanel.setLaby(sim.getLaby());
				sim.addObserver(centerPanel);
				System.out.println(sim.mesurePerf(it));
				sim.deleteObserver(centerPanel);
			}
		}).start();
	}
	
	/**
	 * Méthode principale
	 * 
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		Controleur c = (Controleur) ControlFactory.createControleurSmart();
		
		new LabyViewer(new Labyrinthe(COLS, LIGNES), c, 30);
	}

}
