
# 3I002 - TP 04

_Sources fournies dans le fichier **pobj.algogen-LOGLISCI-NASTURAS-04.jar** ci-joint, ou dans **[le dépôt](http://github.com/3201101/3I002/tree/master/Devoirs/04)**._


## Questions

**Donnez la réponse aux questions ci-dessus. Par ailleurs, copiez-collez le code de votre clase principale et une trace d'exécution de votre programme pour le cas où vous évaluez une population de dix individus constitués d'expressions à deux variables.**

Classe principale :

	package pobj.algogen;
	
	import java.util.Random;
	
	import pobj.algogen.doubles.IndividuDouble;
	import pobj.algogen.doubles.ValeurCible;
	
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
					IndividuDouble.r.setSeed(rand.nextLong());
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
				throw new IllegalArgumentException("Nombre d'arguments invalide.");
			}
		}
	}


## Trace d'exécution


	./PopulationMain 5 100



	Population initiale

	 > Individu | Valeur propre = 0.12095395073990378 | Fitness = 0.0
	 > Individu | Valeur propre = 0.59065389341757 | Fitness = 0.0
	 > Individu | Valeur propre = 0.7715014510533056 | Fitness = 0.0
	 > Individu | Valeur propre = 0.6366481251594813 | Fitness = 0.0
	 > Individu | Valeur propre = 0.587288175752623 | Fitness = 0.0


	Population évaluée

	 > Individu | Valeur propre = 0.7715014510533056 | Fitness = 731.8447140073393
	 > Individu | Valeur propre = 0.6366481251594813 | Fitness = 104.36095897011353
	 > Individu | Valeur propre = 0.59065389341757 | Fitness = 48.30405707219194
	 > Individu | Valeur propre = 0.587288175752623 | Fitness = 46.12108079734731
	 > Individu | Valeur propre = 0.12095395073990378 | Fitness = 2.6561588768949504


	Population de génération 0

	 > Individu | Valeur propre = 0.7051174559381871 | Fitness = 1155.4306333549255
	 > Individu | Valeur propre = 0.7715014510533056 | Fitness = 731.8447140073393
	 > Individu | Valeur propre = 0.6684003011672195 | Fitness = 228.6240849469541
	 > Individu | Valeur propre = 0.6366481251594813 | Fitness = 104.36095897011353
	 > Individu | Valeur propre = 0.5917273519276964 | Fitness = 49.03296407144972


	Population de génération 1

	 > Individu | Valeur propre = 0.7408596221216079 | Fitness = 25011.068742424803
	 > Individu | Valeur propre = 0.7149833999428934 | Fitness = 2615.5934779701797
	 > Individu | Valeur propre = 0.758398209798843 | Fitness = 1756.2876966175265
	 > Individu | Valeur propre = 0.7051174559381871 | Fitness = 1155.4306333549255
	 > Individu | Valeur propre = 0.7715014510533056 | Fitness = 731.8447140073393


	Population de génération 2

	 > Individu | Valeur propre = 0.7408596221216079 | Fitness = 25011.068742424803
	 > Individu | Valeur propre = 0.7149833999428934 | Fitness = 2615.5934779701797
	 > Individu | Valeur propre = 0.7582871001731176 | Fitness = 1772.7585766315988
	 > Individu | Valeur propre = 0.7662030364473673 | Fitness = 997.23600443447
	 > Individu | Valeur propre = 0.6893308007204892 | Fitness = 489.3439931867115


	Population de génération 3

	 > Individu | Valeur propre = 0.7408596221216079 | Fitness = 25011.068742424803
	 > Individu | Valeur propre = 0.7521215680162103 | Fitness = 3233.77826104783
	 > Individu | Valeur propre = 0.7557831975414527 | Fitness = 2215.2143534521297
	 > Individu | Valeur propre = 0.6970513703566268 | Fitness = 711.6766933301067
	 > Individu | Valeur propre = 0.6890747156403855 | Fitness = 483.8465915770413


	Population de génération 4

	 > Individu | Valeur propre = 0.7338860684066912 | Fitness = 2363967.8688530037
	 > Individu | Valeur propre = 0.7408596221216079 | Fitness = 25011.068742424803
	 > Individu | Valeur propre = 0.7521215680162103 | Fitness = 3233.77826104783
	 > Individu | Valeur propre = 0.7069969226898979 | Fitness = 1318.5193819561168
	 > Individu | Valeur propre = 0.7889780557175038 | Fitness = 337.39481977859083


	Population de génération 5

	 > Individu | Valeur propre = 0.7338860684066912 | Fitness = 2363967.8688530037
	 > Individu | Valeur propre = 0.7285491545180157 | Fitness = 27895.633746903128
	 > Individu | Valeur propre = 0.7408596221216079 | Fitness = 25011.068742424803
	 > Individu | Valeur propre = 0.7417543831646224 | Fitness = 19194.47619329294
	 > Individu | Valeur propre = 0.7532613447546352 | Fitness = 2852.0818938645025


	Population de génération 6

	 > Individu | Valeur propre = 0.7338860684066912 | Fitness = 2363967.8688530037
	 > Individu | Valeur propre = 0.7285491545180157 | Fitness = 27895.633746903128
	 > Individu | Valeur propre = 0.7232934720952563 | Fitness = 7911.0843671532
	 > Individu | Valeur propre = 0.7694053629562595 | Fitness = 822.4766790855016
	 > Individu | Valeur propre = 0.693741489591789 | Fitness = 600.8784354007904


	Population de génération 7

	 > Individu | Valeur propre = 0.7338860684066912 | Fitness = 2363967.8688530037
	 > Individu | Valeur propre = 0.7356221887079221 | Fitness = 848325.466880237
	 > Individu | Valeur propre = 0.7285491545180157 | Fitness = 27895.633746903128
	 > Individu | Valeur propre = 0.7259541253751544 | Fitness = 13576.51993168483
	 > Individu | Valeur propre = 0.689486561064503 | Fitness = 492.73366312458006


	Population de génération 8

	 > Individu | Valeur propre = 0.7338860684066912 | Fitness = 2363967.8688530037
	 > Individu | Valeur propre = 0.7199879633035373 | Fitness = 4724.581840170915
	 > Individu | Valeur propre = 0.7518891655448904 | Fitness = 3320.9774547992124
	 > Individu | Valeur propre = 0.7727507909257667 | Fitness = 684.7745732321393
	 > Individu | Valeur propre = 0.7856764766054831 | Fitness = 382.3652181992298


	Population de génération 9

	 > Individu | Valeur propre = 0.7338860684066912 | Fitness = 2363967.8688530037
	 > Individu | Valeur propre = 0.7359760491222818 | Fitness = 482532.72167070315
	 > Individu | Valeur propre = 0.7255969980546457 | Fitness = 12513.437099964267
	 > Individu | Valeur propre = 0.7199879633035373 | Fitness = 4724.581840170915
	 > Individu | Valeur propre = 0.7762231281598568 | Fitness = 575.4475742835339




