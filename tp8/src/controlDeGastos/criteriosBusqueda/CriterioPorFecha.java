package controlDeGastos.criteriosBusqueda;

import java.time.LocalDate;

import controlDeGastos.Busqueda;
import controlDeGastos.GastoAbs;

public class CriterioPorFecha extends Busqueda {
	
	private LocalDate fecha;
	
	public CriterioPorFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	@Override
	public boolean cumple(GastoAbs gasto) {
		return gasto.getFecha().equals(this.fecha);
	}

}
