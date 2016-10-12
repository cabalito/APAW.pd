package es.upm.miw.pd.composite.expression;

public class Multiplicacion extends Operacion {
	
	public Multiplicacion (Expresion expresion1, Expresion expresion2){
		super(expresion1, expresion2);
	}
	
	@Override
	public int operar() {
		return this.expresion1.operar() * this.expresion2.operar();
	}
	
	@Override
	public String toString() {
		return  "(" + this.expresion1.toString() + "*" + this.expresion2.toString() + ")";
	}

}
