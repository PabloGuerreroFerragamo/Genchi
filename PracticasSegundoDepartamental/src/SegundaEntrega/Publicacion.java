
package SegundaEntrega;

import java.util.Scanner;

public class Publicacion {
    int codigo;
    String titulo;
    int añoPublicacion;
    Scanner leer = new Scanner(System.in);
    Scanner leerint = new Scanner(System.in);
    public Publicacion(int codigo1, String titulo1, int añoPublicacion1) {
        codigo = codigo1;
        titulo = titulo1;
        añoPublicacion = añoPublicacion1;
    }
    
    void getAnio() {
        System.out.println("Dame el año de publicacion:");
        añoPublicacion = leerint.nextInt();      
    }
    void getCodigo() {
        System.out.println("\nDame el codigo:");
        codigo = leerint.nextInt();       
    }
    void get() {
        System.out.println("Dame el titulo:");
        titulo = leer.nextLine();
    }
    void tostring() {
        System.out.println("El codigo es: " + codigo + " , su titulo es: " + titulo + " , publicado en: " + añoPublicacion);
        System.out.println("");
    }
    
}
class Revistas extends Publicacion {

    Revistas(int codigo, String titulo, int añoPublicacion) {
        super(codigo, titulo, añoPublicacion);
    }
    int prestado=0;

    void get() {
        System.out.println("El libro es prestado? 1 -> SI ; 2 -> NO");
        prestado = leerint.nextInt();
    }

    void set() {
        System.out.println("El codigo es: " + codigo + " , su titulo es: " + titulo + " , publicado en: " + añoPublicacion);
        System.out.println("");
    }

}

class Libros extends Publicacion {

    Libros(int codigo, String titulo, int añoPublicacion) {
        super(codigo, titulo, añoPublicacion);
    }
    int prestado=0;
    String textoPrestado="No esta prestado";

//    void get() {
//        System.out.println("El libro es prestado? 1 -> SI ; 2 -> NO");
//        prestado = leerint.nextInt();
//    }

    void set() {
        if(prestado==1){
            textoPrestado="Si esta prestado";
        }
        System.out.println("El codigo es: " + codigo + " , su titulo es: " + titulo + " , publicado en: " + añoPublicacion+ ", " + textoPrestado);
        System.out.println("");
    }
    public static void main(String[] args) {
        int respuesta;
        int responder;
        int respuesta3;
        int contador=0;
        int contando=0;
        int utimoContador=0;
        Libros libros1 = new Libros(1, "", 1);
        Revistas revistas1 = new Revistas(1, "", 1);
        
        System.out.println("---Menu Principal---");
        System.out.println("Presiona 1 para agregar");
        System.out.println("Presiona 2 mostar");
        System.out.println("Presiona 3 para salir");
        respuesta = libros1.leerint.nextInt();

        if (respuesta == 1) {
    }
}
}



