package alarmaConSensores;
public class Principal {

	public static void main(String[] args) {
		
		Alarma alarma = new Alarma();
		Sensor sensor1 = new Sensor("Ventana");
		Sensor sensor2 = new Sensor("Movimiento en interior");
		
		alarma.agregarSensor(sensor1);
		alarma.agregarSensor(sensor2);
		
		//sensor1.setEstado(true);
		
		System.out.println("Hay robo: "+alarma.hayRobo());
	}
}
