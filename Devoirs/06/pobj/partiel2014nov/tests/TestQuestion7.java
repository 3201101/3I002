package pobj.partiel2014nov.tests;
import java.util.ArrayList;
import java.util.List;

//import static org.fw4ex.junit.Assert.*;
import static org.junit.Assert.*;
import org.junit.*;

import pobj.partiel2014nov.DicoCompte;
import pobj.partiel2014nov.INoeud;


public class TestQuestion7 {

  @Test
  public void test1() {
    List<INoeud> nil = new ArrayList<INoeud>();
    DicoCompte d = new DicoCompte(nil);
    d.ajoute("FA");     
    d.ajoute("FAR");
    d.ajoute("FAUX");
    d.ajoute("FRISE");
    d.ajoute("FRIT");
    d.ajoute("FRITE");
    assertTrue( d.nombreNoeud() == 11);
    assertTrue( d.nombreMot() == 6);
  }

  @Test
  public void test2() {
    List<INoeud> nil = new ArrayList<INoeud>();
    DicoCompte d = new DicoCompte(nil);
    d.ajoute("BRUN");
    d.ajoute("BRUNE");
    d.ajoute("LION");
    d.ajoute("LUNE");
    d.ajoute("PION");
    d.ajoute("PRUNE");
    assertTrue( d.nombreNoeud() == 20);
    assertTrue( d.nombreMot() == 6);
    d.ajoute("LIN");
    assertTrue( d.nombreNoeud() == 21);
    assertTrue( d.nombreMot() == 7);

  }

}
