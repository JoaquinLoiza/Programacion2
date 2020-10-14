package alarmaConSensores;

public class AlarmaLuminosa extends Alarma {
	
	private Luz luz;
	
	public AlarmaLuminosa() {
		super();
		this.luz = new Luz();
	}
	
	@Override
	public void dispararAlarma() {
		this.timbre.hacerSonar();
		this.luz.encender();			
	}
}

