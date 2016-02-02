package pobj.algogen;

import java.util.Random;

/**
 * Classe représentant un individu évolutif
 */
public class Individu implements Comparable<Individu>
{
	private double valeur;
	private double fitness = 0;

	/**
	 * Instancie un Individu évolutif caractérisé par une valeur donnée
	 * @param  v Valeur propre de l'individu
	 */
	public Individu(double v)
	{
		valeur = v;
	}

	/**
	 * Instancie un individu évolutif caractérisé par une valeur aléatoire.
	 */
	public Individu()
	{
		this(Math.random());
	}

	/**
	 * Retourne la valeur propre de l'individu
	 * @return Valeur propre de l'individu
	 */
	public double getValeur()
	{
		return valeur;
	}

	/**
	 * Retourne la valeur de la qualité
	 * @return Valeur de fitness
	 */
	public double getFitness()
	{
		return fitness;
	}

	/**
	 * Définit la valeur de la qualité
	 * @param f nouvelle valeur de fitness
	 */
	public void setFitness(double f)
	{
		fitness = f;
	}

	/**
	 * Mute l'Individu en lui attribuant une nouvelle valeur aléatoire égale à plus ou moins 20% de la valeur précédente
	 */
	public void muter()
	{
		valeur = min(max((valeur + ((Math.random() - 0.5) / 5)), 0), 1);
	}

	/**
	 * Croise deux Individus et crée un nouvel Individu dont la valeur propre est la moyenne des deux parents assortie d'une mutation de 10% maximum.
	 * @param  autre Second parent
	 * @return       Individu enfant créé
	 */
	public Individu croiser(Individu autre)
	{
		return new Individu((min(max((this.getValeur() + autre.getValeur()) / 2) + ((Math.random() - 0.5) / 10)), 0), 1);
	}

	/**
	 * Retourne un clone de l'objet courant.
	 * @return Individu identique
	 */
	public Individu clone()
	{
		Individu i = new Individu(valeur);
		i.setFitness = fitness;

		return i;
	}

	/**
	 * Compare deux Individus
	 * @param  o Individu à comparer
	 * @return   -1 si o est plus petit, 1 si this est plus petit, 0 s'ils sont égaux
	 */
	public int compareTo(Individu o)
	{
		if(o.getFitness() < fitness)
			return -1;
		else if (o.getFitness() > fitness)
			return 0;
		return 1;
	}
}