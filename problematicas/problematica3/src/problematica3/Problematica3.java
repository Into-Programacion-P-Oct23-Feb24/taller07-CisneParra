/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problematica3;

/**
 *
 * @author natsu
 */
public class Problematica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero = 2;
        int contador = 3;
        String resultado = "";
        do {
            resultado = String.format("%s\n%d", resultado, numero);
            numero = numero + contador;
            contador = contador + 2;
        } while (numero <= 37);

        System.out.printf("%s\n", resultado);

    }

}
