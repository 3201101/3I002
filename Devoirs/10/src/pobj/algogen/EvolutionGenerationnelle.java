package pobj.algogen;

import java.util.List;

public class EvolutionGenerationnelle<T> implements IEvolution<T> {

	IndivSelecteur selec = new SelecteurUniforme();
	
	/**
	 * Crée une nouvelle Population évoluée.
	 * @return Nouvelle Population
	 */
	@Override
	public Population<T> reproduire(Population<T> pop, double ratio) {
		Population<T> p = new Population<T>();
		List<IIndividu<T>> l = pop.getList();
		int taille = l.size();
		int i = 0;
		int c = Math.max((int)Math.round(taille * ratio), 1);

		for(i = 0; i < c; i++)
		{
			p.add(l.get(i).clone());
		}

		for(i = c; i < taille; i++)
		{
			IIndividu<T> pere = selec.getRandom(pop);
			IIndividu<T> mere = selec.getRandom(pop);
			while(pere == mere)
				mere = selec.getRandom(pop);
			
			p.add(pere.croiser(mere));
		}

		return p;
	}

}
