import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        // Pide el precio de un producto sin IVA y calcula su precio con IVA. El IVA es del 21%.
        // Formatea el resultado para que se muestre con dos decimales.

        final double IVA_RATE = 0.21;
        double precioSinIVA, montoIVA, precioConIVA;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Ingrese el precio del producto: ");
            precioSinIVA = scanner.nextDouble();

            montoIVA = precioSinIVA * IVA_RATE;
            precioConIVA = precioSinIVA + montoIVA;
            System.out.printf("El precio con IVA es: %.2f%n", precioConIVA);

        } catch (Exception e) {
            System.out.println("Ocurrió un error al ingresar el precio.");
        }
    }
}
