package SegundaEntrega;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Productos {

    Productos(int FechaDeCaducidad1, int NumeroDeLote1) {
        FechaDeCaducidad = FechaDeCaducidad1;
        NumeroDeLote = NumeroDeLote1;
    }
    int FechaDeCaducidad;
    int NumeroDeLote;
    Scanner leer = new Scanner(System.in);
    Scanner leerint = new Scanner(System.in);

}

class Frescos extends Productos {

    Frescos(int FechaDeCaducidad, int NumeroDeLote) {
        super(FechaDeCaducidad, NumeroDeLote);
    }

    String envasado;
    String paisDeOrigen;
    void modificar() {
        int responder = 0;
        System.out.println("Que deseas modificar?");
        System.out.println("Presiona 1 para modificar numero de lote");
        System.out.println("Presiona 2 para modificar fecha de caducidad");
        System.out.println("Presiona 3 para modificar fecha de evansado");
        System.out.println("Presiona 4 para modificar pais de origen");
        System.out.println("Presiona 5 para modificar todo");
        responder = leerint.nextInt();
        if (responder == 1) {
            System.out.println("Dame numero de lote:");
            NumeroDeLote = leerint.nextInt();
        }
        if (responder == 2) {
            System.out.println("Dame fecha de caducidad:");
            FechaDeCaducidad = leerint.nextInt();
        }
        if (responder == 3) {
            System.out.println("Dame la Fecha de Envasado:");
        envasado = leer.nextLine();
        }
        if (responder == 4) {
            System.out.println("Dame el pais de origen:");
        paisDeOrigen = leerint.nextLine();
        }
        if (responder == 5) {
                   System.out.println("Dame la Fecha de Caducidad:");
        FechaDeCaducidad = leerint.nextInt();
        System.out.println("Dame el Numero de Lote:");
        NumeroDeLote = leerint.nextInt();
        System.out.println("Dame la Fecha de Envasado:");
        envasado = leerint.nextLine();
        System.out.println("Dame el pais de origen:");
        paisDeOrigen = leerint.nextLine();
        }
    }

    
    void get() {
        System.out.println("Dame la Fecha de Caducidad:");
        FechaDeCaducidad = leerint.nextInt();
        System.out.println("Dame el Numero de Lote:");
        NumeroDeLote = leerint.nextInt();
        System.out.println("Dame la Fecha de Envasado:");
        envasado = leerint.nextLine();
        System.out.println("Dame el pais de origen:");
        paisDeOrigen = leerint.nextLine();
    }

    void set() {
        System.out.println("La fecha de caducidad es: " + FechaDeCaducidad + " , el numero de lote es: " + NumeroDeLote + ", Con fecha de envasado de: " + envasado + " , y su pais de origen es: " + paisDeOrigen);
    }

    void setEnvasado(String envasado1) {
        envasado = envasado1;

    }

    String getEnvasado() {

        return envasado;
    }

    void setPaisDeOrigen(String paisDeOrigen1) {
        paisDeOrigen = paisDeOrigen1;

    }

    String getPaisDeOrigen() {
        return paisDeOrigen;
    }

}

class Refrigerados extends Productos {

    Refrigerados(int FechaDeCaducidad, int NumeroDeLote) {
        super(FechaDeCaducidad, NumeroDeLote);
    }
    int codigoDelOrganismoDeSupervisionAlimentaria;

        void modificar() {
        int responder = 0;
        System.out.println("Que deseas modificar?");
        System.out.println("Presiona 1 para modificar numero de lote");
        System.out.println("Presiona 2 para modificar fecha de caducidad");
        System.out.println("Presiona 3 para modificar codigo");
        System.out.println("Presiona 4 para modificar todo");
        responder = leerint.nextInt();
        if (responder == 1) {
            System.out.println("Dame numero de lote:");
            NumeroDeLote = leerint.nextInt();
        }
        if (responder == 2) {
            System.out.println("Dame fecha de caducidad:");
            FechaDeCaducidad = leerint.nextInt();
        }
        if (responder == 3) {
            System.out.println("Dame el codigo:");
        codigoDelOrganismoDeSupervisionAlimentaria = leerint.nextInt();
        }
        if (responder == 4) {
           System.out.println("Dame la Fecha de Caducidad:");
        FechaDeCaducidad = leerint.nextInt();
        System.out.println("Dame el Numero de Lote:");
        NumeroDeLote = leerint.nextInt();
        System.out.println("Dame el codigo:");
        codigoDelOrganismoDeSupervisionAlimentaria = leerint.nextInt();
        }
    }

    
    void get() {
        System.out.println("Dame la Fecha de Caducidad:");
        FechaDeCaducidad = leerint.nextInt();
        System.out.println("Dame el Numero de Lote:");
        NumeroDeLote = leerint.nextInt();
        System.out.println("Dame el codigo:");
        codigoDelOrganismoDeSupervisionAlimentaria = leerint.nextInt();

    }

    void set() {
        System.out.println("La fecha de caducidad es: " + FechaDeCaducidad + " , el numero de lote es: " + NumeroDeLote + ", y con codigo: " + codigoDelOrganismoDeSupervisionAlimentaria);
    }

    void setCodigo(int codigo1) {
        codigoDelOrganismoDeSupervisionAlimentaria = codigo1;

    }

