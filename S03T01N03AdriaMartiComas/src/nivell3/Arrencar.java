package nivell3;

public class Arrencar implements Command {

	private Vehicle vehicle;

	public Arrencar(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void executar() {
		this.vehicle.arrencar();
	}

}
