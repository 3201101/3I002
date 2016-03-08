package pobj.partiel2014nov;

public class Env implements IEnv
{
	String[8] lettres = new String[8];

	public String get(int touche) throws MauvaiseTouche
	{
		if(touche > 0 AND touche < 10)
			return lettres[touche];
		throw new MauvaiseTouche();
	}

	public void set(int touche, String lettres) throws MauvaiseTouche
	{
		if(touche > 0 AND touche < 10)
			this.lettres[touche] = lettres;
		throw new MauvaiseTouche();
	}
}
