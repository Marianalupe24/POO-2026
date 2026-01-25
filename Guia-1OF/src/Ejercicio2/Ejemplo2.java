package Ejercicio2;
import javax.swing.*;

public class Ejemplo2 {
    public static void main(String[] args) {

        String txtValue1 = JOptionPane.showInputDialog("Digite el valor de capacitador 1 en microfaradios: ");
        String txtValue2 = JOptionPane.showInputDialog("Digite el valor de capacitador 2 en microfaradios:");
        String txtValue3 = JOptionPane.showInputDialog("Digite el valor de capacitador 3 en microfaradios:");

        //Validar si hay campos nulos
        if ( txtValue1.isEmpty() || txtValue2.isEmpty() || txtValue3.isEmpty()){
            JOptionPane.showMessageDialog(null, "No ingresó un valor. Se finalizará el programa");
            System.exit(0);
        }

        //Convertir a double
        double v1 = Double.parseDouble(txtValue1);
        double v2 = Double.parseDouble(txtValue2);
        double v3 = Double.parseDouble(txtValue3);

        //Validar si son negativos o cero
        if (v1 <= 0 || v2 <=0 || v3 <= 0){
            JOptionPane.showMessageDialog(null, "No se permiten valores cero o negativos. El programa finalizará.");
            System.exit(0);
        }

        //Mostrar los datos correctos en consola

        System.out.println("Datos de capacitares ingresados: ");
        System.out.println("Valor 1 = "+v1);
        System.out.println("Valor 2 = "+v2);
        System.out.println("Valor 3 = "+v3);

        //Llamando a los metodos
        double serie = calcularSerie (v1, v2, v3);
        double paralelo = calcularParalelo (v1, v2, v3);


        //Imprimir
        System.out.println("\n Resultados: ");
        System.out.println("Capacitor en SERIE equivale a: "+serie+ " microfaradios");
        System.out.println("Capacitor en PARALELO equivale a: "+paralelo+ " microfaradios");


    }

    //Metodos
    public static double calcularSerie(double v1, double v2, double v3){
        return 1/ ((1/v1) +(1/v2)+ (1/v3));
    }

    public static double calcularParalelo(double v1, double v2, double v3){
        return v1+v2+v3;
    }
}
