package seleccionDeFutbol;


import java.time.LocalDate;

public class Entrenador extends Persona {

	private int id;

	public Entrenador(String nombre, String apellido, int nPasaporte, LocalDate fechaNac, boolean viajando,
			boolean enConcentracion, boolean enPaisDeOrigen, int id) {
		super(nombre, apellido, nPasaporte, fechaNac, viajando, enConcentracion, enPaisDeOrigen);
		this.id = id;
	}

	public int getId() {
		return id;
	}

}
