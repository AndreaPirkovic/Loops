package pirkovic.andrea;
import java.util.Scanner;
public class Zadatak14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Koliko brojeva zelite da unesete?");
		int x = sc.nextInt();
	int pozitivan=0, nula= 0, negativan =0;
			
		for (int i= 1; i <= x; i++) 
		
		{ 
			
			System.out.println("Unesite " + i + "broj" );
			int y = sc.nextInt();
			if ( y > 0) {
				pozitivan++;}
			if (y == 0) {
				nula++;	}
			if (y < 0) {
				negativan++; }
			
		}
	
	System.out.println(pozitivan + " " + nula + " " + negativan);
		
	}}

