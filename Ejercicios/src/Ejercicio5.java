public class Ejercicio5 {

    public static void main(String[] args) {

        // Muestra los números del 1 al 100 que sean divisibles entre 2 y 3
        for (int i = 1; i <= 100; i++) {
            // Verificar si el número es divisible entre 2 y 3
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("El número " + i + " es divisible entre 2 y 3");
            }
        }
    }
}
