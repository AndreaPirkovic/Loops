package pirkovic.andrea;

public class Zadatak2 {

	public static void main(String[] args) {
		
		// %8s i %8d znaci da ce string biti ispisan u polju koje zauzima 8 karaktera sa desnim poravnanjem
		System.out.printf("%8s%8s%8s \n", "Broj", "Kvadrat", "Kub");
		for (int broj = 1; broj <= 5; broj++) 
		
		{ 
			System.out.printf("%8d%8d%8d \n", broj, broj*broj, broj*broj*broj); 
			}

	}

}
