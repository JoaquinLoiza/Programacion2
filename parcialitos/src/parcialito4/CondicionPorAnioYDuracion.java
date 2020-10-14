package parcialito4;

public class CondicionPorAnioYDuracion extends CriterioDeBusqueda {
	
	private int año;
	private int duracion;
	
	public CondicionPorAnioYDuracion(int año, int duracion) {
		this.año = año;
		this.duracion = duracion;
	}

	@Override
	public boolean cumple(Pelicula pelicula) {
		return (pelicula.getAñoEstreno() < this.año && pelicula.getDuracionEnMinutos() < this.duracion);
	}

}
