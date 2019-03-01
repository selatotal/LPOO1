
public class Main {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Tales", 12);

		Endereco endRes = new Endereco("Itacolomi", 3600, "Predio 5", "Sao Vicente", "Gravatai", "12345-678");
		
		Endereco endCom = new Endereco("Farroupilha", 6000, "Predio 14", "Sao Luis", "Canoas", "12345-678");

		aluno1.setEnderecoResidencial(endRes);
		aluno1.setEnderecoComercial(endCom);
		
		System.out.println("Nome: " + aluno1.getNome());
		System.out.println("Numero de Matricula: " + aluno1.getNumeroMatricula());

		System.out.println("Endereco Residencial: ");
		aluno1.getEnderecoResidencial().mostraDados();
		
		System.out.println("Endereco Comercial: ");
		aluno1.getEnderecoComercial().mostraDados();
		
	}

}
