package diccionario;

import java.util.ArrayList;
import java.util.Collections;

public class Diccionario {
	private ArrayList<Palabra> palabras; 
	
	public Diccionario() {
		this.palabras = new ArrayList<>();
	}
	
	public void addPalabra(Palabra p) {
		this.palabras.add(p); 
	}
	
	public void modificarPalabra(Palabra p, String defanterior, String defnueva) {
		if(this.palabras.contains(p)) {
			p.modificarDefinicion(defanterior, defnueva);
		}
	}
	
	public void eliminarPalabra(Palabra p) {
		if(this.palabras.contains(p)) {
			this.palabras.remove(p);
		}
	}
	
	public ArrayList<String> dadaPalabraListaSinonimos(Palabra p){
		return p.listaSinonimos();
	}
	
	public ArrayList<String> dadaPalabraListaAntonimos(Palabra p){
		return p.listaAntonimos();
	}
	
	public ArrayList<String> dadaPalabraDefiniciones(Palabra p){
		return p.devuelveListaDefiniciones(); 	
	}
	
	public void ordenarPalabras() {
		Collections.sort(this.palabras);
	}
	
	public ArrayList<Palabra> listaPalabrasComprendidas(Palabra p1, Palabra p2){
		this.ordenarPalabras();
		int pos1 = this.buscarPosicion(p1);
		int pos2 = this.buscarPosicion(p2); 
		
		if(pos1 > -1 && pos2 > -1 ) {
			if(pos1 < pos2) {
				return this.devuelvePalabrasComprendidas(pos1, pos2);
			}
			else if(pos1 > pos2){
				return this.devuelvePalabrasComprendidas(pos2, pos1);
			}
			else {
				return null; 
			}
		}
		
		else {
			return null;
		}
		
	}

	private ArrayList<Palabra> devuelvePalabrasComprendidas(int pos1, int pos2) {
		ArrayList<Palabra> aux = new ArrayList<>(); 
		for(int i = pos1; i <= pos2; i++) {
			aux.add(this.palabras.get(i));
		}
		return aux;
	}

	private int buscarPosicion(Palabra p) {
		if(this.palabras.contains(p)) {
			return this.palabras.indexOf(p); 
		}
		else {
			return -1; 
		}
	}
}
