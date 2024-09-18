package javaapplication1;

import java.util.Scanner;

public class Ejercicio3 {
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();
        
        if (num1 > num2) {
            System.out.println("Ordenados de mayor a menor: " + num1 + ", " + num2);
        } else {
            System.out.println("Ordenados de mayor a menor: " + num2 + ", " + num1);
        }
    }
}
