package busquedadedocumentos;

import java.util.ArrayList;

public class Coleccion {

	private ArrayList<Documento> documentos;
	
	public Coleccion() {
		this.documentos = new ArrayList<>();
	}

	public void addDocumento(Documento doc) {
		this.documentos.add(doc);
	}
	
	public ArrayList<Documento> getDocumentosPorCondicion(CriterioBusqueda condicion) {
		
		ArrayList<Documento> list = new ArrayList<>();
		
		for (int i = 0; i < documentos.size(); i++)
			if (condicion.cumple(documentos.get(i)))
				list.add(documentos.get(i));
		
		return list;
	}
}
