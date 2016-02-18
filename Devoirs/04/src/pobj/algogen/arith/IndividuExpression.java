package pobj.algogen.arith;

import pobj.algogen.AbstractIndividu;
import pobj.algogen.IIndividu;
import pobj.arith.Expression;
import pobj.arith.ExpressionFactory;
import pobj.arith.Operator;

public class IndividuExpression extends AbstractIndividu {
	
	private Expression valeur;
	
	public IndividuExpression() {
		this(ExpressionFactory.createRandomExpression(3));
	}
	
	public IndividuExpression(Expression e) {
		valeur = e;
	}

	@Override
	public Object getValeur() {
		return valeur;
	}

	@Override
	public void muter() {
		valeur = ExpressionFactory.createRandomExpression(3);
	}

	@Override
	public IIndividu croiser(IIndividu autre) {
		if (autre instanceof IndividuExpression) {
			IndividuExpression a = (IndividuExpression) autre;
			
			Expression l = ExpressionFactory.createOperateurBinaire(Operator.PLUS, this.valeur, a.valeur);
			Expression r = ExpressionFactory.createConstante(2);
			Expression val = ExpressionFactory.createOperateurBinaire(Operator.DIV, l, r);
			return new IndividuExpression(val);
		}
		throw new IllegalArgumentException("Individu de types différents");
	}

	@Override
	public IIndividu clone() {
		return new IndividuExpression(valeur);
	}
	
	@Override
	public String toString() {
		return "Individu | Valeur propre = " + valeur + " | Fitness = " + fitness + "\n";
	}

}
