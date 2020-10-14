package parcialito4;

public class enBaseAAnioYGenero extends Rentabilidad {

	private int anio;
	private String genero1;
	private String genero2;
	
	
	
	public enBaseAAnioYGenero(int anio, String genero1, String genero2) {
		this.anio = anio;
		this.genero1 = genero1;
		this.genero2 = genero2;
	}

	@Override
	public boolean esRentable(Pelicula pelicula) {
		
		if (pelicula.getAñoEstreno() > this.anio) {
			if (!pelicula.contengoGenero(genero1) || !pelicula.contengoGenero(genero2)) {
				return true;
			}
		}
		return false;
	}

}
