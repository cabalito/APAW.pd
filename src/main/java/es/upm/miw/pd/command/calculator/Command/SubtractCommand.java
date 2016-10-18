package es.upm.miw.pd.command.calculator.Command;

import es.upm.miw.pd.command.calculator.Calculator;
import es.upm.miw.pd.command.calculator.Operation;
import upm.jbb.IO;

public class SubtractCommand extends Operation{
	
	public SubtractCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public String name() {
		return "Subtraction";
	}

	@Override
	public void execute() {
		this.getCalculator().subtract(IO.getIO().readInt());
	}
}
