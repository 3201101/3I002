package pobj.algogen.arith;

import java.util.Random;

import pobj.algogen.Environnement;
import pobj.algogen.IIndividu;
import pobj.arith.EnvEval;
import pobj.arith.Expression;
import pobj.arith.ExpressionFactory;

public class FonctionCible implements Environnement {
	
	public final EnvEval env;
	private double valeur;
	public static final Random r = new Random();

	public FonctionCible(EnvEval e, double c) {
		env = e;
		valeur = c;
	}
	
	public FonctionCible() {
		this(ExpressionFactory.createRandomEnvEval(ExpressionFactory.MAXVARIABLES), r.nextDouble());
	}
	
	@Override
	public double eval(IIndividu i) {
		if (i.getValeur() instanceof Expression) {
			Expression val = (Expression) i.getValeur();
			return ( 1 / ( (valeur - val.eval(env)) * (valeur - val.eval(env)) ) );
		}
		else
		{
			throw new IllegalArgumentException("Not a IndividuDouble");
		}
	}
	
	@Override
	public String toString() {
		return "Environement d'évaluation d'expressions pour " + valeur + " : " + env;
	}
}
