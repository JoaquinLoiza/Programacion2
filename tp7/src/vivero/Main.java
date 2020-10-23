package vivero;
import java.util.Comparator;

import vivero.citeriosDeBusqueda.CritSegunNombreCientif;
import vivero.comparadores.CompNivelSolReq;

public class Main {

	public static void main(String[] args) {
		Vivero viveroLaGominola = new Vivero();
		Planta planta1 = new Planta("Gominolastecus Loizatecus", "Gominola", "Potus", "MedioPelo", true, 7, 8);
		Planta planta2 = new Planta("Cahetequeco Loizatecus", "Cachete", "Lenguadesuegra", "MedioPelo", true, 9, 6);
		Planta planta3 = new Planta("Loizatecus perae", "Peral", "perasMucha", "pauperrimo", false, 4, 3);
		
		viveroLaGominola.addPlanta(planta1);
		viveroLaGominola.addPlanta(planta2);
		viveroLaGominola.addPlanta(planta3);
		
		planta1.addNombre("laQueTiraLa");
		
		CriterioBusqueda palabraEnNombre = new CritSegunNombreCientif("Loizatecus");
		//CriterioBusqueda nombVulgar =  new CritNomVulgar("laQueTiraLa");
		Comparator<Planta> compPorSol = new CompNivelSolReq(); 
				
		System.out.println(viveroLaGominola.getPlantasSegunCriterio(palabraEnNombre, compPorSol));
		//System.out.println(viveroLaGominola.getPlantasSegunCriterio(nombVulgar,));
	}
}
