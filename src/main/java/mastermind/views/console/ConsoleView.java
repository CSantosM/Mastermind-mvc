package mastermind.views.console;

import mastermind.controllers.Controller;
import mastermind.controllers.ProposedCombinationController;
import mastermind.controllers.ResumeController;
import mastermind.controllers.StartController;
import mastermind.models.Message;
import mastermind.utils.YesNoDialog;
import mastermind.views.View;

public class ConsoleView extends View {

	@Override
	public void interact(Controller controller) {
		controller.accept(this);
	}

	public void visit(StartController startController) {
		Message.NEW_LINE.write();
		Message.TITLE.writeln();
		startController.start();
		new GameView(startController).writeln();
	}

	public void visit(ProposedCombinationController proposedCombinationController) {
		new GameView(proposedCombinationController).writeln();
	}

	public void visit(ResumeController resumeController) {
		resumeController.resume(new YesNoDialog().read());
	}
}
