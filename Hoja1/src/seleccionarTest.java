import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class seleccionarTest {

	@Test
	void test() {
		Radio radio = new Radio();
		String output = radio.seleccionar(7);
		assertEquals("Emisora seleccionada", output);
	}

}
