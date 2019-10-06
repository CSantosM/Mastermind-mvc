package mastermind.views.console;

import mastermind.controllers.Controller;

public class GameView {

	private final Controller controller;

	GameView(Controller controller) {
		this.controller = controller;
	}

	public void writeln() {
		new SecretCombinationView(this.controller).writeln();
		new ProposedCombinationView(this.controller).writeln();
		new ResultView(this.controller).writeln();
	}
}
