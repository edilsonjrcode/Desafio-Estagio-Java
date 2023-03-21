package Atividade6.Main;

import java.util.Scanner;

import Atividade6.Classe.Model;

public class Modelo1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        Model numero1 = new Model(scan.nextInt());

        // System.out.println("Digite um número: ");
        // numero1.setNumero(scan.nextInt());
        // numero1.addAntecessor(numero1.getNumero());
        // numero1.addSucessor(numero1.getNumero());

        System.out.println("Número = " + numero1.getNumero() + " \nAntecessor = " + numero1.getAntecessor()
                + " \nSucessor = " + numero1.getSucessor());

    }
}
