package Apostila;

import java.util.Scanner;

public class Ex07 {
    //Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
    //dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int anos, meses, dias;
        System.out.println("Digite a sua idade: ");
        anos = sc.nextInt();

        System.out.println("Digite os meses: ");
        meses = sc.nextInt();

        System.out.println("Digite os dias: ");
        dias = sc.nextInt();

        int totalDias = (anos * 365) + (meses * 30) + dias;
        System.out.println("Idade em dias: " + totalDias);

        sc.close();
    }
}
