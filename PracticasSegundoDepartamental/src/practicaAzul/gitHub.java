
package practicaAzul;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pablo
 */

    class gitHub { // Clase padre
    Scanner lector = new Scanner(System.in); // Se crea objeto Scanner para leer datos desde el teclado
    int code, año; // Se declaran variables para el código del libro y el año de publicación
    String title; // Se declara variable para el título del libro
    
    // Constructor de la clase bibliotec
    gitHub(int code1, String title1, int año1){
        code = code1;
        title = title1;
        año = año1;
    }
    
    // Métodos para obtener el código, título y año del libro
    int getCode() {
        return code;
    }
    
    String getTitle() {
        return title;
    }
    
    int getAño() {
        return año;
    }
}

class libritos extends gitHub { // Clase hija que hereda de bibliotec
    String presta; // Se declara variable para saber si el libro está prestado o no
    
    // Constructor de la clase libritos
    libritos(int code, String title, int año, String presta1) {
        super(code, title, año); // Llamada al constructor de la clase padre
        presta = presta1;
    }
    
    // Métodos para establecer y obtener el estado del préstamo
    void setPresta(String presta1) {
        presta = presta1;
    }
    
    String getPresta() {
        return presta;
    }
    
    // Método para prestar un libro
    String prestar() {
        if (presta == "No") { // Si el libro no está prestado, se puede prestar
            System.out.println("Se te ha prestado el libro.");
        } else { // Si el libro ya está prestado, no se puede prestar de nuevo
            System.out.println("No podemos prestarte el libro.");
        }
        return "Si"; // Retorna el valor "Si"
    }
    
    // Método para devolver un libro
    String devolver() {
        if (presta == "Si") { // Si el libro está prestado, se puede devolver
            System.out.println("El libro se ha devuelto");
        } else { // Si el libro no está prestado, no se puede devolver
            System.out.println("Este libro no esta prestado");
        }
        return "No"; // Retorna el valor "No"
    }
    
    // Método para verificar si el libro está prestado
    String prestado() {
        if (presta == "No") { // Si el libro no está prestado, se puede pedir
            return ("Puedes pedir este libro.");
        } else { // Si el libro está prestado, no se puede pedir
            return ("Este libro ya esta prestado.");
        } 
    }
}

class revistitas extends gitHub { // Clase hija que hereda de bibliotec
    int numid; // Se declara variable para el número de identificación de la revista
    
    // Constructor de la clase revistitas
    revistitas(int code, String title, int año, int numid1) {
        super(code, title, año); // Llamada al constructor de la clase padre
        numid = numid1;
    }
    
    // Métodos para establecer y obtener el número de identificación de la revista
    void setNumid(int numid1){
        numid=numid1;
    }
    int getNumid(){
        return numid;
    }
}

