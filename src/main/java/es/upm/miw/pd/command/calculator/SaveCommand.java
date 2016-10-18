package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class SaveCommand extends Operation{

	public SaveCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public void execute() {
		GestorMementos.getGestorMementosSingleton().addMemento(IO.getIO().readString("Nombre del Memento"),(this.getCalculator()).createMemento());
				
	}

	@Override
	public String name() {
		return "Guardar";
	}
}
