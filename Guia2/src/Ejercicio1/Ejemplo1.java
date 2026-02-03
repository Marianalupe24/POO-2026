package Ejercicio1;
import java.util.*;
import javax.swing.*;

public class Ejemplo1 {
    public static void main(String[] args) {
        ejemplo3();
    }
    static void ejemplo3(){
        int result = JOptionPane.showConfirmDialog(null,
                "Quiere reemplazar su seleccion?");
        System.out.println(
                "El numero devuelto por showConfirmDialog es: "+result);
        /*if (result == JOptionPane.YES_OPTION)
            System.out.println("Yes");
        else if (result == JOptionPane.NO_OPTION)
            System.out.println("No");
        else if (result == JOptionPane.CANCEL_OPTION)
            System.out.println("Cancel");
        else if (result == JOptionPane.CLOSED_OPTION)
            System.out.println("Closed");

        System.exit(0);*/

        switch (result){
            case JOptionPane.YES_OPTION:
                System.out.println("Yes");
                break;
            case  JOptionPane.NO_OPTION:
                System.out.println("No");
                break;
            case  JOptionPane.CANCEL_OPTION:
                System.out.println("Cancel");
                break;
            case JOptionPane.CLOSED_OPTION:
                System.out.println("Closed");
                break;
            default:
                System.out.println("Opción desconocida");
                break;



        }
    }

}


