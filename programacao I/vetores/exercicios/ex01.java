//1. Faça um programa que preencha automaticamente (use uma estrutura de repetição) um vetor numérico com 8 posições, conforme abaixo (vide pdf de exercicios):

public class ex01 {

    public static void main(String[] args) {
        int[] lista = new int[7];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = 999;
            System.out.println(lista[i]);
        }
    }
}
