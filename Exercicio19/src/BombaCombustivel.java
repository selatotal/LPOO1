
public class BombaCombustivel {

	private String tipoDeCombustivel;
	private double valorPorLitro;
	private double quantidadeDeCombustivel;
	
	public BombaCombustivel() {}
	
	public BombaCombustivel(String tipoDeCombustivel, double valorPorLitro, double quantidadeDeCombustivel) {
		this.tipoDeCombustivel = tipoDeCombustivel;
		this.valorPorLitro = valorPorLitro;
		this.quantidadeDeCombustivel = quantidadeDeCombustivel;
	}

	public double abastecerPorValor(double valor) {
		if (valor < 0) {
			System.out.println("Valor negativo");
			return 0;
		}
		
		double litros = valor / valorPorLitro;
		if (litros > this.quantidadeDeCombustivel) {
			System.out.println("Nao tenho combustivel suficiente");
			return 0;
		}
		
		this.quantidadeDeCombustivel-=litros;
		return litros;
	}
	
	public double abastecerPorLitro(double litros) {
		if (litros < 0) {
			System.out.println("Valor negativo");
			return 0;
		}
		if (litros > this.quantidadeDeCombustivel) {
			System.out.println("Nao tenho combustivel suficiente");
			return 0;
		}
		
		double valor = litros * this.valorPorLitro;
		this.quantidadeDeCombustivel-=litros;
		return valor;
	}

	public String getTipoDeCombustivel() {
		return tipoDeCombustivel;
	}

	public void setTipoDeCombustivel(String tipoDeCombustivel) {
		this.tipoDeCombustivel = tipoDeCombustivel;
	}

	public double getValorPorLitro() {
		return valorPorLitro;
	}

	public void setValorPorLitro(double valorPorLitro) {
		if (valorPorLitro >= 0) {
			this.valorPorLitro = valorPorLitro;
		}
	}

	public double getQuantidadeDeCombustivel() {
		return quantidadeDeCombustivel;
	}

	public void setQuantidadeDeCombustivel(double quantidadeDeCombustivel) {
		if (quantidadeDeCombustivel >= 0) {
			this.quantidadeDeCombustivel = quantidadeDeCombustivel;
		}
	}
	
	
}
