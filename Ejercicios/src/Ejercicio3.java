import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        // Pedir dos números por teclado e indicar si el segundo es divisible por el primero
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese el primer número: ");
            int num1 = sc.nextInt();
            System.out.print("Ingrese el segundo número: ");
            int num2 = sc.nextInt();

            // Verificar si el segundo número es divisible por el primero
            if (num1 != 0) {
                if (num2 % num1 == 0) {
                    System.out.printf("El número %d es divisible entre %d%n", num2, num1);
                } else {
                    System.out.printf("El número %d no es divisible entre %d%n", num2, num1);
                }
            } else {
                System.out.println("No es posible la división por cero");
            }
        }
        // El bloque try-with-resources se encarga de cerrar el Scanner automáticamente
    }
}
