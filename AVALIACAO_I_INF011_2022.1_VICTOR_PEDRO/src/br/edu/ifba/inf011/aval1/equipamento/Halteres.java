package br.edu.ifba.inf011.aval1.equipamento;

public class Halteres extends Equipamento {
	
	public Halteres(String identificador, int quantidade, double d) {
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


	@Override
	public void criar(String identificador, int quantidade, Double peso) {
		// TODO Auto-generated method stub
		this.setIdentificador(identificador);
		this.setQuantidade(quantidade);
		this.setPeso(peso);
		
		System.out.println("NOVO HALTERE: " + this.getIdentificador() + " " + this.getQuantidade()
		+ " " + this.getPeso());
		
	}
	

}
