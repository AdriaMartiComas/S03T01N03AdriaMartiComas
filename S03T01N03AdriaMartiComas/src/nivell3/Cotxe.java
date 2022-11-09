package nivell3;

public class Cotxe implements Vehicle {

	@Override
	public void arrencar() {
		System.out.println("El cotxe està arrencant");
	}

	@Override
	public void accelerar() {
		System.out.println("El cotxe està accelerant");
		
	}

	@Override
	public void frenar() {
		System.out.println("El cotxe està frenant");
		
	}

}
