
public class Carro {

	public String cor;
	public double capacidadeMotor;
	public double velocidade = 0d;
	
	public Carro(String cor, double capacidadeMotor){
		this.cor = cor;
		this.capacidadeMotor = capacidadeMotor;
	}
	
	public void aumentarVelocidade(double velocidade){
		if (velocidade < 0){
			System.out.println("Velocidade invalida");
			return;
		}
		
		double limiteVelocidade = 110 * this.capacidadeMotor;
		if (this.velocidade + velocidade > limiteVelocidade){
			System.out.println("Velocidade acima da capacidade do motor");
			return;
		}
		
		this.velocidade += velocidade;
	}

	public void reduzirVelocidade(double velocidade){
		if ((velocidade < 0) || (velocidade > this.velocidade)){
			System.out.println("Velocidade invalida");
			return;
		}
		
		if (velocidade >= 60){
			System.out.println("AIR-BAG disparado");
			this.velocidade = 0;
			return;
		}
		
		this.velocidade -= velocidade;
	}

	public String getCor(){
		return this.cor;
	}
	
	public void setCor(String cor){
		this.cor = cor;
	}
	
	public double getVelocidade(){
		return this.velocidade;
	}
}
