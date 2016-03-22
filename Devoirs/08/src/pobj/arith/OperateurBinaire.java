package pobj.arith;

import java.util.NoSuchElementException;

public class OperateurBinaire implements Expression
{
	public final Expression left;
	public final Expression right;
	public final Operator op;
	
	
	OperateurBinaire(Operator o, Expression l, Expression r)
	{
		op = o;
		left = l;
		right = r;
	}

	public Expression getLeft()
	{
		return left;
	}
	
	public Expression getRight()
	{
		return right;
	}

	@Override
	public double eval(EnvEval e) {
		switch (op) {
		case DIV:
			return left.eval(e) / right.eval(e);
			
		case MINUS:
			return left.eval(e) - right.eval(e);

		case MULT:
			return left.eval(e) * right.eval(e);

		case PLUS:
			return left.eval(e) + right.eval(e);

		default:
			throw new NoSuchElementException();
		}
	}
	
	@Override
	public String toString() {
		switch (op) {
		case DIV:
			return "(" + left.toString() + " / " + right.toString() + ")";
			
		case MINUS:
			return "(" + left.toString() + " - " + right.toString() + ")";

		case MULT:
			return "(" + left.toString() + " * " + right.toString() + ")";

		case PLUS:
			return "(" + left.toString() + " + " + right.toString() + ")";

		default:
			throw new NoSuchElementException();
		}
	}
}