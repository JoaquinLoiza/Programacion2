package busquedadedocumentos;

public class CriterioTextoEnContenido extends CriterioBusqueda {
	
	private String texto;
	
	public CriterioTextoEnContenido(String texto) {
		super();
		this.texto = texto;
	}

	@Override
	public boolean cumple(Documento documento) {
		return documento.getContenidoTextual().contains(this.texto);
	}
}
