package AulaObserve;
import java.util.Observable;

public class Revista  extends Observable {
	
	private int edicao;

	public Revista() {
		this.edicao = edicao;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
		this.setChanged();
		this.notifyObservers(edicao);
	}
	
	
	
}
