
		package pirkovic.andrea;
		import java.util.Scanner;
		public class Zadatak7 {

			public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Uneti broj n");
				int n = sc.nextInt();
				System.out.println("Uneti broj m");
				int m = sc.nextInt();
				int suma = 0;
				
				for (int i= 1; i <= m; i++) 
				{ 
					suma = suma + n*(n + i*m);
				}		
				System.out.println("Za uneti broj  " + n + " i  " + m + " vrednost S je: " + suma );
				
	
	}

}
