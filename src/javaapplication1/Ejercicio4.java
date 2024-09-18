package javaapplication1;

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio4 {
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Ingresa el tercer número: ");
        int num3 = scanner.nextInt();
        
        int[] numeros = {num1, num2, num3};
        Arrays.sort(numeros);
        
        System.out.println("Ordenados de mayor a menor: " + numeros[2] + ", " + numeros[1] + ", " + numeros[0]);
    }
}
