package controleAcademico;

import java.util.ArrayList;

public class Professor {
    private final String nome;
    private ArrayList<Disciplina> horario;

    public Professor(String nome) {
        this.nome = nome;
        this.horario = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Disciplina> getHorario() {
        return horario;
    }
}
