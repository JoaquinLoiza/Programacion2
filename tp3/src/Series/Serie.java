package Series;

import java.util.ArrayList;

public class Serie {
	
	private String titulo;
	private String descripcion;
	private String creador;
	private String genero;
	ArrayList<Temporada> temporadas;
	
	// Constructor
	
	public Serie(String titulo, String descripcion, String creador, String genero) {	
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.creador = creador;
		this.genero = genero;
		this.temporadas = new ArrayList<Temporada>();
	}
	
	// Getters and Setters

	public String getTitulo() {
		return titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getCreador() {
		return creador;
	}

	public String getGenero() {
		return genero;
	}
	
	// Agrega una temporada al arreglo
	
	public void agregarTemporada(Temporada temp) {
		temporadas.add(temp);
	}
	
	// Devuelve la cantidad de temporadas de una serie
	
	public int cantTemporadasSerie() {
		return temporadas.size();
	}
	
	// Obtener el total de episodios vistos de una serie.

	public int totalEpVistosDeSerie() {
		int cantVistos = 0;
		for (Temporada temporadas: this.temporadas) {
			cantVistos += temporadas.totalEpVistosDeTemporada();
		}
		return cantVistos;
	}
	
	// Obtener el promedio de las calificaciones dadas para una serie.
	
	// Determinar si se vio todos los episodios de la serie.
	
	

}
