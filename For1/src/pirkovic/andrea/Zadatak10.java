package pirkovic.andrea;

import java.util.Scanner;
public class Zadatak10 {

	public static void main(String[] args) {
		
		
		int broj, s, d, j;
		
		for (int i= 0; i <= 999; i++) 
		{ 
				broj = i;
				s = broj/100;

				d = (broj/10)%10;

				j = (broj % 10);
			if ( broj == j*j*j + d*d*d + s*s*s) 
			{
		System.out.println("Armstrongov broj" + broj);
	}

}}}