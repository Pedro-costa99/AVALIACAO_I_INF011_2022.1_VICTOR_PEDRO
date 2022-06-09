package br.edu.ifba.inf011.aval1;

import java.util.Scanner;

import br.edu.ifba.inf011.aval1.exercicio.Exercicio;
import br.edu.ifba.inf011.aval1.exercicio.TipoExercicio;
import br.edu.ifba.inf011.aval1.factorymethod.AcessoriosApplication;
import br.edu.ifba.inf011.aval1.factorymethod.Application;
import br.edu.ifba.inf011.aval1.factorymethod.HalteresApplication;
import br.edu.ifba.inf011.aval1.factorymethod.MaquinasApplication;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		//questão 01
		Application app = new MaquinasApplication();
		Application app2 = new AcessoriosApplication();
		Application app3 = new HalteresApplication();
		
		app.novoEquipamento("M001", 20, "Bicicleta ergométrica", "Dream Fitness");
		app2.novoEquipamento("A001", 3, "PUXADOR PULLEY RETO 50 CM/");
		app3.novoEquipamento("H001", 2, 5.5);
		
		Exercicio ex = new Exercicio();		
		
		TipoExercicio [] tiposExercicios = new TipoExercicio [3];	
		
		
		//c.setTipo("TIPOA");		
		//tiposExercicios[0] = c;
		//c.setTipo("TIPOB");
		//tiposExercicios[1] = c;
		//c.setTipo("TIPOC");
		//tiposExercicios[2] = c;
		
		
		
		for(int i=0; i <3; i++) {
			
			TipoExercicio c = new TipoExercicio();	
			//Contato c = new Contato();				
			
			System.out.println("Informe o nome do " + (i+1) + "º exercício:");
			String nome = scan.nextLine();
			//c.setNome(nome);
			c.setTipo(nome);
						
			//contatos[i] = c;
			tiposExercicios[i] = c;
			
		
	}
	
		ex.setTiposExercicios(tiposExercicios);
		
		
			
		String [] gruposMusculares = new String [3];
		
		gruposMusculares[0] = "Peito e ombro";
		gruposMusculares[1] = "Bíceps e Trícpes";
		gruposMusculares[2] = "Pernas";
		
		//questão 02
		Exercicio e = new Exercicio.ExercicioBuilder()
				.descricao("teste01")
				.tiposExercicios(tiposExercicios)
				.gruposMusculares(gruposMusculares).build();
		
		
		
		System.out.println(e);
		System.out.println(ex.getTiposExercicios());
		
	}

}
