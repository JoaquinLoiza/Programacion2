package biblioteca.Comparadores;

import java.util.Comparator;

import biblioteca.Libro;

public class ComparadorPorISBN implements Comparator<Libro>{

	@Override
	public int compare(Libro o1, Libro o2) {
		return o1.getIsbn() - o2.getIsbn();
	}
	
}
