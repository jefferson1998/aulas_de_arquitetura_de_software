package AulaFactoryMethod;

public class FactoryMethod {
	
	public Conta construirConta(int limite) {
		
		Conta conta = null;
		// dependendo do valor da Interface(que determiona o limite de crédito e assim o tipo da conta.
		if(Conta.limiteDeCreditoContaCorrente <=  limite && limite >= 0) {
			conta = new ContaCorrente();
		} else if (Conta.limiteDeCreditoContaOuro <= limite) {
			conta = new ContaOuro();
		} else {
			conta = new ContaDiamante();
		}
		
		return conta;
		
	}
	
}
