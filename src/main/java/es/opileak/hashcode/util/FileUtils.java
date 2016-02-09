package es.opileak.hashcode.util;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileUtils {

	private static final Charset CHARSET = Charset.forName("UTF-8");

	public static List<String> readFileByLines(Path path) throws IOException {
		return Files.readAllLines(path, CHARSET);
	}

	public static String readWholeFile(Path path) throws IOException {
		return new String(Files.readAllBytes(path), CHARSET);

	}

	public static void writeFile(Path path, String body) throws IOException {
		Files.write(path, body.getBytes(CHARSET), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
	}
}
