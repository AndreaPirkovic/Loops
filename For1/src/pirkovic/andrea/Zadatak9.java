package pirkovic.andrea;
		import java.util.Scanner;
		public class Zadatak9 {

			public static void main(String[] args) {
				
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Unesite max broj");
				int maxBroj = sc.nextInt();
				System.out.println("Unesite min broj");
				int minBroj = sc.nextInt();
				for (int n= minBroj; n <= maxBroj; n++) 
				{ 
					if (n % 3 == 0) {
				System.out.print(" " + n );
				}		
					}
				
				}
	}


