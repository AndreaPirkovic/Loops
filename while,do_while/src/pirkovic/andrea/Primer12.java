package pirkovic.andrea;
import java.util.Scanner; 
public class Primer12 {
	public static void main(String[] args) { 
		Scanner ulaz = new Scanner(System.in); 
		System.out.println("Unesite vrednost za a:"); 
		int a = ulaz.nextInt(); 
		System.out.println("Unesite vrednost za b:"); 
		int b = ulaz.nextInt(); 
		//int i = a; 
		while (a <= b) 
		{ System.out.println(a); 
		a *= 4; 
		} 
		ulaz.close();
		} }
