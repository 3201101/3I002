package pobj.arith;

import java.util.Random;

public class EnvEval
{
	static int MAXVARIABLES = 10;
	static Random r = new Random();
	private double tabVal[];
	
	public EnvEval(int nbVal)
	{
		if(nbVal > MAXVARIABLES)
			throw new IllegalArgumentException("Argument superior to MAXVARIABLE");
		tabVal = new double[nbVal];
	}
	
	public static EnvEval randEnv(int nbVal)
	{
		EnvEval e = new EnvEval(nbVal);
		for(int i = 0; i < MAXVARIABLES; i++)
		{
			e.tabVal[i] = r.nextDouble();
		}
		return e;
	}
	

	public void setVariable(int indexVariable, double val)
	{
		tabVal[indexVariable] = val;
	}
	
	double getValue(int indexVariable)
	{
		return tabVal[indexVariable];
	}
	
	@Override
	public String toString()
	{
		String str = "Voici le tableau de valeur :\n";
		for(int i = 0; i < tabVal.length; i++)
		{
			str += i + " -> " + tabVal[i];
		}
		return str;
	}
}
