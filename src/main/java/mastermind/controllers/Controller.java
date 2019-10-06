package mastermind.controllers;

import mastermind.models.Game;
import mastermind.models.State;

public abstract class Controller {

	protected Game game;
	protected State state;

	Controller(Game game, State state) {
		this.game = game;
		this.state = state;
	}
	
	public void writeSecretCombination() {
		this.game.writeSecretCombination();
	}
	
	public void createProposeCombination() {
		this.game.createProposeCombination();
	}
	
	public void writeResult() {
		this.game.writeResult();
		if(this.game.hasWinnerOrLoser()) {
			this.state.next();
		}
	}
	
	public abstract void accept(ControllerVisitor controllerVisitor);

}
