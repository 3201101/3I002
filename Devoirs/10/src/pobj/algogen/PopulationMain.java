package pobj.algogen;

import java.io.IOException;

import agent.control.IControleur;
import agent.laby.ChargeurLabyrinthe;
import agent.laby.Labyrinthe;
import agent.laby.interf.LabyViewer;
import pobj.algogen.agent.SimulationCible;
import pobj.algogen.arith.FonctionCible;
import pobj.algogen.doubles.ValeurCible;
import pobj.arith.Expression;
import pobj.util.Configuration;
import pobj.util.Generateur;

/**
 * Classe d'éxecution du simulateur d'évolution
 */
public class PopulationMain
{
	private static Configuration conf = Configuration.getInstance();
	public static final String CONTROL_INDIV = "Control";
	public static final String EXP_INDIV = "Exp";
	public static final String DOUBLE_INDIV = "Double";
	
	public static void setDefaultConfig(){
		conf.setParameterValue(AlgoGenParameter.LABYRINTHE, "QRBen.mze");
		conf.setParameterValue(AlgoGenParameter.NB_GEN, "100");
		conf.setParameterValue(AlgoGenParameter.NB_PAS, "10");
		conf.setParameterValue(AlgoGenParameter.SEED, "123");
		conf.setParameterValue(AlgoGenParameter.TAILLE_POP, "100");
		conf.setParameterValue(AlgoGenParameter.TYPE_INDIVIDU, CONTROL_INDIV);
		conf.setParameterValue(Population.RATIO, "0.2");
		conf.setParameterValue(Population.UNI, Boolean.toString(false));
	}
	
	/**
	 * Éxecuté au lancement du programme, lance une simulation de population d'individus évolutifs
	 * @param args Arguments de lancement
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException{
		if(args.length > 0){
			String f = args[0];
			try{
				conf.setConfigurationFromFile(f);
			}
			catch(IOException e){
				setDefaultConfig();
				conf.saveConfigurationToFile(f);
			}
		}
		else{
			setDefaultConfig();
		}	
		
		switch (conf.getParameterValue(AlgoGenParameter.TYPE_INDIVIDU)) {
		case CONTROL_INDIV:
			testControlPop();
			break;
		case EXP_INDIV:
			testExpPop();
			break;
		case DOUBLE_INDIV:
			testDoublePop();
			break;
		default:
			System.err.println("Invalid configuration file");
			break;
		}
	}
		
	public static void testControlPop() throws IOException{
		int taillePop = Integer.parseInt(conf.getParameterValue(AlgoGenParameter.TAILLE_POP));

		String ficLaby = conf.getParameterValue(AlgoGenParameter.LABYRINTHE);
		Labyrinthe laby = ChargeurLabyrinthe.chargerLabyrinthe(ficLaby);
		int nbPas = Integer.parseInt(conf.getParameterValue(AlgoGenParameter.NB_PAS));

		Population<IControleur> pop = PopulationFactory.createRandomControleurPopulation(taillePop);
		Environnement<IControleur> env = new SimulationCible(laby, nbPas);
		
		pop = PopulationMain.algoGen(pop, env);
		
		new LabyViewer(laby, pop.getList().get(0).getValeur() , Integer.parseInt(conf.getParameterValue(AlgoGenParameter.NB_PAS)));
	}
	
	public static void testExpPop(){
		Generateur.setSeed(Long.parseLong(conf.getParameterValue(AlgoGenParameter.SEED)));
		int taillePop = Integer.parseInt(conf.getParameterValue(AlgoGenParameter.TAILLE_POP));

		Population<Expression> pop = PopulationFactory.createRandomExpressionPopulation(taillePop);
		Environnement<Expression> env = new FonctionCible();
	
		PopulationMain.algoGen(pop, env);
		
		System.out.println(env);
	}
	
	public static void testDoublePop(){
		Generateur.setSeed(Long.parseLong(conf.getParameterValue(AlgoGenParameter.SEED)));
		int taillePop = Integer.parseInt(conf.getParameterValue(AlgoGenParameter.TAILLE_POP));
		
		Population<Double> pop = PopulationFactory.createRandomDoublePopulation(taillePop);
		Environnement<Double> env = new ValeurCible();
	
		PopulationMain.algoGen(pop, env);
	}
	
	public static <T> Population<T> algoGen(Population<T> pop, Environnement<T> env){
		Generateur.setSeed(Long.parseLong(conf.getParameterValue(AlgoGenParameter.SEED)));
		int nbGen = Integer.parseInt(conf.getParameterValue(AlgoGenParameter.NB_GEN));
		
		/* Création d'une population aléatoire d'Individus */
		Population<T> p = pop;
		System.out.println("\nPopulation initiale\n");
		System.out.println(p);
	
		/* Création d'un environnement basique aléatoire */
		Environnement<T> e = env;
	
		/* Évaluation de la population */
		p.evaluer(e);
		System.out.println("\nPopulation évaluée\n");
		System.out.println(p);
		
		/* Évolution de la population */
		for(int i = 0; i < nbGen; i++)
		{
			p = p.evoluer(e);
			System.out.println("\nPopulation de génération " + i + "\n");
			System.out.println(p);
		}
		return p;
	}
}