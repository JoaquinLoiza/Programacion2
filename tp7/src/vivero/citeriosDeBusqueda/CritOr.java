package vivero.citeriosDeBusqueda;

import vivero.CriterioBusqueda;
import vivero.Planta;

public class CritOr extends CriterioBusqueda {

	private CriterioBusqueda c1;
	private CriterioBusqueda c2;

	public CritOr(CriterioBusqueda c1, CriterioBusqueda c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public boolean cumple(Planta planta) {
		return c1.cumple(planta) || c2.cumple(planta);
	}
}
