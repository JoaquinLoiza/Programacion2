package controlDeGastos.criteriosBusqueda;

import controlDeGastos.Busqueda;
import controlDeGastos.GastoAbs;

public class CriterioNot extends Busqueda {

	private Busqueda criterio;
		
	public CriterioNot(Busqueda criterio) {
		this.criterio = criterio;
	}

	@Override
	public boolean cumple(GastoAbs gasto) {
		return !(criterio.cumple(gasto));
	}

}
