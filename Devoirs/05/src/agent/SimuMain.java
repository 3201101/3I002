package agent;

import java.io.IOException;

import agent.control.ControlFactory;
import agent.control.IControleur;
import agent.laby.ChargeurLabyrinthe;
import agent.laby.Labyrinthe;

/**
 * Classe principale pour tester le comportement des agents dans
 *         le labyrinthe.
 *  @author sigaud 
 */
public class SimuMain {

	/**
	 * @param args[0] : nom du fichier contenant le labyrinthe
	 * @param args[1] : nombre de pas d'évaluation
	 * @param args[2] : nombre de règles par controleur
	 */
	public static void main(String[] args) {

		String labyFile = "goal.mze"; // args[0];
		int nbSteps = 50; // Integer.parseInt(args[1]);
		//int nbRules = 10; // Integer.parseInt(args[2]);
		try {
			Labyrinthe laby = ChargeurLabyrinthe.chargerLabyrinthe(labyFile);

			//IControleur sc = ControlFactory.createControleur(nbRules);
			IControleur sc = ControlFactory.createControleurSmart();
			Simulation sim = new Simulation(laby, sc);
			System.out.println("Regles du controleur :");
			System.out.println(sc);
			System.out.println("\nLabi avant :");
			System.out.println(sim.getLaby());
			System.out.println("\nNombre de points :");
			System.out.println(sim.mesurePerf(nbSteps, System.out));
			System.out.println("\nLabi apres :");
			System.out.println(sim.getLaby());

		} catch (IOException e) {
			System.out.println("Problème de chargement du labyrinthe"+e);
			System.exit(1);
		}
	}
}
