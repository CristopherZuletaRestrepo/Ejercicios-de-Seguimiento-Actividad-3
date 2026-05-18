package com.mycompany.figuras;

public class Piramide extends FiguraGeometrica {

    private double Base;
    private double Altura;
    private double Apotema;

    public Piramide(double Base, double Altura, double Apotema) {
        this.Base = Base;
        this.Altura = Altura;
        this.Apotema = Apotema;
    }

    @Override
    public double calcularVolumen() {
        return (1.0 / 3.0) * Math.pow(Base, 2) * Altura;
    }

    @Override
    public double calcularSuperficie() {
        return Math.pow(Base, 2) + (2 * Base * Apotema);
    }
}
