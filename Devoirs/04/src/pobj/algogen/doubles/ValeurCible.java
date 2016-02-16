package pobj.algogen.doubles;

import java.util.Random;

import pobj.algogen.Environnement;
import pobj.algogen.IIndividu;

/**
 * Environnement basique évaluant la distance entre sa valeur cible et la valeur propre des Individus.
 */
public class ValeurCible implements Environnement
{
	private double valeur;
	public static final Random r = new Random();

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
	public double eval(IIndividu i)
	{
		if (i.getValeur() instanceof Double) {
			double val = (Double) i.getValeur();
			return ( 1 / ( (valeur - val) * (valeur - val) ) );
		}
		else
		{
			throw new IllegalArgumentException("Not a IndividuDouble");
		}
	}
}