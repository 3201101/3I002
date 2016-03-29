package pobj.algogen;

public interface IIndividu<T> extends Comparable<IIndividu<T>> {

	/**
	 * Retourne la valeur propre de l'individu
	 * @return Valeur propre de l'individu
	 */
	public abstract T getValeur();

	/**
	 * Retourne la valeur de la qualité
	 * @return Valeur de fitness
	 */
	public abstract double getFitness();

	/**
	 * Définit la valeur de la qualité
	 * @param f nouvelle valeur de fitness
	 */
	public abstract void setFitness(double f);

	/**
	 * Mute l'Individu en lui attribuant une nouvelle valeur aléatoire égale à plus ou moins 20% de la valeur précédente
	 */
	public abstract void muter();

	/**
	 * Croise deux Individus et crée un nouvel Individu dont la valeur propre est la moyenne des deux parents assortie d'une mutation de 10% maximum.
	 * @param  autre Second parent
	 * @return       Individu enfant créé
	 */
	public abstract IIndividu<T> croiser(IIndividu<T> autre);

	/**
	 * Retourne un clone de l'objet courant.
	 * @return Individu identique
	 */
	public abstract IIndividu<T> clone();

	/**
	 * Compare deux Individus
	 * @param  o Individu à comparer
	 * @return   -1 si o est plus petit, 1 si this est plus petit, 0 s'ils sont égaux
	 */
	public abstract int compareTo(IIndividu<T> o);

	/**
	 * Affiche un résumé textuel de l'Individu.
	 */
	public abstract String toString();

}