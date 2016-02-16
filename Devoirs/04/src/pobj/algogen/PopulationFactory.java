package pobj.algogen;

import pobj.algogen.doubles.IndividuDouble;

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
	public static Population createRandomPopulation(int size)
	{
		Population pop = new Population();
		for(int i = 0; i<size; i++)
		{
			pop.add(new IndividuDouble());
		}
		return pop;
	}
}