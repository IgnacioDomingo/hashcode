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

	public void writeSolutionToFile() {

		List<Command> lstCommand = solution.getLstCommand();

		String file = new String();

		Integer numberOfCommands = solution.getLstCommand().size() + 1;

		file = numberOfCommands + "\n";
		for (Command command : lstCommand) {

			//			TODO: Cambiar el tipo por un enum en el modelo y aquí!

			//			Si es de tipo Load
			if (command.getCommandType() == "L") {
				file += command.getDroneId() + " " + command.getCommandType() + " " + command.getWarehouseId() + " " + command.getProcutId() + " " + command.getProcutConsumed() + "\n";
			}
			//			Si es de tipo Deliver
			if (command.getCommandType() == "D") {
				file += command.getDroneId() + " " + command.getCommandType() + " " + command.getOrderId() + " " + command.getProcutId() + " " + command.getProcutConsumed() + "\n";
			}
		}

		try {
			FileUtils.writeFile(Paths.get("output.txt"), file);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
