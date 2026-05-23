package notas;

public class Notas {

    double[] Listanotas;

    public Notas() {
        Listanotas = new double[5];
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double nota : Listanotas) {
            suma += nota;
        }

        return suma / Listanotas.length;

    }

    public double calcularDesviacion() {
        double promedio = calcularPromedio();
        double suma = 0;

        for (int i = 0; i < Listanotas.length; i++) {
            double nota = Listanotas[i];
            suma += Math.pow(nota - promedio, 2);
        }

        return Math.sqrt(suma / Listanotas.length);
    }

    public double calcularMayor() {
        double mayor = Listanotas[0];
        for (int i = 0; i < Listanotas.length; i++) {
            double nota = Listanotas[i];
            if (nota > mayor) {
                mayor = nota;
            }
        }
        return mayor;
    }

    public double calcularMenor() {
        double menor = Listanotas[0];
        for (int i = 0; i < Listanotas.length; i++) {
            double nota = Listanotas[i];
            if (nota < menor) {
                menor = nota;
            }
        }
        return menor;
    }
}
