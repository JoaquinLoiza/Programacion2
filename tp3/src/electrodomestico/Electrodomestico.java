package electrodomestico;

public class Electrodomestico {
	  private String nombre;
	  private double precioBase;
	  private String color;
	  private int consumo;
	  private double peso;
	  private final static int MIN_BALANCE = 3;
	  private final static int MAX_CONSUMO = 45;
	
	//Constructores
	  
	public Electrodomestico(String nombre){
	  this.nombre = nombre;
	  this.precioBase = 100;
	  this.color = "gris plata";
	  this.consumo = 10;
	  this.peso = 2;
	}
	
	public Electrodomestico(String nombre, double precioBase){
		  this(nombre);
		  this.precioBase = precioBase;
		  this.color = "gris plata";
		  this.consumo = 10;
		  this.peso = 2;
	}
	
	public Electrodomestico(String nombre, double precioBase, String color){
		  this(nombre, precioBase);
		  this.color = color;
		  this.consumo = 10;
		  this.peso = 2;
	}
	
	public Electrodomestico(String nombre, double precioBase, String color, int consumo){
		  this(nombre, precioBase, color);
		  this.consumo = consumo;
		  this.peso = 2;
	}
	
	public Electrodomestico(String nombre, double precioBase, String color, int consumo, double peso){
		  this(nombre, precioBase, color, consumo);
		  this.peso = peso;
	}

	
	//Metodos getters y setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	//Metodos
	
	public boolean esBajoConsumo() {
		return this.consumo < MAX_CONSUMO;
	}
	
	public double calcularBalance() {
		return this.precioBase/this.peso;
	}
	
	public boolean esAltaGama() {
		return this.calcularBalance() > MIN_BALANCE;
	}
	
}
