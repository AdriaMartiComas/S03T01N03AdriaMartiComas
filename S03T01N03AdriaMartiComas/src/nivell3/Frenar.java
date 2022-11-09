package nivell3;

public class Frenar implements Command {

	private Vehicle vehicle;

	public Frenar(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void executar() {
		this.vehicle.frenar();
	}

}
