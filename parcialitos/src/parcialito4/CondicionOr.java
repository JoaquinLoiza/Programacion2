package parcialito4;

public class CondicionOr extends CriterioDeBusqueda {
	
	private CriterioDeBusqueda c1;
	private CriterioDeBusqueda c2;
	
	public CondicionOr(CriterioDeBusqueda c1, CriterioDeBusqueda c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public boolean cumple(Pelicula pelicula) {
		return this.c1.cumple(pelicula) || this.c2.cumple(pelicula);
	}
}
