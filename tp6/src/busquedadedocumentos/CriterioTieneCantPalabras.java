package busquedadedocumentos;

public class CriterioTieneCantPalabras extends CriterioBusqueda {

	private int cant;

	public CriterioTieneCantPalabras(int cant) {
		this.cant = cant;
	}

	@Override
	public boolean cumple(Documento documento) {
		return documento.cantPalabras() >= this.cant;
	}

}
