/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problematica5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author natsu
 */
public class Problematica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int limite = 15;
        int numerador = 1;
        int denominador = 3;
        int contador = 0;
        double fraccion;
        double total = 1;
        String signo;
        String cadena = "";
        do {
            if (contador == 0) {
                signo = "-";
                fraccion = (-((double) numerador / denominador));
                contador = contador + 1;
            } else {
                signo = "+";
                contador = contador - 1;
                fraccion = (-((double) numerador / denominador));
            }
            cadena = String.format("%s%s %d/%d", cadena
            , signo, numerador, denominador);
            total = total + fraccion;
            denominador = denominador + 2;
        }while (denominador <= limite);
        System.out.printf("%d %s\nCon un resultado"
                + " de: %.2f\n", contador, cadena,total);
    }
}

