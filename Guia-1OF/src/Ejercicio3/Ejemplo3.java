package Ejercicio3;
import javax.swing.*;

public class Ejemplo3 {
    public static void main(String[] args) {

        //Llamar a metodos
        double radio = valorRadio();
        double altura = valorAltura();
        double volumen = calcularVolumenCilindro(radio, altura);
        double lDiesel = convertirLitros(volumen);
        double kgGasolina = calcularKgGasolina(volumen);

        imprimirResultados(radio, altura, lDiesel, kgGasolina);
    }

    // Constante
    public static final double DENSIDAD_GASOLINA = 0.750;

    // Metodos para obtener los datos
    public static double valorRadio() {
        String texto = JOptionPane.showInputDialog("Digite el radio del tanque:");
        return Double.parseDouble(texto);
    }


    public static double valorAltura() {
        String texto = JOptionPane.showInputDialog("Digite la altura del tanque:");
        return Double.parseDouble(texto);
    }


    public static double calcularVolumenCilindro(double radio, double altura) {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    public static double convertirLitros(double volumen) {
        return volumen * 1000;
    }

    public static double calcularKgGasolina(double volumen) {
        double litros = convertirLitros(volumen);
        return litros * DENSIDAD_GASOLINA;
    }


    //Metodo para mostrar
    public static void imprimirResultados(double radio, double altura, double lDiesel, double kgGasolina) {

        System.out.println("***MEDIDAS DEL TANQUE***");
        System.out.println("Radio: " + radio + " m");
        System.out.println("Altura: " + altura + " m");
        System.out.println("\n***RESULTADOS***");
        System.out.println("Capacidad máxima de Diesel: " + lDiesel + " Litros");
        System.out.println("Capacidad máxima de Gasolina: " + kgGasolina + " Kg");
    }
}