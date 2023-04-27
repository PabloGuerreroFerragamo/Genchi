package SegundaEntrega;

import java.util.Scanner;

public class Programa5 {
    public static void main(String[] args) {//Metodo principal
        
        SUM obj1 = new SUM();//Instancia a la clase SUM con objeto llamado "obj1"
        REST obj2 = new REST();//Instancia a la clase REST con con objeto llamado "obj2"
        System.out.println("CONSTRUCTOR");//mensaje del constructor
        obj1.suma();//llamada al metodo suma de la clase SUM
        obj2.resta();//llamada al metodo resta de la clase REST
        System.out.println("Finalizando...."); //Mensaje del destructor
    }
}
class base{//Clase padre llamada Base
    double a, b;//Variables de tipo double llamadas "a" y "b"
    Scanner entrada = new Scanner(System.in); //Instancia de la clase Scanner llamada entrada para la insercion de datos por el teclado
}


class SUM extends base{//Clase hija llamada SUM que hereda atributos de la clase padre llamada "base"
   
    public void suma(){//Metodo miembro llamado "Suma"
        
        double SUMA;//Variable llamada "SUMA" de tipo double
        System.out.println("Dame el valor de a: ");//Mensaje que pide el valor de "a"
        a = entrada.nextDouble();//Asignacion del valor pedido a la variable "a"
        System.out.println("Dame el valor de b: ");//Mensaje que pide el valor de "b"
        b = entrada.nextDouble();//Asignacion del valor pedido a la variable "a"
        SUMA = a+b;//Operacion que suma las variables "a" y "b" y se asigna el resultado a la variable llamada "SUMA"
        System.out.println("El resultado de la suma es de: "+SUMA);//Impresion del resultado de la operacion realizada
}
}

class REST extends base{//Clase hija llamada REST que hereda atributos de la clase padre llamada base
   
    public void resta(){//Metodo miembro de la clase "REST" llamada "resta"
     double RESTA;//Variable de tipo double llamada "RESTA"
        System.out.println("Dame el valor de a: ");//Mensaje que pide el valor de "a"
        a = entrada.nextDouble();//Asginacion del valor solicitado a la variable "a"
        System.out.println("Dame el valor de b: ");//Mensaje que pide el valor de "b"
        b = entrada.nextDouble();// Asigncacion del valor solicitado al variable "b"
        RESTA = a-b;//Operacion que resta las variables "a" y "b" y se asigna el resultado a la variable llamada "RESTA"
        System.out.println("El resultado de la resta es de: "+RESTA);//Impresion del resultado de la resta 
    }
}
