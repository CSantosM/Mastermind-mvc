package mastermind.models;

import java.util.ArrayList;

public class Game {

	private SecretCombination secretCombination;
	private ArrayList<ProposedCombination> proposedCombinations;
	private ArrayList<Result> results;

	public Game() {
		this.clear();
	}

	public void writeSecretCombination() {
		this.secretCombination.write();
	}

	public void createProposeCombination() {
		this.proposedCombinations.add(new ProposedCombination());
	}

	public void writeResult() {
		Message.ATTEMPTS.writeln(this.getAttemps());
		this.writeSecretCombination();
		this.results.add(this.secretCombination.getResult(this.getLastProposedCombination()));
		for (int i = 0; i < this.getAttemps(); i++) {
			this.proposedCombinations.get(i).write();
			this.results.get(i).writeln();
		}
	}
	
	public boolean hasWinnerOrLoser() {
		return this.getAttemps() == 10 || this.getLastResult().isWinner();
	}

	public void clear() {
		this.secretCombination = new SecretCombination();
		this.proposedCombinations = new ArrayList<ProposedCombination>();
		this.results = new ArrayList<Result>();
	}

	private int getAttemps() {
		return this.proposedCombinations.size();
	}

	private ProposedCombination getLastProposedCombination() {
		return this.proposedCombinations.get(this.proposedCombinations.size() - 1);
	}
	
	private Result getLastResult() {
		return this.results.get(this.results.size() - 1);
	}
}
