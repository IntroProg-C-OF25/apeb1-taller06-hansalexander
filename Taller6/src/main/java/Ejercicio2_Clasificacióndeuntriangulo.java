/**
 *
 * @author Hans
 */
import java.util.Scanner;
public class Ejercicio2_Clasificacióndeuntriangulo {
    public static void main(String[] args) {
        double lado1, lado2, lado3;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese los 3 lados del triangulo: ");
        lado1 = tcl.nextDouble();
        lado2 = tcl.nextDouble();
        lado3 = tcl.nextDouble();
        if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
            System.out.println("No es un triangulo");
        } else {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triangulo equilatero");
        } else 
            if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triangulo isosceles");
        } else {
                System.out.println("Triangulo escaleno");
            }
        }
    }
}
    
/***
 * Run
 * Ingrese los 3 lados del triangulo: 4 5 5
Triangulo isosceles
BUILD SUCCESS
 */