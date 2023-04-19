package pirkovic.andrea;
import java.util.Scanner;
public class Zadatak6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Uneti broj n");
		int n = sc.nextInt();
		int faktorijel = 1; // kod mnozenja jedinica predstavlja neutral
		for (int i= 1; i <= n; i++) 
		{ 
			faktorijel = faktorijel *i;
					
		}
		System.out.println("Za uneti broj  " + n + " faktorijel je: " + faktorijel);
		
	}}
