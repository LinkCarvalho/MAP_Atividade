package controleAcademico;

import java.util.ArrayList;

public class Aluno {
    private final int matricula;
    private final String nome;
    private ArrayList<Disciplina> horario;

    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
        this.horario = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public ArrayList<Disciplina> getHorario() {
        return horario;
    }
}
