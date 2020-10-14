package seleccionDeFutbol;


import java.time.LocalDate;

public class Masajista extends Persona {

	private String titulo;
	private int cantAniosExp;

	public Masajista(String nombre, String apellido, int nPasaporte, LocalDate fechaNac, boolean viajando,
			boolean enConcentracion, boolean enPaisDeOrigen, String titulo, int cantAniosExp) {
		super(nombre, apellido, nPasaporte, fechaNac, viajando, enConcentracion, enPaisDeOrigen);
		this.titulo = titulo;
		this.cantAniosExp = cantAniosExp;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getCantAniosExp() {
		return cantAniosExp;
	}

}
