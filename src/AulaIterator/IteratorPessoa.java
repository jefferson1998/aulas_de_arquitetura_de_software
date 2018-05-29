package AulaIterator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class IteratorPessoa implements Iterator<Pessoa>,  Comparator<Pessoa> {

	List<Pessoa> list = new ArrayList<>();
	private int contador;
	
	public IteratorPessoa(List<Pessoa> list) {
		list.sort(new IteratorPessoa()); 
		this.list = list;
		this.contador = 0;
	}
	
	public  IteratorPessoa() {
		
	}

	@Override
	public boolean hasNext() {
		return this.contador < list.size();
	}

	@Override
	public Pessoa next() {
		return list.get(this.contador++);
	}

	@Override
	public int compare(Pessoa pessoa, Pessoa pessoa1) {
		
		return pessoa.getIdade() - pessoa1.getIdade();
	}

	
	
}
