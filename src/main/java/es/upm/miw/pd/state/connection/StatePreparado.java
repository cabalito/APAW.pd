package es.upm.miw.pd.state.connection;

public class StatePreparado extends State {

	@Override
	public void abrir(Conexion context) {
	}

	@Override
	public void cerrar(Conexion context) {
		context.setState(new StateCerrado());
	}

	@Override
	public void parar(Conexion context) {
		context.setState(new StateParado());
	}

	@Override
	public void iniciar(Conexion context) {
	}

	@Override
	public void enviar(String msj, Conexion context) {
		context.getLink().enviar(msj);
        context.setState(new StateEsperando());
	}

	@Override
	public void recibir(int respuesta, Conexion context) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	public Estado getEstado(){
		return Estado.PREPARADO;
	}

}
