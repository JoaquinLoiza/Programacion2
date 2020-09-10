package alarma;

public class AlarmaLuminosa extends Alarma {
	
	private Luz luz;
	
	public AlarmaLuminosa() {
		super();
		this.luz = new Luz();
	}

	public boolean comprobar() {
		return super.comprobar();
	}
}

