package pobj.algogen.agent;

import agent.control.IControleur;
import pobj.algogen.AbstractIndividu;
import pobj.algogen.IIndividu;

public class IndividuControleur extends AbstractIndividu<IControleur> {
	
	private IControleur control;
	
	static double mutationProba = 0.2;
	
	public IndividuControleur(IControleur c) {
		control = c;
	}
	
	@Override
	public void muter() {
		control.muter(mutationProba);
	}

	@Override
	public IIndividu<IControleur> croiser(IIndividu<IControleur> autre) {
		return new IndividuControleur(control.creeFils(autre.getValeur(), mutationProba));
	}

	@Override
	public IIndividu<IControleur> clone() {
		return new IndividuControleur(control.clone());
	}

	@Override
	public String toString() {
		//return control.toString();
		return "";
	}

	@Override
	public IControleur getValeur() {
		return control;
	}
	
}
