package biblioteca.Comparadores;

import java.util.Comparator;

import biblioteca.Libro;

public class ComparadorPorAutor implements Comparator<Libro>{

	@Override
	public int compare(Libro o1, Libro o2) {
		return o1.getAutor().compareTo(o2.getAutor());
	}

}
