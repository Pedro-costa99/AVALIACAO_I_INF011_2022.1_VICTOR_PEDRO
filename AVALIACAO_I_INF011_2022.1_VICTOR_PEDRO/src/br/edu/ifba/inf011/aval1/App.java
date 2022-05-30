package br.edu.ifba.inf011.aval1;

import br.edu.ifba.inf011.aval1.factorymethod.Application;
import br.edu.ifba.inf011.aval1.factorymethod.MaquinasApplication;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Application app = new MaquinasApplication();
		app.novoEquipamento("pedro");
				
		//System.out.println(Test);

	}

}
