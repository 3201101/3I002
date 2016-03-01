package pobj.partiel2014nov;

import java.util.List;

public interface INoeud {
	/**
	 * @return la lettre associée à ce noeud de l'arbre.
	 */
	char getLettre();

	/**
	 * @return la liste des fils de ce noeud
	 */
	List<INoeud> getFils();

	/**
	 * @return true si le noeud est marqué (c'est la fin d'un mot) ou false sinon.
	 */
	boolean isMarque();

	/**
	 * Met à jour la propriété marqué ou non du noeud.
	 * @param isMarque la nouvelle valeur du marquage.
	 */
	void setMarque (boolean isMarque);
}
