package mastermind.controllers;

public interface ControllerVisitor {

	public void visit(ProposedCombinationController controller);

	public void visit(ResumeController controller);

	public void visit(StartController controller);
}
