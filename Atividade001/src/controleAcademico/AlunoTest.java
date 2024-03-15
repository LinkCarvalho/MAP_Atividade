package controleAcademico;

//verifica se o horário do aluno é configurado corretamente
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AlunoTest {

  @Test
  public void testAdicionarDisciplina() {
      Aluno aluno = new Aluno(1234, "Pedro");
      Disciplina disciplina1 = new Disciplina("Matematica", "Segunda, 8h-10h");
      Disciplina disciplina2 = new Disciplina("Portugues", "Quarta, 10h-12h");

      aluno.adicionarDisciplina(disciplina1);
      aluno.adicionarDisciplina(disciplina2);

      assertEquals(2, aluno.getDisciplinas().size());
      assertEquals("Matematica", aluno.getDisciplinas().get(0).getNome());
      assertEquals("Segunda, 8h-10h", aluno.getDisciplinas().get(0).getHorario());
      assertEquals("Portugues", aluno.getDisciplinas().get(1).getNome());
      assertEquals("Quarta, 10h-12h", aluno.getDisciplinas().get(1).getHorario());
      }

}
