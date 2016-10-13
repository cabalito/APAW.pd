package es.upm.miw.pd.text;

public class Texto extends TextoCompuesto {

	public void add(Componente componente){
		validaComponente(componente);
		super.add(componente);
	}
	
	public String dibujar(boolean mayusculas){
		return super.dibujar(mayusculas) + "---o---\n";
	}
		
	private void validaComponente(Componente componente){
		char[] b = componente.dibujar(false).toCharArray();
		if(b.length == 1) throw new UnsupportedOperationException("Acción no permitida... ");
	}
	

	
}
