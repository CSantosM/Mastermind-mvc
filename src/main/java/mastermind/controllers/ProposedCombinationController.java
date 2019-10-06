package mastermind.controllers;

import mastermind.models.Game;
import mastermind.models.State;

public class ProposedCombinationController extends Controller {

	ProposedCombinationController(Game game, State state) {
		super(game, state);
	}

	@Override
	public void accept(ControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}
}
