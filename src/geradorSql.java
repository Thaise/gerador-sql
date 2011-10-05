import java.lang.reflect.Array;

public class  geradorSql {

	public static String inserir(String entidade, String[]colunas, String[]valores) {		
	
		String coluna1 = colunas[0];
		String demaisColunas = "";
		
		String valor1 = valores[0];
		String demaisValores = "";
		
		for(int i=1; i < colunas.length; i++){
			demaisColunas = demaisColunas+", "+colunas[i];
		}
		
		for(int i=1; i < valores.length; i++){
			demaisValores = demaisValores+", "+valores[i];
		}
		
		return "INSERT INTO "+entidade+" ("+coluna1+demaisColunas+")"+" VALUES"+" ("+valor1+demaisValores+")"+";";
	}

	public static String deletar(String entidade) {
	
		return "DELETE FROM "+entidade;
	}

	public static String atualizar(String entidade, String coluna, String valor) {
		
		return "UPDATE "+entidade+" SET "+coluna+" = "+valor+";";
	}

	public static String selecionar(String entidade, String[] colunas) {
		
		String coluna1 = colunas[0];
		String demaisColunas = "";
		
		for(int i=1; i < colunas.length; i++){
			demaisColunas = demaisColunas+", "+colunas[i];
		}
		
		return "SELECT "+coluna1+demaisColunas+" FROM "+entidade+";";
	}

}
