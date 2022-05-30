package br.edu.ifba.inf011.aval1.equipamento;

public abstract class Equipamento {
	
	Equipamento(){
		System.out.println("A classe equipamento foi instanciada");
	}
	
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
	
	public abstract void open();
	public abstract void close();
	public abstract void save();
	public abstract void revert();
	
}
