
package SegundaEntrega;

import java.util.Scanner;

class Ejercicionuevo {
    static int perimetro(int lado){ //Variable rectangulo
        lado=(lado+lado+lado+lado);
        return lado;
    }
    static double perimetro(double radio){ //Variable circulo
    radio=((2*3.1416)*radio);
return radio;    
    }
    static int perimetro(int L1, int L2,int L3){ //Variable triangulo
        int resultado;
        resultado=(L1+L2+L3);
        return resultado;
    }
}
public class Programa7{ 
    public static void main(String[] args) {
    int x=0,lado1, lado2, lado3, altura, lado; //Variables miembro
    double radio;
    Ejercicionuevo llamar = new Ejercicionuevo();
    Scanner LeerDouble= new Scanner(System.in);
    Scanner LeerInt= new Scanner(System.in);
    Scanner LeerString= new Scanner(System.in);
    while(x!=4){
        System.out.println("Eliga una opcion: ");
        System.out.println("1 Calcular perímetro de circulo     2- Calcular perimetro del rectangulo   3-Calcular perimetro de triangulo   4-Salir");
    x=LeerInt.nextInt();
    if(x==1){
        System.out.println("Dame el radio del circulo:");
        radio=LeerDouble.nextDouble();
        System.out.println(llamar.perimetro(radio));
    }
        if(x==2){
        System.out.println("Dame el valor del lado:");
        lado=LeerInt.nextInt();
        System.out.println(llamar.perimetro(lado));

    }
     if(x==3){
        System.out.println("Dame el valor del lado 1 del triangulo:");
        lado1=LeerInt.nextInt();
        System.out.println("Dame el valor del lado 2 del triangulo:");
        lado2=LeerInt.nextInt();
        System.out.println("Dame el valor del lado 3 del triangulo:");
        lado3=LeerInt.nextInt();
        System.out.println(llamar.perimetro(lado1, lado2, lado3));

    }
    }
        System.out.println("Hasta luego");
}
}

