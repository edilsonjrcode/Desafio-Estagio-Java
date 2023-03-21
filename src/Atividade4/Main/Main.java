package Atividade4.Main;

import Atividade4.Classe.Ipi;

// 4. Escrever um algoritmo que receba via construtor:
// - a porcentagem do IPI a ser acrescido no valor das peças
// - o código da peça 1, valor unitário da peça 1, quantidade de peças 1
// - o código da peça 2, valor unitário da peça 2, quantidade de peças 2
// O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
// Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)

public class Main {

    public static void main(String[] args) {
        Ipi peca1 = new Ipi(01, 50, 3);
        Ipi peca2 = new Ipi(02, 75, 8);

        peca1.setPorcentagemIpi(10d);

        System.out.printf("Valor total a ser pago: R$%.2f",
                peca1.formulaIpi(peca1.getValor(), peca1.getQuantPecas(),
                        peca2.getValor(), peca2.getQuantPecas(), peca1.getPorcentagemIpi()));
    }
}
