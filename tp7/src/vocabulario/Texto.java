package vocabulario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Texto{

	private ArrayList<String> palabras;
	
	public Texto(String palabra) {
		this.palabras=new ArrayList<>();
		this.agregarPalabra(palabra);
	}
	 
	public void agregarPalabra(String palabra) {
		this.palabras.add(palabra);
	}
	 
	public ArrayList<String> getPalabras() {//
		HashSet<String> copia=new HashSet<>();
		ArrayList<String> aux= new ArrayList<>();
		copia.addAll(palabras);
		aux.addAll(copia);
		Collections.sort(aux);
		return aux;
	}
	
	public boolean contienePalabra(String palabraBuscada) {
		 return this.palabras.contains(palabraBuscada);
	}
	
	public int cantRepeticiones(String palabraBuscada) {
		int contador=0;
		for(int i=0; i<palabras.size(); i++) {
			if(palabraBuscada.equals(palabras.get(i)))
				contador++;
		}
		return contador;
	 }
	
	 public int cantPalabraDiferentes() {
		 return this.getPalabras().size();
		 
	 }
	 
	 public ArrayList<String> palabrasSegunFrecuencia(CriterioBusqueda frecuencia){
		 ArrayList<String> aux= new ArrayList<>();

		 for (String palabra : this.palabras) {
			 if(!aux.contains(palabra) && frecuencia.cumple(palabra)){
				 aux.add(palabra); 
			 } 
		 }
		 return aux;
	 }
	 
	 public int getFrecuenciaMenor() {
		 int frecuenciaMenor = 0;
		 
		 for (String palabra : this.palabras) {
			 if(cantRepeticiones(palabra) < frecuenciaMenor)
				 frecuenciaMenor = cantRepeticiones(palabra);
		}
		return frecuenciaMenor;
	 }
	 
	 public int getFrecuenciaMayor() {
		 int frecuenciaMayor = 0;
		 
		 for (String palabra : this.palabras) {
			 if(cantRepeticiones(palabra) > frecuenciaMayor)
				 frecuenciaMayor = cantRepeticiones(palabra);
		}
		return frecuenciaMayor;
	 }
}
