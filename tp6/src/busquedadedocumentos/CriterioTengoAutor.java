package busquedadedocumentos;

public class CriterioTengoAutor extends CriterioBusqueda {
	
	private String autor;
	
	public CriterioTengoAutor(String autor) {
		this.autor = autor;
	}
	
	@Override
	public boolean cumple(Documento documento) {
		return documento.tengoAutor(this.autor);
	}

}
