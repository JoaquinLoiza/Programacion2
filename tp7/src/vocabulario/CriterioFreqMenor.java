package vocabulario;

public class CriterioFreqMenor extends CriterioBusqueda {

	private Texto texto;
	
	public CriterioFreqMenor(Texto texto) {
		this.texto = texto;
	}
	
	@Override
	public boolean cumple(String palabra) {
		
		return this.texto.getFrecuenciaMenor() == this.texto.cantRepeticiones(palabra);
		
	}
}
