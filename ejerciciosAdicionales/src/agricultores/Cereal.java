package agricultores;

import java.util.ArrayList;

public class Cereal {
	
	private String nombre; 
	private ArrayList<String> minerales;
	
	public Cereal(String nombre) {
		this.setNombre(nombre);
		this.minerales = new ArrayList<String>();
	}
	
	public void agregarMineral(String mineral){
		minerales.add(mineral);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Metodos
	
	public boolean sePuedeSembrar(Lote lote) {
		// TODO Auto-generated method stub
		return false;
	}

}
