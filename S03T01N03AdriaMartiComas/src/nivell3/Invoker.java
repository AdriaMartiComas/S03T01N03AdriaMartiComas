package nivell3;

public class Invoker {

	public Command command;

	public Invoker(Command command) {
		this.command = command;
	}

	public void executar() {
		this.command.executar();
	}

}
