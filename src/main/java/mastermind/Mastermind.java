package mastermind;

import mastermind.controllers.Controller;
import mastermind.controllers.Logic;
import mastermind.views.View;
import mastermind.views.console.ConsoleView;

public class Mastermind {

	private View view;
	private Logic logic;

	public Mastermind() {
		this.view = new ConsoleView();
		this.logic = new Logic();
	}

	public static void main(String[] args) {
		new Mastermind().play();
	}

	public void play() {
		Controller controller;
		do {
			controller = this.logic.getController();
			if (controller != null) {
				this.view.interact(controller);
			}
		} while (controller != null);
	}
}
