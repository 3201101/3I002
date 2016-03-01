package pobj.partiel2014nov.tests;

//import static org.fw4ex.junit.Assert.*;
import static org.junit.Assert.*;
import org.junit.*;

import pobj.partiel2014nov.*;

public class TestQuestion1 {

	@Test
	public void test1() {
		IEnv e = new Env();
		try {
			e.set(1, " ");
			e.set(2, "ABC");
			e.set(3, "DEF");
			e.set(4, "GHI");
			e.set(5, "JKL");
			e.set(6, "MNO");
			e.set(7, "PQRS");
			e.set(8, "TUV");
			assertTrue(true);
		} catch (MauvaiseTouche mt) {
			assertTrue(false);
		}

		try {
			String s = e.get(7);
			assertTrue(s.equals("PQRS"));
		} catch (MauvaiseTouche mt) {
			assertTrue(false);
		} catch (Exception ex) {
			assertTrue(false);
		}

		try {
			e.get(10);
			assertTrue(false);
		} catch (MauvaiseTouche mt) {
			assertTrue(true);
		} catch (Exception ex) {
			assertTrue(false);
		}
		
		try {
			String s = "PRE";
			e.set(3,s);
			assertTrue( e.get(3).equals(s) );
		} catch (Exception ex) {
			assertTrue(false);
		}
		
	}

}
