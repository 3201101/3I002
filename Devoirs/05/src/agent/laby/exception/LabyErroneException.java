package agent.laby.exception;

import java.awt.Point;

public class LabyErroneException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Point p;

	public LabyErroneException(Point p)
	{
		this.p = p;
	}
	public Point getP()
	{
		return p;
	}
	
	@Override
	public String toString() {
		return super.toString() + " au point : " + p;
	}
}