package pobj.algogen;

import java.util.List;
import java.util.Random;

import pobj.util.Generateur;

public class SelecteurUniforme implements IndivSelecteur {
	
	Random r = Generateur.getRandom();
	
	/* (non-Javadoc)
	 * @see pobj.algogen.IndivSelecteur#getRandom(pobj.algogen.Population)
	 */
	@Override
	public <T> IIndividu<T> getRandom(Population<T> pop){
		List<IIndividu<T>> l = pop.getList();
		return l.get(r.nextInt(l.size()));
	}
	
}
