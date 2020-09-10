package alarma;

public class Alarma {
	private boolean seRompioVidrio;
	private boolean seAbrioPuerta;
	private boolean seDetectoMovimiento;
	private Timbre timbre;
	
	public Alarma() {
		this.seRompioVidrio = false;
		this.seAbrioPuerta = false;
		this.seDetectoMovimiento = false;
		this.timbre = new Timbre();
	}

	//Getters and Setters
	
	public boolean isVidrioRoto() {
		return seRompioVidrio;
	}

	public void setVidrioRoto(boolean vidrioRoto) {
		this.seRompioVidrio = vidrioRoto;
	}

	public boolean isPuertaAbierta() {
		return seAbrioPuerta;
	}

	public void setPuertaAbierta(boolean puertaAbierta) {
		this.seAbrioPuerta = puertaAbierta;
	}

	public boolean isDetectoMovimiento() {
		return seDetectoMovimiento;
	}

	public void setDetectoMovimiento(boolean detectoMovimiento) {
		this.seDetectoMovimiento = detectoMovimiento;
	}
	
	//Metodos
	
	public boolean comprobar() {
		
		return false;
	}
}
