package br.edu.ifba.inf011.aval1.factorymethod;

import br.edu.ifba.inf011.aval1.equipamento.Acessorios;
import br.edu.ifba.inf011.aval1.equipamento.Equipamento;

public class AcessoriosApplication extends Application {



	@Override
	public Equipamento criarEquipamento() {
		// TODO Auto-generated method stub
		return new Acessorios(null, 0);
	}

}
