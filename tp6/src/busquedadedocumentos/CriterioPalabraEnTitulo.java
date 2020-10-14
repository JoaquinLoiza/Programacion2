package busquedadedocumentos;

public class CriterioPalabraEnTitulo extends CriterioBusqueda {
	
	private String palabra;
	
	public CriterioPalabraEnTitulo(String palabra) {
		this.palabra = palabra;
	}

	@Override
	public boolean cumple(Documento documento) {
		return documento.getTitulo().contains(palabra);
	}

}
