package parcialito4;

public class CondicionPorActorYDirector extends CriterioDeBusqueda {

	private String actor;
	private String director;
	
	
	public CondicionPorActorYDirector(String actor, String director) {
		this.actor = actor;
		this.director = director;
	}
	
	@Override
	public boolean cumple(Pelicula pelicula) {
		return pelicula.contengoActor(this.actor) && !(pelicula.getDirector().equals(this.director));
	}

}
