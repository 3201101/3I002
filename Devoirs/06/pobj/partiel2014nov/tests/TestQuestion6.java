package pobj.partiel2014nov.tests;
import java.util.ArrayList;
import java.util.List;

//import static org.fw4ex.junit.Assert.*;
import static org.junit.Assert.*;
import org.junit.*;

import pobj.partiel2014nov.Compte;
import pobj.partiel2014nov.Dico;
import pobj.partiel2014nov.DicoAbs;
import pobj.partiel2014nov.INoeud;
import pobj.partiel2014nov.Question5;


public class TestQuestion6 {

  @Test
  public void test1() {
    Dico d = Question5.creerDico();
    INoeud x = DicoAbs.chercheNoeud(d.getDico(), 'F');
    assertTrue(x != null); 
    assertTrue ( ( Compte.nombreNoeud(x) == 11) || ( Compte.nombreMot(x) == 6));
    assertTrue ( ( Compte.nombreNoeud(x) == 11) && ( Compte.nombreMot(x) == 6));
  }
	 
  @Test
  public void test2() {
    Dico d = new Dico(); 
    d.ajoute("BRUN");
    d.ajoute("BRUNE");
    d.ajoute("LION");
    d.ajoute("LUNE");
    d.ajoute("PION");
    d.ajoute("PRUNE");
    INoeud x = DicoAbs.chercheNoeud(d.getDico(), 'L');
    assertTrue(x != null); 
    assertTrue ( ( Compte.nombreNoeud(x) == 7) || ( Compte.nombreMot(x) == 2));
    assertTrue ( ( Compte.nombreNoeud(x) == 7) && ( Compte.nombreMot(x) == 2));
  }


  @Test
  public void test3() {
    List<INoeud> nil = new ArrayList<INoeud>();
    Dico d = new Dico(nil); 
    d.ajoute("BRUN");
    d.ajoute("BRUNE");
    d.ajoute("LION");
    d.ajoute("LUNE");
    d.ajoute("PION");
    d.ajoute("PRUNE");
    INoeud x = DicoAbs.chercheNoeud(d.getDico(), 'B');
    assertTrue(x != null); 
    assertTrue ( ( Compte.nombreNoeud(x) == 5) || ( Compte.nombreMot(x) == 2));
    assertTrue ( ( Compte.nombreNoeud(x) == 5)) ; 
    assertTrue ( ( Compte.nombreMot(x) == 2));
  }


}
