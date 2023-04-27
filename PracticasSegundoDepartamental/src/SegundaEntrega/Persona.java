package SegundaEntrega;

import java.util.Scanner;

public class Persona {

    String nombre;
    String apellido;
    int edad;
    String IdProfesor;
    Scanner leer = new Scanner(System.in);
    Scanner leerint = new Scanner(System.in);
    //Constructor

    public Persona(String nombre1, String apellido1, int edad1) {
        nombre = nombre1;
        apellido = apellido1;
        edad = edad1;

    }

    //Metodos
    void pedir() {

        System.out.println("Dame nombre:");
        nombre = leer.nextLine();
        System.out.println("Dame apellido:");
        apellido = leer.nextLine();
        System.out.println("Dame edad");
        edad = leerint.nextInt();
        System.out.println("Dame ID");
        IdProfesor = leer.nextLine();

    }

    void modificar() {
        int responder = 0;
        System.out.println("Que deseas modificar?");
        System.out.println("Presiona 1 para modificar nombre");
        System.out.println("Presiona 2 para modificar apellido");
        System.out.println("Presiona 3 para modificar edad");
        System.out.println("Presiona 4 para modificar ID");
        System.out.println("Presiona 5 para modificar todo");
        responder = leerint.nextInt();
        if (responder == 1) {
            System.out.println("Dame nombre:");
            nombre = leer.nextLine();
        }
        if (responder == 2) {
            System.out.println("Dame apellido:");
            apellido = leer.nextLine();
        }
        if (responder == 3) {
            System.out.println("Dame edad");
            edad = leerint.nextInt();
        }
        if (responder == 4) {
            System.out.println("Dame ID");
            IdProfesor = leer.nextLine();
        }
        if (responder == 5) {
            System.out.println("Dame nombre:");
            nombre = leer.nextLine();
            System.out.println("Dame apellido:");
            apellido = leer.nextLine();
            System.out.println("Dame edad");
            edad = leerint.nextInt();
            System.out.println("Dame ID");
            IdProfesor = leer.nextLine();
        }
    }

    String getNombre() {
        return nombre;
    }

    String getApellido() {
        return apellido;
    }

    int getEdad() {
        return edad;
    }

}
//codigo de la clase profesor, subclase de la clase persona

class Profesor extends Persona {

    Profesor(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        IdProfesor = "Unknown";

    }

    void setIdProfesor(String IdProfesor1) {
        IdProfesor = IdProfesor1;

    }

    String getIdProfesor() {
        return IdProfesor;
    }

    void mostarNombreApellidoyCarnet() {
        System.out.println("Profesor de nombre: " + getNombre() + "" + getApellido() + " Con ID de profesor: " + getIdProfesor());
    }
    void menu(){
        
    }
}
//codigo test

class TestHerencia1 {

    public static void main(String[] args) {
        int contador = 0;
        int andyYaNoMeRasguñes=0;
        int respuesta = 0;
        Profesor profesor1 = new Profesor("", "", 0);
        Profesor profesor2 = new Profesor("", "", 0);
        Profesor profesor3 = new Profesor("", "", 0);
        
        if(andyYaNoMeRasguñes==0){
            while (contador < 1) {
                System.out.println("---Menu Principal---");
            System.out.println("Presiona 1 para agregar");
            System.out.println("Presiona 2 desplegar base de datos");
            System.out.println("Presiona 3 para modificar");
            System.out.println("Presiona 4 para agregar los datos de otro profesor");
                System.out.println("Presiona 5 para salir");
            respuesta = profesor1.leerint.nextInt();
            if (respuesta == 1) {
                profesor1.pedir();
            }
            if (respuesta == 2) {
                profesor1.mostarNombreApellidoyCarnet();

            }

            if (respuesta == 3) {

                profesor1.modificar();
            }
             if (respuesta == 4) {
                if(andyYaNoMeRasguñes==0){
            System.out.println("\n---Segundo Profesor---");
            while (contador < 1) {
            System.out.println("Presiona 1 para agregar");
            System.out.println("Presiona 2 desplegar base de datos");
            System.out.println("Presiona 3 para modificar");
            System.out.println("Presiona 4 para regresar al menu principal");
            respuesta = profesor2.leerint.nextInt();
            if (respuesta == 1) {
                profesor2.pedir();
            }
            if (respuesta == 2) {
                profesor2.mostarNombreApellidoyCarnet();

            }

            if (respuesta == 3) {

                profesor2.modificar();
            }
            if (respuesta == 4) {
                contador++;

            }
        }
            andyYaNoMeRasguñes++;
            contador--;
        }
                
            }
            if (respuesta == 5) {
                contador++;

            }
        }
            
           
        }
        
        

    }
}
