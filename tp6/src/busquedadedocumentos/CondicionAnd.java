package busquedadedocumentos;

public class CondicionAnd extends CriterioBusqueda {
	
	private CriterioBusqueda c1;
	private CriterioBusqueda c2;
	
	public CondicionAnd(CriterioBusqueda c1, CriterioBusqueda c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	
	@Override
	public boolean cumple(Documento documento) {
		return this.c1.cumple(documento) && this.c2.cumple(documento) ;
	}

}
