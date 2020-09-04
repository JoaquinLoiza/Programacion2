package elementosGeometricos;

public class PuntoGeometrico {
	private int x;
	private int y;
	
	//Constructores
	
	public PuntoGeometrico() {
		this.x = 0;
		this.y = 0;
	}
	public PuntoGeometrico(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//Getters y Setters
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//Metodos
	
	public void desplazarPuntoGeometrico(int x, int y) {
		this.x += x; //this.x = this.x + x;
		this.y += y;
	}
	
	public double calcularDistanciaEuclidea(PuntoGeometrico otroPunto) {
		
		int distanciaEnX = this.getX() - otroPunto.getX();
		int distanciaEnY = this.getY() - otroPunto.getY();
		double distanciaAlCuadrado = Math.pow(distanciaEnX, 2) + Math.pow(distanciaEnY, 2);
		
		return Math.sqrt(distanciaAlCuadrado);
	}	
}