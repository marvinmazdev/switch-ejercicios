package javaapplication1;

import java.util.Scanner;

public class Ejercicio2 {
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
    }
}

