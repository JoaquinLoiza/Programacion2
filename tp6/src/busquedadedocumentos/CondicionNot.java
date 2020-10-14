package busquedadedocumentos;

public class CondicionNot extends CriterioBusqueda {

	private CriterioBusqueda c1;
	
	public CondicionNot(CriterioBusqueda c1) {
		this.c1 = c1;
	}

	@Override
	public boolean cumple(Documento documento) {
		return !(this.c1.cumple(documento));
	}

}
