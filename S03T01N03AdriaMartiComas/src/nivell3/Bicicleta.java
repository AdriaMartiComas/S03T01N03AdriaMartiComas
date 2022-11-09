package nivell3;

public class Bicicleta implements Vehicle{
	
	@Override
	public void arrencar() {
		System.out.println("La bicicleta està arrencant");
	}

	@Override
	public void accelerar() {
		System.out.println("La bicicleta està accelerant");
		
	}

	@Override
	public void frenar() {
		System.out.println("La bicicleta està frenant");
		
	}

}
