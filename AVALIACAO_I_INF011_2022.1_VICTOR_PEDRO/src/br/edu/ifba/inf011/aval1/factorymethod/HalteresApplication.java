package br.edu.ifba.inf011.aval1.factorymethod;

import br.edu.ifba.inf011.aval1.equipamento.Equipamento;
import br.edu.ifba.inf011.aval1.equipamento.Halteres;

public class HalteresApplication extends Application {

	@Override
	public Equipamento criarEquipamento() {
		// TODO Auto-generated method stub
		return new Halteres(null, 0, 0);
	}

}
