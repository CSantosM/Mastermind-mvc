package mastermind.views.console;

import mastermind.controllers.Controller;

public class SecretCombinationView {

	private final Controller controller;

	public SecretCombinationView(Controller controller) {
		this.controller = controller;
	}

	public void writeln() {
		this.controller.writeSecretCombination();
	}
}
