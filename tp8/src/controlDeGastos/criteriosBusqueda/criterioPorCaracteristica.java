package controlDeGastos.criteriosBusqueda;

import controlDeGastos.Busqueda;
import controlDeGastos.GastoAbs;

public class criterioPorCaracteristica extends Busqueda {
	
	private String nombre;
	private Object valor;
	
	public criterioPorCaracteristica(String nombre, Object valor) {
		this.nombre = nombre;
		this.valor = valor;
	}
	
	@Override
	public boolean cumple(GastoAbs gasto) {
		
		Object valor = gasto.getCaracteristica(this.nombre);
		
		if (valor != null && valor.equals(this.valor))
			return true;
		else
			return false;
	}

}
