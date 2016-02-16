package pobj.algogen.doubles;

import java.util.Random;

import pobj.algogen.AbstractIndividu;
import pobj.algogen.IIndividu;

/**
 * Classe représentant un individu évolutif
 */
public class IndividuDouble extends AbstractIndividu implements IIndividu
{
	double valeur;
	public static final Random r = new Random();

	/**
	 * Instancie un Individu évolutif caractérisé par une valeur donnée
	 * @param  v Valeur propre de l'individu
	 */
	public IndividuDouble(double v)
	{
		valeur = v;
	}

	/**
	 * Instancie un individu évolutif caractérisé par une valeur aléatoire.
	 */
	public IndividuDouble()
	{
		this(r.nextDouble());
	}

	/* (non-Javadoc)
	 * @see pobj.algogen.IIndividu#getValeur()
	 */
	@Override
	public Object getValeur()
	{
		return valeur;
	}

	/* (non-Javadoc)
	 * @see pobj.algogen.IIndividu#muter()
	 */
	@Override
	public void muter()
	{
		double m = ((r.nextDouble() - 0.5) / 5.0);
		
		if ((valeur + m > 1.0) || (valeur + m < 0.0))
		{
			valeur-= m;
		}
		else
		{
			valeur+= m;
		}
	}

	/* (non-Javadoc)
	 * @see pobj.algogen.IIndividu#croiser(pobj.algogen.IIndividu)
	 */
	@Override
	public IndividuDouble croiser(IIndividu autre)
	{
		double autreVal = 0.0;
		
		if (autre.getValeur() instanceof Double)
		{
			autreVal = (Double) autre.getValeur();
		}
		else
		{
			throw new IllegalArgumentException("Individu de types différents");
		}
		
		double l = (valeur + autreVal) / 2;
		double m = (r.nextDouble() - 0.5) / 10;
		
		if ((l + m > 1.0) || (l + m < 0.0))
		{
			return new IndividuDouble(l - m);
		}
		else
		{
			return new IndividuDouble(l + m);
		}
	}
	
	@Override
	public IndividuDouble clone()
	{
		IndividuDouble i = new IndividuDouble(valeur);
		i.setFitness(fitness);
	
		return i;
	}

	/* (non-Javadoc)
	 * @see pobj.algogen.IIndividu#toString()
	 */
	@Override
	public String toString()
	{
		return "Individu | Valeur propre = " + valeur + " | Fitness = " + fitness + "\n";
	}
}