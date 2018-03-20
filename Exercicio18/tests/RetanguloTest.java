import static org.junit.Assert.*;

import org.junit.Test;

import com.sun.xml.internal.ws.policy.spi.AssertionCreationException;

public class RetanguloTest {

	@Test
	public void testInstance() {
		Retangulo retangulo = new Retangulo();
		
		assertNull("Vertice deve ser nulo", retangulo.getVertice());
		assertEquals("Altura deve ser zero", 0, retangulo.getAltura(), 0.0001);
		assertEquals("Largura deve ser zero", 0, retangulo.getLargura(), 0.0001);

		retangulo.setAltura(-1);
		assertEquals("Não deve permitir altura negativa", 0, retangulo.getAltura(), 0.0001);
		retangulo.setLargura(-1);
		assertEquals("Não deve permitir largura negativa", 0, retangulo.getAltura(), 0.0001);

		retangulo = new Retangulo(-1, -1);
		assertEquals("Não deve permitir altura negativa no construtor", 0, retangulo.getAltura(), 0.0001);
		assertEquals("Não deve permitir largura negativa no construtor", 0, retangulo.getAltura(), 0.0001);
		
		retangulo = new Retangulo(10, 20);
		assertEquals("Altura definida pelo construtor", 10, retangulo.getAltura(), 0.00001);
		assertEquals("Largura definida pelo construtor", 20, retangulo.getLargura(), 0.00001);
		
	}

	@Test
	public void testVertice(){
		Retangulo retangulo = new Retangulo();
		Ponto vertice = new Ponto(10, 20);
		
		retangulo.setVertice(vertice);
		assertNotNull("Vertice nao pode ser nulo", retangulo.getVertice());
		assertEquals("Vertice deve ser definido para o objeto passado", retangulo.getVertice(), vertice);
		
		retangulo.setVertice(null);
		assertNull("Definindo vertice para nulo", retangulo.getVertice());		
	}
	
	@Test
	public void testCalculaCentro(){
		
		Retangulo retangulo = new Retangulo();
		
		assertNull("Chamada deve retornar nulo se altura e largura forem 0", retangulo.getCentro());
		
		retangulo.setAltura(10);
		assertNull("Chamada deve retornar nulo se largura for zero", retangulo.getCentro());

		retangulo.setAltura(0);
		retangulo.setLargura(10);
		assertNull("Chamada deve retornar nulo se altura for zero", retangulo.getCentro());

		retangulo.setVertice(new Ponto(0, 10));
		retangulo.setAltura(10);
		Ponto ponto = retangulo.getCentro();
		assertNotNull("Deve retornar o ponto do centro", ponto);
		assertEquals("X do Ponto deve ser 5", 5, ponto.getX(), 0.0001);
		assertEquals("Y do Ponto deve ser 5", 5, ponto.getY(), 0.0001);
		
		retangulo.setVertice(new Ponto(1, 11));
		ponto = retangulo.getCentro();
		assertNotNull("Deve retornar o ponto do centro", ponto);
		assertEquals("X do Ponto deve ser 6", 6, ponto.getX(), 0.0001);
		assertEquals("Y do Ponto deve ser 6", 6, ponto.getY(), 0.0001);
		
	}
}
