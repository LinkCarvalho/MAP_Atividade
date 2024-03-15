package controleAcademico;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private final int matricula;
    private final String nome;
    List<Disciplina> disciplinas = new ArrayList<>();

    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public void adicionarDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }

    /*public void imprimirHorarios() {
        System.out.println("Horários das disciplinas de " + this.nome + ":");
        for (Disciplina disciplina : this.disciplinas) {
            System.out.println(disciplina.getNome() + ": " + disciplina.getHorario());
        }
    }*/

    public String getNome() {
        return nome;
    }


    public int getMatricula() {
        return matricula;
    }

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
}
