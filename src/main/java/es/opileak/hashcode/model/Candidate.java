package es.opileak.hashcode.model;

import java.util.List;

public class Candidate {

	private List<Command>	lstCommands;
	private Integer			score;
	private Order			closedOrder;

	public List<Command> getLstCommands() {
		return lstCommands;
	}

	public void setLstCommands(List<Command> lstCommands) {
		this.lstCommands = lstCommands;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Candidate [lstCommands=" + lstCommands + ", score=" + score + "]";
	}

	public Order getClosedOrder() {
		return closedOrder;
	}

}
