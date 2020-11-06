package controlDeGastos;

import java.time.LocalDate;
import java.util.ArrayList;

public class GastoDetallado extends GastoAbs {

	private ArrayList<GastoAbs> gastos;
	
	public GastoDetallado(String descripcion, LocalDate fecha) {
		super(descripcion, fecha);
		this.gastos = new ArrayList<>();
	}
	
	public void addGasto(GastoAbs gasto) {
		this.gastos.add(gasto);
	}

	@Override
	public int getMonto() {
		int total = 0;
		
		for (GastoAbs gasto: this.gastos) {
			total += gasto.getMonto();
		}
		return total;
	}

	@Override
	public ArrayList<GastoAbs> listarGastos(Busqueda busqueda) {
		ArrayList<GastoAbs> salida = new ArrayList<>();
		
		if (busqueda.cumple(this))
			salida.add(this);
		else {			
			for (GastoAbs g : this.gastos) {
				if (busqueda.cumple(g)) 
					salida.addAll(g.listarGastos(busqueda));
			}
		}
		return salida;
	}

	@Override
	public int totalGastos(Busqueda busqueda) {
		int total = 0;
		
		if(busqueda.cumple(this)){
			total += this.getMonto();
		}else {			
			for (GastoAbs g : this.gastos)
				total += g.totalGastos(busqueda);
		}
		return total;	
	}
}