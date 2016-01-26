package pobj.algogen;

import java.util.Random;

/**
 * Classe représentant un individu évolutif
 */
public class Individu
{
	public final double m;
	private double fitness = 0;

	/**
	 * Instancie un individu évolutif caractérisé par une valeur aléatoire.
	 */
	public Individu()
	{
		Random r = new Random();
		m = r.nextDouble();
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