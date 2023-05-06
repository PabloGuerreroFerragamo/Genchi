package Clases;

import java.util.Scanner;

public class Abarrotes {

    String id = "";
    String nombre = "";
    Scanner leer = new Scanner(System.in);
    Scanner leerint = new Scanner(System.in);

    public Abarrotes(String id1, String nombre1) {
        id = id1;
        nombre = nombre1;
    }
}

class Articulos extends Abarrotes {

    int cantidadMaxima = 0;
    int cantidadMinima = 0;
    int stock = 0;

    Articulos(String id, String nombre) {
        super(id, nombre);
    }

    String getId() {
        System.out.println("Dame el ID del producto: ");
        id = leer.nextLine();
        return id;
    }
    String getNombre(){
        System.out.println("Dame el nombre del producto: ");
        nombre = leer.nextLine();
        return nombre;
    }
    int getCantidadMaxima(){
        System.out.println("Dame la cantidad maxima del producto: ");
        cantidadMaxima = leerint.nextInt();
        return cantidadMaxima;
    }
    int getCantidadMinima(){
        System.out.println("Dame la cantidad minima del producto: ");
        cantidadMinima = leerint.nextInt(); 
        return cantidadMinima;
    }
    int getStock(){
        System.out.println("Dame el stock del producto: ");
        stock = leerint.nextInt();
        return stock;
    }
}

class Master {

    public static void main(String[] args) {//Inicio de main
        Articulos atri = new Articulos("", "");
        Ficheros ficha = new Ficheros();
        int contadorPrincipal = 0;
        int respuestaPrincipal = 0;
        
        while (contadorPrincipal < 1) {
            System.out.println("Abarroteria Don Leopoldo");
            System.out.println("1.-Dar de alta articulos   2.-Dar de baja articulos   3.-Consultar articulos   4.-Modificar articulos   5.-Desplegar registros   6.-Salir del sistema");
            respuestaPrincipal = atri.leerint.nextInt();
            if (respuestaPrincipal == 1) {
                ficha.guardarArchivo();
                contadorPrincipal++;
            }

        }
    }//Cierre de main
}
