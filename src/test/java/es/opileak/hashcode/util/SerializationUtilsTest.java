package es.opileak.hashcode.util;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

public class SerializationUtilsTest {

	@Test
	public void serilizeDeserializeTest() throws IOException, ClassNotFoundException {
		Integer object = 345;
		String serlizedObject = SerializationUtils.serializar(object);
		Integer deserializedObject = SerializationUtils.desSerializar(serlizedObject);
		assertTrue(object.equals(deserializedObject));
	}

}
