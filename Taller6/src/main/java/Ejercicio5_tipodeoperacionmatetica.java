/**
 *
 * @author Hans
 */
import java.util.Scanner;
public class Ejercicio5_tipodeoperacionmatetica {
    public static void main(String[] args) {
        int noperacion;
        String tipoperacion;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese un numero del 1 al 4 que represente una operacion matematica:");
        noperacion = tcl.nextInt();
        switch (noperacion) {
            case 1:
                tipoperacion = "Suma";
                break;
            case 2:
                tipoperacion = "Resta";
                break;
            case 3:
                tipoperacion = "Multiplicacion";
                break;
            case 4:
                tipoperacion = "Division";
                break;
            default:
                tipoperacion = "Operacion no valida";
                break;
        }
        System.out.println("La operacion seleccionada es: " + tipoperacion);
    }

}

/***
 * Run
 *Ingrese un numero del 1 al 4 que represente una operacion matematica: 3
La operacion seleccionada es: Multiplicacion
BUILD SUCCESS
 */
