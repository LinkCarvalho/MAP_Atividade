package controleAcademico;

import java.util.ArrayList;

public class ProfessorTurma {
    private static ArrayList<Professor> professores = new ArrayList<>();
    private static ArrayList<Turma> turmas = new ArrayList<>();

    public static void addNovoProfessor(String nome){
        professores.add(new Professor(nome));
    }

    public static void addNovaTurma(String sala, String horario, Disciplina disciplina){
        turmas.add(new Turma(sala, horario, disciplina));
    }

    public static void addDisciplinaProfessor(int indexProfessor, int indexTurma){
        professores.get(indexProfessor).getHorario().add(turmas.get(indexTurma).getDisciplina());
    }

    public static void imprimeDisciplinasHorarioProfessor(int indexProfessor) {
        System.out.println("Horário e disciplinas do professor " + professores.get(indexProfessor).getNome() + ":");
        for (Disciplina disciplina : professores.get(indexProfessor).getHorario()) {
            System.out.println(disciplina.getNome());
        }
    }
}
