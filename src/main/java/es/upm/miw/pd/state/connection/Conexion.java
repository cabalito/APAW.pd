package es.upm.miw.pd.state.connection;

public class Conexion {//Context
	private State state;
	private Link link;
	
	public Conexion(Link link){
		assert link != null;
	    this.link = link;
		this.state = new StateCerrado();
	}
	
	public void abrir(){
		state.abrir(this);
	}
	
	public void cerrar(){
		state.cerrar(this);
	}
	
	public void parar(){
		state.parar(this);
	}
	
	public void iniciar(){
		state.iniciar(this);
	}
	
	public void enviar(String msj){
		state.enviar(msj, this);
	}
	
	public void recibir(int respuesta){
		state.recibir(respuesta, this);
	}
	
	public String toString(){
		return "Context[" + state.toString() + "]";
	}
	
	protected void setState(State state){
		this.state = state;
	}
	
	protected Link getLink(){
		return link;
	}
	
	public Estado getEstado(){
		return state.getEstado();
	}
}
