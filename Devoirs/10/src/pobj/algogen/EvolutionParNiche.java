package pobj.algogen;

public class EvolutionParNiche<T> implements IEvolution<T> {
	
	IndivSelecteur selec = new SelecteurParFitness();

	@Override
	public Population<T> reproduire(Population<T> pop, double ratio) {
		
		IIndividu<T> pere = selec.getRandom(pop);
		IIndividu<T> mere = selec.getRandom(pop);
		while(pere == mere)
			mere = selec.getRandom(pop);
		
		pop.popLast();
		pop.add(pere.croiser(mere));
		
		return pop;
	}

}
