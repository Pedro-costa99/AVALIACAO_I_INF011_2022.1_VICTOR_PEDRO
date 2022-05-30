package br.edu.ifba.inf011.aval1;

import br.edu.ifba.inf011.aval1.factorymethod.AcessoriosApplication;
import br.edu.ifba.inf011.aval1.factorymethod.Application;
import br.edu.ifba.inf011.aval1.factorymethod.HalteresApplication;
import br.edu.ifba.inf011.aval1.factorymethod.MaquinasApplication;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Application app = new MaquinasApplication();
		Application app2 = new AcessoriosApplication();
		Application app3 = new HalteresApplication();
		
		app.novoEquipamento("M001", 20, "Bicicleta ergométrica", "Dream Fitness");
		app2.novoEquipamento("A001", 3, "PUXADOR PULLEY RETO 50 CM/");
		app3.novoEquipamento("H001", 2, 5.5);
		
	}

}
