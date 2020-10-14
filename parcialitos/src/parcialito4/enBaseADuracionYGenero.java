package parcialito4;

public class enBaseADuracionYGenero extends Rentabilidad {

	private int duracion;
	private String genero;
	
	public enBaseADuracionYGenero(int duracion, String genero) {
		this.duracion = duracion;
		this.genero = genero;
	}

	@Override
	public boolean esRentable(Pelicula pelicula) {
		return (pelicula.getDuracionEnMinutos() < this.duracion && !pelicula.contengoGenero(this.genero));
	}

}
