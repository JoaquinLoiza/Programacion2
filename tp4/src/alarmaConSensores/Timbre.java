package alarmaConSensores;

public class Timbre {

	private boolean timbre;
	
	public Timbre() {
		this.timbre = false;
	}
	
	public void hacerSonar() {
		if (this.timbre == false)
			this.timbre = true;
	}
	
}
