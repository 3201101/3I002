package pobj.algogen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Classe représentant une population d'individus évolutifs
 */
public class Population
{
	private ArrayList<IIndividu> individus = new ArrayList<>();
	public static final Random r = new Random();

	/**
	 * Retourne la taille de la population
	 * @return taille de la population
	 */
	public int size()
	{
		return individus.size();
	}

	/**
	 * Ajoute un individu évolutif à la population
	 * @param individu individu à ajouter
	 */
	public void add(IIndividu individu)
	{
		individus.add(individu);
	}

	/**
	 * Permet de faire évoluer la Population en produisant une nouvelle génération.
	 * La fonction primordiale de la Population est de pouvoir evoluer.
	 * On passe un Environnement qui permettra de calculer le fitness des individus,
	 * afin de décider lesquels sont les plus aptes (survival of the fittest).
	 * On garde ici les 20% meilleurs et on les fait se reproduire pour générer la prochaine génération.
	 * @param cible l’objectif/probléme à résoudre/environnement conditionnant l’évolution
	 * @return une nouvelle Population, dont les membres sont tous nouveaux (aucun individu de cette Population n’appartient à la Population "this").
	 */
	public Population evoluer(Environnement cible)
	{
		evaluer(cible);
		Population p = reproduire();
		p.muter(1.0);
		p.evaluer(cible);

		return p;
	}

	/**
	 * Évalue la totalité des individus évolutifs d'une population en leur attribuant de nouvelles valeurs de fitness.
	 * @param cible Environnement dans lequel évoluent les individus
	 */
	public void evaluer(Environnement cible)
	{
		for(IIndividu i : individus)
		{
			i.setFitness(cible.eval(i));
		}
		Collections.sort(individus);
	}

	/**
	 * Provoque la mutation de l'ensemble des Individus de la Population.
	 * @param prob Probabilité pour chaque Individu de muter.
	 */
	private void muter(double prob)
	{
		for(int i = 1; i < individus.size(); i++)
		{
			if(r.nextDouble() < prob)
			{
				individus.get(i).muter();
			}
		}
	}

	/**
	 * Crée une nouvelle Population évoluée.
	 * @return Nouvelle Population
	 */
	private Population reproduire()
	{
		Population p = new Population();
		int l = individus.size();
		int i = 0;
		int c = Math.max(l/5, 1);

		for(i = 0; i < c; i++)
		{
			p.add(individus.get(i).clone());
		}

		for(i = c; i < l; i++)
		{
			int pere = r.nextInt(c);
			int mere = r.nextInt(c);
			while(pere == mere)
				mere = r.nextInt(c);
			
			p.add(individus.get(pere).croiser(individus.get(mere)));
		}

		return p;
	}
	
	/**
	 * Affiche un résumé textuel de la Population
	 */
	@Override
	public String toString()
	{
		String s = "";
		for(IIndividu i : individus)
		{
			s+= " > " + i.toString();
		}
		
		return s;
	}
}