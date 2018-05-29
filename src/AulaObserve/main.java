package AulaObserve;

public class main {

	public static void main(String[] args) {
		Revista revista = new Revista();
		
		Assinante assinante = new Assinante("José");
		Assinante assinante1 = new Assinante("Carine");
		Assinante assinante2 = new Assinante("Rodrigo");
		
		revista.addObserver(assinante);
		revista.addObserver(assinante1);
		revista.addObserver(assinante2);
		revista.setEdicao(1);
		
		
	}

}
