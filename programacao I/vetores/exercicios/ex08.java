//8. Crie um programa que leia as notas de uma turma de 10 alunos. Guarde-as em um vetor, calcule a média da turma e conte quantos alunos obtiveram nota acima desta média calculada. Escrever a média da turma e o resultado da contagem. 

import java.util.*;

public class ex08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int contador = 0;
        int soma = 0;
        //int media = soma / numeros.length;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("digita a nota do aluno: " + i);
            numeros[i] = scanner.nextInt();
            soma = soma + numeros[i];

        }

        int media = soma / numeros.length;
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > media) {
                contador++;
            }
        }

        System.out.println("a media da turma é: " + media + " e a quantidade de alunos acima da media é: " + contador);

    }
}
