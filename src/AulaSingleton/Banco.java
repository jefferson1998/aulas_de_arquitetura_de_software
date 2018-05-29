package AulaSingleton;

public class Banco {
	// O private static Banco faz com que somente a Classe Banco possa dar um new Banco
	// assim, evita-se de que em qualquer lugar se pudesse dar um new Banco.
	private static Banco banco;
	
	private	 Banco() {
		
	}
	// metodo static, porque o metódo é da classe, ou seja, eu não preciso criar um Banco para pegar
	// o metodo. É assim que eu delimito, neste caso, que só vai haver um Banco no projeto.
	public static Banco getInstance() {
		if(banco == null) {
			banco = new Banco();
		}
		return banco;
	}
	// o void é semistatic, ou seja, eu preciso criar o Objeto Banco para poder usar o método.
	public void fazNada() {
		
	}

}
