
package SegundaEntrega;

import java.util.Scanner;

public class Programa02 {
    public static void main(String[] args) {
        circulo llamada=new circulo(); //Constructor circulo
        llamada.Capturar();
        llamada.Perimetro();
        
        triangulo llamar=new triangulo(); //Constructor triangulo
        llamar.Capturar();
        llamar.Perimetro();
        
        rectangulo llamad=new rectangulo(); //Constructor rectangulo
        llamad.Capturar();
        llamad.Perimetro();
        
    }
}

class base{ //clase padre base
    int alto,ancho, radio; //Variables miembro
    Scanner leer=new Scanner(System.in);
    Scanner lectura=new Scanner(System.in);
}

class circulo extends base{ //clase hijo circulo
    int radio; //variable heredada
    public void Perimetro(){ //Función miembro
        System.out.println("El perimetro del círculo es: " + ((radio*2)*3.1416));
        System.out.println("");
    }
    public void Capturar(){ //método para que el usuario ingrese datos
        System.out.println("Inserta el radio del circulo: ");
        radio=leer.nextInt();
        System.out.println("");
    }
}

class triangulo extends base{ //clase hijo triangulo
    int ancho; //variable heredada
    public void Perimetro(){ //Función miembro
        System.out.println("El perimetro del triangulo es: "+ (ancho+ancho+ancho));
        System.out.println("");
    }
    public void Capturar(){ //método para que el usuario ingrese datos
        System.out.println("Inserta el ancho del triangulo: ");
        ancho=leer.nextInt();
        System.out.println("");
    }
}

class rectangulo extends base{ //clase hijo rectangulo
    int ancho, alto; //variables heredadas
    public void Perimetro(){ //Función miembro
        System.out.println("El perimetro del rectangulo es: "+ (ancho+alto+ancho+alto));
        System.out.println("");
    }
    public void Capturar(){ //método para que el usuario ingrese datos
        System.out.println("Inserta el ancho del rectangulo: ");
        ancho=leer.nextInt();
         System.out.println("Inserta el alto del rectangulo: ");
        alto=leer.nextInt();
        System.out.println("");
    }
}
 