package controleAcademico;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private final String nome;

    List<Disciplina> disciplinasMinistradas = new ArrayList<>();

    public Professor(String nome) {
        this.nome = nome;
    }

    public void adicionarDisciplina(Disciplina disciplina) {

        disciplinasMinistradas.add(disciplina);
    }

    public void Disciplinas() {
        System.out.println("Disciplinas do professor " + this.nome + ":");
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

	public String getNome() {
		return nome;
	}

}
