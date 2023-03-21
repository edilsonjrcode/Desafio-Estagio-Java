package Atividade6.Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int number = scan.nextInt();

        System.out.println("Número = " + number + " \nAntecessor = " + (number - 1) + " \nSucessor = " + (number + 1));
    }
}