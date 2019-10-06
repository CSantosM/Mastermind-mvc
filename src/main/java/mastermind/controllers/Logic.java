package mastermind.controllers;

import java.util.HashMap;
import java.util.Map;

import mastermind.models.Game;
import mastermind.models.State;
import mastermind.models.StateValue;

public class Logic {

	private Map<StateValue, Controller> controllers;
	private State state;
	private Game game;

	public Logic() {
		this.state = new State();
		this.game = new Game();
		this.controllers = new HashMap<StateValue, Controller>();
		this.controllers.put(StateValue.INITIAL, new StartController(this.game, this.state));
		this.controllers.put(StateValue.IN_GAME, new ProposedCombinationController(this.game, this.state));
		this.controllers.put(StateValue.RESUME, new ResumeController(this.game, this.state));
		this.controllers.put(StateValue.FINAL, null);
	}

	public Controller getController() {
		return this.controllers.get(this.state.getValueState());
	}

}
