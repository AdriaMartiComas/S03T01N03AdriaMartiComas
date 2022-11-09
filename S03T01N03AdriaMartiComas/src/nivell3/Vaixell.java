package nivell3;

public class Vaixell implements Vehicle{
	
	@Override
	public void arrencar() {
		System.out.println("El vaixell està arrencant");
	}

	@Override
	public void accelerar() {
		System.out.println("El vaixell està accelerant");
		
	}

	@Override
	public void frenar() {
		System.out.println("El vaixell està frenant");
		
	}

}
