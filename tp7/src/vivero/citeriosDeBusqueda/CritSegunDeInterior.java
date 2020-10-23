package vivero.citeriosDeBusqueda;

import vivero.CriterioBusqueda;
import vivero.Planta;

public class CritSegunDeInterior extends CriterioBusqueda {

	@Override
	public boolean cumple(Planta planta) {
		return planta.isInterior();
	}
}
