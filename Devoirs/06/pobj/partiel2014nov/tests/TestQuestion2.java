package pobj.partiel2014nov.tests;

//import static org.fw4ex.junit.Assert.*;
import static org.junit.Assert.*;
import org.junit.*;

import pobj.partiel2014nov.EnvFactory;
import pobj.partiel2014nov.IEnv;
import pobj.partiel2014nov.MauvaiseTouche;


public class TestQuestion2 {

  @Test
	public void test1() {
		IEnv env = EnvFactory.creerEnv();
		String s = "";
		try {
			s = env.get(2);
			assertTrue(true);
		} catch (MauvaiseTouche mt) {
			s = "MauvaiseTouche - 2";
			assertTrue(false);
		}
		System.out.println(s);
		try {
			s = env.get(12);
			s = "Probleme";
			assertTrue(false);
		} catch (MauvaiseTouche mt) {
			s = "Ok - 12";
			assertTrue(true);
		}
		System.out.println(s);
	}

}

