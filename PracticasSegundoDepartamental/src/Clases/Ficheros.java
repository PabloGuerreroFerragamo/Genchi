package Clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Ficheros {

    //Guardar en un archivo txt
    public void guardarArchivo() {
        Articulos articulo = new Articulos("", "");

        try {

            FileWriter fw = new FileWriter("consulta.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(articulo.getId());
            pw.print("," + articulo.getNombre());
            pw.print("," + articulo.getCantidadMaxima());
            pw.print("," + articulo.getCantidadMinima());
            pw.println("," + articulo.getStock());

            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
