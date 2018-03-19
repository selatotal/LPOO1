import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCasa {
	
	@Test
	public void testCreation() {
		Casa casa = new Casa();
		assertEquals("Total de portas instaladas deve ser 0", casa.totalDePortasInstaladas(), 0);
		assertEquals("Total de portas abertas deve ser 0", casa.totalDePortasInstaladas(), 0);
	}

	@Test
	public void testPorta1(){
		Casa casa = new Casa();
		Porta porta = new Porta();
		casa.setPorta1(porta);
		assertEquals("Total de portas instaladas deve ser 1", casa.totalDePortasInstaladas(), 1);
		assertEquals("Total de portas abertas deve ser 0", casa.quantasPortasEstaoAbertas(), 0);

		casa.setPorta2(porta);
		assertEquals("Total de portas instaladas deve ser 1", casa.totalDePortasInstaladas(), 1);
		assertEquals("Total de portas abertas deve ser 0", casa.quantasPortasEstaoAbertas(), 0);

		casa.setPorta3(porta);
		assertEquals("Total de portas instaladas deve ser 1", casa.totalDePortasInstaladas(), 1);
		assertEquals("Total de portas abertas deve ser 0", casa.quantasPortasEstaoAbertas(), 0);

		casa.setPorta1(null);
		assertEquals("Total de portas instaladas deve ser 0", casa.totalDePortasInstaladas(), 0);
		assertEquals("Total de portas abertas deve ser 0", casa.quantasPortasEstaoAbertas(), 0);
		
		porta.abre();
		assertEquals("Total de portas instaladas deve ser 0", casa.totalDePortasInstaladas(), 0);
		assertEquals("Total de portas abertas deve ser 0", casa.quantasPortasEstaoAbertas(), 0);
		
		casa.setPorta1(porta);
		assertEquals("Total de portas instaladas deve ser 1", casa.totalDePortasInstaladas(), 1);
		assertEquals("Total de portas abertas deve ser 1", casa.quantasPortasEstaoAbertas(), 1);

		porta.fecha();
		assertEquals("Total de portas instaladas deve ser 1", casa.totalDePortasInstaladas(), 1);
		assertEquals("Total de portas abertas deve ser 0", casa.quantasPortasEstaoAbertas(), 0);
	}
	
	@Test
	public void testPorta2(){
		Casa casa = new Casa();
		Porta porta = new Porta();
		casa.setPorta2(porta);
		assertEquals("Total de portas instaladas deve ser 1", casa.totalDePortasInstaladas(), 1);
		assertEquals("Total de portas abertas deve ser 0", casa.quantasPortasEstaoAbertas(), 0);

		casa.setPorta1(porta);
		assertEquals("Total de portas instaladas deve ser 1", casa.totalDePortasInstaladas(), 1);
		assertEquals("Total de portas abertas deve ser 0", casa.quantasPortasEstaoAbertas(), 0);

		casa.setPorta3(porta);
		assertEquals("Total de portas instaladas deve ser 1", casa.totalDePortasInstaladas(), 1);
		assertEquals("Total de portas abertas deve ser 0", casa.quantasPortasEstaoAbertas(), 0);

		casa.setPorta2(null);
		assertEquals("Total de portas instaladas deve ser 0", casa.totalDePortasInstaladas(), 0);
		assertEquals("Total de portas abertas deve ser 0", casa.quantasPortasEstaoAbertas(), 0);
		
		porta.abre();
		assertEquals("Total de portas instaladas deve ser 0", casa.totalDePortasInstaladas(), 0);
		assertEquals("Total de portas abertas deve ser 0", casa.quantasPortasEstaoAbertas(), 0);
		
		casa.setPorta2(porta);
		assertEquals("Total de portas instaladas deve ser 1", casa.totalDePortasInstaladas(), 1);
		assertEquals("Total de portas abertas deve ser 1", casa.quantasPortasEstaoAbertas(), 1);

		porta.fecha();
		assertEquals("Total de portas instaladas deve ser 1", casa.totalDePortasInstaladas(), 1);
		assertEquals("Total de portas abertas deve ser 0", casa.quantasPortasEstaoAbertas(), 0);
	}

	@Test
	public void testPorta3(){
		Casa casa = new Casa();
		Porta porta = new Porta();
		casa.setPorta3(porta);
		assertEquals("Total de portas instaladas deve ser 1", casa.totalDePortasInstaladas(), 1);
		assertEquals("Total de portas abertas deve ser 0", casa.quantasPortasEstaoAbertas(), 0);

		casa.setPorta3(porta);
		assertEquals("Total de portas instaladas deve ser 1", casa.totalDePortasInstaladas(), 1);
		assertEquals("Total de portas abertas deve ser 0", casa.quantasPortasEstaoAbertas(), 0);

		casa.setPorta1(porta);
		assertEquals("Total de portas instaladas deve ser 1", casa.totalDePortasInstaladas(), 1);
		assertEquals("Total de portas abertas deve ser 0", casa.quantasPortasEstaoAbertas(), 0);

		casa.setPorta3(null);
		assertEquals("Total de portas instaladas deve ser 0", casa.totalDePortasInstaladas(), 0);
		assertEquals("Total de portas abertas deve ser 0", casa.quantasPortasEstaoAbertas(), 0);
		
		porta.abre();
		assertEquals("Total de portas instaladas deve ser 0", casa.totalDePortasInstaladas(), 0);
		assertEquals("Total de portas abertas deve ser 0", casa.quantasPortasEstaoAbertas(), 0);
		
		casa.setPorta3(porta);
		assertEquals("Total de portas instaladas deve ser 1", casa.totalDePortasInstaladas(), 1);
		assertEquals("Total de portas abertas deve ser 1", casa.quantasPortasEstaoAbertas(), 1);

		porta.fecha();
		assertEquals("Total de portas instaladas deve ser 1", casa.totalDePortasInstaladas(), 1);
		assertEquals("Total de portas abertas deve ser 0", casa.quantasPortasEstaoAbertas(), 0);
	}

}