    int getCodigo() {

        return codigoDelOrganismoDeSupervisionAlimentaria;
    }

}

class Congelados extends Productos {

    Congelados(int FechaDeCaducidad, int NumeroDeLote) {
        super(FechaDeCaducidad, NumeroDeLote);
    }
    int temeperaturaRecomendada;

    void modificar() {
        int responder = 0;
        System.out.println("Que deseas modificar?");
        System.out.println("Presiona 1 para modificar numero de lote");
        System.out.println("Presiona 2 para modificar fecha de caducidad");
        System.out.println("Presiona 3 para modificar temperatura");
        System.out.println("Presiona 4 para modificar todo");
        responder = leerint.nextInt();
        if (responder == 1) {
            System.out.println("Dame numero de lote:");
            NumeroDeLote = leerint.nextInt();
        }
        if (responder == 2) {
            System.out.println("Dame fecha de caducidad:");
            FechaDeCaducidad = leerint.nextInt();
        }
        if (responder == 3) {
               System.out.println("Dame temperatura:");
        temeperaturaRecomendada = leerint.nextInt();
        }
        if (responder == 4) {
           System.out.println("Dame la Fecha de Caducidad:");
        FechaDeCaducidad = leerint.nextInt();
        System.out.println("Dame el Numero de Lote:");
        NumeroDeLote = leerint.nextInt();
        System.out.println("Dame temperatura:");
        temeperaturaRecomendada = leerint.nextInt();
        }
    }

    
    void get() {
        System.out.println("Dame la Fecha de Caducidad:");
        FechaDeCaducidad = leerint.nextInt();
        System.out.println("Dame el Numero de Lote:");
        NumeroDeLote = leerint.nextInt();
        System.out.println("Dame temperatura:");
        temeperaturaRecomendada = leerint.nextInt();

    }

    void set() {
        System.out.println("La fecha de caducidad es: " + FechaDeCaducidad + " , el numero de lote es: " + NumeroDeLote + ", y con temperatura: " + temeperaturaRecomendada);
    }

    void setTemperatura(int temperatura1) {
        temeperaturaRecomendada = temperatura1;

    }

    int getTemperatura() {

        return temeperaturaRecomendada;
    }
}

class testHerencia2 {

    public static void main(String[] args) {
        int contador = 0, productos = 0, productosgeneral = 0, productos3 = 0, productos4=0;
        int andyYaNoMeRasguñes = 0;
        int respuesta = 0;
        int responder = 0;
        Frescos frescos1 = new Frescos(0, 0);
        Refrigerados refrigerados1 = new Refrigerados(0, 0);
        Congelados congelados1 = new Congelados(0, 0);
        
        while (productosgeneral < 1) {
            System.out.println("---Menu---");
            System.out.println("Presiona 1 para agregar");
            System.out.println("Presiona 2 mostar");
            System.out.println("Presiona 3 para modificar");
            System.out.println("Presiona 4 para regresar al menu principal");
            respuesta = frescos1.leerint.nextInt();
            if (respuesta == 1) {
                while (productos < 1) {
                    System.out.println("Presiona 1 para agregar Producto Fresco");
                    System.out.println("Presiona 2 para agregar Producto Refrigerado");
                    System.out.println("Presiona 3 para agregar Producto Congelado");
                    System.out.println("Presiona 4 para salir");
                    responder = frescos1.leerint.nextInt();
                    if (responder == 1) {
                        frescos1.get();
                        productos++;
                    }
                    if (responder == 2) {
                        refrigerados1.get();
                        productos++;
                    }
                    if (responder == 3) {
                        congelados1.get();
                        productos++;
                    }
                    if (responder == 4) {
                        productos++;
                    }
                }
               productos--;

            }
            if (respuesta == 2) {
                while (productos3 < 1) {
                    System.out.println("Presiona 1 para mostrar Producto Fresco");
                    System.out.println("Presiona 2 para mostrar Producto Refrigerado");
                    System.out.println("Presiona 3 para mostrar Producto Congelado");
                    System.out.println("Presiona 4 para salir");
                    responder = frescos1.leerint.nextInt();
                    if (responder == 1) {
                        frescos1.set();
                         productos3++;
                    }
                    if (responder == 2) {
                        refrigerados1.set();
                         productos3++;
                    }
                    if (responder == 3) {
                        congelados1.set();
                         productos3++;
                    }
                    if (responder == 4) {
                        productos3++;
                    }
                }
             productos3--;
                

            }
             
  if (respuesta == 3) {
                while (productos4 < 1) {
                    System.out.println("Presiona 1 para modificar Producto Fresco");
                    System.out.println("Presiona 2 para modificar Producto Refrigerado");
                    System.out.println("Presiona 3 para modificar Producto Congelado");
                    System.out.println("Presiona 4 para salir");
                    responder = frescos1.leerint.nextInt();
                    if (responder == 1) {
                        frescos1.modificar();
                        productos4++;
                    }
                    if (responder == 2) {
                        refrigerados1.modificar();
                         productos4++;
                    }
                    if (responder == 3) {
                        congelados1.modificar();
                         productos4++;
                    }
                    if (responder == 4) {
                        productos4++;
                    }
                }
productos4--;

            }
             
        }
    }
}
