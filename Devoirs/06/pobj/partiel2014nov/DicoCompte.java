package pobj.partiel2014nov;

import java.util.List;
import java.util.ArrayList;

public class DicoCompte extends Dico implements Comptable
{
	private Compte c = new Compte();

	public DicoCompte()
	{
		super();
	}

	public DicoCompte(List<INoeud> dico)
	{
		super(dico);
	}

	/**
	 * @return le nombre de noeuds total dans la représentation
	 */
	public int nombreNoeud()
	{
		int i = 0;

		for (INoeud n : this.getDico())
			i+= this.c.nombreNoeud(n);

		return i;
	}
	
	/**
	 * @return le nombre total de mots stockés 
	 */    
	public int nombreMot()
	{
		int i = 0;

		for (INoeud n : this.getDico())
			i+= this.c.nombreMot(n);

		return i;
	}
}