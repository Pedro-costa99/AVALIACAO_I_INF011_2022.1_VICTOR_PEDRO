package br.edu.ifba.inf011.aval1.factorymethod;

import br.edu.ifba.inf011.aval1.equipamento.Equipamento;

public abstract class Application {
	
	//factoryMethod
	public abstract Equipamento criarEquipamento();
	
	public void novoEquipamento(String nome) {
		Equipamento e =  criarEquipamento();
		e.open();
	}

}
