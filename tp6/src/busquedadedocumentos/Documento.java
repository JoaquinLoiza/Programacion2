package busquedadedocumentos;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Documento {

	private String titulo;
	private String contenidoTextual;
	private ArrayList<String> autores;
	private ArrayList<String> palabrasClaves;
	
	
	public Documento(String titulo, String contenidoTextual) {
		this.titulo = titulo;
		this.contenidoTextual = contenidoTextual;
		this.autores = new ArrayList<>();
		this.palabrasClaves = new ArrayList<>();
	}
	
	public void addAutor(String autor) {
		this.autores.add(autor);
	}
	
	public void addPalabra(String palabra) {
		this.palabrasClaves.add(palabra);
	}

	public String getTitulo() {
		return titulo;
	}

	public String getContenidoTextual() {
		return contenidoTextual;
	}
	
	public boolean tengoAutor(String autor) {
		return this.autores.contains(autor);
	}
	
	public boolean tengoPalabra(String palabra) {
		return this.palabrasClaves.contains(palabra);
	}

	public int cantPalabras() {
		StringTokenizer st = new StringTokenizer(this.contenidoTextual);
		return st.countTokens();
	}
}
