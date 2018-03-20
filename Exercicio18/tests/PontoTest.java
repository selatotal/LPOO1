import static org.junit.Assert.*;

import org.junit.Test;

public class PontoTest {

	@Test
	public void testInstance() {
		Ponto ponto = new Ponto();

		ponto.setX(10);		
		assertEquals("Definir valor do atributo X", 10, ponto.getX(), 0.0001);

		ponto.setY(10);		
		assertEquals("Definir valor do atributo Y", 10, ponto.getY(), 0.0001);

		ponto = new Ponto(10, 20);
		assertEquals("Definir valor do atributo X", 10, ponto.getX(), 0.0001);
		assertEquals("Definir valor do atributo Y", 20, ponto.getY(), 0.0001);
	}

}
