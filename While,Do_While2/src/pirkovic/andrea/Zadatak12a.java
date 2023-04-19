package pirkovic.andrea;


	import java.util.Scanner; 
	public class Zadatak12a {
		
			public static void main(String[] args) { Scanner ulaz = new Scanner(System.in); 
			int n, k; 
			int i = 0; 
			double s=0;
			System.out.print("Unesite vrednost za n: "); 	
			n = ulaz.nextInt();
			System.out.print("Unesite vrednost za k: "); 	
			k = ulaz.nextInt();
					do { 
					s += (double)2/ (k + i); 
					 i++; } 	
					while (i <= n);
			System.out.println("Suma brojeva za unetu vrednost n= " + n + " je: " + s); 	
			ulaz.close(); } 
}
