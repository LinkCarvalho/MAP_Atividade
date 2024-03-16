package controleAcademico;


public class Main {
    public static void main(String[] args) {
        // Criando alguns alunos
        Aluno aluno1 = new Aluno(1, "João");
        Aluno aluno2 = new Aluno(2, "Maria");

        // Criando algumas disciplinas
        Disciplina disciplina1 = new Disciplina("Matemática", 101, 60);
        Disciplina disciplina2 = new Disciplina("Português", 102, 60);

        // Criando alguns professores
        Professor professor1 = new Professor("Prof. Carlos");
        Professor professor2 = new Professor("Prof. Ana");

        // Criando algumas turmas
        Turma turma1 = new Turma("Sala 101", "08:00 - 10:00", disciplina1);
        Turma turma2 = new Turma("Sala 102", "10:00 - 12:00", disciplina2);

        // Associando alunos a disciplinas
        AlunoTurma alunoTurma1 = new AlunoTurma();
        alunoTurma1.aluno = aluno1;
        alunoTurma1.turma = turma1;
        alunoTurma1.adicionarDisciplina(disciplina1);

        AlunoTurma alunoTurma2 = new AlunoTurma();
        alunoTurma2.aluno = aluno2;
        alunoTurma2.turma = turma2;
        alunoTurma2.adicionarDisciplina(disciplina2);

        // Associando professores a disciplinas
        ProfessorTurma professorTurma1 = new ProfessorTurma();
        professorTurma1.professor = professor1;
        professorTurma1.adicionarDisciplina(disciplina1);

        ProfessorTurma professorTurma2 = new ProfessorTurma();
        professorTurma2.professor = professor2;
        professorTurma2.adicionarDisciplina(disciplina2);

        // Imprimindo as disciplinas que um professor está ministrando
        professorTurma1.Disciplinas();
        professorTurma2.Disciplinas();

        // Imprimindo o horário de um aluno
        System.out.println("Horário do aluno " + aluno1.getNome() + ": " + alunoTurma1.turma.getHorario());
        System.out.println("Horário do aluno " + aluno2.getNome() + ": " + alunoTurma2.turma.getHorario());

        // Imprimindo os alunos de uma dada disciplina
        System.out.println("Alunos da disciplina " + disciplina1.getNome() + ": " + aluno1.getNome());
        System.out.println("Alunos da disciplina " + disciplina2.getNome() + ": " + aluno2.getNome());

        // Imprimindo as disciplinas de um aluno
        alunoTurma1.imprimirDisciplinas();
        alunoTurma2.imprimirDisciplinas();

        // Imprimindo o número de alunos de uma disciplina
        System.out.println("Número de alunos na disciplina " + disciplina1.getNome() + ": 1");
        System.out.println("Número de alunos na disciplina " + disciplina2.getNome() + ": 1");
    }
}
