package noticias;

import java.util.ArrayList;

public class Seccion extends Contenido {

	private String nombre;
	private String descripcion;
	private String imagenAsociada;
	
	private ArrayList<Contenido> contenidos;
	
	public Seccion(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.contenidos = new ArrayList<>();
	}
	
	public void addContenido(Contenido contenido) {
		this.contenidos.add(contenido);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagenAsociada() {
		return imagenAsociada;
	}

	public void setImagenAsociada(String imagenAsociada) {
		this.imagenAsociada = imagenAsociada;
	}
	
	@Override
	public int cantidadNoticias() {
		int totalNoticias = 0;
		
		for (Contenido contenido: this.contenidos)
			totalNoticias += contenido.cantidadNoticias();
		
		return totalNoticias;
	}

	@Override
	public Contenido copiar(Busqueda busqueda) {
		Seccion copiaSeccion = new Seccion(this.nombre, this.descripcion);
		copiaSeccion.setImagenAsociada(this.getImagenAsociada());
				
		for (Contenido contenido: this.contenidos) {
			Contenido contenidoCopia = contenido.copiar(busqueda);
			if (contenidoCopia != null)
				copiaSeccion.addContenido(contenidoCopia);
		}
		
		return copiaSeccion;
	}

	@Override
	public Contenido copiar() {
		Seccion copiaPropia = new Seccion(this.nombre, this.descripcion);
		copiaPropia.setImagenAsociada(this.getImagenAsociada());
				
		for (Contenido contenido: this.contenidos) {
			Contenido hijoCopiado = contenido.copiar();
			copiaPropia.addContenido(hijoCopiado);
		}
		
		return copiaPropia;
	}

	@Override
	public ArrayList<Noticia> buscar(Busqueda busqueda) {
		ArrayList<Noticia> resultado = new ArrayList<>();
		
		for (Contenido contenido: this.contenidos) {
			ArrayList<Noticia> auxiliar = contenido.buscar(busqueda);
			resultado.addAll(auxiliar);
			// += 
			// [1, 3] += [2, 5] ----> [1, 3, 2, 5]
		}
			
		return resultado;
	}

	@Override
	public ArrayList<String> mapa() {
		ArrayList<String> mapa = new ArrayList<>();
		
		mapa.add(this.getNombre());
		
		for (Contenido contenido: this.contenidos) {
			ArrayList<String> mapaHijo = contenido.mapa();
			for (String rutaHija: mapaHijo)
				mapa.add(this.getNombre() + "/" + rutaHija);
		}
		
		return mapa;
	}
		
}
