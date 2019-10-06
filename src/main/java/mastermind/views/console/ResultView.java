package mastermind.views.console;

import mastermind.controllers.Controller;

public class ResultView {
	private final Controller controller;

	public ResultView(Controller controller) {
		this.controller = controller;
	}
	
	public void writeln() {
		this.controller.writeResult();
	}


}
