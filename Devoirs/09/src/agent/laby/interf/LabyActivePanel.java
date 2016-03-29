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
		modifLaby();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		// requalifier le type de la source
//		CaseButton c = (CaseButton) e.getSource();
//		// mettre à jour l'aspect du bouton
//		c.setAspect(actionSelected);
//		// mettre à jour le Maze à la position concernée
//		laby.setContenuCase(c.getPosition(), actionSelected);
	}
}
