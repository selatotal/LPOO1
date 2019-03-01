package pessoa;

public class Main {

	public static void main(String[] args) {

		Pessoa p = new Pessoa("Tales", 'M');
		Aluno al = new Aluno("Jota", 'C', 123);
	
		Pessoa c = new Aluno("Jota", 'F', 12313);
		c.imprimir();
	}

}
