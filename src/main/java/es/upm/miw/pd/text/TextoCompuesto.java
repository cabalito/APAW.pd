package es.upm.miw.pd.text;

import java.util.ArrayList;
import java.util.List;

public class TextoCompuesto extends Componente {
	
	protected List<Componente> textoCompuesto;
	
	public TextoCompuesto(){
		textoCompuesto = new ArrayList<Componente>();
	}
	
	public void add(Componente componente){
		this.textoCompuesto.add(componente);
	}
	
	public String dibujar(boolean mayusculas){
		String textoResultante = "";
		for(Componente componente : textoCompuesto){
			textoResultante = textoResultante + componente.dibujar(mayusculas);
		}
		return textoResultante;
	}

}
