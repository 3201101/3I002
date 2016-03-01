package pobj.partiel2014nov.tests;

//import static org.fw4ex.junit.Assert.*;
import static org.junit.Assert.*;
import org.junit.*;

import pobj.partiel2014nov.Dico;
import pobj.partiel2014nov.Question5;


public class TestQuestion5 {

  @Test
  public void test1() {
   Dico d5 = Question5.creerDico(); 
   assertTrue( ! (d5.appartient("BONJOUR")));
   assertTrue(d5.appartient("FRIT") || d5.appartient("BRUN"));
   assertTrue(d5.appartient("FRITE") || d5.appartient("BRUNE"));
   assertTrue( ! (d5.appartient("FRITO")));
  }

  @Test
  public void test2() {
   Dico d5 = Question5.creerDico(); 
   assertTrue(d5.appartient("FA") || d5.appartient("LION"));
   assertTrue( ! (d5.appartient("FAU")));
  }

}
