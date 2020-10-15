package parcialito4;

public class CriterioAntesDelAnio extends CriterioDeBusqueda {

	private int anio;

	public CriterioAntesDelAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public boolean cumple(Pelicula pelicula) {
		return pelicula.getAñoEstreno() <= this.anio;
	}

}
