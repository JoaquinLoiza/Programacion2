package alarma;

public class Luz {
	
	private boolean luz;

	public Luz() {
		this.luz = false;
	}

	public void encender() {
		if (this.luz == false)
			this.luz = true;
	}
}
