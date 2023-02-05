/*
	 Crie um algoritmo Do while que solicite ao usuário a entrada de N
números e só encerre o programa quando o usuário digitar um
número entre 1 e 5.
	 */

package application;

	import java.util.Locale;
	import java.util.Scanner;

public class exerciseWhile {
	
	public static int Nm;
		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
		
			
			do{
				System.out.println("Digite um número:");
				Nm = sc.nextInt();
			}while(Nm==0 || Nm>5);
	
			System.out.println("Programa encerrado!");
			
		}
		

}
