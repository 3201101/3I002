package pobj.partiel2014nov.tests;

//import static org.fw4ex.junit.Assert.*;
import static org.junit.Assert.*;
import org.junit.*;

import pobj.partiel2014nov.Dico;
import pobj.partiel2014nov.DicoAbs;
import pobj.partiel2014nov.INoeud;
import pobj.partiel2014nov.Question8;


public class TestQuestion8 {

  @Test
  public void test1() {
    Dico d = new Dico();
    d.ajoute("FA");     
    d.ajoute("FAR");
    d.ajoute("FAUX");
    d.ajoute("FRISE");
    d.ajoute("FRIT");
    d.ajoute("FRITE");
    INoeud n = DicoAbs.chercheNoeud(d.getDico(),'F');
    assertTrue(n!=null);
    String s = Question8.toString(n);  
    int len = s.length();
    assertTrue((len > 22) && (len < 30));
    assertTrue(s.indexOf("FAUX\n") >= 0);
//    assertTrue(s.indexOf("FRISE") >= 0);
//    assertTrue(s.indexOf("FAFAR") == -1);
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
    String s = Question8.toString(d);  
    assertTrue(s.indexOf("BRUN\n") >= 0);
    assertTrue(s.indexOf("BRUNE\n") >= 0);
    assertTrue(s.indexOf("BRUNBRUNE\n") == -1);
  }

}
