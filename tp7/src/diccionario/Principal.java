package diccionario;

public class Principal {
	public static void main(String[] args) {
		Diccionario d = new Diccionario();
		Palabra p = new Palabra("Casa", "Sustantivo"); 
		p.addAntonimo("x");
		p.addDefinicion("y");
		p.addDefinicion("o");
		p.addSinonimo("z");
		p.addSinonimo("f");
		
		
		Palabra p2 = new Palabra("Hogar", "Sustantivo"); 
		p2.addAntonimo("");
		
		Palabra p3 = new Palabra("Arbol", "Sustantivo"); 
		p3.addAntonimo("xxxxx");
		
		d.addPalabra(p);
		d.addPalabra(p2);
		d.addPalabra(p3);
		
		//System.out.println(p);
		//System.out.println(d.dadaPalabraListaSinonimos(p));
		//System.out.println(d.dadaPalabraDefiniciones(p));
		System.out.println(d.listaPalabrasComprendidas(p2, p3));
	}
}
