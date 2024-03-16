package controleAcademico;


public class Aluno {
    private final int matricula;
    private final String nome;
    

    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }


    public int getMatricula() {
        return matricula;
    }

	
}
