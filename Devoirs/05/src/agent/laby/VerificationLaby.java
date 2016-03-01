package agent.laby;

import java.awt.Point;
import java.io.IOException;

import agent.laby.exception.CaseDepartNonVideException;
import agent.laby.exception.LabyErroneException;
import agent.laby.exception.LabyMalEntoureException;

public class VerificationLaby
{
	/**
	 * La méthode estEntoureDeMurs() vérifie que le labyrinthe est correctement fermé et ne présente aucun glitch riquant de provoquer des erreurs d'exécution.
	 * @param  l                       Labyrinthe testé
	 * @throws LabyMalEntoureException Erreur d'absence de mur
	 */
	private static void estEntoureDeMurs(Labyrinthe l) throws LabyMalEntoureException
	{
		for(int x = 0; x < l.Xsize(); x++)
		{
			if(l.getContenuCase(x, 0) != ContenuCase.MUR)
				throw new LabyMalEntoureException(new Point(x, 0));

			if(l.getContenuCase(x, l.Ysize()-1) != ContenuCase.MUR)
				throw new LabyMalEntoureException(new Point(x, l.Ysize()-1));
		}

		for(int y = 1; y < l.Ysize()-1; y++)
		{
			if(l.getContenuCase(0, y) != ContenuCase.MUR)
				throw new LabyMalEntoureException(new Point(0, y));

			if(l.getContenuCase(l.Xsize()-1, y) != ContenuCase.MUR)
				throw new LabyMalEntoureException(new Point(l.Xsize()-1, y));
		}
	}
	/**
	 * La méthode estCaseInitialeValide() vérifie que la case àù se trouve le joueur au début du jeu est une case valide, c'est à dire une case vide.
	 * @param  l                          Labyrinthe testé
	 * @throws CaseDepartNonVideException Erreur de case invalide
	 */
	private static void estCaseInitialeVide(Labyrinthe l) throws CaseDepartNonVideException
	{
		Point p = l.getPositionInitiale();
		if(l.getContenuCase(p) != ContenuCase.VIDE)
			throw new CaseDepartNonVideException(p);
	}

	/**
	 * La méthode verifierConditions() vérifie que le labyrinthe chargé est valide.
	 * @param  l                   Le labyrinthe testé
	 * @throws LabyErroneException Erreur dans le labyrinthe
	 */
	public static void verifierConditions(Labyrinthe l) throws LabyErroneException
	{
		estEntoureDeMurs(l);
		estCaseInitialeVide(l);
	}

	/**
	 * La méthode corrigerConditions() tente de corriger un Labyrinthe invalide en corrigeant une à une les erreurs détectées.
	 * @param  l Labyrinthe à corriger
	 * @return   Nombre de corrections effectuées
	 */
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
	
	/**
	 * Chargement d'un Labyrinthe
	 * @param  args        Le premier argument du programme doit être l'adresse du fichier du Labyrinthe
	 * @throws IOException Erreur de lecture
	 */
	public static void main(String[] args) throws IOException 
	{
		Labyrinthe labi = ChargeurLabyrinthe.chargerLabyrinthe(args[0]);
		System.out.println("Labi avant :\n" + labi);
		try{
			verifierConditions(labi);
		}
		catch(Exception e){
			System.out.println(e);
		}
		corrigerConditions(labi);
		System.out.println("Labi apres :\n" + labi);
	}

}


