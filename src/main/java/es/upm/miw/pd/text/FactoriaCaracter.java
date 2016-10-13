package es.upm.miw.pd.text;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {

	private final Map<Character, Caracter> map = new HashMap<Character, Caracter>();
	private static FactoriaCaracter factoriaCaracter = new FactoriaCaracter();
	
	private FactoriaCaracter(){
	}
	
	public static FactoriaCaracter getFactoria(){
		return FactoriaCaracter.factoriaCaracter;
	}
	
	public Caracter get(char key){
		if(map.containsKey(key)){
			return map.get(key);
		}else{
			Caracter caracter = new Caracter(key);
			map.put(key, caracter);
			return caracter;
		}
	}
}
