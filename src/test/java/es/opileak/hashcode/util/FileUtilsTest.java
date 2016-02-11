package es.opileak.hashcode.util;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

public class FileUtilsTest {

	@Test
	public void writeOnceFileTest() throws IOException {
		Path path = Paths.get("writeOnce.txt");
		Files.deleteIfExists(path);
		String textToWrite = "hola";
		FileUtils.writeFile(path, textToWrite);

		String readBody = FileUtils.readWholeFile(path);
		assertTrue(textToWrite.equals(readBody));
		Files.deleteIfExists(path);

	}

	@Test
	public void writeExistingFileTest() throws IOException {
		Path path = Paths.get("writeMult.txt");
		Files.deleteIfExists(path);
		String textToWrite = "hola";
		FileUtils.writeFile(path, textToWrite);
		String readBody = FileUtils.readWholeFile(path);
		assertTrue(textToWrite.equals(readBody));

		String textToWrite2 = "hola2";
		FileUtils.writeFile(path, textToWrite2);
		String readBody2 = FileUtils.readWholeFile(path);
		assertTrue(textToWrite2.equals(readBody2));
		Files.deleteIfExists(path);

	}

}
