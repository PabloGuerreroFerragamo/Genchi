
package SegundaEntrega;

import java.util.Scanner;

class ProgramaNueve {
      static int volumen(int lado){ //Variable cubo
        lado=(lado*lado*lado);
        return lado;
    }
    static double volumen(double L1,double L2,double altura){ //Variable piramide
    double resultado;
        resultado=((L1/3)*L2*altura);
return resultado;    
    }
}
public class Programa9{
    public static void main(String[] args) {
    int x=0,lado; //variables miembro
    double lado1,lado2,altura;
    ProgramaNueve llamar = new ProgramaNueve();
    Scanner LeerDouble= new Scanner(System.in);
    Scanner LeerInt= new Scanner(System.in);
    Scanner LeerString= new Scanner(System.in);
    while(x!=3){
        System.out.println("Eliga una opcion: ");
        System.out.println("1 Calcular el volumen de la piramide     2- Calcular el volumen del cubo   3-Salir");
    x=LeerInt.nextInt();
    if(x==1){
        System.out.println("Dame el valor del lado:");
        lado=LeerInt.nextInt();
        System.out.println(llamar.volumen(lado));
    }
        if(x==2){
        System.out.println("Dame el valor del lado 1:");
        lado1=LeerDouble.nextDouble();
        System.out.println("Dame el valor del lado 2:");
        lado2=LeerDouble.nextDouble();
        System.out.println("Dame el valor de la altura:");
        altura=LeerDouble.nextDouble();
        System.out.println(llamar.volumen(lado1,lado2,altura));

    }
    }
        System.out.println("Adios");
}
}
