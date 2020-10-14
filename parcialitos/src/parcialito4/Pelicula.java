package parcialito4;

import java.util.ArrayList;

public class Pelicula {

	private String titulo;
	private String sinopsis;
	private String director;
	private int a�oEstreno;
	private int duracionEnMinutos;
	private int edadMinimaRequerida;
	private ArrayList<String> generos;
	private ArrayList<String> actores;
	
	public Pelicula(String titulo, String sinopsis, String director, int a�oEstreno, int duracionEnMinutos, int edadMinimaRequerida) {
		
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.director = director;
		this.a�oEstreno = a�oEstreno;
		this.duracionEnMinutos = duracionEnMinutos;
		this.edadMinimaRequerida = edadMinimaRequerida;
		this.generos = new ArrayList<>();
		this.actores = new ArrayList<>();
	}

	public String getTitulo() {
		return titulo;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public String getDirector() {
		return director;
	}

	public int getA�oEstreno() {
		return a�oEstreno;
	}

	public int getDuracionEnMinutos() {
		return duracionEnMinutos;
	}

	public int getEdadMinimaRequerida() {
		return edadMinimaRequerida;
	}

	public void addGeneros(String g) {
		this.generos.add(g);
	}
	
	public void addActores(String a) {
		this.actores.add(a);
	}
	
	public boolean contengoGenero(String genero) {
		for(String g : this.generos) {
			if( g.equals(genero) )
				return true;
		}
		return false;
	}
	
	public boolean contengoActor(String actor) {
		for(String a : this.actores) {
			if( a.equals(actor) )
				return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "\nPelicula: " + titulo + "\nsinopsis: " + sinopsis + "\ndirector: " + director + "\na�oEstreno: "
				+ a�oEstreno + "\n";
	}
	
	
}
