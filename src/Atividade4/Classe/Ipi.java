package Atividade4.Classe;

public class Ipi {

    private double porcentagemIpi;
    private int codigo;
    private double valor;
    private int quantPecas;

    public Ipi(int codigo, double valorUnitatio, int quantPecas) {
        this.codigo = codigo;
        this.valor = valorUnitatio;
        this.quantPecas = quantPecas;
    }

    public double getPorcentagemIpi() {
        return porcentagemIpi;
    }

    public void setPorcentagemIpi(double porcentagemIpi) {
        this.porcentagemIpi = porcentagemIpi;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantPecas() {
        return quantPecas;
    }

    public void setQuantPecas(int quantPecas) {
        this.quantPecas = quantPecas;
    }

    public double formulaIpi(double valor1, int quant1, double valor2, int quant2, double ipi) {
        return ((valor1 * quant1) + (valor2 * quant2)) * ((ipi / 100) + 1);
    }
}
