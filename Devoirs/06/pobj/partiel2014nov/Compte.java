package pobj.partiel2014nov;

import java.util.List;
import java.util.ArrayList;

public class Compte
{
	/**
	 * Calcule le nombre de noeuds dans l'arbre dont "in" est la tête.
	 * @param in un noeud, tête de l'arbre à dénombrer
	 * @return le nombre de mots dans l'arbre
	 */
	public static int nombreNoeud(INoeud in)
	{
		int t = 1;
		List<INoeud> f = in.getFils();

		if(f != null)
			for(int i = 0; i < f.size(); i++)
				t+= nombreNoeud(f.get(i));

		return t;
	}

	/**
	 * Calcule le nombre de mots dans l'arbre dont "in" est la tête.
	 * @param in un noeud, tête de l'arbre à dénombrer
	 * @return le nombre de mots dans l'arbre
	 */    
	public static int nombreMot(INoeud in)
	{
		int t = 0;
		if(in.isMarque() == true)
			t = 1;

    	List<INoeud> f = in.getFils();

    	if(f != null)
    		for(int i = 0; i < f.size(); i++)
	    		t+= nombreMot(f.get(i));

    	return t;
	}
}
