package pobj.algogen;

import java.util.ArrayList;

/**
 * Classe représentant une population d'individus évolutifs
 */
public class Population
{
	private ArrayList<Individu> individus = new ArrayList<>();

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
	public void add(Individu individu)
	{
		individus.add(individu);
	}

	/**
	 * Signature texte
	 * @return Signature texte
	 */
	@Override
	public String toString()
	{
		return individus.toString();
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
		p.muter(0.1);
		p.evaluer(cible);

		return p;
	}

	/**
	 * Évalue la totalité des individus évolutifs d'une population en leur attribuant de nouvelles valeurs de fitness.
	 * @param cible Environnement dans lequel évoluent les individus
	 */
	public void evaluer(Environnement cible)
	{
		for(Individu i : individus)
		{
			i.setFitness(cible.eval(i));
		}
		individus.sort();
	}

	private void muter(double prob)
	{
		for(int i = 1; i < individus.length(); i++)
		{
			if(Math.random() < prob)
			{
				individus[i].muter();
			}
		}
	}

	private Population reproduire()
	{
		Population p = new Population;
		Random r = new Random();
		int l = individus.length();
		int i = 0;
		int c = l/5;

		for(i = 0; i < c; i++)
		{
			p.add(individus[i].clone());
		}

		for(i = c; i < l; i++)
		{
			p.add(individus[r.nextInt(c)].reproduire(individus[r.nextInt(c)]));
		}

	}
}