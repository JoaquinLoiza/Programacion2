package noticias;

public class BusquedaPorTitulo extends Busqueda {

	private String tituloBuscado;

	public BusquedaPorTitulo(String tituloBuscado) {
		this.tituloBuscado = tituloBuscado;
	}

	@Override
	public boolean cumple(Noticia noticia) {
		return noticia.getTitulo().contains(tituloBuscado);
	}

}
