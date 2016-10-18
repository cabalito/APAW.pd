package es.upm.miw.pd.command.calculator;

import java.util.SortedMap;
import java.util.TreeMap;

public class GestorMementos {
	private static GestorMementos gestorMementoSigleton = new GestorMementos();
	private SortedMap<String, Memento> lista = new TreeMap<String, Memento>();

	
	public static GestorMementos getGestorMementosSingleton() {
    	return gestorMementoSigleton;
    }
	
    public void addMemento(String key, Memento memento) {
        this.lista.put(this.lista.size() + ":" + key, memento);
    }

    public Memento getMemento(String key) {
        return this.lista.get(key);
    }

    public String[] keys() {
        return this.lista.keySet().toArray(new String[0]);
    }
}
