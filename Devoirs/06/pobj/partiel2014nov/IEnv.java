package pobj.partiel2014nov;

/** Associe à des entiers (les touches) l'ensemble des lettres sur la touche */
public interface IEnv {
	/**
	 * Rend les lettres associées à une touche donnée.
	 * 
	 * @param touche un entier compris entre 1 et 9 inclus
	 * @return une chaine de caractères contenant les lettres associées à cette
	 *         touche.
	 * @throws MauvaiseTouche  si l'entier n'est pas compris entre 1 et 9
	 */
	String get(int touche) throws MauvaiseTouche;

	/**
	 * Associe un ensemble de lettres à une touche; si la touche est déjà
	 * associée a des lettres, écrase l'ancienne association.
	 * 
	 * @param touche
	 *            un entier compris entre 1 et 9 inclus
	 * @param lettres
	 *            une chaine de caractères contenant les lettres à associer à
	 *            cette touche.
	 * @throws MauvaiseTouche
	 *             si l'entier n'est pas compris entre 1 et 9
	 */
	void set(int touche, String lettres) throws MauvaiseTouche;
}
