package pruebas;

public class Principal {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Joaquin");
		Persona p2 = new Persona("Joaquin");
		

		System.out.println(compararElementos(p1, p2));
	}
	
	public static boolean compararElementos(Persona p1, Persona p2) {
		
		if(p1.equals(p2))
			return true;
		else
			return false;
	}
}