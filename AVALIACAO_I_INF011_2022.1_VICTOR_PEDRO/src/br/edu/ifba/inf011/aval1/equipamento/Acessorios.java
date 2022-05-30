package br.edu.ifba.inf011.aval1.equipamento;

public class Acessorios extends Equipamento {
	
	public Acessorios(String identificador, int quantidade) {
		super(identificador, quantidade);
		// TODO Auto-generated constructor stub
	}

	private String descricao;
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public void criar(String identificador, int quantidade, String descricao) {
		// TODO Auto-generated method stub
		this.setIdentificador(identificador);
		this.setQuantidade(quantidade);
		this.setDescricao(descricao);
		
		System.out.println("NOVO ACESSÓRIO: " + this.getIdentificador() + " " + this.getQuantidade()
		+ " " + this.getDescricao());
		
	}
	
	


	
	

}
