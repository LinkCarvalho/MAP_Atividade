package controleAcademico;

public class Main {
    public static void main(String[] args) {
        Disciplina matematica = new Disciplina("Matemática", 101, 60);
        Disciplina portugues = new Disciplina("Português", 102, 60);
        
        AlunoTurma.addNovoAluno(123, "João");
        AlunoTurma.addNovoAluno(124, "Maria");
        AlunoTurma.addNovaTurma("Sala 101", "8:00", matematica);
        AlunoTurma.addNovaTurma("Sala 102", "10:00", portugues);
        AlunoTurma.addDisciplinaAluno(0, 0); // Adiciona a disciplina da turma 0 ao aluno 0
        AlunoTurma.addDisciplinaAluno(1, 1); // Adiciona a disciplina da turma 1 ao aluno 1

        // Imprime as disciplinas do aluno 0 (João)
        AlunoTurma.imprimeDisciplinasAluno(0);

        // Imprime os alunos matriculados na disciplina Matemática
        AlunoTurma.imprimeAlunosDisciplina(matematica);

        // Imprime o número de alunos matriculados na disciplina Matemática
        AlunoTurma.imprimeNumeroAlunosDisciplina(matematica);

        ProfessorTurma.addNovoProfessor("Carlos");
        ProfessorTurma.addNovoProfessor("Ana");
        ProfessorTurma.addNovaTurma("Sala 101", "8:00", matematica);
        ProfessorTurma.addNovaTurma("Sala 102", "10:00", portugues);
        ProfessorTurma.addDisciplinaProfessor(0, 0); // Adiciona a disciplina da turma 0 ao professor 0
        ProfessorTurma.addDisciplinaProfessor(1, 1); // Adiciona a disciplina da turma 1 ao professor 1

        // Imprime as disciplinas e o horário do professor 0 (Carlos)
        ProfessorTurma.imprimeDisciplinasHorarioProfessor(0);
    }
}
