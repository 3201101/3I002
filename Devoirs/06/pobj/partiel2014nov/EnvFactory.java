package pobj.partiel2014nov;

public class EnvFactory
{
	public static IEnv createEnv()
	{
		Env e = new Env();
		
		e.set(1, " ");
		e.set(2, "ABC");
		e.set(3, "DEF");
		e.set(4, "GHI");
		e.set(5, "JKL");
		e.set(6, "MNO");
		e.set(7, "PQRS");
		e.set(8, "TUV");
		e.set(9, "WXYZ");

		return e;
	}
}