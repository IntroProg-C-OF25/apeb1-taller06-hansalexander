/**
 *
 * @author Hans
 */
import java.util.Scanner;
public class Ejercicio3_Costodeenvíodepaquetes {
    public static void main(String[] args) {
        double peso, costoenvio;
        String region;
        Scanner tcl = new Scanner(System.in);
        System.out.print("INGRESE EL PESO DEL PAQUETE KG: ");
        peso = tcl.nextDouble();
        System.out.print("INGRESE LA REGION (local/nacional/internacional): ");
        region = tcl.next();
        if (peso < 5 && region.equals("local")) {
            costoenvio = 5;
        } else if (peso >= 5 && peso <= 10 && region.equals("nacional")) {
            costoenvio = 10;
        } else {
            costoenvio = 15;
        }
        System.out.printf("El costo de envio es: " + costoenvio + "$");

    }

}

/***
 * Run
 * INGRESE EL PESO DEL PAQUETE KG: 56
INGRESE LA REGION (local/nacional/internacional): new york
El costo de envio es: 15.0$
BUILD SUCCESS
 */
    

