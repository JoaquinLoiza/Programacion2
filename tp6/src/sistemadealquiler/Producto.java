package sistemadealquiler;

import java.time.LocalDate;

public abstract class Producto {
	private LocalDate fechalimite;
	
	public Producto(LocalDate fecha) {
		this.fechalimite = fecha;
	}
	
	public abstract boolean sePuedeAlquilar(Cliente c);
	
	public LocalDate getFechalimite() {
		return fechalimite;
	}
	
	public void setFechalimite(LocalDate fechalimite) {
		this.fechalimite = fechalimite;
	}
}
