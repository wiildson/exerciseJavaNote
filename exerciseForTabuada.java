/*
	 Crie um algoritmo que leia um número digitado pelo usuário e
imprima a tabuada desse número.
	 */

package application;
import java.util.Locale;
import java.util.Scanner;
public class exerciseForTabuada {

	
	public static int num;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Digite um numero:");
		num = sc.nextInt();
		
		System.out.println("Tabuada do " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
	}

}
