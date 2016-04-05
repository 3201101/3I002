package pobj.util;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class MyArrayList<T> implements Iterable<T>{

	private LinkedList<Vector<T>> list;
	private int taille;
	
	public MyArrayList() {
		this(10);
	}
	
	public MyArrayList(int t) {
		taille = t;
		list = new LinkedList<>();
		list.add(new Vector<T>(taille));
	}
	
	public MyArrayList(Collection<T> c) {
		this();
		for(T t : c)
			add(t);
	}
	
	public boolean add(T object){
		if(list.getLast().size() >= taille){
			list.addLast(new Vector<T>(taille));
		}
		return list.getLast().add(object);
	}
	
	public T get(int location){
		return list.get(location/taille).get(location%taille);
	}
	
	public T set(int location, T object){
		return list.get(location/taille).set(location%taille, object);
	}
	
	public int size(){
		return (list.size() - 1) * taille + list.getLast().size();
	}

	public static void main(String[] args) {
		MyArrayList<Integer> t = new MyArrayList<>(2);
		t.add(10);
		System.out.println(t.get(0));
		System.out.println(t.set(0, 5));
		System.out.println(t.size());
		t.add(10);
		t.add(11);
		t.add(11);
		System.out.println(t.get(3));
		System.out.println(t.size());
		System.out.println(t.get(0));
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
