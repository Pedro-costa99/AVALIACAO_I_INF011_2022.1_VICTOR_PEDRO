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
	
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("open acessórios");
		
	}

	public void close() {
		// TODO Auto-generated method stub
		
	}

	public void save() {
		// TODO Auto-generated method stub
		
	}

	public void revert() {
		// TODO Auto-generated method stub
		
	}
	
	

}
