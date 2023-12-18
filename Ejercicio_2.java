package org.example;
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tiempo;
        int temperatura;

        System.out.println("Ingrese el tipo de tiempo: ");
        tiempo = scanner.next();
        System.out.println("Ingrese la temperatura: ");
        temperatura = scanner.nextInt();

        if(temperatura > 25 && tiempo.equals("Soleado")){
            System.out.println("Podes caminar y tomar sol");
        }
        else if((temperatura > 15 && temperatura <= 25) && tiempo.equals("Soleado")){
            System.out.println("Podes salir a caminar");
        } else if (temperatura <= 15 && tiempo.equals("Soleado")) {
            System.out.println("Podes salir a camianar con campera");
        } else if (temperatura < 10 && tiempo.equals("lluvia")) {
            System.out.println("Es preferible quedarse en casa o salir con paraguas y campera");
        } else if (temperatura < 10 && tiempo.equals("Nieve")) {
            System.out.println("Podes salir a esquiar");
        }

    }
}