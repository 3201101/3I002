package pobj.partiel2014nov;

import java.util.List;

public class NoeudFactory
{
	/**
	 * Fabrique un nouveau noeud de l’arbre avec les caractéristiques souhaitées.
	 * @param  lettre   lettre la lettre qui étiquette ce noeud
	 * @param  fils     fils la liste des fils de ce noeud
	 * @param  isMarked vrai si le noeud est marqué (c’est la fin d’un mot
	 * @return          un noeud nouvellement créé
	 */
	public static INoeud createNoeud(char lettre, List<INoeud> fils, boolean isMarked)
	{
		return Noeud(lettre, fils, isMarked);
	}
}