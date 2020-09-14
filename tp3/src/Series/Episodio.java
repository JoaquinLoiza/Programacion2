package Series;

public class Episodio {
	
	private String titulo;
	private String descripcion;
	private int calificacion;
	private boolean visto; 
	
	public Episodio(String titulo, String descripcion) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.calificacion = -1;
		this.visto = false;
	}

	// Getters and Setters

	public String getTitulo() {
		return titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getCalificacion() {
		return calificacion;
	}
	
	public boolean getVisto() {
		return visto;
	}

	private void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	// Califica un episodio comprobando si el rango es correcto.

	public boolean calificarEpisodio(int calificacion) {
		if (calificacion >= 1 && calificacion <= 5) {
			this.setCalificacion(calificacion);
			this.seVio();
			return true;
		} else {
			return false;
		}
	}
	
	public void seVio() {
		this.visto = true;
	}

}
