import static org.junit.Assert.*;

import org.junit.Test;

import entities.Vaga;
import entities.Controller;

public class TestVagas {
	
	Vaga vaga1 = new Vaga(10, "ABJ-CS", "Azul","Paula", 123456);
	Vaga vaga2 = new Vaga(10, "ABX-DF", "Amarelo", "Anderson", 123444);
	Vaga vaga3 = new Vaga(5, "ABXXX", "Preto", "Fernanda", 33333);
	Controller servico = new Controller();
	
	
	
	@Test
	public void vagaOcupada() {
		servico.cadastrar(vaga1);
		boolean result = servico.vagaOcupada(vaga2);
		
		assertTrue(result);
	}
	
	@Test
	public void vagaNaoOcupada() {
		servico.cadastrar(vaga1);
		boolean result = servico.vagaOcupada(vaga3);
		
		assertFalse(result);
	}
	
	@Test 
	public void consultRg() {
		servico.cadastrar(vaga2);
		Vaga resultado = servico.consultarRg(vaga2.getRg());
		
		assertNotNull(resultado);
	}
	
	@Test
	public void consultaRgNaoVaga() {
		servico.cadastrar(vaga2);
		Vaga resultado = servico.consultarRg(vaga3.getRg());
		
		assertNull(resultado);
	}
	
	@Test
	public void cadastroNaoExiste() {
		servico.cadastrar(vaga1);
		Vaga resultado = servico.consultarRg(vaga3.getRg());
		
		assertNull(resultado);
	}

}
