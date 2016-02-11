package es.opileak.hashcode.algoritm;

import es.opileak.hashcode.model.Candidate;
import es.opileak.hashcode.model.ProblemState;
import es.opileak.hashcode.model.Solution;
import es.opileak.hashcode.services.CandidateService;

public class Voraz {

	private CandidateService candidateService;

	public Voraz() {
		super();
	}

	public Solution run(ProblemState problemState) {

		Solution potentialSolution = new Solution(problemState);

		while (!problemState.isSolved() && candidateService.hasCandidate()) {
			Candidate operationCandidate = candidateService.getBestCandidate(potentialSolution);

			potentialSolution.add(operationCandidate);
			problemState.apply(operationCandidate);
		}

		return potentialSolution;

	}

}
