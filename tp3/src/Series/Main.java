package Series;

public class Main {

	public static void main(String[] args) {
		
		Serie serie = new Serie("Los Simpsons", "Serie animada", "Matt Groening", "Animados" );
		Temporada temporada = new Temporada("Temporada 2");
		Episodio episodio = new Episodio("El abuelo", "kfbakjfkajdfkad");
		Episodio episodio_2 = new Episodio("Ewerwer", "kwerwerwerfkad"); 
		
		serie.agregarTemporada(temporada);
		temporada.agregarEpisodio(episodio);
		temporada.agregarEpisodio(episodio_2);
		
		if (episodio.calificarEpisodio(3) == false) {
			System.out.println("La calificacion debe ser del 1 al 5");
		};
		
		if (episodio_2.calificarEpisodio(5) == false) {
			System.out.println("La calificacion debe ser del 1 al 5");
		};
		
		System.out.println("Calificacion de episodio: "+episodio.getCalificacion());
		
		System.out.println("Calificacion de episodio2: "+episodio_2.getCalificacion());
		
		System.out.println("Total vistos de la serie: "+serie.totalEpVistosDeSerie());
		
		System.out.println("Total vistos de la temporada: "+temporada.totalEpVistosDeTemporada());
		
	}

}
