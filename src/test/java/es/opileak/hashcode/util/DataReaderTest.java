package es.opileak.hashcode.util;

import java.io.IOException;

import org.junit.Test;

public class DataReaderTest {

	@Test
	public void readExampleData() throws IOException {
		String path = "prueba.in";
		DataReader.readFile(path);

	}

}
