package es.upm.miw.pd.command.calculator.Command;

import es.upm.miw.pd.command.calculator.Calculator;
import es.upm.miw.pd.command.calculator.GestorMementos;
import es.upm.miw.pd.command.calculator.Operation;
import upm.jbb.IO;

public class LoadCommand extends Operation{

	public LoadCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public void execute() {
		(this.getCalculator()).restoreMemento(GestorMementos.getGestorMementosSingleton().getMemento(
				(String) IO.getIO().select(GestorMementos.getGestorMementosSingleton().keys(), "Restaurar")));
	}

	@Override
	public String name() {
		return "Cargar";
	}
}
