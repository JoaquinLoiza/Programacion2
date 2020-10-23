package vivero.comparadores;
import java.util.Comparator;
import vivero.Planta;

public class CompReversa implements Comparator<Planta> {

	private Comparator<Planta> comparador;
	
	public CompReversa(Comparator<Planta> comp) {
		this.comparador = comp;
	}
	
	@Override
	public int compare(Planta p1, Planta p2) {
		return comparador.compare(p1,p2) * -1;
	}

}
