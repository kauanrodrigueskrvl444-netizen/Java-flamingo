package Apostila;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args){
        double altura, base, area;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a Base do Retângulo: ");
        base = sc.nextDouble();

        System.out.println("Digite a Altura do retângulo: ");
        altura = sc.nextDouble();

        area = base * altura;

        System.out.printf("A Área do retângulo = %.2f", area);
        sc.close();
    }

}
