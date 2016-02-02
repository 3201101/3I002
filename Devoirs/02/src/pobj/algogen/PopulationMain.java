package pobj.algogen;

import java.util.Arrays;

/**
 * Classe d'éxecution du simulateur d'évolution
 */
public class PopulationMain
{
	/**
	 * Éxecuté au lancement du programme, lance une simulation de population d'individus évolutifs
	 * @param args Arguments de lancement
	 */
	public static void main(String[] args)
	{
		if(args.length == 1)
		{
			/* Création d'une population aléatoire d'Individus */
			Population p = PopulationFactory.createRandomPopulation(Integer.parseInt(args[0]));
			System.out.println(p);

			/* Création d'un environnement basique aléatoire */
			Environnement e = new ValeurCible();

			/* Évaluation de la population */
			p.evaluer(e);
			System.out.println(p);
		}
		else
		{
			throw new java.lang.IllegalArgumentException("Nombre d'arguments invalide.");
		}
	}
}