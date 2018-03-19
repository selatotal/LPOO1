
public class Main {

	public static void main(String[] args) {

		Casa casa = new Casa();
		casa.pinta("Azul");

		System.out.println("Casa criada");
		System.out.println("Portas Instaladas: " + casa.totalDePortasInstaladas());
		System.out.println("Portas Abertas: " + casa.quantasPortasEstaoAbertas());
		
		Porta p1 = new Porta();
		casa.setPorta1(p1);
		System.out.println("Adicionada porta 1");
		System.out.println("Portas Instaladas: " + casa.totalDePortasInstaladas());
		System.out.println("Portas Abertas: " + casa.quantasPortasEstaoAbertas());
		
		p1.abre();
		System.out.println("Porta 1 aberta");
		System.out.println("Portas Instaladas: " + casa.totalDePortasInstaladas());
		System.out.println("Portas Abertas: " + casa.quantasPortasEstaoAbertas());

		casa.setPorta2(p1);
		System.out.println("Tentando adicionar porta 1 na porta 2");
		System.out.println("Portas Instaladas: " + casa.totalDePortasInstaladas());
		System.out.println("Portas Abertas: " + casa.quantasPortasEstaoAbertas());
		
		Porta p2 = new Porta();
		casa.setPorta2(p2);
		System.out.println("Adicionada porta 2");
		System.out.println("Portas Instaladas: " + casa.totalDePortasInstaladas());
		System.out.println("Portas Abertas: " + casa.quantasPortasEstaoAbertas());
		
		p2.abre();
		System.out.println("Porta 2 aberta");
		System.out.println("Portas Instaladas: " + casa.totalDePortasInstaladas());
		System.out.println("Portas Abertas: " + casa.quantasPortasEstaoAbertas());

		Porta p3 = new Porta();
		casa.setPorta3(p3);
		System.out.println("Adicionada porta 3");
		System.out.println("Portas Instaladas: " + casa.totalDePortasInstaladas());
		System.out.println("Portas Abertas: " + casa.quantasPortasEstaoAbertas());
		
		p3.abre();
		System.out.println("Porta 3 aberta");
		System.out.println("Portas Instaladas: " + casa.totalDePortasInstaladas());
		System.out.println("Portas Abertas: " + casa.quantasPortasEstaoAbertas());

		casa.setPorta1(null);
		System.out.println("Retirada porta 1");
		System.out.println("Portas Instaladas: " + casa.totalDePortasInstaladas());
		System.out.println("Portas Abertas: " + casa.quantasPortasEstaoAbertas());

		p1.fecha();
		System.out.println("Fechada porta 1 apos retirar da casa");
		System.out.println("Portas Instaladas: " + casa.totalDePortasInstaladas());
		System.out.println("Portas Abertas: " + casa.quantasPortasEstaoAbertas());

		p2.fecha();
		System.out.println("Fechada porta 2 apos retirar da casa");
		System.out.println("Portas Instaladas: " + casa.totalDePortasInstaladas());
		System.out.println("Portas Abertas: " + casa.quantasPortasEstaoAbertas());

	}

}
