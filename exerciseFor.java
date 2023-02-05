	/*
	 Crie um Algoritmo For que leia duas notas de 3 alunos, e para cada
nota, calcule a média e exiba na tela a situação Aprovado ou
Reprovado considerando a média 6 e no final, calcule a média da
turma na tela.
	 */


package application;
import java.util.Locale;
import java.util.Scanner;
public class exerciseFor {
	

	public static int alunos = 3;
	public static double nota1, nota2, media, mediaTurma = 0;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
        
        for (int i = 1; i <= alunos; i++) {
            System.out.println("Aluno " + i);
            System.out.print("Nota 1: ");
            nota1 = sc.nextDouble();
            System.out.print("Nota 2: ");
            nota2 = sc.nextDouble();
            media = (nota1 + nota2) / 2;
            mediaTurma += media;
            System.out.println("Média: " + media);
            if (media >= 6) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
            System.out.println("");
        }
        mediaTurma = mediaTurma / alunos;
        System.out.println("Média da turma: " + mediaTurma);
    }



	}

