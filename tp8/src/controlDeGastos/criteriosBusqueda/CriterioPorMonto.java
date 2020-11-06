package controlDeGastos.criteriosBusqueda;

import controlDeGastos.Busqueda;
import controlDeGastos.GastoAbs;

public class CriterioPorMonto extends Busqueda {

	private int monto;
	
	public CriterioPorMonto(int monto) {
		this.monto = monto;
	}
	
	@Override
	public boolean cumple(GastoAbs gasto) {
		return gasto.getMonto() > this.monto;
	}

}
