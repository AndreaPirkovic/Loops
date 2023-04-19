package pirkovic.andrea;
import java.util.Scanner; 
public class Zadatak10a {
	
		public static void main(String[] args) { Scanner ulaz = new Scanner(System.in); 
		int n, i = 1; 
		double s=0;
		System.out.print("Unesite vrednost za n: "); 	
		n = ulaz.nextInt();
				while (i <= n) { 
				s += (double)1/ (2 * i); 
				 i++; } 	
			//drugi nacina sa FOR petljom
		//for (int i1 = 1; i1<=n; i1++)
			// s+= (double)1/ (2 * i1); 
		System.out.println("Suma brojeva do n= " + n + " je: " + s); 	
		ulaz.close(); } 
}
