package vivero.citeriosDeBusqueda;

import vivero.CriterioBusqueda;
import vivero.Planta;

public class CritSupSol extends CriterioBusqueda {

	private int num;

	public CritSupSol(int num) {
		this.num = num;
	}

	@Override
	public boolean cumple(Planta planta) {
		return planta.getRequerSol() > this.num;
	}

}
