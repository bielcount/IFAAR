//4. Crie um programa que preencha automaticamente (use uma estrutura de repetição) um vetor numérico com 10 posições, conforme abaixo (vide pdf de exercicios):
public class ex04 {

    public static void main(String[] args) {
        double[] lista = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 2 == 0) {
                lista[i] = 5;
            } else {
                lista[i] = 3;
            }

            System.out.println(lista[i]);
        }
    }
}
