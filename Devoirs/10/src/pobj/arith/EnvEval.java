package pobj.arith;

import java.util.ArrayList;

public class EnvEval
{
	private ArrayList<Double> variables = new ArrayList<>();
	
	public void addVariable(double val) {
		variables.add(val);
	}
	
	public void setVariable(int indexVariable, double val)
	{
		variables.set(indexVariable, val);
	}
	
	double getValue(int indexVariable)
	{
		return variables.get(indexVariable);
	}
	
	public int getSize()
	{
		return variables.size();
	}
	
	@Override
	public String toString()
	{
		String str = "Voici le tableau de valeur :\n";
		for(int i = 0; i < this.getSize(); i++)
		{
			str += "X" + i + " -> " + variables.get(i) + "\n";
		}
		return str;
	}
}
