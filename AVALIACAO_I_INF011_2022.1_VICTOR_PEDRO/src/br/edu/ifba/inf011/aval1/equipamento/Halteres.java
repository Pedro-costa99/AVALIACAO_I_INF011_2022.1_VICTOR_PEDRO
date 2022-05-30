package br.edu.ifba.inf011.aval1.equipamento;

public class Halteres extends Equipamento {
	
	public Halteres(String identificador, int quantidade) {
		super(identificador, quantidade);
		// TODO Auto-generated constructor stub
	}


	private Double peso;

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("open halteres");
		
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
