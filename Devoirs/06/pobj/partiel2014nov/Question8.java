package pobj.partiel2014nov;

import java.util.List;

public class Question8
{
	private static String toSubString(INoeud n, String p)
	{
		String s = "";

		if(n.isMarque())
			s.concat(p).concat(n.getLettre()).concat("\n");
		
		for (INoeud i : n.getFils())
			s.concat(toSubString(i, p.concat(n.getLettre())))

		return s;
	}

	/**
	 * Rend l'ensemble des mots dans l'arbre donné, ligne par ligne
	 * @param  n Arbre de tête
	 * @return   String contenant les mots séparés par des \n
	 */
	public static String toString(INoeud n)
	{
		return toSubString(n, "");
	}

	/**
	 * Rend l'ensemble des mots dans le dictionnaire donné, ligne par ligne
	 * @param  n Dictionnaire
	 * @return   String contenant les mots séparés par des \n
	 */
	public static String toString(Dico d)
	{
		String s = "";

		for(INoeud i : d.getdico())
			s.concat(toString(i));

		return s;
	}
}
