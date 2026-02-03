package Ejercicio2;

public class Ejemplo2 {
    public static void main(String[] args) {
        cuadratica(16, 0, 9);
    }

    static void cuadratica (double a, double b, double c ){
        double d = b*b - 4 * a * c;

        try{
            double x1= (-b + Math.sqrt(d)) / (2 * a);
            double x2= (-b - Math.sqrt(d)) / (2 * a);

            if (d < 0) {
                throw new Exception(); // Forzar error si es negativa
            }
            System.out.println("Raices reales: ");
            System.out.println("x1: " + x1 );
            System.out.println("x2: "+x2);

        } catch (Exception e){
            double imaginaria = Math.sqrt(-d) / (2 * a);

            System.out.println("Raíces imaginarias:");
            System.out.println("x1: + "    + imaginaria + "i");
            System.out.println("x2: - " + imaginaria + "i");
        }
    }

}
