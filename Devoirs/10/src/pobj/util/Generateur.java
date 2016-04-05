package pobj.util;

import java.util.Random;

public class Generateur
{
	public static final Random r = new Random();
	// public static ArrayList<Random> r = new ArrayList<Random>();
	// Une liste d'objets random permet d'instancier plusieurs générateurs de nombre aléatoires
	// ce qui permet d'assurer le déterminisme de l'application lors d'une modification du code.
	
	public static Generateur getInstance()
	{
		return new Generateur();
	}
	
	public int nextInt()
	{
		return r.nextInt();
	}
	
	public float nextFloat()
	{
		return r.nextFloat();
	}
	
	public long nextLong()
	{
		return r.nextLong();
	}

	public void setSeed(long seed)
	{
		r.setSeed(seed);
	}
}
