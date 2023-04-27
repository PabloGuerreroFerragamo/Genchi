package SegundaEntrega;

import java.util.Scanner;

public class Programa3 {

    static public class base {//clase padre

        double a, b, c, d, e;//variabes miembro
        Scanner leer = new Scanner(System.in);

    }

    static class esfera extends base {//clase hija esfera

        esfera() {//constructor para iniciaizar los valores en 0
            double a = 0;
            double b = 0;
            double c = 0;
            double d = 0;
            double e = 0;
        }

        void volumen() {//función miembro que devuelve el volumen de la esfera
            System.out.println("---ESFERA---");
            System.out.println("Dame radio:");
            a = leer.nextInt();
            System.out.println("El volumen es: " + (4 * 3.1416 * a * a * a) / 3);
        }
    }

    static class cono extends base {//clase hijo cono

        cono() {//constructor para iniciaizar los valores en 0
            double a = 0;
            double b = 0;
            double c = 0;
            double d = 0;
            double e = 0;
        }

        void volumen() {//función miembro que devuelve el volumen del cono
            System.out.println("\n ---CONO---");
            System.out.println("Dame radio:");
            b = leer.nextInt();
            System.out.println("Dame la altura:");
            c = leer.nextInt();
            System.out.println("El volumen es: " + (c * 3.1416 * b * b) / 3);
        }
    }

    public static void main(String[] args) {
        esfera obj1 = new esfera();//se instancia un objeto llamado obj1 de tipo esfera
        cono obj2 = new cono();//se instancia un objeto llamado obj2 de tipo cono
        obj1.volumen();//apartir del objeto obj1 se llama a la funcion miembro volumen
        obj2.volumen();//apartir del objeto obj2 se llama a la funcion miembro volumen
    }
}
