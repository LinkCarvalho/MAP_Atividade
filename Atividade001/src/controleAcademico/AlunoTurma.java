package controleAcademico;

import java.util.ArrayList;

public class AlunoTurma {
    private static ArrayList<Aluno> alunos = new ArrayList<>();
    private static ArrayList<Turma> turmas = new ArrayList<>();

    public static void addNovoAluno(int matricula, String nome){
        alunos.add(new Aluno(matricula, nome));
    }

    public static void addNovaTurma(String sala, String horario, Disciplina disciplina){
        turmas.add(new Turma(sala, horario, disciplina));
    }

    public static void addDisciplinaAluno(int indexAluno, int indexTurma){
        alunos.get(indexAluno).getHorario().add(turmas.get(indexTurma).getDisciplina());
    }

    public static void imprimeDisciplinasAluno(int indexAluno) {
        System.out.println("Disciplinas do aluno " + alunos.get(indexAluno).getNome() + ":");
        for (Disciplina disciplina : alunos.get(indexAluno).getHorario()) {
            System.out.println(disciplina.getNome());
        }
    }

    public static void imprimeAlunosDisciplina(Disciplina disciplina) {
        System.out.println("Alunos matriculados na disciplina " + disciplina.getNome() + ":");
        for (Aluno aluno : alunos) {
            if (aluno.getHorario().contains(disciplina)) {
                System.out.println(aluno.getNome());
            }
        }
    }

    public static void imprimeNumeroAlunosDisciplina(Disciplina disciplina) {
        int count = 0;
        for (Aluno aluno : alunos) {
            if (aluno.getHorario().contains(disciplina)) {
                count++;
            }
        }
        System.out.println("Número de alunos matriculados na disciplina " + disciplina.getNome() + ": " + count);
    }
}
