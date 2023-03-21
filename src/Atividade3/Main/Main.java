package Atividade3.Main;

import java.util.Scanner;

import Atividade3.Classe.Saldo;

//3. Informar um saldo e imprimir o saldo com reajuste de 1%.

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor de saldo: ");

        Saldo valor1 = new Saldo(scan.nextDouble());

        System.out.println("Saldo: " + valor1.imprimeSaldo(valor1.getSaldo()));

        System.out.println("Saldo Reajustado: " + valor1.imprimeSaldo(valor1.getSaldoReajustado()));
    }

}
