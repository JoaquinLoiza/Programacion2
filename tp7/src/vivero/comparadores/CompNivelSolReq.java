package vivero.comparadores;
import java.util.Comparator;

import vivero.Planta;

public class CompNivelSolReq implements Comparator<Planta> {

	@Override
	public int compare(Planta p1, Planta p2) {
		return p1.getRequerSol() - p2.getRequerSol();
	}

}
