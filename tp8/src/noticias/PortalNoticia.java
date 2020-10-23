package noticias;

import java.util.ArrayList;

public class PortalNoticia {

	private ArrayList<Contenido> contenido;
		
	public ArrayList<Noticia> buscarNoticias(Busqueda busqueda) {
		
		ArrayList<Noticia> salida = new ArrayList<>();
		
		for (Contenido contenido: this.contenido) {
			ArrayList<Noticia> resultado = contenido.buscar(busqueda);
			salida.addAll(resultado);
		}
		
		return salida;
	}
}
