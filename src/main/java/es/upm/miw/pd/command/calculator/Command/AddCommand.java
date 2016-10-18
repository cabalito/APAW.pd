package es.upm.miw.pd.command.calculator.Command;

import es.upm.miw.pd.command.calculator.Calculator;
import es.upm.miw.pd.command.calculator.Operation;
import upm.jbb.IO;

public class AddCommand extends Operation{

	public AddCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public String name() {
		return "Addition";
	}

	@Override
	public void execute() {
		this.getCalculator().add(IO.getIO().readInt());
	}

}
