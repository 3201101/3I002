package pobj.partiel2014nov;

import java.util.ArrayList;

public class Env implements IEnv
{
	ArrayList<String> lettres = new ArrayList<String>(9);

	public String get(int touche) throws MauvaiseTouche
	{
		int t = touche-1;
		if(t < 0 || t > 8)
			throw new MauvaiseTouche();	
		try
		{
			return this.lettres.get(t);
		}
		catch(Exception e)
		{
			throw new MauvaiseTouche();
		}
	}

	public void set(int touche, String lettres) throws MauvaiseTouche
	{
		int t = touche-1;
		if(t < 0 || t > 8)
			throw new MauvaiseTouche();	
		try
		{
			if(t >= this.lettres.size())
				this.lettres.add(t, lettres);
			else
				this.lettres.set(t, lettres);
		}
		catch(Exception e)
		{
			throw new MauvaiseTouche();
		}
	}
}
