package br.edu.ifba.inf011.aval1.exercicio;

import java.util.Arrays;

public class Exercicio {
	
	private String descricao;
	private TipoExercicio [] tiposExercicios;
	private String [] gruposMusculares = new String [3];
	
	public Exercicio () {
		
	}
	
	private Exercicio(String descricao, TipoExercicio[] tiposExercicios, String[] gruposMusculares) {
		super();
		this.descricao = descricao;
		this.tiposExercicios = tiposExercicios;
		this.gruposMusculares = gruposMusculares;
	}
	public static class ExercicioBuilder{
		
		private String descricao;
		private TipoExercicio [] tiposExercicios;
		private String [] gruposMusculares = new String [3];
		
		public ExercicioBuilder() {
			super();
		}
		
		public ExercicioBuilder descricao(String descricao) {
			this.descricao = descricao;
			return this;
			
		}
		
		public ExercicioBuilder tiposExercicios(TipoExercicio [] tiposExercicios) {
			this.tiposExercicios = tiposExercicios;
			return this;
			
		}
		
		public ExercicioBuilder gruposMusculares(String [] gruposMusculares) {
			this.gruposMusculares = gruposMusculares;
			return this;
			
		}
		
		public Exercicio build() {
			return new Exercicio(descricao, tiposExercicios, gruposMusculares);
		}
		
		
		
	}
	
	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public TipoExercicio[] getTiposExercicios() {
		return tiposExercicios;
	}
	public void setTiposExercicios(TipoExercicio[] tiposExercicios) {
		this.tiposExercicios = tiposExercicios;
	}
	public String[] getGruposMusculares() {
		return gruposMusculares;
	}
	public void setGruposMusculares(String[] gruposMusculares) {
		this.gruposMusculares = gruposMusculares;
	}
	@Override
	public String toString() {
		return "Exercicio [descricao=" + descricao + ", tiposExercicios=" + Arrays.toString(tiposExercicios)
				+ ", gruposMusculares=" + Arrays.toString(gruposMusculares) + "]";
	}
	
	
	
	
	
}
