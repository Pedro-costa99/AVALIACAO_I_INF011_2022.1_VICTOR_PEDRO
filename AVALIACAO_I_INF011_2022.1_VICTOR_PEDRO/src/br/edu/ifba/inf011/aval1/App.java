package br.edu.ifba.inf011.aval1;
import br.edu.ifba.inf011.aval1.exercicio.Exercicio;
import br.edu.ifba.inf011.aval1.exercicio.TipoExercicio;
import br.edu.ifba.inf011.aval1.factorymethod.AcessoriosApplication;
import br.edu.ifba.inf011.aval1.factorymethod.Application;
import br.edu.ifba.inf011.aval1.factorymethod.HalteresApplication;
import br.edu.ifba.inf011.aval1.factorymethod.MaquinasApplication;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//questão 01
		Application app = new MaquinasApplication();
		Application app2 = new AcessoriosApplication();
		Application app3 = new HalteresApplication();
		
		app.novoEquipamento("M001", 20, "Bicicleta ergométrica", "Dream Fitness");
		app2.novoEquipamento("A001", 3, "PUXADOR PULLEY RETO 50 CM/");
		app3.novoEquipamento("H001", 2, 5.5);
				
		//Exercicio e = new Exercicio("Alongamento ");
		//e.setDescricao("testepedro");
		//System.out.println(e.getDescricao());
		//Exercicio e = new Exercicio.ExercicioBuilder().descricao("teste55").build();
		//System.out.println(e);
		
		TipoExercicio [] tiposExercicios = new TipoExercicio [3];	
		TipoExercicio ex = new TipoExercicio();	
	
			
		//for(TipoExercicio tp : tiposExercicios) {
			
		//	System.out.println(tp.getTipo());
		//}		
		
		//Exercicio e = new Exercicio ();
		//e.setTiposExercicios(tiposExercicios);
	
		
		String [] gruposMusculares = new String [3];
		//String gm = new String ();
		
		
		gruposMusculares[0] = "Peito e ombro";
		gruposMusculares[1] = "Bíceps e Trícpes";
		gruposMusculares[2] = "Pernas";
		
			
		Exercicio e = new Exercicio.ExercicioBuilder()
				.descricao("teste01")
				.tiposExercicios(tiposExercicios)
				.gruposMusculares(gruposMusculares).build();
		
		
		
		System.out.println(e);
		
	}

}
