package pirkovic.andrea;

import java.util.Scanner;
public class Zadatak3 { public static void main(String[] args) { 
	
	Scanner ulaz = new Scanner(System.in); 
	
	int n; 
	
	System.out.print("Unesite vrednost za n: "); 	n = ulaz.nextInt(); 
	int i = 1; 
	int s=0;
	while ( i <= n) { 
		if (i % 2 == 0) 
			//System.out.println(i);
		s+=i;// s= s+i operator +=; -=;*=;/=;
		i++; } 
	System.out.println(s);
	ulaz.close(); } }
