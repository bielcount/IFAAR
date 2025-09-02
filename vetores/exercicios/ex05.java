// 5. Faça um programa que leia 7 nomes de pessoas e guarde-os em um vetor. No final, mostre uma listagem com todos os nomes informados, na ordem inversa daquela em que eles foram informados.
public class ex05 {

    public static void main(String[] args) {
        String[] lista = {"fulano", "ciclano", "beltrano", "gabriel", "professor", "caraAleatório", "linus torvalds"}; //entrada usuario/servidor
        String[] outraLista = new String[lista.length];
        for (int i = 0; i < lista.length; i++) {
            outraLista[i] = lista[(lista.length-1)-i];
            System.out.println(outraLista[i]);
        }
    }
}
 