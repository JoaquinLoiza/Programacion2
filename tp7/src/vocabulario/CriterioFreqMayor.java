package vocabulario;

public class CriterioFreqMayor extends CriterioBusqueda {
	
	private Texto texto;
	
	public CriterioFreqMayor(Texto texto) {
		this.texto = texto;
	}
	
	@Override
	public boolean cumple(String palabra) {
		
		return this.texto.getFrecuenciaMayor() == this.texto.cantRepeticiones(palabra);
		
	}

}
