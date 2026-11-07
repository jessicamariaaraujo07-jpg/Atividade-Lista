package Javalist.view;
import java.util.List;

import Javalist.controler.AlunoController;
import Javalista.model.Aluno;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		AlunoController ac = new AlunoController();
		ac.setAluno(new Aluno(10, "Ale", "DSM", 2));
		ac.setAluno(new Aluno(20, "Aline", "DSM", 2));
		ac.setAluno(new Aluno(30, "Lucas", "DSM", 2));
		ac.setAluno(new Aluno(40, "Pedro", "DSM", 2));
		
		
		
		System.out.println(ac.getAluno(2));
		System.out.println(ac.mostrarAlunos());
		
	
		ac.removerAlunoLista(1);
		ac.viradaSemestre();
		System.out.println(ac.mostrarAlunos());
		
		ac.limparLista();
		System.out.println(ac.mostrarAlunos());
		
		ac.localizarPeloCiclo(2);		
		
	}

}
