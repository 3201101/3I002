package pobj.algogen.arith;

import pobj.algogen.AbstractIndividu;
import pobj.algogen.IIndividu;
import pobj.arith.Expression;
import pobj.arith.ExpressionFactory;
import pobj.arith.Operator;

public class IndividuExpression extends AbstractIndividu<Expression> {
	
	private Expression valeur;
	
	public IndividuExpression() {
		this(ExpressionFactory.createRandomExpression(3));
	}
	
	public IndividuExpression(Expression e) {
		valeur = e;
	}

	@Override
	public Expression getValeur() {
		return valeur;
	}

	@Override
	public void muter() {
		valeur = ExpressionFactory.createRandomExpression(3);
	}

	@Override
	public IIndividu<Expression> croiser(IIndividu<Expression> autre) {
			Expression l = ExpressionFactory.createOperateurBinaire(Operator.PLUS, this.valeur, autre.getValeur());
			Expression r = ExpressionFactory.createConstante(2);
			Expression val = ExpressionFactory.createOperateurBinaire(Operator.DIV, l, r);
			return new IndividuExpression(val);
	}

	@Override
	public IIndividu<Expression> clone() {
		return new IndividuExpression(valeur);
	}
	
	@Override
	public String toString() {
		return "Individu | Valeur propre = " + valeur + " | Fitness = " + fitness + "\n";
	}

}
