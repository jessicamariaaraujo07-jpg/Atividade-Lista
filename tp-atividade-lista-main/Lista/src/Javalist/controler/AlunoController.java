package Javalist.controler;
import Javalista.model.Aluno;
import java.util.List;
import java.util.ArrayList;

public class AlunoController {

	private List<Aluno> listaAlunos;
	
	public AlunoController() {
		listaAlunos = new ArrayList<>();
	}

	public void setAluno(Aluno a) {
		listaAlunos.add(a);
	}
	
	public Aluno getAluno(int index) {
		return listaAlunos.get(index);
	}
	public String mostrarAlunos() {
		StringBuilder sb = new StringBuilder();
		for(Aluno a:listaAlunos) {
			sb.append(a.toString()+"\n");
		}
		return sb.toString();
	}
	
	public void removerAlunoLista (int index) {
		listaAlunos.remove(index);
	}
	
	public void viradaSemestre () {
		for (Aluno a: listaAlunos) {
			a.proximoCiclo();
		}
	}
	
	public void limparLista () {
		while (!listaAlunos.isEmpty()) {
		    removerAlunoLista(0);
		}
	}
	
	public void localizarPeloCiclo (int matricula) {
		for (Aluno a : listaAlunos) {
			if(a.getMatricula() == matricula) {
				System.out.println(a.toString());
			}
		}
	}
	
	
	
}


