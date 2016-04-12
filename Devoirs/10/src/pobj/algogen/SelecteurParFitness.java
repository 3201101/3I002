package pobj.algogen;

import java.util.Random;

import pobj.util.Generateur;

public class SelecteurParFitness implements IndivSelecteur {

	Random r = Generateur.getRandom();
	
	@Override
	public <T> IIndividu<T> getRandom(Population<T> pop) {
		int seuil = r.nextInt(pop.getSommeFitness());
		int cpt = 0;
		for (IIndividu<T> i : pop.getList()) {
			cpt += i.getFitness();
			if(cpt >= seuil)
				return i;
		}
		throw new IllegalStateException("Etat impossible");
	}
}
