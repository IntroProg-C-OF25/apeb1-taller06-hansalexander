/**
 *
 * @author Hans
 */
import java.util.Scanner;
public class Ejercicio1_facturaciondedosproductos {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costoProd1, costoProd2, costoenvio, iva, descuento, subtotal, costofinal;
        System.out.println("Dame tres costos: ");
        costoProd1 = tcl.nextDouble();
        costoProd2 = tcl.nextDouble();
        costoenvio = tcl.nextDouble();
        iva = (costoProd1 + costoProd2) * 0.10;
        subtotal = iva + (costoProd1 + costoProd2);
        descuento = subtotal * 0.05;
        if (subtotal > 1000) {
            descuento = (subtotal * 0.2);
            costofinal = subtotal - descuento + costoenvio;
            System.out.print("costoFinal = " + costofinal);
        } else {
            if (subtotal > 5000) {
                descuento = (subtotal * 0.2);
            }
            costoenvio = 0;
            costofinal = subtotal - descuento + costoenvio;
            System.out.print("El costo final es: " + costofinal);
        }
    }

}
/***
 * Run
 * Dame tres costos: 
2 3 5
El costo final es: 5.225
BUILD SUCCESS
 */
        
   
