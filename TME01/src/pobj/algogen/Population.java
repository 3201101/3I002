package pobj.algogen;

import java.util.ArrayList;

/**
 * Classe représentant une population d'individus évolutifs
 */
public class Population
{
	private ArrayList<Individu> individus = new ArrayList<>();

	/**
	 * Retourne la taille de la population
	 * @return taille de la population
	 */
	public int size()
	{
		return individus.size();
	}

	/**
	 * Ajoute un individu évolutif à la population
	 * @param individu individu à ajouter
	 */
	public void add(Individu individu)
	{
		individus.add(individu);
	}

	/**
	 * Signature texte
	 * @return Signature texte
	 */
	@Override
	public String toString()
	{
		return individus.toString();
	}
}