package pobj.util.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import pobj.util.MyArrayList;

public class MyArrayTest {

	@Test
	public void test() {
		MyArrayList<Integer> t = new MyArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		assertTrue(t.get(2) == 3);
	}
	
	@Test
	public void test2() {
		Chrono c = new Chrono();
		MyArrayList<Integer> t = new MyArrayList<Integer>();
		for(int i = 0; i < 1000000; i++){
			t.add(i);
		}
		c.stop();
		ArrayList<Integer> a = new ArrayList<Integer>();
		c = new Chrono();
		for(int i = 0; i < 1000000; i++){
			a.add(i);
		}
		c.stop();
		//assertTrue(true);
		
	}

}
