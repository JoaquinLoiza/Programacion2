package vivero.citeriosDeBusqueda;

import vivero.CriterioBusqueda;
import vivero.Planta;

public class CritNot extends CriterioBusqueda {

	private CriterioBusqueda crit;
	
	public CritNot(CriterioBusqueda crit) {
		this.crit = crit;
	}
	
	@Override
	public boolean cumple(Planta planta) {
		return !(this.crit.cumple(planta));
	}

}
