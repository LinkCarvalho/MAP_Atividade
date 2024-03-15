package controleAcademico;

//verifica se um aluno pode ser adicionado corretamente a uma disciplina e se o número de alunos na disciplina é atualizado corretamente
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class DisciplinaTest {

 @Test
 public void testAddAluno() {
     Professor professor = new Professor("João");
     Disciplina disciplina = new Disciplina("Matemática", "Segunda, 8h-10h");
     Aluno aluno1 = new Aluno(1234, "Pedro");
     Aluno aluno2 = new Aluno(5678, "Maria");

     disciplina.adcionarAluno(aluno1);
     disciplina.adcionarAluno(aluno2);

     assertEquals(2, disciplina.getTurma().size());
     assertEquals(1234, disciplina.getTurma().get(0).getMatricula());
     assertEquals("Pedro", disciplina.getTurma().get(0).getNome());
     assertEquals(5678, disciplina.getTurma().get(1).getMatricula());
     assertEquals("Maria", disciplina.getTurma().get(1).getNome());
 }
}
