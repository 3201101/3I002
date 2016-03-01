package pobj.partiel2014nov.tests;
import java.util.ArrayList;
import java.util.List;

//import static org.fw4ex.junit.Assert.*;
import static org.junit.Assert.*;
import org.junit.*;

import pobj.partiel2014nov.INoeud;
import pobj.partiel2014nov.NoeudFactory;


public class TestQuestion3 {

  @Test
  public void test1() {
    List<INoeud> nil = new ArrayList<INoeud>();
    INoeud n = NoeudFactory.createNoeud('c',nil,false);
    assertTrue(n.getLettre() == 'c');
    assertTrue(! n.isMarque());
    assertTrue(n.getFils().isEmpty());
  }

  @Test
  public void test2() {
	  List<INoeud> nil = new ArrayList<INoeud>();
	  INoeud n = NoeudFactory.createNoeud('a',nil,false);
	  assertTrue(n.getLettre() == 'a');
	  //assertTrue(n.isMarque());
	  assertTrue(n.getFils().isEmpty());
  }

}

