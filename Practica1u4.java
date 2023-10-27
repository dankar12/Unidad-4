/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1u4;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Practica1u4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] arreglo = {20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3};
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Selecciona una opcion:");
            System.out.println("1. Sumar elementos del arreglo");
            System.out.println("2. Multiplicar elementos del arreglo");
            System.out.println("3. Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    double suma = 0;
                    for (double elemento : arreglo) {
                        suma += elemento;
                    }
                    System.out.println("La suma de los elementos es: " + suma);
                    break;
                case 2:
                    double producto = 1;
                    for (double elemento : arreglo) {
                        producto *= elemento;
                    }
                    System.out.println("La multiplicacion de los elementos es: " + producto);
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("La opción no es válida. Por favor, elige una opción válida.");
            }
            
        }
        
    }
    
}
   
