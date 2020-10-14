package sistemadealquiler;

import java.time.LocalDate;

public class Pelicula extends Producto {
	
	private String informacion;
	private int copias;

	public Pelicula(String info, int cop, LocalDate fechalimite) {
		super(fechalimite);
		this.informacion = info;
		this.setCopias(cop);
	}
	
	public String getInformacion() {
		return informacion;
	}
	
	public int getCopias() {
		return copias;
	}
	
	public void setCopias(int copias) {
		this.copias = copias;
	}
	
	@Override
	public boolean sePuedeAlquilar(Cliente c) {
		if(this.copias > 0) {
			c.agregarAlquilerPelicula(this);
			this.copias--;
			return true;
		}
		return false;
	}
}
