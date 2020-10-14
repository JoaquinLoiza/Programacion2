package busquedadedocumentos;

public class CriterioPorTituloIdentico extends CriterioBusqueda {

	private String titulo;
	
	public CriterioPorTituloIdentico(String titulo) {
		this.titulo = titulo;
	}
	
	@Override
	public boolean cumple(Documento documento) {
		return documento.getTitulo().equals(this.titulo);
	}
}
