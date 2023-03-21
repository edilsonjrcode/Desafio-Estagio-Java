package Atividade2.Classe;

public class Media {

    private int quatro = 4;
    private int cinco = 5;
    private int seis = 6;
    private int sete = 7;
    private int oito = 8;
    private int nove = 9;

    public int getQuatro() {
        return quatro;
    }

    public void setQuatro(int quatro) {
        this.quatro = quatro;
    }

    public int getCinco() {
        return cinco;
    }

    public void setCinco(int cinco) {
        this.cinco = cinco;
    }

    public int getSeis() {
        return seis;
    }

    public void setSeis(int seis) {
        this.seis = seis;
    }

    public int getSete() {
        return sete;
    }

    public void setSete(int sete) {
        this.sete = sete;
    }

    public int getOito() {
        return oito;
    }

    public void setOito(int oito) {
        this.oito = oito;
    }

    public int getNove() {
        return nove;
    }

    public void setNove(int nove) {
        this.nove = nove;
    }

    public int media(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3;
    }

    public int somaMedia(int num1, int num2) {
        return num1 + num2;
    }

    public int mediaDaMedia(int num1, int num2) {
        return (num1 + num2) / 2;
    }

}
