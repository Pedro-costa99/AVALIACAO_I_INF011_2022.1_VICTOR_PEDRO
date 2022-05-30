package br.edu.ifba.inf011.aval1.equipamento;

public abstract class Equipamento {
	
		
	private String identificador;
	private int quantidade;
	
	public Equipamento(String identificador, int quantidade) {
		super();
		this.identificador = identificador;
		this.quantidade = quantidade;
	}
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
	
	public void criar(String identificador, int quantidade, String descricao, String marca) {
		// TODO Auto-generated method stub
		
	}
	public void criar(String identificador, int quantidade, String descricao) {
		// TODO Auto-generated method stub
		
	}
	public void criar(String identificador, int quantidade, Double peso) {
		// TODO Auto-generated method stub
		
	}

	
}
