package pobj.partiel2014nov;

import java.util.List;

public class Noeud implements INoeud
{
	protected char lettre;
	protected boolean fin;
	protected List<INoeud> fils;

	public Noeud(char lettre, List<INoeud> fils, boolean isMarked)
	{
		this.lettre = lettre;
		this.fils = fils;
		this.fin = isMarked;
	}

	/**
	 * @return la lettre associée à ce noeud de l'arbre.
	 */
	public char getLettre()
	{
		return lettre;
	}

	/**
	 * @return la liste des fils de ce noeud
	 */
	public List<INoeud> getFils()
	{
		return fils;
	}

	/**
	 * @return true si le noeud est marqué (c'est la fin d'un mot) ou false sinon.
	 */
	public boolean isMarque()
	{
		return fin;
	}

	/**
	 * Met à jour la propriété marqué ou non du noeud.
	 * @param isMarque la nouvelle valeur du marquage.
	 */
	public void setMarque (boolean isMarque)
	{
		this.fin = isMarque;
	}
}
