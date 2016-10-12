package es.upm.miw.pd.composite.expression;

public class Numero extends Expresion{
	int valor;

	
	public Numero(int valor) {
		super();
		this.valor = valor;
	}

	@Override
	public String toString(){
		return String.valueOf(this.valor);
	}

	@Override
	public int operar() {
		return valor;
	}

}
