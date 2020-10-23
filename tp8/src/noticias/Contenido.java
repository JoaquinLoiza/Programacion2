package noticias;

import java.util.ArrayList;

public abstract class Contenido {

	public abstract int cantidadNoticias();
	
	public abstract Contenido copiar(Busqueda busqueda);

	public abstract Contenido copiar();
	
	public abstract ArrayList<Noticia> buscar(Busqueda busqueda);
	
	public abstract ArrayList<String> mapa();
	
}
