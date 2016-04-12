package pobj.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Configuration implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected Map<String, String> params = new HashMap<>();
	private static Configuration singleton = new Configuration();
	
	private Configuration() {
	}
	
	public static Configuration getInstance(){
		return Configuration.singleton;
	}
	
	public void setConfigurationFromFile(String f) throws IOException{
		try(FileInputStream fis = new FileInputStream(f); ObjectInputStream ois = new ObjectInputStream(fis)) {
			Configuration conf = (Configuration) ois.readObject();
			singleton = conf;
		} catch (ClassCastException e) {
			throw new IOException("Le fichier ne contient pas une Configuration.", e);
		} catch (ClassNotFoundException e) {
			throw new IOException("File don't have any object.", e);
		}
	}
	
	public void saveConfigurationToFile(String f) throws IOException{
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(Configuration.singleton);
		fos.close();
	}
	
	public String getParameterValue(String p){
		return params.get(p);
	}
	
	public void setParameterValue(String p, String v){
		params.put(p, v);
		System.out.println(p + " " + params.get(p));
	}
}
