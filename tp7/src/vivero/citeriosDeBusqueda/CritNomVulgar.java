package vivero.citeriosDeBusqueda;

import vivero.CriterioBusqueda;
import vivero.Planta;

public class CritNomVulgar extends CriterioBusqueda {

	private String palabra;
	
	public CritNomVulgar(String palabra) {
		this.palabra = palabra;
	}

	@Override
	public boolean cumple(Planta planta) {
		return planta.getNomVulgares().contains(palabra);
	}
}
