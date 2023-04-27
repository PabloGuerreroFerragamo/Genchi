
package SegundaEntrega;

import java.util.Scanner;

class Ejercicio {
    static int suma(int n1, int n2){ //Variable enteros
        int resultado;
        resultado=(n1+n2);
        return resultado;
    }
    static float suma(float f1, float f2){ //Variables flotantes
    float respuesta;
        respuesta=(f1+f2);
return respuesta;    
    }
}

public class Programa10 {
      public static void main(String[] args) {
    int x=0,d1,d2; //variables miembro
    float e1,e2; //variables miembro
    Ejercicio llamar = new Ejercicio();
    Scanner LeerFloat= new Scanner(System.in);
    Scanner LeerInt= new Scanner(System.in);
    Scanner LeerString= new Scanner(System.in);
    while(x!=3){
        System.out.println("Eliga una opcion: ");
        System.out.println("1 Suma de 2 enteros     2- Suma dos flotantes   3-Salir");
    x=LeerInt.nextInt();
    if(x==1){
        System.out.println("Dame el valor del primer numero:");
        d1=LeerInt.nextInt();
        System.out.println("Dame el valor del segundo numero:");
        d2=LeerInt.nextInt();
        System.out.println(llamar.suma(d1,d2));
    }
        if(x==2){
        System.out.println("Dame el valor del primer numero:");
        e1=LeerFloat.nextFloat();
        System.out.println("Dame el valor del segundo numero:");
        e2=LeerFloat.nextFloat();
        System.out.println(llamar.suma(e1,e2));

    }
    }
        System.out.println("Adios");
}
}
