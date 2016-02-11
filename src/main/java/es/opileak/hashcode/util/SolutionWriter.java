package es.opileak.hashcode.util;

import java.util.List;

import es.opileak.hashcode.model.Command;
import es.opileak.hashcode.model.Solution;

public class SolutionWriter {

	private FileUtils	fileUtils;
	private Solution	solution;

	public SolutionWriter(Solution solution) {
		this.solution = solution;
	}

	public void writeSolutionToFile(Solution solution) {

		List<Command> lstCommand = solution.getLstCommand();

		String file = new String();
		for (Command command : lstCommand) {
			file += command.getDroneId() + " " + command.getCommandType() + " " + command.getWarehouseId() + " " + command.getProcutId() + " " + command.getProcutConsumed() + "\n";
		}

		//		fileUtils.writeFile(, file);

	}

}
