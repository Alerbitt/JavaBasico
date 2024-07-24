import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        // Pedir un nombre por teclado y hacer que salude
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese su nombre: ");
            String nombre = scanner.nextLine();
            
            // Saludar al usuario
            System.out.printf("Hola %s, ¿qué tal?", nombre);
        } 
        
    }
}
