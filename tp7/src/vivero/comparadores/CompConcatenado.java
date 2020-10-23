package vivero.comparadores;
import java.util.Comparator;
import vivero.Planta;

public class CompConcatenado implements Comparator<Planta> {

	Comparator<Planta> comp1;
	Comparator<Planta> comp2;
	
	public CompConcatenado(Comparator<Planta> comp1, Comparator<Planta> comp2) {
		this.comp1 = comp1;
		this.comp2 = comp2;
	}
	
	@Override
	public int compare(Planta p1, Planta p2) {
		int resultado = this.comp1.compare(p1, p2);
		if (resultado == 0) 
			resultado = this.comp2.compare(p1, p2);
		
		return resultado;
	}

}
