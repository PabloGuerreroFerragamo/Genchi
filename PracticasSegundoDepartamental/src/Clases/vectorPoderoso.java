package Clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Vector;

public class vectorPoderoso {

    public void imprimeCososDeUnTxt() {
        File archivo = new File("C:\\guardar\\ppollokfc.txt");
        try {

            FileWriter crear = new FileWriter(archivo, true);
            BufferedReader brCablon = new BufferedReader(new FileReader(archivo));
            PrintWriter escribir = new PrintWriter(crear);
            String st;
            Vector<String> v = new Vector(40);
            for (int i = 0; (st = brCablon.readLine()) != null; i++) {
                v.addElement(st);

            }
            String[] Arreglo = v.toArray(new String[v.size()]);
            
            for (int x = 0; Arreglo.length > x; x++) {
                System.out.println(Arreglo[x]);//la x es la posicion vertical del txt

            }
        } catch (IOException e) {
        }

    }

    public static void main(String[] args) {
        vectorPoderoso llamar = new vectorPoderoso();
        llamar.imprimeCososDeUnTxt();
    }
}
