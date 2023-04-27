package SegundaEntrega;

import java.util.Scanner;

public class Programa06 {

    //Metodo area con un parametro flotante
    static void area(float a) {
        System.out.println(a * a * 3.1416);
    }

    //Metodo area con dos parametros flotantes
    static void area(float a, float b) {
        System.out.println((a * b) / 2);
    }

    //Metodo area con un parametro flotante y con un parametro entero
    static void area(float a, int z) {
        System.out.println(a * a);
    }

    //Inicio main
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Declaracion de variables
        float r, a, b, l;
        int z = 1;
        int cintodar = 0;

        //Munu
        while (cintodar < 1) {
            System.out.println("Seleciona alguna opcion(1:circulo, 2:triangulo, 3:cuadrado, 4:salir)");
            int opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Dame el radio");
                    r = entrada.nextFloat();
                    area(r);
                    break;
                case 2:
                    System.out.println("Dame la altura");
                    a = entrada.nextFloat();
                    System.out.println("Dame la base");
                    b = entrada.nextFloat();
                    area(a, b);
                    break;

                case 3:
                    System.out.println("Dame el valor para el area del cuadrado");
                    l = entrada.nextFloat();
                    area(l, 1);
                    break;

                case 4:
                    cintodar = cintodar + 1;
                    System.out.println("Finalizando.....");
                    break;

            }

        }//Cierre del menu

    }//Cierre de main
}
