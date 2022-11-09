package nivell3;

public class Accelerar implements Command {

	private Vehicle vehicle;

	public Accelerar(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void executar() {
		this.vehicle.accelerar();
	}

}
