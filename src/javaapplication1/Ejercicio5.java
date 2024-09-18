package javaapplication1;

import java.util.Scanner;

public class Ejercicio5 {
    
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el día: ");
        int dia = scanner.nextInt();
        
        System.out.print("Ingresa el mes: ");
        int mes = scanner.nextInt();
        
        System.out.print("Ingresa el año: ");
        int año = scanner.nextInt();
        
        boolean fechaCorrecta = false;
        
        
        switch (mes) {
            case 2: 
                if (dia >= 1 && dia <= 28) {
                    fechaCorrecta = true;
                }
                break;
            case 4: case 6: case 9: case 11: 
                if (dia >= 1 && dia <= 30) {
                    fechaCorrecta = true;
                }
                break;
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
                if (dia >= 1 && dia <= 31) {
                    fechaCorrecta = true;
                }
                break;
            default:
                
                fechaCorrecta = false;
        }
        
        if (fechaCorrecta) {
            System.out.println("La fecha es correcta: " + dia + "/" + mes + "/" + año);
        } else {
            System.out.println("La fecha es incorrecta.");
        }
    }
}
