// 5. Faça um programa que leia 7 nomes de pessoas e guarde-os em um vetor. No final, mostre uma listagem com todos os nomes informados, na ordem inversa daquela em que eles foram informados.

import java.util.*;

public class ex05alternativo {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        String[] nomes = new String[7];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("digita o nome: \n");
            String nome = tc.nextLine();

            nomes[i] = nome;
        }

        for (int i = nomes.length; i > 0; i--) {
            System.out.println(nomes[i - 1]);
        }
    }
}
