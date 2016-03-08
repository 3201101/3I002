package pobj.partiel2014nov;

import java.util.List;
import java.util.ArrayList;

public class Dico extends DicoAbs
{
	public Dico()
	{
		super();
	}

	public Dico(List<INoeud> dico)
	{
		super(dico);
	}

	/**
	 * Cherche un mot dans le dictionnaire.
	 * @param s un mot à chercher
	 * @return true si le mot est présent dans le dictionnaire
	 */
	public boolean appartient(String s)
	{
		List<INoeud> l = this.getDico();
		INoeud n = this.chercheNoeud(l, s.charAt(0));

		if(n == null)
			return false;

		for(int i = 0; i < s.length(); i++)
		{
			n = this.chercheNoeud(l, s.charAt(i));

			if(n == null)
				return false;

			l = n.getFils();
		}

		return n.isMarque();
	}

}