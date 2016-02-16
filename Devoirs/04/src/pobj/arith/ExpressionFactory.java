package pobj.arith;

import java.util.NoSuchElementException;
import java.util.Random;

public class ExpressionFactory
{
	static Random r = new Random();
	
	/**
	 * Un constructeur pour des expressions binaires usuelles : +, -, *, /
	 * @param op Le type de l'opérande, {@link Operator}, PLUS, MINUS, MULT, DIV
	 * @param left Opérande gauche
	 * @param right Opérande droite
	 * @return Une expression binaire
	 */
	public static Expression createOperateurBinaire(Operator op, Expression left, Expression right)
	{
		return new OperateurBinaire(op, left, right);
	}
	
	/**
	 * Un constructeur d'expressions constantes
	 * @param constant Sa valeur
	 * @return Une constante
	 */
	public static Expression createConstante(double constant)
	{
		return new Constante(constant);
	}
	
	/**
	 * Un constructeur de variables, identifiées par un entier compris entre 0 et MAXVARIABLES.
	 * La demande de création de variables d’indice plus grand entraine un accroissement de MAXVARIABLES (static).
	 * @param id Indice de la variable
	 * @return Une variable
	 */
	public static Expression createVariable(int id)
	{
		return new Variable(id);
	}
	
	public static Expression createRandomExpression(int depth)
	{
		if(depth > 0)
		{
			switch (r.nextInt(3))
			{
				case 0:
					Operator o;
					switch (r.nextInt(3))
					{
						case 0:
							o = Operator.PLUS;
							break;
							
						case 1:
							o = Operator.MINUS;
							break;
							
						case 2:
							o = Operator.MULT;
							break;
		
						default:
							throw new NoSuchElementException();
					}
					return createOperateurBinaire(o, createRandomExpression(depth-1), createRandomExpression(depth-1));
					
				case 1:
					return createConstante(r.nextDouble());
					
				case 2:
					return createVariable(r.nextInt(EnvEval.MAXVARIABLES));
	
				default:
					throw new NoSuchElementException();
			}
		}
		else
		{
			if(r.nextBoolean())
			{
				return createConstante(r.nextDouble());
			}
			else
			{
				return createVariable(r.nextInt(EnvEval.MAXVARIABLES));
			}
		}
	}
}
