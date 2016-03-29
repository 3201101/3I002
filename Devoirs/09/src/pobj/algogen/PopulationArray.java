package pobj.algogen;

import java.util.Arrays;

public class PopulationArray<T>
{
	private static final int POP_SIZE = 20;
	private IIndividu<T>[] individus;
	private int size = 0;

	@SuppressWarnings("unchecked")
	public PopulationArray()
	{
		individus = new IIndividu[POP_SIZE];
		
	}

	public int size()
	{
		return size;
	}

	public void add(IIndividu<T> individu)
	{
		if (size < individus.length)
		{
			individus[size] = individu;
			size++;
		}
		else
		{
			throw new ArrayIndexOutOfBoundsException("Plus de place !");
		}
	}

	@Override
	public String toString()
	{
		return Arrays.toString(individus);
	}
}