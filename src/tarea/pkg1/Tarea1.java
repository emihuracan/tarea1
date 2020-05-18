/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg1;

/**
 *
 * @author emi
 */
public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // 1)
        int numero1=10;
        
        // 2)
        int numero2 = 6; // Aca creo y asigno la variable llamada numero2
                
        System.out.println(numero1 + numero2); // no es necesario crear otra variable para mostrar el resultado
        
        // 3)
        float decimal1 = 1.34f;
        
        // 4)
        char caracter1 = 'f';
        
        // 5)
        boolean esVerdadero = true;
        
        // 6)
        System.out.println(numero1 + decimal1);
        
        // 7)
        // System.out.println(numero1 + carater1); no compila por sumar numeros con letras
        
        // 8)
        System.out.println(numero1%numero2); // % = para mostrar resto de una división en java
        
        // 9)
        String cadena1 = "Hola mundo";
        System.out.println(cadena1);
        
        // 10)
        final int NUMERO_CONSTANTE = 2;
        
        // 11)
        // NUMERO_CONSTANTE = 5; No se pueden modificar las constantes
        
        // 12)
        numero2 = NUMERO_CONSTANTE; // se puede hacer
        
       
        }
    
    
}
