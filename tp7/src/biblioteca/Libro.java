package biblioteca;

import java.time.LocalDate;

public class Libro {
	private int isbn; 
	private String autor; 
	private LocalDate fechaedicion; 
	private String genero; 
	
	public Libro(int isbn, String autor, LocalDate fechaedicion, String genero) {
		this.isbn = isbn;
		this.autor = autor;
		this.fechaedicion = fechaedicion;
		this.genero = genero; 
	}

	public int getIsbn() {
		return isbn;
	}

	public String getAutor() {
		return autor;
	}

	public LocalDate getFechaedicion() {
		return fechaedicion;
	}

	public String getGenero() {
		return genero;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", autor=" + autor + ", fechaedicion=" + fechaedicion + ", genero=" + genero
				+ "]";
	}
	
	
}
