package Atividade6.Classe;

public class Model {

    private int numero;
    private int antecessor;
    private int sucessor;

    public Model(int number) {
        this.numero = number;
        this.addAntecessor(number);
        this.addSucessor(number);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAntecessor() {
        return antecessor;
    }

    public void setAntecessor(int antecessor) {
        this.antecessor = antecessor;
    }

    public int getSucessor() {
        return sucessor;
    }

    public void setSucessor(int sucessor) {
        this.sucessor = sucessor;
    }

    public int addAntecessor(int number) {
        setAntecessor(number - 1);
        return antecessor;
    }

    public int addSucessor(int number) {
        setSucessor(number + 1);
        return sucessor;
    }
}
