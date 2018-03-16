
public class Main {

	public static void main(String[] args){
		
		Data data1 = new Data();
		Data data2 = new Data();
		Data data3 = new Data();
		
		data1.setDia(15);
		data1.setMes(3);
		data1.setAno(2018);
		
		data2.setDia(6);
		data2.setMes(9);
		data2.setAno(1977);
		
		data3.setDia(16);
		data3.setMes(6);
		data3.setAno(2003);
		
		System.out.println(data1.mostraData());
		System.out.println(data2.mostraData());
		System.out.println(data3.mostraData());
		
	}
	
}
