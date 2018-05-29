package AulaSingleton;

public class Banco {
	// O private static Banco faz com que somente a Classe Banco possa dar um new Banco
	// assim, evita-se de que em qualquer lugar se pudesse dar um new Banco.
	private static Banco banco;
	
	private	 Banco() {
		
	}
	// metodo static, porque o met�do � da classe, ou seja, eu n�o preciso criar um Banco para pegar
	// o metodo. � assim que eu delimito, neste caso, que s� vai haver um Banco no projeto.
	public static Banco getInstance() {
		if(banco == null) {
			banco = new Banco();
		}
		return banco;
	}
	// o void � semistatic, ou seja, eu preciso criar o Objeto Banco para poder usar o m�todo.
	public void fazNada() {
		
	}

}
