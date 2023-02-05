	/*
	 Crie um algoritmo que solicite um número inteiro positivo ao usuário
e no final imprima os números ímpares do 1 até o numero que o
usuário digitou.
	 */

package application;
	import java.util.Locale;
	import java.util.Scanner;
public class exerciseForImpar {

	public static int num;
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Digite um numero inteiro e positivo:");
		num = sc.nextInt();
		
		 System.out.println("Os números ímpares de 1 a " + num + " são:");
	        for (int i = 1; i <= num; i += 2) {
	            System.out.println(i);
	        }
	}

}
