package SegundaEntrega;

import java.util.Scanner;

public class Programa01 {
    public static void main(String[] args) { //Metodo principal del codigo
        circulo obj3 = new circulo(); //instancia a la clase hija circulo
        triangulo obj2 = new triangulo();//instancia a la clase hija triangulo
   cuadrado obj1 = new cuadrado();//instancia a la clase hija cuadrado
        System.out.println("CONSTRUCTOR"); //Impresion de un mensaje del constructor
   obj1.Area();//llamada al metodo area de la clase hija cuadrado
   obj1.Graficar();//llamada al metodo graficar de la clase hija cuadrado
   obj2.Area();//llamada al metodo area de la clase hija triangulo
   obj2.Graficar();//llamada al metodo graficar de la clase hija triangulo
   obj3.Area();//llamada al metodo area de la clase hija circulo
   obj3.Graficar();//llamada al metodo graficar de la clase hija circulo
        System.out.println("Finalizando...."); //Impresion de un mensaje del destructor
    }
}
class base{//clase PADRE llamada base
    double alto, ancho, radio, lado; //Creacion de variables en la clase padre
    Scanner entrada = new Scanner(System.in); //Instancia de la clase Scanner llamada entrada
}
class cuadrado extends base{//clase HIJA llamada cuadrado que hereda tributos de la clase PADRE llamada base
    public void Area(){//Metodo llamado area que tiene la clase Hija Cuadrado
        double mul;//variable de tipo double llamada mul
        System.out.println("Ingresa uno de los lados del cuadrado: "); //Impresion de un mensaje pidiendo datos al usuario
        lado = entrada.nextDouble();//asignando la respuesta del usuario
        mul = (lado*lado);//Operaciones
        System.out.println("El area del cuadrado es de: "+lado*lado);//Impresion de un mensaje dando el resultado
    }
    public void Graficar(){//Metodo para graficar un cuadrado
    int ladoo = 5;// variable de tipo entero llamado ladoo
    
    for(int i=0; i<ladoo; i++){//Estructura repetitiva for para crear un cuadrado
        for(int j=0; j<ladoo; j++){//Estructura repetitiva for para crear un cuadrado
            if(i == 0||i == ladoo-1||j==0||j==ladoo-1){//si esta en la primera o ultima fila o columna
                System.out.print("*");//imprime asterisco
                
            }else{
                System.out.print(" ");//imprime espacio en blanco
            }
        }System.out.println();//salto de linea para empezar una nueva linea
    }
}
}
class triangulo extends base{ //Clase llamada Triangulo que hereda de la clase padre llamada "Base"
    public void Area(){ // Metodo llamado Area
        double multi;// Creacion de una variable tipo Double llamada "multi"
        System.out.println("Ingresa el alto del triangulo: "); // Mensaje del sistema
        alto = entrada.nextDouble();// Asignacion de valor introducido por el usuario a la variable llamada "alto"
        System.out.println("Ingresa el ancho del triangulo: "); //Mensaje del sistema
        ancho = entrada.nextDouble();//Asignacion de valor introducido por el usuario a la variable llamada "Ancho"
        multi = (alto*ancho)/2; // Operacion para calcular el area del triangulo
        System.out.println("El area del triangulo es de: "+multi); //Mensaje del sistema con el resultado de la operacion
    }
    public void Graficar(){ //Metodo llamado Graficar de la clase Triangulo
        int altura = 5;// variable que define la altura del triangulo
        
        for(int i=0; i<altura; i++){ //Estructura repetitiva para graficar el triangulo
            for(int j=0; j<=i; j++){ //Estructura repetitiva anidada para graficar el triangulo
                System.out.print("*"); //Caracter que ilustra el area del triangulo
            }System.out.println(); //Salto de linea para crear otra linea del area del triangulo 
        }
    }
}
class circulo extends base{//Clase llamada Circulo que hereda atributos de la clase padre llamada "Base"
    public void Area(){ //Metodo llamado area para calcular el area del circulo
        double mult; //Variable llamada Mult de tipo double
        System.out.println("Dame el radio del circulo: "); //Se le pide el radio del circulo al usuario
        radio = entrada.nextInt(); // Se le asigna ese valor a la variable radio
        mult = 3.1416*(radio*radio);//Operacion con el radio del circulo para calcular el area
        System.out.println("El area del circulo es de: "+mult); //Mostramos el area del circulo al usuario
    }
    public void Graficar(){//Metodo llamado "graficar" para ilustrar el area del circulo
        int rad=5;//radio del circulo
        int centro=rad;//centro del circulo
        
        for(int y=0; y<=2*rad; y++){//Estructura repetitiva para graficar el circulo
            for(int x=0; x<=2*rad; x++){//Estructura repetitiva anidada para graficar el circulo
                double distancia=Math.sqrt((x-centro)*(x-centro)+(y-centro)*(y-centro)); //calcula la distancia desde el punto actual al centro
                if(distancia>rad-0.5 && distancia<rad+0.5){//si la distancia esta dentro del radio del circulo
                    System.out.print("*");//Insercion de un asterisco para ilustrar el area del circulo
                }else{ 
                    System.out.print(" ");//Insercion de salto de linea para continuar graficando el resto del circulo
                }
            }System.out.println();// Insercion de linea vacia
        }
    }
}
