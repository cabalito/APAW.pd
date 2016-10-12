package es.upm.miw.pd.state.connection;

public abstract class State {
	public abstract void abrir(Conexion context);
	
	public abstract void cerrar(Conexion context);
	
	public abstract void parar(Conexion context);
	
	public abstract void iniciar(Conexion context);
	
	public abstract void enviar(String msj, Conexion context);
	
	public abstract void recibir(int respuesta, Conexion context);
	
	public abstract Estado getEstado();
}
