/**
 *
 * @author Hans
 */

import java.util.Scanner;
public class Ejercicio4_Convertirunnumerodemesanombre {
    public static void main(String[] args) {
        int nummes;
        Scanner tcl = new Scanner(System.in);
        System.out.println("ESCRIBA UN NUMERO DEL 1 AL 12 SEGUN EL MES: ");
        nummes = tcl.nextInt();
        String Nombremes;
        switch (nummes) {
            case 1:
                Nombremes = "Enero";
                break;
            case 2:
                Nombremes = "Febrero";
                break;
            case 3:
                Nombremes = "Marzo";
                break;
            case 4:
                Nombremes = "Abril";
                break;
            case 5:
                Nombremes = "Mayo";
                break;
            case 6:
                Nombremes = "Junio";
                break;
            case 7:
                Nombremes = "Julio";
                break;
            case 8:
                Nombremes= "Agosto";
                break;
            case 9:
                Nombremes = "Septiembre";
                break;
            case 10:
                Nombremes = "Octubre";
                break;
            case 11:
                Nombremes = "Noviembre";
                break;
            case 12:
                Nombremes = "Diciembre";
                break;
            default:
                Nombremes = "Numero de mes invalido";
                break;
        }
        System.out.println("El mes correspondiente es: " + Nombremes);

    }

}

/***
 * Run
 * ESCRIBA UN NUMERO DEL 1 AL 12 SEGUN EL MES: 
3
El mes correspondiente es: Marzo
BUILD SUCCESS
 */
    

