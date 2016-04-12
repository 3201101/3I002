package pobj.algogen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import pobj.util.Configuration;
import pobj.util.Generateur;

/**
 * Classe représentant une population d'individus évolutifs
 */
public class Population<T>{
	public static String RATIO = "ratio";
	public static String UNI = "SelectionUniforme";
	private ArrayList<IIndividu<T>> individus = new ArrayList<>();
	public static final Random r = Generateur.getRandom();
	private Configuration conf = Configuration.getInstance();
	private IEvolution<T> evo;
	{
		if(Boolean.parseBoolean(conf.getParameterValue(Population.UNI)))
			evo = new EvolutionGenerationnelle<>();
		else
			evo = new EvolutionParNiche<>();
	}
	
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
	public void add(IIndividu<T> individu)
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
	public Population<T> evoluer(Environnement<T> cible)
	{
		evaluer(cible);
		Population<T> p = evo.reproduire(this, Double.parseDouble(conf.getParameterValue(Population.RATIO)));
		p.muter(1.0);
		p.evaluer(cible);

		return p;
	}

	/**
	 * Évalue la totalité des individus évolutifs d'une population en leur attribuant de nouvelles valeurs de fitness.
	 * @param cible Environnement dans lequel évoluent les individus
	 */
	public void evaluer(Environnement<T> cible)
	{
		for(IIndividu<T> i : individus)
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
	 * Affiche un résumé textuel de la Population
	 */
	@Override
	public String toString()
	{
		String s = "";
		for(IIndividu<T> i : individus)
		{
			s+= " > " + i.toString() +" > " + i.getFitness();
		}
		
		return s;
	}
	
	public List<IIndividu<T>> getList(){
		return individus;
	}
	
	public int getSommeFitness(){
		int r = 0;
		for (IIndividu<T> i : individus) {
			r += i.getFitness();
		}
		return r;
	}
	
	public IIndividu<T> popLast(){
		IIndividu<T> ret = individus.get(individus.size() - 1);
		individus.remove(individus.size() - 1);
		return ret;
	}
}