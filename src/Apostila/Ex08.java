package Apostila;

import java.util.Scanner;

public class Ex08 {
    //Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos
    //brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total
    //de eleitores.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int totalEleitores, votosBrancos, votosNulos, votosValidos;

        System.out.println("Digite o total de eleitores: ");
        totalEleitores = sc.nextInt();

        System.out.println("Digite o numero de votos brancos: ");
        votosBrancos = sc.nextInt();

        System.out.println("Digite o numero de votos nulos: ");
        votosNulos = sc.nextInt();

        System.out.println("Digite o numero de votos validos: ");
        votosValidos = sc.nextInt();

        double percBrancos = (votosBrancos * 100.0);
        double percNulos = (votosNulos * 100.0);
        double percValidos = (votosValidos * 100.0);
        sc.close();
    }

}
