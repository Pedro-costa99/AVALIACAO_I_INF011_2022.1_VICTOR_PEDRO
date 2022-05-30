package br.edu.ifba.inf011.aval1.factorymethod;

import br.edu.ifba.inf011.aval1.equipamento.Equipamento;
import br.edu.ifba.inf011.aval1.equipamento.Maquinas;

public class MaquinasApplication extends Application {



	@Override
	public Equipamento criarEquipamento() {
		// TODO Auto-generated method stub
		return new Maquinas(null, 0, null, null);
	}

}
