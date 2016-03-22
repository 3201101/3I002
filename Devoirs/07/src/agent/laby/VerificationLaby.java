package agent.laby;

import java.awt.Point;

@SuppressWarnings("serial")
class LabyErroneException extends Exception
{
	private Point p;

	public LabyErroneException(Point p)
	{
		this.p = p;
	}
	public Point getP()
	{
		return p;
	}
}

@SuppressWarnings("serial")
class LabyMalEntoureException extends LabyErroneException
{

	public LabyMalEntoureException(Point p)
	{
		super(p);
	}
	
}

@SuppressWarnings("serial")
class CaseDepartNonVideException extends LabyErroneException
{

	public CaseDepartNonVideException(Point p)
	{
		super(p);
	}
	
}

public class VerificationLaby
{
	private static void estEntoureDeMurs(Labyrinthe l) throws LabyMalEntoureException
	{
		for(int x = 0; x < l.Xsize(); x++)
		{
			if(l.getContenuCase(x, 0) == ContenuCase.MUR)
				throw new LabyMalEntoureException(new Point(x, 0));

			if(l.getContenuCase(x, l.Ysize()-1) == ContenuCase.MUR)
				throw new LabyMalEntoureException(new Point(x, l.Ysize()-1));
		}

		for(int y = 1; y < l.Ysize()-1; y++)
		{
			if(l.getContenuCase(0, y) == ContenuCase.MUR)
				throw new LabyMalEntoureException(new Point(0, y));

			if(l.getContenuCase(l.Xsize()-1, y) == ContenuCase.MUR)
				throw new LabyMalEntoureException(new Point(l.Xsize()-1, y));
		}
	}

	private static void estCaseInitialeVide(Labyrinthe l) throws CaseDepartNonVideException
	{
		Point p = l.getPositionInitiale();
		if(l.getContenuCase(p) != ContenuCase.VIDE)
			throw new CaseDepartNonVideException(p);
	}

	public static void verifierConditions(Labyrinthe l) throws LabyErroneException
	{
		estEntoureDeMurs(l);
		estCaseInitialeVide(l);
	}

	public static int corrigerConditions(Labyrinthe l)
	{
		boolean x = true;
		int i = 0;
		while(x)
		{
			x = false;
			try
			{
				verifierConditions(l);
			}
			catch (LabyMalEntoureException e)
			{
				x = true;
				i++;
				
				l.setContenuCase(e.getP(), ContenuCase.MUR);
			}
			catch (CaseDepartNonVideException e)
			{
				x = true;
				i++;

				l.setContenuCase(e.getP(), ContenuCase.VIDE);
			} catch (LabyErroneException e) {}
		}

		return i;
	}
	
	public static void main(String[] args) 
	{
		
	}

}


