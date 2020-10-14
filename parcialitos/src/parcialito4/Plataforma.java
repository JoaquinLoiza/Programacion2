package parcialito4;

import java.util.ArrayList;

public class Plataforma {
	
	private ArrayList<Pelicula> catalogo;
	
	public Plataforma() {
		this.catalogo = new ArrayList<>();
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
	
	public static void main(String[] args) {
		
		Pelicula p1 = new Pelicula("Titulo que contiene luna", "Sinopsis", "Martin Scorsese", 1990, 45, 16);
		p1.addActores("Will Smith");
		p1.addActores("Actor2");
		p1.addGeneros("comedia");
		
		
		Pelicula p2 = new Pelicula("Titulo que no contiene palabra", "Sinopsis", "otro", 2019, 35, 20);
		p2.addActores("Actor1");
		p2.addActores("Actor2");
		p2.addGeneros("drama");
		
		Plataforma cinePlus = new Plataforma();
		cinePlus.addPelicula(p1);
		cinePlus.addPelicula(p2);
		
		CriterioDeBusqueda porPalabra = new CondicionPorTitulo("luna");		
		CriterioDeBusqueda porGenero = new CondicionPorGenero("comedia");
		CriterioDeBusqueda porActorYNoDirector = new CondicionPorActorYDirector("Will Smith", "asdas");
		
//		System.out.println(cinePlus.getPeliculasPorCondicion(porPalabra));
//		System.out.println(cinePlus.getPeliculasPorCondicion(porGenero));
		System.out.println(cinePlus.getPeliculasPorCondicion(porActorYNoDirector));
		
	}
}
