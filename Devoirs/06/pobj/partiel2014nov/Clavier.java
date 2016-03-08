package pobj.partiel2014nov;

import java.util.List;
import java.util.ArrayList;

public class Clavier implements Saisissable
{
	IEnv env;

	public Clavier(IEnv env)
	{
		this.env = env;
	}

	/**
	 * Filtre parmi les noeuds de alc ceux qui pourraient correspondre) à la touche pressée.
	 * @param alc une liste de noeuds : les complétions possibles
	 * @param touche la touche préssée, comprise entre 1 et 9
	 * @return le sous ensemble de alc dont la lettre correspond à la touche pressée selon l'environnement fourni.
	 * @throws MauvaiseTouche si la touche n'est pas entre 1 et 9
	 */
	public List<INoeud> uneTouche(List<INoeud> alc, int touche) throws MauvaiseTouche
	{
		String s = this.env.get(touche);
		List<INoeud> l = new ArrayList<INoeud>();

		for(int i = 0; i < alc.size(); i++)
		{
			for(int j = 0; j < s.length(); j++)
			{
				if(alc.get(i).getLettre() == s.charAt(j))
					l.add(alc.get(i));
			}
		}

		return l;
	}

	/**
     * Rend les noeuds qui permettent de compléter la séquence de touches donnée.
     * @param alc les têtes de mots du dictionnaire
     * @param touches une séquence de touches ayant été pressées
     * @return une liste de noeuds compatibles avec la séquence de touches pressée.
	 * @throws MauvaiseTouche si la touche n'est pas entre 1 et 9
     */
	public List<INoeud> seqTouche(List<INoeud> alc, int[] touches) throws MauvaiseTouche
	{
		List<INoeud> l = alc;
		List<INoeud> t = new ArrayList<INoeud>();

		for(int i = 0; i < touches.length; i++)
		{
			t.clear();
			t = this.uneTouche(l, touches[i]);
			l.clear();

			if(i < touches.length-1)
				for(int j = 0; j < t.size(); j++)
					l.addAll(t.get(j).getFils());
		}

		return t;
	}
}
