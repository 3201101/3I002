package pobj.partiel2014nov.tests;
import java.util.ArrayList;
import java.util.List;

//import static org.fw4ex.junit.Assert.*;
import static org.junit.Assert.*;
import org.junit.*;

import pobj.partiel2014nov.Dico;
import pobj.partiel2014nov.INoeud;


public class TestQuestion4 {

  @Test
  public void test1() {
    List<INoeud> nil = new ArrayList<INoeud>();
    Dico d = new Dico(nil);
    d.ajoute("FA");	
    d.ajoute("FAR");
    d.ajoute("FAUX");
    d.ajoute("FRISE");
    d.ajoute("FRIT");
    d.ajoute("FRITE");
    assertTrue(d.appartient("FRIT")); 
    assertTrue(d.appartient("FRITE")); 
    assertTrue(! (d.appartient("FRIC")));
  }

  @Test
  public void test2() {
    List<INoeud> nil = new ArrayList<INoeud>();
    Dico d = new Dico(nil);
    d.ajoute("BRUNE");
    d.ajoute("BRUN");
    d.ajoute("LION");
    d.ajoute("LUNE");
    d.ajoute("PION");
    d.ajoute("PRUNE");
    assertTrue(d.appartient("BRUN")); 
    assertTrue(d.appartient("BRUNE")); 
    assertTrue(! (d.appartient("BRUNIE")));
  }

  @Test
  public void test3() {
    List<INoeud> nil = new ArrayList<INoeud>();
    Dico d = new Dico(nil);
    assertTrue(! (d.appartient("BONJOUR")));
    assertTrue(! (d.appartient("SALUT")));
    d.ajoute("BONJOUR");
    d.ajoute("SALUTATION");
    assertTrue(! (d.appartient("SALUT")));
    d.ajoute("SALUT");
    assertTrue((d.appartient("SALUT")));
  }

}

