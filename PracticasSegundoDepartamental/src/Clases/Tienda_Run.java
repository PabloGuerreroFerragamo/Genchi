
package Clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;
import javax.xml.validation.Validator;

class Producto {
    int precio,cantidad;
    String marcaDeProducto,fechaDeCaducidad,contenidoNeto,tipo;
}

public class Tienda_Run{
    
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        MenuPrincipal();
    }
    
        static boolean Validar(String RespUsuarioValidar){
            boolean esnumerico;
            esnumerico=RespUsuarioValidar != null && RespUsuarioValidar.matches("[0-9]+");
                if(esnumerico==false){
                    System.out.println("Introduce una opcion valida y correcta: ");
                }
                else{
                }
        return esnumerico;
    }
        
        static void MenuPrincipal() throws IOException{
    String respuestaUsuario="";
        boolean x=false;
        System.out.println("Bienvenido a la abarroteria de Don Leopoldo, por favor, Selecciona una opcion tecleando el numero correspondiente:");
        System.out.println("1.-Soy dueno de la abarroteria 2.-Comprar productos         3.-Salir del sistema");

        while(x==false){
        respuestaUsuario=leer.nextLine();
        if(Validar(respuestaUsuario)==true){
            x=true;
        }
        }
        while(Integer.parseInt(respuestaUsuario)!=3){
        if(Integer.parseInt(respuestaUsuario)==1){
            MenuDueno();
        }
        if(Integer.parseInt(respuestaUsuario)==2){
            MenuCliente();
        }
        }
            System.out.println("Hasta Luego...");
            System.exit(0);
}
        
        
        
        static void MenuDueno() throws IOException{
            String RespuestaMenuDueno="";
            boolean x=false;
            System.out.println("Bienvenido Gomez, Que desea hacer con en su tienda?");
            System.out.println("1.-Anadir productos 2.-Eliminar productos       3.-Retroceder al menu principal   4.-Salir del sistema");
            while(x==false){
                RespuestaMenuDueno=leer.nextLine();
                if(Validar(RespuestaMenuDueno)==true){
            x=true;
        }
        }
         while(Integer.parseInt(RespuestaMenuDueno)!=4){
                if(Integer.parseInt(RespuestaMenuDueno)==1){
                    AnadirProductos();
                }
                if(Integer.parseInt(RespuestaMenuDueno)==2){
                    EliminarProductos();
                }
                if(Integer.parseInt(RespuestaMenuDueno)==3){
                    MenuPrincipal();
                }
            }
            System.out.println("Hasta Luego...");
            System.exit(0);
        }
        static void MenuCliente() throws IOException{
            String RespuestaMenuCliente="";
            boolean x=false;
            System.out.println("Bienvenido, Que desea comprar?");
            System.out.println("1.-Refrigerados 2.-No refrigerados 3.-Vinos y Licores          4.-Regresar al menu Principal");
            while(x==false){
                RespuestaMenuCliente=leer.nextLine();
                if(Validar(RespuestaMenuCliente)==true){
            x=true;
        }
        }
        while(Integer.parseInt(RespuestaMenuCliente)!=4){
                if(Integer.parseInt(RespuestaMenuCliente)==1){
                    ComprarRefrigerados();
                }
                if(Integer.parseInt(RespuestaMenuCliente)==2){
                    
                }
                if(Integer.parseInt(RespuestaMenuCliente)==3){
                    
                }
            }
        MenuPrincipal();
        }
        
        static void AnadirProductos(){
            String RespuestaMenuDuenoAnadirProductos="";
            boolean x=false;
            System.out.println("Que productos desea agregar?");
            System.out.println("1.-Refrigerados 2.-No refrigerados 3.-Vinos y Licores");
            while(x==false){
                RespuestaMenuDuenoAnadirProductos=leer.nextLine();
                if(Validar(RespuestaMenuDuenoAnadirProductos)==true){
            x=true;
        }
        }
            
        }
        
        static void EliminarProductos(){
            String RespuestaMenuDuenoEliminarProductos="";
            boolean x=false;
            System.out.println("Que productos desea eliminar?");
            System.out.println("1.-Refrigerados 2.-No refrigerados 3.-Vinos y Licores");
            while(x==false){
                RespuestaMenuDuenoEliminarProductos=leer.nextLine();
                if(Validar(RespuestaMenuDuenoEliminarProductos)==true){
            x=true;
        }
        }
            
        }
        static void ComprarRefrigerados() throws IOException{
            String Seleccion="";
            File archivo =new File ("C:\\Users\\Rec17\\Desktop\\Refrigerados.txt");
            //FileWriter crear =new FileWriter (archivo,true);
            BufferedReader br=new BufferedReader(new FileReader(archivo));
                String st;
                Vector <String> v=new Vector(40);
                for(int i=0;(st=br.readLine())!=null;i++){
                    v.addElement(st);
                }
                String[] Arreglo= v.toArray(new String[v.size()]);
                System.out.println("Estos son los productos refrigerados en Existencia: ");
                for(int x=0;Arreglo.length>x;x++){
                    System.out.println(x+".-"+Arreglo[x]);
                }
            System.out.println("Seleccione sus productos tecleando el numero (Para terminar pulse y envie la tecla 'T')");
            while(!(Seleccion.equalsIgnoreCase("T"))){
            Seleccion=leer.nextLine();
                System.out.println("Producto Anadido, Para terminar envie la tecla 'T', en caso contrario, siga eligiendo: ");
            }
            System.out.println("Productos anadidos al carrito");
            MenuCliente();
}
        
}
