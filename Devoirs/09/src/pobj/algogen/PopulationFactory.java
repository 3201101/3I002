package pobj.algogen;

import pobj.algogen.arith.IndividuExpression;
import pobj.algogen.doubles.IndividuDouble;
import pobj.arith.Expression;

/**
 * Classe technique pour la création de populations d'individus évolutifs
 */
public class PopulationFactory
{
	/**
	* Opération permettant d’obtenir une nouvelle population générée aléatoirement.
	* @param size la taille de la population à créer.
	* @return une population composée de "size" individus générés aléatoirement.
	*/
	public static Population<Double> createRandomDoublePopulation(int size)
	{
		Population<Double> pop = new Population<>();
		for(int i = 0; i<size; i++)
		{
			pop.add(new IndividuDouble());
		}
		return pop;
	}
	
	public static Population<Expression> createRandomExpressionPopulation(int size)
	{
		Population<Expression> pop = new Population<>();
		for(int i = 0; i<size; i++)
		{
			pop.add(new IndividuExpression());
		}
		return pop;
	}
}