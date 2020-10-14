package agricultores;

import java.util.ArrayList;

public class Lote {
	private String nombre;
	private int hectareas; 
	private ArrayList<String> minerales;
	
	public Lote(String nombre, int hectareas) {
		this.nombre = nombre;
		this.setHectareas(hectareas); 
		this.minerales = new ArrayList<String>();
	}

	public int getHectareas() {
		return this.hectareas;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public void setHectareas(int hectareas) {
		this.hectareas = hectareas;
	}
	
	public void agregarMineral(String mineral) {
		minerales.add(mineral);
	}
	
	//Metodos

	//Es apto
	
	//Es especial
}
