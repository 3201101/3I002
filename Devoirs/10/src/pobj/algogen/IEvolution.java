package pobj.algogen;

public interface IEvolution<T> {
	public Population<T> reproduire(Population<T> pop, double ratio);
}
