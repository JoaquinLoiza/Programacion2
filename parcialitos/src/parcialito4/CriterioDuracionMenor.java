package parcialito4;

public class CriterioDuracionMenor extends CriterioDeBusqueda {

	private int duracion;

	public CriterioDuracionMenor(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public boolean cumple(Pelicula pelicula) {
		return pelicula.getDuracionEnMinutos() < this.duracion;
	}
}
