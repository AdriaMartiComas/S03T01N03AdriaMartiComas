package nivell3;

public class Avio implements Vehicle{
	
	@Override
	public void arrencar() {
		System.out.println("L'avió està arrencant");
	}

	@Override
	public void accelerar() {
		System.out.println("L'avió està accelerant");
		
	}

	@Override
	public void frenar() {
		System.out.println("L'avió està frenant");
		
	}

}
