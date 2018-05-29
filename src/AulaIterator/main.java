package AulaIterator;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		List<Pessoa> list = new ArrayList<>();
		
		list.add(new Pessoa("Vilmar", 55));
		list.add(new Pessoa("Rodrigo", 22));
		list.add(new Pessoa("Jefferson", 26));

		  
		IteratorPessoa iteratorPessoa = new IteratorPessoa(list);
		
		while(iteratorPessoa.hasNext()) {
			System.out.println(iteratorPessoa.next().getIdade());
		}
		
	}

}
