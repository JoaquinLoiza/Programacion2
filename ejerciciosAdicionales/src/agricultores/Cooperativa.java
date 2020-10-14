package agricultores;

import java.util.ArrayList;

public class Cooperativa {
	
	private ArrayList<String> mineralesEsp;
	
	public Cooperativa() {
		this.mineralesEsp = new ArrayList<String>();
	}
	
	public void agregarMineralEspecial(String cereal) {
		this.mineralesEsp.add(cereal);
	}
	
	public boolean aptoParaSiembra(Lote lote, Cereal cereal) {
		return cereal.sePuedeSembrar(lote);
	}
		
 }
