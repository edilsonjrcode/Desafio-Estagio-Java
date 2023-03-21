package Atividade5.Main;

import java.util.Scanner;

import Atividade5.Classe.Salario;

//5. Crie um algoritmo que receba via construtor o valor do salário mínimo e o valor do salário de um usuário, calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
//(1SM=R$1320,00)

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu salário: ");

        Salario salario1 = new Salario(scan.nextDouble());

        System.out.printf("A quantidade de salários ganhos é equivalente a %.2f salários.",
                salario1.quantSalario(salario1.getSalarioMinimo(), salario1.getSalarioUsuario()));
    }
}
