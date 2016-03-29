package pobj.arith;

public class Constante implements Expression
{
	
	public final double val;
	
	Constante(double n)
	{
		val = n;
	}
	
	public double getVal()
	{
		return val;
	}

	@Override
	public double eval(EnvEval e) {
		return val;
	}
	
	@Override
	public String toString() {
		return String.valueOf(val);
	}
}

