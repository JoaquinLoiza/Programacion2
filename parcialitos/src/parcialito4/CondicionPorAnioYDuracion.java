package parcialito4;

public class CondicionPorAnioYDuracion extends CriterioDeBusqueda {
	
	private int a�o;
	private int duracion;
	
	public CondicionPorAnioYDuracion(int a�o, int duracion) {
		this.a�o = a�o;
		this.duracion = duracion;
	}

	@Override
	public boolean cumple(Pelicula pelicula) {
		return (pelicula.getA�oEstreno() < this.a�o && pelicula.getDuracionEnMinutos() < this.duracion);
	}

}
