package parcialito4;

public class CondicionPorGenero extends CriterioDeBusqueda {

	private String genero;
	
	public CondicionPorGenero(String genero) {
		this.genero = genero;
	}
	
	@Override
	public boolean cumple(Pelicula pelicula) {
		return pelicula.contengoGenero(this.genero);
	}
}
