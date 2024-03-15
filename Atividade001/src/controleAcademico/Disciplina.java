package controleAcademico;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private final String nome;

    private String horario;

    List<Aluno> turma = new ArrayList<>();

    public void adcionarAluno(Aluno aluno){
        turma.add(aluno);
    }

    public int quantAlunos(){

        return turma.size();

    }

    public String getNome() {
        return nome;
    }

    public Disciplina(String nome, String horario) {
        this.nome = nome;
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }

	public List<Aluno> getTurma() {
		return turma;
	}

	public void setTurma(List<Aluno> turma) {
		this.turma = turma;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}



}
