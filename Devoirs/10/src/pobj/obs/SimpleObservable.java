package pobj.obs;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class SimpleObservable implements ISimpleObservable {

	private List<ISimpleObserver> obs = new ArrayList<ISimpleObserver>();
	
	@Override
	public void addObserver(ISimpleObserver obser) {
		obs.add(obser);
	}

	@Override
	public void deleteObserver(ISimpleObserver obser) {
		if(!obs.remove(obser))
			throw new NoSuchElementException("ISimpleObserver " + obser + " not found.");
	}
	
	public void notifyObservers() {
		for(ISimpleObserver o : obs)
			o.update();
	}
}
