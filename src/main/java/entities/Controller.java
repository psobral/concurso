package entities;

public class Controller {
	
	ServiceVagas servico = new ServiceVagas();
	
	public void cadastrar(Vaga vaga) {
		servico.cadastrar(vaga);
	}
		
	public Vaga consultarRg(Integer rg) {
		return servico.consultarRg(rg);
	}
	
	public boolean vagaOcupada(Vaga vaga) {
		return servico.vagaOcupada(vaga);
	}

}
