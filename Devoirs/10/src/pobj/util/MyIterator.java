package pobj.util;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Vector;

class MyIterator<T> implements Iterator<T> {
	private Iterator<Vector<T>> listIT;
	private Iterator<T> vectorIT;
	
	public MyIterator(LinkedList<Vector<T>> list) {
		listIT = list.iterator();
		vectorIT = listIT.next().iterator();
	}

	@Override
	public boolean hasNext() {
		return listIT.hasNext() || vectorIT.hasNext();
	}

	@Override
	public T next() {
		if(vectorIT.hasNext())
			return vectorIT.next();
		else if(listIT.hasNext()){
			vectorIT = listIT.next().iterator();
			return vectorIT.next();
		}
		else
			throw new NoSuchElementException();
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
