package diccionario;

import java.util.ArrayList;
import java.util.Collections;

public class Palabra implements Comparable<Palabra>{
	private String nombre; 
	private String funciongramatical; 
	private ArrayList<String> sinonimos; 
	private ArrayList<String> antonimos; 
	private ArrayList<String> definiciones; 
	
	public Palabra(String nombre, String funciongramatical) {
		this.setNombre(nombre);
		this.setFunciongramatical(funciongramatical); 
		this.sinonimos = new ArrayList<>(); 
		this.antonimos = new ArrayList<>(); 
		this.definiciones = new ArrayList<>(); 
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFunciongramatical() {
		return funciongramatical;
	}

	public void setFunciongramatical(String funciongramatical) {
		this.funciongramatical = funciongramatical;
	}
	
	public void addSinonimo(String s) {
		this.sinonimos.add(s);
	}
	
	public void addAntonimo(String a) {
		this.antonimos.add(a); 
	}
	
	public void addDefinicion(String d) {
		this.definiciones.add(d);
	}
	
	@Override
	public int compareTo(Palabra p) {
		return this.getNombre().compareTo(p.getNombre()); 
	}
	
	public void modificarDefinicion(String defanterior, String defnueva) {
		this.definiciones.add(defnueva);
		this.definiciones.remove(defanterior); 
	}

	@Override
	public boolean equals(Object obj) {
		try {
			Palabra p = (Palabra)obj;
			return this.getNombre().equals(p.getNombre()); 
		} catch (Exception e) {
			return false;
		}
	}
	
	public ArrayList<String> listaSinonimos(){
		return this.ordenarArregloAsc(this.sinonimos); 
	}
	
	public ArrayList<String> listaAntonimos(){
		return this.ordenarArregloAsc(this.antonimos); 
	}
	
	public ArrayList<String> ordenarArregloAsc(ArrayList<String> array){
		ArrayList<String> arr = new ArrayList<>();
		arr.addAll(array); 
		Collections.sort(arr);
		return arr; 
	}

	@Override
	public String toString() {
		return "\nPalabra: " + getNombre() + "\nlistaSinonimos: " + listaSinonimos() + "\nlistaAntonimos: " + listaAntonimos() + "\n";
	}
	
	public ArrayList<String> devuelveListaDefiniciones(){
		ArrayList<String> definiciones = new ArrayList<>(); 
		definiciones.addAll(this.definiciones); 
		return definiciones; 
	}
	
	
	
	
	
	
	
}
