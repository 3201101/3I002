package agent.laby.interf;

import java.awt.event.ActionEvent;

import agent.laby.Labyrinthe;
import pobj.obs.ISimpleObserver;

public class LabyActivePanel extends LabyPanel implements ISimpleObserver {

	public LabyActivePanel(Labyrinthe laby) {
		super(laby);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void update() {
		try{
			Thread.sleep(500);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		updateGraphics();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
