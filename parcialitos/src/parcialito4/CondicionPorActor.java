package parcialito4;

public class CondicionPorActor extends CriterioDeBusqueda {

	private String actor;
	
	public CondicionPorActor(String actor) {
		this.actor = actor;
	}
	
	@Override
	public boolean cumple(Pelicula pelicula) {

		return pelicula.contengoActor(this.actor);
	}

}
