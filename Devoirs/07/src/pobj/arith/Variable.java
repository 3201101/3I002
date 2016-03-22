package pobj.arith;

public class Variable implements Expression {
	
	public final int rang;
	
	Variable(int n) {
		rang = n;
	}
	
	public double getRang()
	{
		return rang;
	}

	@Override
	public double eval(EnvEval e) {
		return e.getValue(rang);
	}
	
	@Override
	public String toString() {
		return "X" + rang;
	}

}
