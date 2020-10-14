package sistemadealquiler;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private Auto alquiloauto;
	private ArrayList<Pelicula> alquileresPelicula;
	
	public Cliente(String nombre) {
		this.setNombre(nombre);
		this.alquiloauto = null;
		this.alquileresPelicula = new ArrayList<Pelicula>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Auto getAuto() {
		return this.alquiloauto;
	}
	
	public boolean getAlquiloAuto() {
		return this.alquiloauto != null;
	}
	
	public void setAlquiloAuto(Auto a) {
		this.alquiloauto = a;
	}
	
	public void agregarAlquilerPelicula(Pelicula p) {
		this.alquileresPelicula.add(p);
	}
	
	private boolean estaVencida(LocalDate fechalimite) {
		return LocalDate.now().isAfter(fechalimite);
	}
	
	public boolean seMeVencioAlgo() {
		return seVencioPelicula() || seVencioAuto();
	}

	public boolean seVencioAuto() {
		return estaVencida(this.alquiloauto.getFechalimite());
	}
	
	public boolean seVencioPelicula() {
		
		for(Pelicula p : this.alquileresPelicula) {
			if (estaVencida(p.getFechalimite())) {					
				return true;
			}
		}
		return false;
	}
}
