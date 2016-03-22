package pobj.obs;

public interface ISimpleObservable {
	
	public void addObserver(ISimpleObserver obser);
	public void deleteObserver(ISimpleObserver obser);

}
