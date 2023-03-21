package Atividade1.Classe;

public class Idade {

    private int ano;
    private int mes;
    private int dias;

    private int totalDias;

    public Idade(int ano, int mes, int dias){
        this.ano = ano;
        this.mes = mes;
        this.dias = dias;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getTotalDias() {
        return totalDias;
    }

    public void setTotalDias(int totalDias) {
        this.totalDias = totalDias;
    }

    public int anoEmDias(int ano){
        return ano*365;
    }

    public int mesEmDias(int mes){
        return mes*30;
    }

    public int somaDias(int ano, int mes, int dias){
        setTotalDias(ano+mes+dias);
        return totalDias;
    }
}