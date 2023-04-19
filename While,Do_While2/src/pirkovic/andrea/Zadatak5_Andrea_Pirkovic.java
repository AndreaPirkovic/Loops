package pirkovic.andrea;
import java.util.Scanner;
public class Zadatak5_Andrea_Pirkovic {

	public static void main(String[] args) {
			
				Scanner sc = new Scanner(System.in);
				int suma = 0,broj = 0, aritSred = 0,i=0;
				
				while (broj !=0) {
					System.out.println("Unestite broj:");
					int broj1 = sc.nextInt();
					i++;
					suma= suma + broj1;
					aritSred= suma/i;
				}
		System.out.println(" aritmeticka sredina unetih brojeva je" + aritSred);
			}
}