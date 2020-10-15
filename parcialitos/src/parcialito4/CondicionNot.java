package parcialito4;

public class CondicionNot extends CriterioDeBusqueda {

	CriterioDeBusqueda c1;
	
	public CondicionNot(CriterioDeBusqueda c1) {
		this.c1 = c1;
	}
	
	@Override
	public boolean cumple(Pelicula pelicula) {
		return !(this.c1.cumple(pelicula));
	}

}
