package vivero.citeriosDeBusqueda;

import vivero.CriterioBusqueda;
import vivero.Planta;

public class CritSegunNombreCientif extends CriterioBusqueda {
	
	private String palabra;
	
	public CritSegunNombreCientif(String palabra) {
		this.palabra = palabra;
	}
	
	@Override
	public boolean cumple(Planta planta) {
		return planta.getNombreCientifico().contains(this.palabra);
	}
}
