import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class guardarTest {

	@Test
	void test() {
		Radio radio = new Radio();
		String output = radio.guardar(88);
		assertEquals("Se guardó la emisora en el boton: ", output);
	}

}
