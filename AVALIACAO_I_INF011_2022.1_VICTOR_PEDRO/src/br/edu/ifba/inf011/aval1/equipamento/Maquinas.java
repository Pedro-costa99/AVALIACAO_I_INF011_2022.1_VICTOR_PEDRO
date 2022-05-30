package br.edu.ifba.inf011.aval1.equipamento;

public class Maquinas extends Equipamento {
	
	private String descricao;
	private String marca;
	
	public Maquinas(String identificador, int quantidade, String descricao, String marca) {
		super(identificador, quantidade);
		this.descricao = "teste";
		this.marca = "teste";
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

	public void open() {
		// TODO Auto-generated method stub
		System.out.println("open máquinas");
		
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
	
	@Override
	public String toString () {
		
		
		return getDescricao() + getMarca();
	}
	

}
