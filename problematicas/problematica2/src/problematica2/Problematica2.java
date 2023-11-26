/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problematica2;

/**
 *
 * @author natsu
 */
public class Problematica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 2;
        int contador = 4;
        String resultado = "";
        while (numero <= 110){
            resultado = String.format("%s\n%d", resultado, numero);
            numero = numero + contador;
            contador = contador + 2;
        }
        System.out.printf("%s\n", resultado);

    }
    
}
