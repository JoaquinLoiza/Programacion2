package busquedadedocumentos;

public class CriterioPorPalabraClave extends CriterioBusqueda {

	private String palabraClave;
	
	public CriterioPorPalabraClave(String palabraClave) {
		this.palabraClave = palabraClave;
	}

	@Override
	public boolean cumple(Documento documento) {
		return documento.tengoPalabra(this.palabraClave);
	}
}
