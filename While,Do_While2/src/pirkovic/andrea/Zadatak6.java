package pirkovic.andrea;

import java.util.Scanner; 
public class Zadatak6 { public static void main(String[] args) { 
	Scanner ulaz = new Scanner(System.in);
	
	int i, k, n,suma = 0; 
	
	System.out.println("Unesite vrednost za k:"); 
	k = ulaz.nextInt(); 
		System.out.println("Unesite vrednost za n:"); 
	n = ulaz.nextInt();
	i=k;
	while(i <= n) { 
		suma += i; 
		i++; } 
	// moze i ovako: while (i<=n) suma += i++;
	
	System.out.println("Od "+ k + " do " + n +" suma = "+ suma);
	ulaz.close(); } }
