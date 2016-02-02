package pobj.algogen;

import java.util.Random;

/**
 * Classe représentant un individu évolutif
 */
public class Individu
{
	private final double valeur;
	private double fitness = 0;

	/**
	 * Instancie un individu évolutif caractérisé par une valeur aléatoire.
	 */
	public Individu()
	{
		Random r = new Random();
		valeur = r.nextDouble();
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
}