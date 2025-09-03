//7. Faça um programa que leia 10 números inteiros e armazene em um vetor. Após, some estes valores e mostre o resultado.

import java.util.*;

public class ex07 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("digita o numero: \n");
            numeros[i] = tc.nextInt();
            soma = soma + numeros[i];
            System.out.println(soma);
        }

        System.out.println(soma);
    }
}
