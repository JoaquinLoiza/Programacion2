package parcialito4;

import java.util.ArrayList;

public class Plataforma {
	
	private ArrayList<Pelicula> catalogo;
	private CriterioDeBusqueda criterioDeRentabilidad;
	
	public Plataforma(CriterioDeBusqueda criterio) {
		this.catalogo = new ArrayList<>();
		this.criterioDeRentabilidad = criterio;
	}
	
	public void setCriterioRentabilidad(CriterioDeBusqueda criterio) {
		this.criterioDeRentabilidad = criterio;
	}
	
	public void addPelicula(Pelicula p) {
		this.catalogo.add(p);
	}
	
	public ArrayList<Pelicula> getPeliculasPorCondicion(CriterioDeBusqueda condicion) {
		
		ArrayList<Pelicula> list = new ArrayList<>();
		
		for (int i = 0; i < catalogo.size(); i++)
			if (condicion.cumple(catalogo.get(i)))
				list.add(catalogo.get(i));
		
		return list;
	}
	
	public boolean esRentable(Pelicula pelicula) {
		return this.criterioDeRentabilidad.cumple(pelicula);
	}
	
	
	/*----	----	----	----	MAIN	----	----	----	----*/
	
	
	public static void main(String[] args) {
		
		Pelicula p1 = new Pelicula("Titulo que contiene luna", "Sinopsis", "Martin Scorsese", 1990, 45, 16);
		p1.addActores("Will Smith");
		p1.addActores("Actor2");
		p1.addGeneros("comedia");
		
		
		Pelicula p2 = new Pelicula("Titulo que no contiene palabra", "Sinopsis", "otro", 2019, 35, 20);
		p2.addActores("Actor1");
		p2.addActores("Actor2");
		p2.addGeneros("documental");
		
		CriterioDeBusqueda Genero1 = new CondicionPorGenero("infantil");
		CriterioDeBusqueda Genero2 = new CondicionPorGenero("documental");
		CriterioDeBusqueda infantilODocumental = new CondicionOr(Genero1, Genero2);
		CriterioDeBusqueda criterioNot = new CondicionNot(infantilODocumental);
		CriterioDeBusqueda antesDeAnio = new CriterioAntesDelAnio(2017);
		CriterioDeBusqueda posteriorAnio = new CondicionNot(antesDeAnio);
		CriterioDeBusqueda criterioAnd = new CondicionAnd(posteriorAnio, criterioNot);
		
		CriterioDeBusqueda criterioRentabilidad = criterioAnd;
		
		Plataforma cinePlus = new Plataforma(criterioRentabilidad);
		cinePlus.addPelicula(p1);
		cinePlus.addPelicula(p2);
		
		System.out.println(cinePlus.esRentable(p1));
		
		
//		CriterioDeBusqueda porPalabra = new CondicionPorTitulo("luna");		
//		CriterioDeBusqueda porGenero = new CondicionPorGenero("comedia");
//		
//		System.out.println(cinePlus.getPeliculasPorCondicion(porPalabra));
//		System.out.println(cinePlus.getPeliculasPorCondicion(porGenero));
		
		
	}
}
