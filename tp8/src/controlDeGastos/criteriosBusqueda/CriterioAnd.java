package controlDeGastos.criteriosBusqueda;

import controlDeGastos.Busqueda;
import controlDeGastos.GastoAbs;

public class CriterioAnd extends Busqueda {

	private Busqueda c1;
	private Busqueda c2;
	
	public CriterioAnd(Busqueda c1, Busqueda c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	
	@Override
	public boolean cumple(GastoAbs gasto) {
		return c1.cumple(gasto) && c2.cumple(gasto);
	}
}