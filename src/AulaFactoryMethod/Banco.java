package AulaFactoryMethod;

public class Banco {
	
	private static Banco banco;
	
	private Banco () {
		
	}
	
	public static Banco getInstance() {
		if (banco == null) {
			banco = new Banco();
		}
		return banco;
	}
	
	public void fazNada() {
		
	}
}
