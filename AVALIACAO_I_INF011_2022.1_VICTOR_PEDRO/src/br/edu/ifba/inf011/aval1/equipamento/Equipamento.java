package br.edu.ifba.inf011.aval1.equipamento;

public abstract class Equipamento {
	
	private String identificador;
	private int quantidade;
	

	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
