package pirkovic.andrea;
import java.util.Scanner; 
public class Zadatak10 { 
	public static void main(String[] args) { Scanner input = new Scanner(System.in); 
	double a, y; 
	System.out.println("Unesite vrednost za n: "); 
	int n = input.nextInt(); 
	if (n>0) {
	
	for(int i = 1; i <= n; i++) 
	{ System.out.println("Unesite vrednost broja a: ");
	a = input.nextDouble(); 
	
	if (a > 0) y = (Math.sqrt(a)); 

		else y = (a * a) ; 
		System.out.println("Za unete vrednosti a, vrednost y je = " +  y);  
	}
	
	input.close(); } }}
