package es.upm.miw.pd.command.calculator.Command;

import es.upm.miw.pd.command.calculator.Calculator;
import es.upm.miw.pd.command.calculator.Operation;

public class RestoreCommand extends Operation{

	public RestoreCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public String name() {
		return "Restore";
	}

	@Override
	public void execute() {
		this.getCalculator().reset();
	}
}
