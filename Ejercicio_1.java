package org.example;
import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuario = "admin";
        String contrasena = "1234";

        boolean credencialesCorrectas = false;

        while (!credencialesCorrectas) {
            System.out.println("Ingrese el usuario: ");
            String usuarioIngreso = scanner.next();
            System.out.println("Ingrese la contraseña: ");
            String contrasenaIngreso = scanner.next();

            if (usuarioIngreso.equals(usuario) && contrasenaIngreso.equals(contrasena)) {
                System.out.println("Bienvenido al sistema");
                credencialesCorrectas = true;
            } else {
                System.out.println("Credenciales incorrectas. Intenta nuevamente.");
            }
        }
    }
}
