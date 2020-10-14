package alarmaConSensores;

public class Sensor {
	private String zona;
	private boolean estado;
	
	public Sensor(String zona) {
		this.zona = zona;
		this.estado = false;
	}

	public boolean getEstado() {
		return estado;
	}

	public String getZona() {
		return zona;
	}
	
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
}

