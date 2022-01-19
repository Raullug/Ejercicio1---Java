package Bootcamp;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) { //psvm

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el name: ");
        String name = teclado.nextLine();

        System.out.println("ingrese la fecha de hoy: ");
        int numero = teclado.nextInt();

        System.out.println("El Día esta soleado? ");
        boolean comprobar = teclado.nextBoolean();

        System.out.println("Hola " + name + ", Como estas?"); //sout
        System.out.println("La fecha de hoy es: " + numero);
        System.out.println("Es Soleado?" + comprobar);
    }
}
