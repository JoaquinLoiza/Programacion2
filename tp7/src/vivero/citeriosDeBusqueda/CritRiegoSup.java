package vivero.citeriosDeBusqueda;

import vivero.CriterioBusqueda;
import vivero.Planta;

public class CritRiegoSup extends CriterioBusqueda {
	
	private int reqAgua;
	
	public CritRiegoSup(int reqAgua) {
		this.reqAgua = reqAgua;
	}
	
	@Override
	public boolean cumple(Planta planta) {
		return planta.getRequerAgua() > this.reqAgua;
	}

}
