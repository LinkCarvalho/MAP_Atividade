package controleAcademico;


public class Main {
    public static void main(String[] args) {
  
        Aluno aluno0 = new Aluno(12345, "Filipe");
        Aluno aluno1 = new Aluno(12346, "Leonardo");
        Professor professor0 = new Professor("Edson");
        Disciplina disciplina0 = new Disciplina("Matematica", "segunda feira, 8:00-10:00");
        Disciplina disciplina1 = new Disciplina("Portugues", "segunda feira, 10:00-12:00");

        professor0.adicionarDisciplina(disciplina0);
        professor0.adicionarDisciplina(disciplina1);

        disciplina0.adcionarAluno(aluno0);
        disciplina0.adcionarAluno(aluno1);
        disciplina1.adcionarAluno(aluno0);

        aluno0.adicionarDisciplina(disciplina0);
        aluno0.adicionarDisciplina(disciplina1);
        aluno1.adicionarDisciplina(disciplina0);

        // imprime a quantidade de alunos
        System.out.println("A disciplina " + disciplina0.getNome() +" tem " + disciplina0.quantAlunos() + " alunos");

        for (Aluno aluno : disciplina0.turma) {
        	// imprime nome do aluno e matricula
            System.out.println("Matricula: " + aluno.getMatricula() + " " + "Nome: "+ aluno.getNome());
        }



       /* System.out.println("\nHorario do " + aluno1.getNome() + ":");
        for (Disciplina disc : aluno1.getDisciplinas()) {
            System.out.println(disc.getNome() + " " + disc.getHorario() );
        }*/

        imprimirHorarios(aluno0);
        Disciplinas(professor0);

        
    }
    public static void imprimirHorarios(Aluno aluno) {
        System.out.println("\nHorários das disciplinas do aluno " + aluno.getNome() + ":");
        for (Disciplina disciplina : aluno.getDisciplinas()) {
            System.out.println(disciplina.getNome() + ": " + disciplina.getHorario());
        }
    }
    
    public static void Disciplinas(Professor professor) {
        System.out.println("\nDisciplinas ministradas pelo professor " + professor.getNome() + ":");
        for (Disciplina disciplina : professor.getDisciplinasMinistradas()) {
            System.out.println(disciplina.getNome());
        }
    }
    
}