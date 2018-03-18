
public class Main {

	public static void main(String[] args) {

		Professor prof1 = new Professor(1, "Tales");
		Professor prof2 = new Professor(2, "Cadona");
		
		Curso curso1 = new Curso(1, "Objetos", prof1);
		Curso curso2 = new Curso(2, "Sistemas Distribuidos", prof1);
		Curso curso3 = new Curso(3, "Banco de Dados", prof2);
		
		System.out.println(curso1.exibeDados());
		System.out.println(curso2.exibeDados());
		System.out.println(curso3.exibeDados());
	}

}
