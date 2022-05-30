package br.edu.ifba.inf011.aval1.factorymethod;

import br.edu.ifba.inf011.aval1.equipamento.Equipamento;

public abstract class Application {
	
	//factoryMethod
	public abstract Equipamento criarEquipamento();
	
	public void novoEquipamento(String string, int i, String string2, String string3) {
		Equipamento e =  criarEquipamento();
		e.criar(string, i, string2, string3);
	}
	public void novoEquipamento(String string, int i, String string2) {
		// TODO Auto-generated method stub
		Equipamento e =  criarEquipamento();
		e.criar(string, i, string2);
	}
	public void novoEquipamento(String string, int i, Double peso) {
		// TODO Auto-generated method stub
		Equipamento e =  criarEquipamento();
		e.criar(string, i, peso);
	}
	
}
