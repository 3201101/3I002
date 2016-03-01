package pobj.partiel2014nov;
import java.util.List;
import java.util.ArrayList;

public abstract class DicoAbs {

	private List<INoeud> dico;

	public DicoAbs() {
		this(new ArrayList<INoeud>());
	}

	public DicoAbs(List<INoeud> dico) {
		this.dico = dico;
	}

	public List<INoeud> getDico() {
		return dico;
	}

	/**
	 * Recherche un noeud portant une lettre particulière au sein d'une liste de noeuds.
	 * @param liste la liste de noeuds
	 * @param lettre la lettre recehrchée
	 * @return le noeud de la liste qui porte la bonne lettre ou null si on n'es trouve pas.
	 */
	public static INoeud chercheNoeud(List<INoeud> liste, char lettre) {
		for (INoeud n : liste)
			if (n.getLettre() == lettre)
				return n;
		return null;
	}

	/**
	 * Crée un arbre (une chaine en pratique, un seul fils par noeud) qui correspond
	 * au mot argument à partir de la lettre "index". Sa feuille est marquée. 
	 * @param s un mot à stocker sous forme d'arbre
	 * @param index l'index de la première lettre à représenter, compris entre 0 (on veut le mot entier) et s.length-1 (que la dernière lettre)
	 * @return un arbre contenant (s.length-pos) noeuds représentant la fin de s. 
	 */
	public INoeud creerSuffixe(String s, int index) {
		INoeud suffixe;
		int size = s.length();
		// l'extrémité est un noeud marqué
		suffixe = NoeudFactory.createNoeud(s.charAt(size-1), new ArrayList<INoeud>(), true);
		// on itère depuis l'avant dernière lettre vers le début du mot, jusque index.
		for (int i = size - 2; i >= index; i--) {
			ArrayList<INoeud> al = new ArrayList<INoeud>();
			al.add(suffixe);
			// un nouveau noeud pour la lettre courante, de fils le suffixe déjà crée
			suffixe = NoeudFactory.createNoeud(s.charAt(i), al, false);
		}
		return suffixe;
	}

	/**
	 * Ajoute un mot au dictionnaire ; crée ou modifie les noeuds existants du dictionnaire.
	 * @param mot
	 */
	public void ajoute(String mot) {
		List<INoeud> l = dico;
		for (int i = 0; i < mot.length(); i++) {
			INoeud n = chercheNoeud(l, mot.charAt(i));
			if (n==null) {
				// pas trouvé : créer
				l.add(creerSuffixe(mot, i));
				return;
			} 
			if (i == mot.length()-1) {
				// on assure que le dernier noeud du mot est marqué
				n.setMarque(true);
			} else {
				// la lettre a été trouvée, on se décale sur les fils  
				l = n.getFils();
			}
		}
	}

	/**
	 * Cherche un mot dans le dictionnaire.
	 * @param s un mot à chercher
	 * @return true si le mot est présent dans le dictionnaire
	 */
	public abstract boolean appartient(String s);

}