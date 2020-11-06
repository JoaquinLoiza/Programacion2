package controlDeGastos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Gasto extends GastoAbs {
	
	private int monto;
	
	public Gasto(String descripcion, LocalDate fecha, int monto) {
		super(descripcion, fecha);
		this.monto = monto;
	}

	@Override
	public int getMonto() {
		return this.monto;
	}

	@Override
	public ArrayList<GastoAbs> listarGastos(Busqueda busqueda) {
		ArrayList<GastoAbs> aux = new ArrayList<>();
		if (busqueda.cumple(this))
			aux.add(this);
		return aux;
	}

	@Override
	public int totalGastos(Busqueda busqueda) {
		if (busqueda.cumple(this))
			return this.getMonto();
		else
			return 0;
	}
}