//3. Crie um programa que preencha automaticamente (use uma estrutura de repetição) um vetor numérico com 10 posições, conforme abaixo (vide pdf de exercicios):
public class ex03 {

    public static void main(String[] args) {
        int[] lista = new int[10];
        for (int i = 9; i >= 0; i--) {
            lista[i] = i;
            System.out.println(lista[i]);
        }
    }
}
