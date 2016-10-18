package es.upm.miw.pd.command.calculator.Command;

import es.upm.miw.pd.command.calculator.Calculator;
import es.upm.miw.pd.command.calculator.Operation;
import upm.jbb.IO;

public class PrintCommand extends Operation{

	public PrintCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public String name() {
		return "Imprimir";
	}

	@Override
	public void execute() {
		IO.getIO().println(this.getCalculator().getTotal());
		
	}

}
