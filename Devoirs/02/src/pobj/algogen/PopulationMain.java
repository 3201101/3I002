package pobj.algogen;

import java.util.Random;

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
		if(args.length == 1 || args.length == 2)
		{
			/* Option debug */
			if(args.length == 2)
			{
				Random rand = new Random(Integer.parseInt(args[1]));
				Population.r.setSeed(rand.nextLong());
				Individu.r.setSeed(rand.nextLong());
				ValeurCible.r.setSeed(rand.nextLong());
			}
			
			/* Création d'une population aléatoire d'Individus */
			Population p = PopulationFactory.createRandomPopulation(Integer.parseInt(args[0]));
			System.out.println("\nPopulation initiale\n");
			System.out.println(p);

			/* Création d'un environnement basique aléatoire */
			Environnement e = new ValeurCible();

			/* Évaluation de la population */
			p.evaluer(e);
			System.out.println("\nPopulation évaluée\n");
			System.out.println(p);
			
			/* Évolution de la population */
			for(int i = 0; i < 10; i++)
			{
				p = p.evoluer(e);
				System.out.println("\nPopulation de génération " + i + "\n");
				System.out.println(p);
			}
		}
		else
		{
			throw new java.lang.IllegalArgumentException("Nombre d'arguments invalide.");
		}
	}
}