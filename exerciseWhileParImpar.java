	/*
	 Crie um algoritmo usando while que solicite ao usuário a entrada de
N números inteiros e positivos, no final exiba o total de números
pares e o total de números impares.

OBS: Encerre o programa quando o usuário digitar um número
negativo.
	 */

package application;

import java.util.Locale;
import java.util.Scanner;

public class exerciseWhileParImpar {


	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
        int numero, pares = 0, impares = 0;
        
        System.out.print("Digite um número inteiro positivo (somente positivo): ");
        numero = sc.nextInt();
        while (numero >= 0) {
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            System.out.print("Digite outro número inteiro positivo (somente positivo): ");
            numero = sc.nextInt();
        }
        System.out.println("Números pares: " + pares);
        System.out.println("Números impares: " + impares);
    }


	}


