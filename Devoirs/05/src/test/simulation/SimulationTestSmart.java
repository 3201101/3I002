package test.simulation;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import agent.Simulation;
import agent.control.ControlFactory;
import agent.control.IControleur;
import agent.laby.ChargeurLabyrinthe;
import agent.laby.Labyrinthe;
import agent.laby.VerificationLaby;
import agent.laby.exception.LabyErroneException;

public class SimulationTestSmart {
	
	private Simulation simul;

	@Before
	public void setUp() throws Exception {
		String labyFile = "goal.mze";
		Labyrinthe laby = ChargeurLabyrinthe.chargerLabyrinthe(labyFile);
		try{
			VerificationLaby.verifierConditions(laby);
		}
		catch(LabyErroneException e){
			VerificationLaby.corrigerConditions(laby);
		}
		IControleur sc = ControlFactory.createControleurSmart();
		simul = new Simulation(laby, sc);
	}

	@Test
	public void testMesurePerf() {
		assertEquals(simul.mesurePerf(100), 4);
	}

}
