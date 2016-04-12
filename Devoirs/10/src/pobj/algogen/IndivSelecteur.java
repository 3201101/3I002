package pobj.algogen;

public interface IndivSelecteur {

	public <T> IIndividu<T> getRandom(Population<T> pop);

}