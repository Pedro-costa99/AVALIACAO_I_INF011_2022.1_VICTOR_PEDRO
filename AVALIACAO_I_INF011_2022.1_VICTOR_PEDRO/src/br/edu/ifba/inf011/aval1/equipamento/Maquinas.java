package br.edu.ifba.inf011.aval1.equipamento;

public class Maquinas extends Equipamento {
	
	private String descricao;
	private String marca;
	
	public Maquinas(String identificador, int quantidade, String descricao, String marca) {
		super(identificador, quantidade);
		this.descricao = descricao;
		this.marca = marca;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
		
	@Override
	public void criar(String identificador, int quantidade, String descricao, String marca) {
		// TODO Auto-generated method stub
		this.setIdentificador(identificador);
		this.setQuantidade(quantidade);
		this.setDescricao(descricao);
		this.setMarca(marca);
		System.out.println("NOVA MÁQUINA: " + this.getIdentificador() + " " + this.getQuantidade()
		+ " " + this.getDescricao() + " " + this.getMarca());
		
	}
	

}
