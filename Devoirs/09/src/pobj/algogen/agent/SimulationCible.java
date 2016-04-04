package pobj.algogen.agent;

import agent.Simulation;
import agent.control.IControleur;
import agent.laby.Labyrinthe;
import pobj.algogen.Environnement;
import pobj.algogen.IIndividu;

public class SimulationCible implements Environnement<IControleur> {

	Labyrinthe laby;
	int nbPas;
	
	public SimulationCible(Labyrinthe l, int n) {
		laby = l;
		nbPas = n;
	}
	
	@Override
	public double eval(IIndividu<IControleur> i) {
		Simulation sim = new Simulation(laby.clone(), i.getValeur());
		return sim.mesurePerf(nbPas);
	}
}
