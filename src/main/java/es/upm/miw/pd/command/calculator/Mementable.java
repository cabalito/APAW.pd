package es.upm.miw.pd.command.calculator;

public interface Mementable<T> {
	 
	Memento createMemento();

	 void restoreMemento(Memento memento);

}
