package es.upm.miw.pd.text;

public class Caracter extends Componente {
	char caracter;
	
	public Caracter(char caracter){
		this.caracter = caracter;
	}
	
	public String dibujar(boolean mayusculas){
		if(mayusculas){
			return  String.valueOf(caracter).toUpperCase();
		}else{
			return String.valueOf(caracter);
		}
	}


	@Override
	public void add(Componente componente) {
		char b = componente.toString().toCharArray()[0];
		FactoriaCaracter.getFactoria().get(b);
		
	}
}
