package pobj.algogen;

import java.util.Random;

/**
 * Environnement basique évaluant la distance entre sa valeur cible et la valeur propre des Individus.
 */
public class ValeurCible implements Environnement
{
	private double valeur;
	static Random r = new Random();

	/**
	 * Instancie un environnement basique possédant une valeur cible donnée.
	 * @param  cible valeur cible utilisée pour l'évaluation des Individus
	 */
	public ValeurCible(double cible)
	{
		valeur = cible;
	}

	/**
	 * Instancie un environnement basique possédant une valeur cible aléatoire.
	 */
	public ValeurCible()
	{
		this(r.nextDouble());
	}

	/**
	 * Retourne la valeur cible de l'environnement
	 * @return valeur cible
	 */
	public double getValeur()
	{
		return valeur;
	}

	/**
	 * Évalue la fitness d'un Invidivu en fonction de la distance entre sa valeur propre et la valeur cible de l'Environnement.
	 * @param  i Individu à évaluer
	 * @return   Fitness de l'Individu dans cet Environnement
	 */
	public double eval(Individu i)
	{
		return ( 1 / ( (valeur - i.getValeur()) * (valeur - i.getValeur()) ) );
	}
}