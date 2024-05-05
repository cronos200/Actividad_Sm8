package com.mycompany.semana_8_punto3;
import java.util.Scanner;
public class Semana_8_punto3 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            // Mostrar menú de opciones
            System.out.println("Seleccione una figura geométrica:");
            System.out.println("1. Triángulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Rectángulo");
            System.out.println("4. Círculo");
            System.out.println("0. Salir");

            // Leer la opción del usuario
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    calcularTriangulo(scanner);
                    break;
                case 2:
                    calcularCuadrado(scanner);
                    break;
                case 3:
                    calcularRectangulo(scanner);
                    break;
                case 4:
                    calcularCirculo(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }
    private static void calcularTriangulo(Scanner scanner) {
        System.out.println("Ingresa la base del triangulo:");
        double base = scanner.nextDouble();
        System.out.println("Ingresa la altura del triangulo:");
        double altura = scanner.nextDouble();
        
        double area = (base * altura) / 2;
        System.out.println("El area del triangulo es: " + area);
    }

    private static void calcularCuadrado(Scanner scanner) {
        System.out.println("Ingresa el lado del cuadrado");
        double lado = scanner.nextDouble();
        
        double area = lado * lado;
        System.out.println("El area del cuadrado es: " + area);
    }

    private static void calcularRectangulo(Scanner scanner) {
        System.out.println("Ingresa la base del rectangulo");
        double base = scanner.nextDouble();
        System.out.println("Ingresa la altura del rectangulo");
        double altura = scanner.nextDouble();
        
        double area = base * altura;
        System.out.println("El area del rectangulo es: " + area);
    }

    private static void calcularCirculo(Scanner scanner) {
        System.out.println("Ingresa el radio del circulo");
        double radio = scanner.nextDouble();
        
        double area = Math.PI * radio * radio;
        System.out.println("El area del circulo es: " + area);
    }
}
