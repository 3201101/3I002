package pobj.algogen;

import java.util;

public class Individu
{
	public final double m;
	private int fitness;

	Individu()
	{
		Random r = new Random();
		m = r.nextDouble();

		fitness = 0;
	}

	public int getFitness()
	{
		return fitness;
	}

	public void setFitness(int f)
	{
		fitness = f;
	}
}