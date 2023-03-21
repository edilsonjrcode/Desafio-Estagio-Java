package Atividade5.Classe;

public class Salario {
    private final double salarioMinimo = 1320.00;
    private double salarioUsuario;

    public Salario(double salario) {
        this.salarioUsuario = salario;
    }

    public double getSalarioUsuario() {
        return salarioUsuario;
    }

    public void setSalarioUsuario(double salarioUsuario) {
        this.salarioUsuario = salarioUsuario;
    }

    public double getSalarioMinimo() {
        return salarioMinimo;
    }

    public double quantSalario(double salarioMinimo, double salarioUsusario) {
        return (salarioUsusario / salarioMinimo);
    }
}
