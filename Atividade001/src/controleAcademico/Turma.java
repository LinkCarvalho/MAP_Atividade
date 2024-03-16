package controleAcademico;

public class Turma{

    private String Sala;

    private String horario;

    private Disciplina disciplina;

    public Turma(String Sala, String horario, Disciplina disciplina) {
        this.Sala = Sala;
        this.horario = horario;
        this.disciplina = disciplina;
    }

    public String getSala() {
        return Sala;
    }

    public void setSala(String sala) {
        Sala = sala;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }


    


    
}
