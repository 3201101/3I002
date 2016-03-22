package pobj.algogen;

public abstract class AbstractIndividu implements IIndividu
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

	public abstract IIndividu clone();

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
	
	@Override
	public abstract String toString();

}