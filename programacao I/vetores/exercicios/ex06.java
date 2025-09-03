//6. Desenvolva um programa que leia 10 números inteiros e guarde-os em um vetor. No final, mostre quais são os números pares que foram digitados e em que posições eles estão armazenados.

import java.util.*;

public class ex06 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("digita o numero: \n");
            numeros[i] = tc.nextInt();
            //System.out.println(numeros[i]);

        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("o numero: " + numeros[i] + " é par e está na posição: " + i);

            }
        }
    }
}
