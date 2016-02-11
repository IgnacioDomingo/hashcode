package es.opileak.hashcode.model;

import java.util.List;

public class Candidate {

	List<Command>	lstCommands;
	Integer			turns;
	Integer			score;

	public List<Command> getLstCommands() {
		return lstCommands;
	}

	public void setLstCommands(List<Command> lstCommands) {
		this.lstCommands = lstCommands;
	}

	public Integer getTurns() {
		return turns;
	}

	public void setTurns(Integer turns) {
		this.turns = turns;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

}
