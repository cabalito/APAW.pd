package es.upm.miw.pd.state.connection;

public class StateEsperando extends State {

	@Override
	public void abrir(Conexion context) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void cerrar(Conexion context) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void parar(Conexion context) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void iniciar(Conexion context) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void enviar(String msj, Conexion context) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void recibir(int respuesta, Conexion context) {
		 if (respuesta == 0) {
             context.setState(new StatePreparado());
         } else {
             context.setState(new StateCerrado());
         }
	}

	public Estado getEstado(){
		return Estado.ESPERANDO;
	}

}
