package AulaObserve;
import java.util.Observable;
import java.util.Observer;

public class Assinante implements Observer {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Assinante(String nome) {
		this.nome = nome;
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		System.out.println("Sr(a)" + this.nome + " a edição nº " + arg1 + " fora lançada");
	}
	
	
}
