package nivell3;

public class Main {

	public static void main(String[] args) {
		//Crear l'objecte recividor
		Vehicle vehicle = Parking.triarVehicle();

		//Crear command i associar al recividor
		Arrencar arrencar = new Arrencar(vehicle);
		Accelerar accelerar = new Accelerar(vehicle);
		Frenar frenar = new Frenar(vehicle);
		
		//Crear invoker i associar amb command 
		Invoker inv1 = new Invoker(arrencar);
		Invoker inv2 = new Invoker(accelerar);
		Invoker inv3 = new Invoker(frenar);
		
		//accions sobre l'objecte invoker
		inv1.executar();
		inv2.executar();
		inv3.executar();

	}

}


