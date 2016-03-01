package pobj.partiel2014nov;

public class Env implements IEnv
{
	String[8] lettres = new String[8];

	public String get(int touche) throws MauvaiseTouche
	{
		if(touche > 0 AND touche < 10)
			return lettres[touche];
		throw new MauvaiseTouche();
		/*
		switch (touche)
		{
			case 1:
				return " ";
			case 2:
				return "ABC";
			case 3:
				return "DEF";
			case 4:
				return "GHI";
			case 5:
				return "JKL";
			case 6:
				return "MNO";
			case 7:
				return "PQRS";
			case 8:
				return "TUV";
			case 9:
				return "WXYZ";
			default:
				throw new MauvaiseTouche();
		}
		*/
	}

	public void set(int touche, String lettres) throws MauvaiseTouche
	{
		if(touche > 0 AND touche < 10)
			this.lettres[touche] = lettres;
		throw new MauvaiseTouche();
	}
}