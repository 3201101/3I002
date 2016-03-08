package pobj.partiel2014nov;

import java.util.List;
import java.util.ArrayList;

public class DicoCompte extends Dico implements Comptable
{
	Compte c = new Compte();

	/**
	 * @return le nombre de noeuds total dans la représentation
	 */
	int nombreNoeud()
	{
		int i = 0;

		for (INoeud n : liste)
			n+= c.nombreNoeud(n);

		return n;
	}
	
	/**
	 * @return le nombre total de mots stockés 
	 */    
	int nombreMot()
	{
		int i = 0;

		for (INoeud n : liste)
			n+= c.nombreMot(n);

		return n;
	}
}