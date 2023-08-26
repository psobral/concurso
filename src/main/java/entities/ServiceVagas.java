package entities;

import java.util.ArrayList;
import java.util.List;
import entities.Vaga;

public class ServiceVagas {
	
	List<Vaga> vagas = new ArrayList<>();
	
	public void cadastrar(Vaga vaga) {
		vagas.add(vaga);
	}
		
	public Vaga consultarRg(Integer rg) {
		for (Vaga objVaga : vagas) {
			if (objVaga.getRg() == rg) {
				return objVaga;
			}
		}
		return null;
	}
	public boolean vagaOcupada(Vaga vaga) {
		for (Vaga objVaga :vagas) {
			if (objVaga.getNumero() == vaga.getNumero()) {
				return true;
			}
		}
		return false;
	}
	

	
	
		 
	
    
}
