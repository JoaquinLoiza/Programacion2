package Series;

import java.util.ArrayList;

public class Temporada {
	ArrayList<Episodio> episodios;
	String nombre;

	public Temporada(String nombre) {
		this.nombre = nombre;
		this.episodios = new ArrayList<Episodio>();
	}
	
	// Devuelve el nombre de la temporada
	
	public String getNombre() {
		return nombre;
	}
	
	// Retorna el arreglo de episodios
	public ArrayList<Episodio> getEpisodios() {
		return episodios;
	}	
	
	// Agrega un episodio al arreglo

	public void agregarEpisodio(Episodio ep) {
		this.episodios.add(ep);
	}
	
	// Obtener cantidad de episodios de la temporada.
	
	public int cantEpisodios() {
		return episodios.size();
	}

	// Obtener el total de episodios vistos de la temporada.

	public int totalEpVistosDeTemporada() {
		int cantVistos = 0;
		for (Episodio episodio : this.episodios) {
			if (episodio.getVisto()) {
				cantVistos++;
			}
		}
		return cantVistos;
	}
	
	// Promedio de calificaciones de la temporada.
	
	// Se vio toda la temporada??
	
}