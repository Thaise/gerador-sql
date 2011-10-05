import static org.junit.Assert.*;

import org.junit.Test;

public class GeradorSqlTest {

	@Test
	public void deveInserirDadosDentroDeColunasDaTEntidade(){	
		String entidade = "nome_tabela";
		String[] colunas = {"coluna1", "coluna2"};
		String[] valores = {"15", "30"};
		String print = geradorSql.inserir(entidade, colunas, valores);
		
		assertEquals("INSERT INTO nome_tabela (coluna1, coluna2) VALUES (15, 30);", print);		
	}
	
	@Test
	public void deveDeletarONomeDaEntidade(){	
		String print = geradorSql.deletar("Aluno");
		assertEquals("DELETE FROM Aluno", print);		
	}
	
	@Test
	public void deveAtualizarOsDadosDaColuna(){	
		String print = geradorSql.atualizar("Aluno", "coluna1", "30");
		assertEquals("UPDATE Aluno SET coluna1 = 30;", print);		
	}
	
	@Test
	public void deveSelecionarOsDadosDaColuna(){
		String entidade = "Aluno";
		String[] colunas = {"coluna1", "coluna2"};
		String print = geradorSql.selecionar(entidade, colunas);
		assertEquals("SELECT coluna1, coluna2 FROM Aluno;", print);		
	}

}
