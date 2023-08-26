package entities;

import java.time.LocalDate;

public class Vaga {
	
	private Integer numero;
	private String placa;
	private String cor;
	private String nome;
	private Integer rg;
	private LocalDate data;
	
	public Vaga(Integer numero, String placa, String cor, String nome, Integer rg) {
		this.numero = numero;
		this.placa = placa;
		this.cor = cor;
		this.nome = nome;
		this.rg = rg;
		this.data = LocalDate.now();
	}
	
	public Integer getNumero() {
		return numero;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getRg() {
		return rg;
	}

	public void setRg(Integer rg) {
		this.rg = rg;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

}
