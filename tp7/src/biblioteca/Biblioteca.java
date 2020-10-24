package biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

import biblioteca.Comparadores.ComparadorPorISBN;
import biblioteca.Comparadores.ComparadorReversa;
//import biblioteca.Comparadores.ComparadorPorAutor;
import biblioteca.Comparadores.ComparadorPorFechaEdicion;


public class Biblioteca {
	
	HashSet<Libro> libros; 
	
	public Biblioteca() {
		this.libros = new HashSet<>(); 
	}
	
	public void addLibro(Libro l) {
		this.libros.add(l); 
	}
	
	public ArrayList<Libro> getLibros(){
		Comparator<Libro> c = new ComparadorPorISBN();
		return this.ordenar(c);
	}
	
	public ArrayList<Libro> getLibros(Comparator<Libro> c){
		return this.ordenar(c);
	}
	
	public ArrayList<Libro> ordenar(Comparator<Libro> c){
		ArrayList<Libro> x = new ArrayList<>(); 
		x.addAll(libros);
		Collections.sort(x, c);
		return x;
	}
	
	public static void main(String[] args) {
		Biblioteca b = new Biblioteca(); 
		Libro l1 = new Libro(72345, "z", LocalDate.of(2020, 2, 1), "x");
		Libro l2 = new Libro(23456, "y", LocalDate.of(2020, 1, 1), "y");
		b.addLibro(l1);
		b.addLibro(l2);
		Comparator<Libro> c = new ComparadorPorFechaEdicion();
		Comparator<Libro> c1 = new ComparadorReversa(c);
		
		System.out.println(b.getLibros(c1));
		
	}

	

}
