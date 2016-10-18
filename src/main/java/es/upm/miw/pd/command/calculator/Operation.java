package es.upm.miw.pd.command.calculator;

public abstract class Operation implements Comando {

	private Calculator calculator;
	
	public Operation(Calculator calculator) {
		this.calculator = calculator;
	}

	protected Calculator getCalculator(){
		return this.calculator;
	}


}
