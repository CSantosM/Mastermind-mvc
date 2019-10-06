package mastermind.views.console;

import mastermind.controllers.Controller;

public class ProposedCombinationView {

	private final Controller controller;

	public ProposedCombinationView(Controller controller) {
		this.controller = controller;
	}
	
	public void writeln() {
		this.controller.createProposeCombination();
	}

}
