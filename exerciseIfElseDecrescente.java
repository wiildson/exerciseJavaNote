package application;

	import java.util.Locale;
	import java.util.Scanner;

public class exerciseIfElseDecrescente {

	/*
	 Crie um algoritmo que leia dois números e imprima-os em ordem decrescente.
	 */
		
	public static int num1;
	public static int num2;
		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite o 1º Numero:");
			num1 = sc.nextInt();
			System.out.println("Digite o 2º Numero:");
			num2 = sc.nextInt();
			
			if(num1>num2) {
				System.out.println(num1);
				System.out.println(num2);
			}
			else {
				System.out.println(num2);
				System.out.println(num1);
			}

	}
}
