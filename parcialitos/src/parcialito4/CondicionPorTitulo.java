package parcialito4;

public class CondicionPorTitulo extends CriterioDeBusqueda {
	
	private String palabra;
	
	public CondicionPorTitulo(String palabra) {
		this.palabra = palabra;
	}
	
	@Override
	public boolean cumple(Pelicula pelicula) {
		return pelicula.getTitulo().contains(this.palabra);
	}

}
