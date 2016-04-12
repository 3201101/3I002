package pobj.util;

import java.util.Random;

public class Generateur
{
	private static Random r = new Random();
	
	public static Random getRandom(){
		return new Random(r.nextLong());
	}

	public static void setSeed(long seed)
	{
		r.setSeed(seed);
	}
}
