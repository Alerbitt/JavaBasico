import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        // Solicitar un año por teclado y determinar si es bisiesto o no
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese un año: ");
            int year = sc.nextInt();

            // Verificar las condiciones para determinar si es año bisiesto
            boolean esDivisiblePorCuatro = (year % 4) == 0;
            boolean noEsDivisiblePorCien = (year % 100) != 0;
            boolean esDivisiblePorCuatrocientos = (year % 400) == 0;

            // Determinar si el año es bisiesto
            if ((esDivisiblePorCuatro && noEsDivisiblePorCien) || esDivisiblePorCuatrocientos) {
                System.out.println(year + " es bisiesto");
            } else {
                System.out.println(year + " no es bisiesto");
            }
        }
        
    }
}
