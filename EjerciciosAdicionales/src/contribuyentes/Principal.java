package contribuyentes;

public class Principal {

	public static void main(String[] args) {
		
		Simple simple = new Simple("Carlos", 435234, 350); 
		Comerciante comerciante = new Comerciante("Maria", 32423423, 250, 400); 
		Programador programador = new Programador("Raul", 234234634, 250, 600);
		
		System.out.println(simple.toString());
		System.out.println("\n"+comerciante.toString());
		System.out.println("\n"+programador.toString());
	}

}
