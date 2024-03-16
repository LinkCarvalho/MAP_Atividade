package controleAcademico;

import java.util.ArrayList;
import java.util.List;

public class AlunoTurma {

    List<Disciplina> horarioAluno = new ArrayList<>();
    Turma turma;
    Aluno aluno;

    public void adicionarDisciplina(Disciplina disciplina){
        horarioAluno.add(disciplina);
    }


    public List<Disciplina> getHorarioAluno() {
        return horarioAluno;
    }

    public void setHorarioAluno(List<Disciplina> horarioAluno) {
        this.horarioAluno = horarioAluno;
    }

    public void imprimirDisciplinas() {
        System.out.println("Disciplinas do aluno " + aluno.getNome());
        for (Disciplina disciplina : horarioAluno) {
            System.out.println("Nome: " + disciplina.getNome());
            System.out.println("Código: " + disciplina.getCodigo());
            System.out.println("Carga Horária: " + disciplina.getCarga_horaria());
            System.out.println("Sala: " + turma.getSala());
            System.out.println("Horário: " + turma.getHorario());
            System.out.println("-----------------------");
        }
    }
    
}
