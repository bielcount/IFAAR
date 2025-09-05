//9. Crie um programa onde um usuário deverá informar os dados de altura e sexo de 10 pessoas. Imprima na tela quantas pessoas são do sexo masculino e quantas pessoas são do sexo feminino. Mostre também qual é a maior altura e se essa altura é de um homem ou uma mulher.	

import java.util.*;

public class teste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sexoPessoas = new int[10]; // 1 e 2
        int[] alturasPessoas = new int[10];
        int posSexMaiorAlt = 0;
        int contMasc = 0;
        int contFem = 0;

        for (int i = 0; i < sexoPessoas.length; i++) {
            //entrada de dados
            //sexo 1 ou 2
            do {
                System.out.println("digite o sexo da pessoa: " + (i + 1) + "\n 1 - masc \n 2 - fem \n");
                sexoPessoas[i] = scanner.nextInt();
            } while (sexoPessoas[i] == 1 || sexoPessoas[i] == 2 && i < sexoPessoas.length);

            //altura em cm
            do {
                System.out.println("digite a altura da pessoa: " + (i + 1) + "\n");
                alturasPessoas[i] = scanner.nextInt();
            } while (i < sexoPessoas.length); //criar a validação!

            //contadores
            if (sexoPessoas[i] == 1) {
                contMasc = contMasc + 1;
                System.out.println("contador masc +1\n");
            } else {
                contFem = contFem + 1;
                System.out.println("contador fem +1\n");
            }

        }

        //compara as alturas, define a maior altura e o sexo da maior altura
        int maiorAltura = alturasPessoas[0];
        for (int i = 1; i < alturasPessoas.length; i++) {
            if (maiorAltura < alturasPessoas[i]) {
                maiorAltura = alturasPessoas[i];
                posSexMaiorAlt = i;
            }
        }

        //imprime os resultados
        if (sexoPessoas[posSexMaiorAlt] == 1) {
            System.out.println("maior altura: " + maiorAltura + "\n sexo: masc");
            System.out.println("masc: " + contMasc + "\n fem: " + contFem);
        } else {
            System.out.println("maior altura: " + maiorAltura + "\n sexo: fem");
            System.out.println("masc: " + contMasc + "\n fem: " + contFem);
        }
    }
}
