package pobj.algogen;

import agent.control.ControlFactory;
import agent.control.IControleur;
import pobj.algogen.agent.IndividuControleur;
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
	
	public static int nbRules = 5;

	public static Population<IControleur> createRandomControleurPopulation(int size)
	{
		Population<IControleur> pop = new Population<>();
		for(int i = 0; i<size; i++)
		{
			pop.add(new IndividuControleur(ControlFactory.createControleur(nbRules)));
		}
		return pop;
	}
}
