import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        // Convertir a try-with-resources
        try (Scanner scanner = new Scanner(System.in)) {
            // Pedir una frase por teclado y contar cuántas vocales tiene
            System.out.print("Ingrese una frase para validar cuántas vocales tiene: ");
            String frase = scanner.nextLine().toLowerCase();

            int contador = 0;
            for (int i = 0; i < frase.length(); i++) {
                char caracter = frase.charAt(i);

                // Contar las vocales usando un switch
                contador += switch (caracter) {
                    case 'a', 'e', 'i', 'o', 'u' -> 1;
                    default -> 0;
                };
            }

            System.out.println("El número de vocales es: " + contador);
        }
        
    }
}
