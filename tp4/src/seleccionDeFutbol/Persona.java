package seleccionDeFutbol;


import java.time.LocalDate;

public class Persona {

	private String nombre;
	private String apellido;
	private int nPasaporte;
	private LocalDate fechaNac;
	private boolean viajando;
	private boolean enConcentracion;
	private boolean enPaisDeOrigen;
	
	//Se puede hacer con arreglos de estados??

	public Persona(String nombre, String apellido, int nPasaporte, LocalDate fechaNac, boolean viajando,
			boolean enConcentracion, boolean enPaisDeOrigen) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nPasaporte = nPasaporte;
		this.fechaNac = fechaNac;
		this.viajando = viajando;
		this.enConcentracion = enConcentracion;
		this.enPaisDeOrigen = enPaisDeOrigen;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getnPasaporte() {
		return nPasaporte;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public boolean isViajando() {
		return viajando;
	}

	public boolean isEnConcentracion() {
		return enConcentracion;
	}
	
	public boolean isEnPaisDeOrigen() {
		return this.enPaisDeOrigen;
	}
	
	public String conocerEstado() {
		return "Viajando: "+this.isViajando()+"\nEn Concentracion: "+this.isEnConcentracion()+"\nEn pais de origen: "+this.isEnPaisDeOrigen();
	}
	
	public boolean estaDisponible() {
		return this.isEnPaisDeOrigen() && !this.isEnConcentracion();
	}
}
