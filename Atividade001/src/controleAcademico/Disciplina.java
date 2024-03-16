package controleAcademico;


public class Disciplina {
    private final String nome;

    private final int codigo;

    private final int carga_horaria;


    public Disciplina(String nome, int codigo, int carga_horaria) {
        this.nome = nome;
        this.codigo = codigo;
        this.carga_horaria = carga_horaria;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCarga_horaria() {
        return carga_horaria;
    }







}
