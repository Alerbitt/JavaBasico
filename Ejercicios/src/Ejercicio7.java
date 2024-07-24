import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        // Pedir una frase por teclado, eliminar los espacios en blanco y mostrar la frase resultante
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Ingrese una frase: ");
            String frase = sc.nextLine();
            StringBuilder nuevaFrase = new StringBuilder();
            
            for (int i = 0; i < frase.length(); i++) {
                char simbolo = frase.charAt(i);
                // Agregar caracteres que no sean espacios a la nueva frase
                if (simbolo != ' ') {
                    nuevaFrase.append(simbolo);
                }
            }
            
            System.out.println(nuevaFrase.toString());
            
        } catch (Exception e) {
            System.out.println("Ocurrió un error al procesar la frase.");
        }
    }
}