class EjercicioHBiblioteca {
    public static void main(String []args){
        // Declaración de variables
        int libs=0; // número de libros
        int revs=0; // número de revistas
        libritos libo[] = new libritos[0]; // arreglo de libros
        revistitas revis[] = new revistitas[0]; // arreglo de revistas
        int cod,añ; // variables para el código y año del material
        String tit; // variable para el título del material
        Scanner swi = new Scanner(System.in); // objeto para leer la entrada del usuario
        int opc,opc1,opclib,leng; // variables para opciones del menú
        
        // Menú principal de la biblioteca
        do{
            System.out.println("---------------MENU--------------");
            System.out.println("Ingrese una opcion");
            System.out.println("1.Libros"
                    + "\n2.Revistas"
                    + "\n3.Salir");
            System.out.print("--->");opc=swi.nextInt();
            switch(opc){
                // Menú para libros
                case 1:
                    do{
                        System.out.println("---------------LIBRO----------------");
                        System.out.println("Ingrese una opcion:");
                        System.out.println("1.Agregar libro"
                                + "\n2.Consultar libros"
                                + "\n3.Pedir libro"
                                + "\n4.Devolver un libro"
                                + "\n5.Volver");
                        System.out.print("--->");opc1=swi.nextInt();
                        switch(opc1){
                            // Opción para agregar un libro
                            case 1:
                                libs++; // aumenta el número de libros
                                System.out.println("-------------AGREGAR LIBRO----------");
                                System.out.println("Ingrese el titulo:");
                                tit=swi.next();
                                System.out.println("Ingrese el año:");
                                añ=swi.nextInt();
                                System.out.println("Ingrese el codigo:");
                                cod=swi.nextInt();
                                libritos libo2[]; // arreglo auxiliar para copiar los datos del arreglo original
                                libo2=Arrays.copyOf(libo,libo.length);
                                libo= new libritos[libs]; // arreglo original con una posición más
                                // Copia los datos del arreglo auxiliar al arreglo original
                                for (int i = 0; i < libo.length-1; i++) {
                                    libo[i] = libo2[i];          
                                }
                                // Agrega el nuevo libro al arreglo original
                                libo[libs-1] = new libritos(cod,tit,añ,"No"); 
                                System.out.println("Registro guardado...");
                                break;
                            // Opción para consultar libros
                            case 2:
                                for (int i = 0; i < libo.length; i++) {
                                    int sum=i+1;
                                    System.out.println("---------------"+"Libro"+sum+"-----------------------");
                                    System.out.println("Titulo: "+libo[i].getTitle());
                                    System.out.println("Año: "+libo[i].getAño());
                                    System.out.println("Codigo: "+libo[i].getCode());
                                    System.out.println("Esta prestado: "+libo[i].getPresta());
                                    System.out.println("Estado: "+libo[i].prestado());
                                    System.out.println("-----------------------------------------");
                                }
                                break;
                            // Opción para pedir un libro prestado
                            case 3:
                            do{
                            System.out.println("--------------PRESTAMO------------");
                            System.out.println("Seleccione el libro que desee:");
                            for (int i = 0; i < libo.length; i++) {
                            System.out.println((i+1)+"."+libo[i].getTitle());  //Imprime eibros existentes      
                         }
                            opclib=swi.nextInt()-1;
                            leng=libo.length;
                            if(opclib<leng){//if que valida que el usuario no ingrese un numero que no sea opcion
                            libo[opclib].setPresta(libo[opclib].prestar());
                            }else{
                                System.out.println("Opcion no valida");
                            }
                            }while(opclib>=leng);
                            
                            break;
                            //Opcion para devolver un libro
                        case 4:
                            do{
                            System.out.println("-----------------DEVOLVER--------------");
                            System.out.println("Seleccione el libro que va a devolver.");
                            for (int i = 0; i < libo.length; i++) {
                            System.out.println((i+1)+"."+libo[i].getTitle()); //Imprime eibros existentes        
                        }
                            opclib=swi.nextInt()-1;
                            leng=libo.length;
                            if(opclib<leng){//if que valida que el usuario no ingrese un numero que no sea opcion
                            libo[opclib].setPresta(libo[opclib].devolver());
                            }else{
                                System.out.println("Opcion no valida");
                            }
                            }while(opclib>=leng);
                            break;
                        case 5:
                            break;
                        default:
                            System.out.println("OPCION NO VALIDA");
                            break;
                    }
                }while(opc1!=5);// Repetir el ciclo hasta que el usuario seleccione la opción "Salir"
                break;
            case 2:
                do{
                    System.out.println("-------------REVISTAS-------------");
                    System.out.println("seleccione una opcion:");
                    System.out.println("1.Agregar revista"
                            + "\n2.Consultar revistas"
                            + "\n3.Volver");
                    opc1=swi.nextInt();
                    switch(opc1){
                        case 1:
                            revs++;// aumenta el número de revistas
                            System.out.println("-------------AGREGAR REVISTA----------");
                            System.out.println("Ingrese el titulo:");
                            tit=swi.next();
                            System.out.println("Ingrese el año:");
                            añ=swi.nextInt();
                            System.out.println("Ingrese el codigo:");
                            cod=swi.nextInt();
                            revistitas revis2[];// arreglo auxiliar para copiar los datos del arreglo original
                            revis2=Arrays.copyOf(revis,revis.length);
                            revis = new revistitas[revs];// arreglo original con una posición más
                            // Copia los datos del arreglo auxiliar al arreglo original
                            for (int i = 0; i < revis.length-1; i++) {
                            revis[i] = revis2[i]; //Guarda los datos         
                           }
                            // Agrega el nuevo libro al arreglo original
                            revis[revs-1] = new revistitas(cod,tit,añ,revs); //
                            System.out.println("Registro guardado...");
                            break;
                        case 2:
                            for (int i = 0; i < revis.length; i++) {//Imprime revistas existentes    
                                int sum=i+1;
                                System.out.println("---------------"+"Revista"+sum+"-----------------------");
                                System.out.println("Titulo: "+revis[i].getTitle());
                                System.out.println("Año: "+revis[i].getAño());
                                System.out.println("Codigo: "+revis[i].getCode());
                                System.out.println("Numero: "+revis[i].getNumid());
                                
                        }
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("OPCION NO VALIDA");
                            break;
                    }
                }while(opc1!=3);// Repetir el ciclo hasta que el usuario seleccione la opción "Salir"
                break;
            case 3:
                System.exit(0);//Sale del sistema
                break;
            default:
                System.out.println("OPCION NO VALIDA");
                break;
        }
        }while(opc!=3);// Repetir el ciclo hasta que el usuario seleccione la opción "Salir"
    }
}


