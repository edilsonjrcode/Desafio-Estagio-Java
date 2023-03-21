package Atividade1.App;

import Atividade1.Classe.Idade;

import java.util.Scanner;

public class IdadeExec {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite em sequência ano, mês e dias de sua idade: ");
        Idade idade1 = new Idade(scan.nextInt(), scan.nextInt(), scan.nextInt());

        System.out.printf("A idade de " + idade1.getAno() +
                " anos, " + idade1.getMes() + " meses e " +
                idade1.getDias() + " dias = "
                + idade1.somaDias(idade1.anoEmDias(idade1.getAno()),
                        idade1.mesEmDias(idade1.getMes()), idade1.getDias())
                + " dias.");
    }
}
