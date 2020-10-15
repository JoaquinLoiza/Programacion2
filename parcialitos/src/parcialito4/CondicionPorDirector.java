package parcialito4;

public class CondicionPorDirector extends CriterioDeBusqueda {

	private String director;
	
	public CondicionPorDirector(String director) {
		this.director = director;
	}
	
	@Override
	public boolean cumple(Pelicula pelicula) {
		return pelicula.getDirector().equals(this.director);
	}
}
