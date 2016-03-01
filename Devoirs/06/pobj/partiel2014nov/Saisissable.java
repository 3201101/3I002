package pobj.partiel2014nov;
import java.util.List;

interface Saisissable {
	/**
	 * Filtre parmi les noeuds de alc ceux qui pourraient correspondre) à la touche pressée.
	 * @param alc une liste de noeuds : les complétions possibles
	 * @param touche la touche préssée, comprise entre 1 et 9
	 * @return le sous ensemble de alc dont la lettre correspond à la touche pressée selon l'environnement fourni.
	 * @throws MauvaiseTouche si la touche n'est pas entre 1 et 9
	 */
    List<INoeud>  uneTouche(List<INoeud> alc, int touche) throws MauvaiseTouche;

    /**
     * Rend les noeuds qui permettent de compléter la séquence de touches donnée.
     * @param alc les têtes de mots du dictionnaire
     * @param touches une séquence de touches ayant été pressées
     * @return une liste de noeuds compatibles avec la séquence de touches pressée.
	 * @throws MauvaiseTouche si la touche n'est pas entre 1 et 9
     */
    List<INoeud>  seqTouche(List<INoeud> alc, int[] touches) throws MauvaiseTouche;
}
