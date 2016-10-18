package es.upm.miw.pd.command.calculator.Command;

import es.upm.miw.pd.command.calculator.Calculator;
import es.upm.miw.pd.command.calculator.Operation;

public class ResetCommand extends Operation{

	public ResetCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public String name() {
		return "Reset";
	}

	@Override
	public void execute() {
		this.getCalculator().reset();
	}

}
