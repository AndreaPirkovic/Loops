package pirkovic.andrea;
import java.util.Scanner;
public class Zadatak13 {

	public static void main(String[] args) {
		int aritSred = 0;
		int suma =0;
		int parni=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Koliko brojeva zelite da unesete?");
		int brojSabiraka = sc.nextInt();
		
		for (int i= 1; i <= brojSabiraka; i++) 
		
		{ 
			
			System.out.println("Unesite " + i + " broj: ");
			int sabirak = sc.nextInt();
			if ( sabirak % 2==0) {
				parni++;
			suma = suma + sabirak;
			aritSred = suma / parni;}
			
		}
		System.out.println("Aritmeticka sredina brojeva iznosi: " + aritSred);
		
	}}
