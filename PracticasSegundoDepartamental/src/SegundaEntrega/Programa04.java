package SegundaEntrega;

import java.util.Scanner;

public class Programa04 {

    static public class base {//clase padre

        double a, b, c, d, e;//variabes miembro
        Scanner leer = new Scanner(System.in);

    }

    static class piramide extends base {//clase hija piramide

        piramide() {//constructor para iniciaizar los valores en 0
            double a = 0;
            double b = 0;
            double c = 0;
            double d = 0;
            double e = 0;
        }

        void volumen() {//función miembro que devuelve el volumen de la piramide
            System.out.println("---PIRAMIDE---");
            System.out.println("Dame la base:");
            a = leer.nextInt();
            System.out.println("Dame el ancho:");
            b = leer.nextInt();
            System.out.println("Dame la altura:");
            c = leer.nextInt();
            System.out.println("El volumen es: " + (a * b * c) / 3);
        }
    }

    static class cubo extends base {//clase hijo cubo

        cubo(){//constructor para iniciaizar los valores en 0
            double a = 0;
            double b = 0;
            double c = 0;
            double d = 0;
            double e = 0;
        }

        void volumen() {//función miembro que devuelve el volumen del cubo
            System.out.println("\n ---CUBO---");
            System.out.println("Dame la base:");
            a = leer.nextInt();
            System.out.println("Dame el ancho:");
            b = leer.nextInt();
            System.out.println("Dame la altura:");
            c = leer.nextInt();
            System.out.println("El volumen es: " + (a * b * c));
        }
    }

    public static void main(String[] args) {
        piramide obj1 = new piramide();//se instancia un objeto llamado obj1 de tipo piramide
        cubo obj2 = new cubo();//se instancia un objeto llamado obj2 de tipo cubo
        obj1.volumen();//apartir del objeto obj1 se llama a la funcion miembro volumen
        obj2.volumen();//apartir del objeto obj2 se llama a la funcion miembro volumen
    }
}
