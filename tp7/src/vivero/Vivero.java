package vivero;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Vivero {
	
	private ArrayList<Planta> plantas;
	
	public Vivero() {
		this.plantas = new ArrayList<>();
	}
	
	public void addPlanta(Planta planta) {
		this.plantas.add(planta);
	}
	
	public ArrayList<Planta> getPlantasSegunCriterio(CriterioBusqueda criterio, Comparator<Planta> comp){
		ArrayList<Planta> copia = new ArrayList<>();
		
		for (Planta planta : this.plantas) {
			if (criterio.cumple(planta))
				copia.add(planta);
		}
		Collections.sort(copia, comp);
		return copia;
	}
}
