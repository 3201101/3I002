package pobj.partiel2014nov.tests;
import java.util.ArrayList;
import java.util.List;

//import static org.fw4ex.junit.Assert.*;
import static org.junit.Assert.*;
import org.junit.*;

import pobj.partiel2014nov.Clavier;
import pobj.partiel2014nov.DicoCompte;
import pobj.partiel2014nov.EnvFactory;
import pobj.partiel2014nov.IEnv;
import pobj.partiel2014nov.INoeud;
import pobj.partiel2014nov.MauvaiseTouche;


public class TestQuestion9 {

	@Test
	public void test1() {
		IEnv env = EnvFactory.creerEnv();
		Clavier cv = new Clavier(env);
		List<INoeud> nil = new ArrayList<INoeud>();

		DicoCompte d7 = new DicoCompte(nil);
		d7.ajoute("BRUNE");
		d7.ajoute("BRUN");
		d7.ajoute("LION");
		d7.ajoute("LUNE");
		d7.ajoute("PION");
		d7.ajoute("PRUNE");
		List<INoeud> il8=new ArrayList<INoeud>();
		try {
			il8 = cv.uneTouche(d7.getDico(),7);
		} catch (MauvaiseTouche e) {
			assertTrue(false);
		}
		DicoCompte d8 = new DicoCompte(il8); 
		System.out.println("===+>" + d8.nombreNoeud());
		System.out.println("===+>" + d8.nombreMot());
		assertTrue(d8.nombreMot() == 2);
		assertTrue(d8.nombreMot() == 2);
		assertTrue(d8.nombreNoeud() == 8);
	}

	@Test
	public void test2() {
		IEnv env = EnvFactory.creerEnv();
		Clavier cv = new Clavier(env);
		List<INoeud> nil = new ArrayList<INoeud>();

		DicoCompte d7 = new DicoCompte(nil);
		d7.ajoute("BRUNE");
		d7.ajoute("BRUN");
		d7.ajoute("LION");
		d7.ajoute("LUNE");
		d7.ajoute("PION");
		d7.ajoute("PRUNE");


		int[] touches = {7, 4, 6}; 
		List<INoeud> il9= new ArrayList<INoeud>();
		try {
			il9 = cv.seqTouche(d7.getDico(), touches);
		} catch (MauvaiseTouche e) {
			assertTrue(false);
		}
		DicoCompte  d9 = new DicoCompte(il9);
		assertTrue(d9.nombreNoeud() == 2);
		assertTrue(d9.nombreMot() == 1);

	}

}
