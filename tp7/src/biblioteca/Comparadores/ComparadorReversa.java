package biblioteca.Comparadores;

import java.util.Comparator;

import biblioteca.Libro;

public class ComparadorReversa implements Comparator<Libro>{
	private Comparator<Libro> c;
	
	public ComparadorReversa(Comparator<Libro> c) {
		this.c = c; 
	}
	
	@Override
	public int compare(Libro o1, Libro o2) {
		return c.compare(o1, o2)*-1; 
		
	}

}
