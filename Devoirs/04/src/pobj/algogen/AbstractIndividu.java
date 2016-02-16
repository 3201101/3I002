package pobj.algogen;

import pobj.algogen.doubles.IndividuDouble;

public abstract class AbstractIndividu
{

	protected double fitness = 0;

	public AbstractIndividu() {
		super();
	}

	public double getFitness() {
		return fitness;
	}

	public void setFitness(double f) {
		fitness = f;
	}

	public abstract IndividuDouble clone();

	public int compareTo(IIndividu o) {
		if(o.getFitness() < fitness)
		{
			return -1;
		}
		if (o.getFitness() > fitness)
		{
			return 1;
		}
		return 0;
	}

}