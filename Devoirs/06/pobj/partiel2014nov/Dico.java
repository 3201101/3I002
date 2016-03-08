package pobj.partiel2014nov;

import java.util.List;
import java.util.ArrayList;

public class Dico extends DicoAbs
{
	/**
	 * Cherche un mot dans le dictionnaire.
	 * @param s un mot à chercher
	 * @return true si le mot est présent dans le dictionnaire
	 */
	public abstract boolean appartient(String s)
	{
		for(int i = 0; i < s.length(); i++)
		{
			INoeud n = chercheNoeud(s[0]);

			if(n == NULL)
				return false;
		}

		return n.isMarque();
	}

}