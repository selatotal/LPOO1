
public class Main {

	public static void main(String[] args) {

		Tamagochi tamagochi = new Tamagochi("Bicho", 0, 0, 1);
		
		System.out.println("Humor: " + tamagochi.getHumor());

		tamagochi.setFome(10);
		System.out.println("Humor: " + tamagochi.getHumor());

		tamagochi.setSaude(20);
		System.out.println("Humor: " + tamagochi.getHumor());

		tamagochi.setFome(0);
		System.out.println("Humor: " + tamagochi.getHumor());

	}

}
