package es.opileak.hashcode.util;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

import es.opileak.hashcode.model.Command;
import es.opileak.hashcode.model.Solution;

public class SolutionWriter {

	private Solution solution;

	public SolutionWriter(Solution solution) {
		this.solution = solution;
	}

	public void writeSolutionToFile(Solution solution) {

		List<Command> lstCommand = solution.getLstCommand();

		String file = new String();
		for (Command command : lstCommand) {
			file += command.getDroneId() + " " + command.getCommandType() + " " + command.getWarehouseId() + " " + command.getProcutId() + " " + command.getProcutConsumed() + "\n";
		}

		try {
			FileUtils.writeFile(Paths.get("output.txt"), file);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
