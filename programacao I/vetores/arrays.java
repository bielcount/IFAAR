//vamos estudar arrays e seus metodos, casos de uso e como utilizar 

public class arrays {

    public static void main(String[] args) {
        int[] numeros; //declaração de array, ele ainda não foi criado
        numeros = new int[2]; //criação do array vazio, porem com numero de elementos pré definidos e de tamanho estatico imutavel na criação.

        String[] nomes = new String[5]; //declaração e criação simultanea

        int[] num = {1, 2, 3, 4, 5}; //dessa forma ele declara, cria e atribui valores ao mesmo tempo, e infere o tamanho de array pela quantidade de elementos passados na declaração.

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
