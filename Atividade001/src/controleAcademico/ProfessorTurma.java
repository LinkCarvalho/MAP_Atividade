package controleAcademico;

import java.util.ArrayList;
import java.util.List;

public class ProfessorTurma {

    Professor professor;

    List<Disciplina> disciplinasMinistradas = new ArrayList<>();

    public void adicionarDisciplina(Disciplina disciplina) {

        disciplinasMinistradas.add(disciplina);
    }

    public void Disciplinas() {
        System.out.println("Disciplinas do professor " + professor.getNome() + ":");
        for (Disciplina disciplina : this.disciplinasMinistradas) {
            System.out.println(disciplina.getNome());
        }
    }

	public List<Disciplina> getDisciplinasMinistradas() {
		return disciplinasMinistradas;
	}

	public void setDisciplinasMinistradas(List<Disciplina> disciplinasMinistradas) {
		this.disciplinasMinistradas = disciplinasMinistradas;
	}
    
}
