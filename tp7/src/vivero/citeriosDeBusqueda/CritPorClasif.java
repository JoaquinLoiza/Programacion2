package vivero.citeriosDeBusqueda;

import vivero.CriterioBusqueda;
import vivero.Planta;

public class CritPorClasif extends CriterioBusqueda {

	private String clasificacion;

	public CritPorClasif(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	@Override
	public boolean cumple(Planta planta) {
		return planta.getClasifSup().equals(this.clasificacion);
	}

}
