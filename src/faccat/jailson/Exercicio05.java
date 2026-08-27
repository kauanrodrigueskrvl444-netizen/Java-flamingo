package faccat.jailson;

import java.util.Scanner;

public class Exercicio05 {
    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = leitor.nextInt();

        int antecessor = valor - 1;

        System.out.println("O antecessor de " + valor + "é" + antecessor);

    }
}



