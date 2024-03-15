package controleAcademico;

//verifica se o horário do professor é configurado corretamente
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ProfessorTest {

  @Test
  public void testSetHorario() {
      Professor professor = new Professor("João");
      Disciplina disciplina1 = new Disciplina("Matemática", "Segunda, 8h-10h");
      Disciplina disciplina2 = new Disciplina("Português", "Quarta, 10h-12h");

      professor.adicionarDisciplina(disciplina1);
      professor.adicionarDisciplina(disciplina2);

      assertEquals(2, professor.getDisciplinasMinistradas().size());
      assertEquals("Matemática", professor.getDisciplinasMinistradas().get(0).getNome());
      assertEquals("Segunda, 8h-10h", professor.getDisciplinasMinistradas().get(0).getHorario());
      assertEquals("Português", professor.getDisciplinasMinistradas().get(1).getNome());
      assertEquals("Quarta, 10h-12h", professor.getDisciplinasMinistradas().get(1).getHorario());
  }
}

