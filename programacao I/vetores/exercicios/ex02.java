//2. Crie um programa que preencha automaticamente (use uma estrutura de repetição) um vetor numérico com 10 posições, conforme abaixo(vide pdf de ecercicios):
public class ex02 {

    public static void main(String[] args) {
        int[] lista = new int[11];
        for (int i = 1; i < 11; i++) {
            lista[i] = 5 * i;
            System.out.println(lista[i]);
        }
    }
}
