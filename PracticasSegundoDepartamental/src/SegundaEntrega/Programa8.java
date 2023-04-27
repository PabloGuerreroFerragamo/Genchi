
package SegundaEntrega;

import java.util.Scanner;

public class Programa8 {
    static void volumen(float b, float h) { //Metodo llamado "volumen" que acepta dos variables, ambas de tipo float
        System.out.println((b*b*h/3)*3.1416);//Impresion del resultado de la operacion para calcular el volumen del cono
    }

    static void volumen(float a, int z) {//Metodo llamado "volumen" que acepta dos variables, una de tipo float y la otra de tipo entera
        System.out.println((a*a*a*4/3)*3.1416);//Impresion del resultado de la operacion con para calcular el volumen de la esfera
    }

    public static void main(String[] args) {//Metodo principal
        Scanner entrada = new Scanner(System.in);//Instancia de la clase "Scanner" llamada entrada para la insercion de datos
        float r, a, b,h, l;// creacion de variables tipo float 
        int z = 1;//Creacion de variable tipo entera
        int cintodar = 0;// Creacion de variable de tipo entera
        while (cintodar < 1) { //Estructura ciclica
            System.out.println("Seleciona alguna opcion(1:cono, 2:esfera, 3:salir)"); //Impresion del menu principal
            int opcion = entrada.nextInt();//Creacion y asignacion del valor a la variable opcion que elegió el usuario

            switch (opcion) {//Estructura selectiva para elegir las opciones
                case 1://Opcion uno
                    System.out.println("Dame la base");//Mensaje pidiendo la base
                    r = entrada.nextFloat();//Asignacion del valor de la base a r
                    System.out.println("Dame la altura");//Mensaje pidiendo la altura
                    h = entrada.nextFloat();//Asignacion del valor de la altura 
                    volumen(r,h); //llamada del metodo "Volumen" con sobrecarga de dos variables de tipo double
                    break;//Rompimiento de la opcion 1
               

                case 2://Opcion dos
                    System.out.println("Dame el valor del radio del cono");//Mensaje pidiendo el valor de la radio del cono
                    l = entrada.nextFloat();//Asigancion del valor de la radio del cono a  la variable "l"
                    volumen(l, 1); //Llamada al metodo llamado "Volumen" con sobrecarga de dos variables de tipo int y tipo double
                    break;//Rompimiento de la opcion 2

                case 3://Opcion tres
                    cintodar = cintodar + 1;
                    System.out.println("Finalizando.....");//Mensaje del destructor
                    break;//Rompimiento de la opcion 3

            }

        }

    }
}
