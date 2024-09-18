package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("Menú de Ejercicios:");
            System.out.println("1. Ejercicio 1: Comparar dos números");
            System.out.println("2. Ejercicio 2: Número positivo o negativo");
            System.out.println("3. Ejercicio 3: Ordenar dos números");
            System.out.println("4. Ejercicio 4: Ordenar tres números");
            System.out.println("5. Ejercicio 5: Validar una fecha");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            
            opcion = sp.nextInt();
            
            switch (opcion) {
                case 1:
                    
                    Ejercicio1 ejercicio1 = new Ejercicio1();
                    ejercicio1.ejecutar(); 
                    break;
                case 2:
                   
                    Ejercicio2 ejercicio2 = new Ejercicio2();
                    ejercicio2.ejecutar();
                    break;
                case 3:
                    
                    Ejercicio3 ejercicio3 = new Ejercicio3();
                    ejercicio3.ejecutar();
                    break;
                case 4:
                    
                    Ejercicio4 ejercicio4 = new Ejercicio4();
                    ejercicio4.ejecutar();
                    break;
                case 5:
                    
                    Ejercicio5 ejercicio5 = new Ejercicio5();
                    ejercicio5.ejecutar();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo porr favor.");
            }
        } while (opcion != 0);
    }
}
