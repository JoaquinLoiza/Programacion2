package controlDeGastos;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class GastoAbs {
	
	private String descripcion;
	private LocalDate fecha;
	ArrayList<Caracteristica> caracteristicas;
	
	public GastoAbs(String descripcion, LocalDate fecha) {
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.caracteristicas = new ArrayList<>();
	}

	public String getDescripcion() {
		return descripcion;
	}

	public LocalDate getFecha() {
		return fecha;
	}
	
	public void addCaracteristica(Caracteristica caracteristica) {
		this.caracteristicas.add(caracteristica);
	}
	
	public Object getCaracteristica(String nombre) {
		for (Caracteristica c : this.caracteristicas) {
			if (c.getNombre().equals(nombre))
				return c.getValor();
		}
		return null;
	}
	
	public abstract int getMonto();
	
	public abstract ArrayList<GastoAbs> listarGastos(Busqueda busqueda);
	
	public abstract int totalGastos(Busqueda busqueda);
	
}
