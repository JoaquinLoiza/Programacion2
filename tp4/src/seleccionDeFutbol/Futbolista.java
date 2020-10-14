package seleccionDeFutbol;


import java.time.LocalDate;

public class Futbolista extends Persona {

	private String posicion;
	private boolean esZurdo;
	private int cantGolConvert;

	public Futbolista(String nombre, String apellido, int nPasaporte, LocalDate fechaNac, boolean viajando,
			boolean enConcentracion, boolean enPaisDeOrigen, String posicion, boolean esZurdo, int cantGolConvert) {
		
		super(nombre, apellido, nPasaporte, fechaNac, viajando, enConcentracion, enPaisDeOrigen);
		this.posicion = posicion;
		this.esZurdo = esZurdo;
		this.cantGolConvert = cantGolConvert;
	}

	public String getPosicion() {
		return posicion;
	}

	public boolean getEsZurdo() {
		return this.esZurdo;
	}

	public int getCantGolConvert() {
		return cantGolConvert;
	}

}
