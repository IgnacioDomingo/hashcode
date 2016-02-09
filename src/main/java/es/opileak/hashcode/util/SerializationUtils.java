package es.opileak.hashcode.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

public class SerializationUtils {

	public static <T> String serializar(T objeto) throws IOException {

		ByteArrayOutputStream arrayStrem = new ByteArrayOutputStream();
		ObjectOutputStream salida;

		salida = new ObjectOutputStream(arrayStrem);
		salida.writeObject(objeto);

		return Base64.getEncoder().encodeToString(arrayStrem.toByteArray());

	}

	@SuppressWarnings("unchecked")
	public static <T> T desSerializar(String objeto) throws IOException, ClassNotFoundException {

		ByteArrayInputStream arrayStrem;
		if (!objeto.isEmpty()) {
			arrayStrem = new ByteArrayInputStream(Base64.getDecoder().decode(objeto.getBytes()));
		} else {
			return null;
		}

		ObjectInputStream entrada = null;
		T result = null;

		entrada = new ObjectInputStream(arrayStrem);
		result = (T) entrada.readObject();

		return result;

	}
}
