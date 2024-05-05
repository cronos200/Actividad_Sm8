package com.mycompany.semana_8_punto2;
import java.util.Random;
import java.util.Scanner;
public class Semana_8_punto2 {

    public static void main(String[] args) {
        adivinarNumero(1, 100, 5);
    }

    public static void adivinarNumero(int min_numero, int max_numero, int max_intentos) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(max_numero - min_numero + 1) + min_numero;

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Tienes " + max_intentos + " intentos para adivinar el número aleatorio entre " + min_numero + " y " + max_numero);

        Scanner scanner = new Scanner(System.in);
        for (int intento = 1; intento <= max_intentos; intento++) {
            System.out.print("Intento #" + intento + ": Ingresa tu número: ");
            int numeroUsuario = scanner.nextInt();

            if (numeroUsuario == numeroAleatorio) {
                System.out.println("¡Felicidades! Has adivinado el número en " + intento + " intentos.");
                return;
            } else if (numeroUsuario < numeroAleatorio) {
                System.out.println("El número aleatorio es mayor que " + numeroUsuario + ". Sigue intentándolo.");
            } else {
                System.out.println("El número aleatorio es menor que " + numeroUsuario + ". Sigue intentándolo.");
            }
        }

        System.out.println("Lo siento, has agotado tus " + max_intentos + " intentos. El número aleatorio era: " + numeroAleatorio);
    }
}
