package modelo;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class OperacionesTexto {

    File texto;
    FileWriter escribir;//Para escribir en el archivo
    PrintWriter linea;//Para escribir en el archivo
    String pathSelected;

    public String guardar(String text, String titulo) {
        String retorno = "";

        texto = new File("C:\\Users\\vicjo\\Documents\\NetBeansProjects\\VicText\\DocumentosDeTexto/" + titulo.trim() + ".txt");//Preparando el archivo
        if (!texto.exists()) {
            try {
                texto.createNewFile();
                escribir = new FileWriter(texto, true);
                BufferedWriter intermediario = new BufferedWriter(escribir);
                linea = new PrintWriter(intermediario);

                //Escribimos en el archivo
                linea.print(text);
                linea.close();
                escribir.close();
                return retorno = "Texto guardado";
            } catch (IOException ex) {
                Logger.getLogger(OperacionesTexto.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                escribir = new FileWriter(texto, true);
                BufferedWriter intermediario = new BufferedWriter(escribir);
                linea = new PrintWriter(intermediario);

                //Escribimos en el archivo
                linea.print(text);
                linea.close();
                escribir.close();
                return retorno = "Texto guardado";
            } catch (IOException ex) {
                Logger.getLogger(OperacionesTexto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return retorno;
    }

    public String abrir() {
        String strgRetorno = "";
        JFileChooser fc = new JFileChooser();
        //fc.setCurrentDirectory(new File("C:\\Users\\vicjo\\Documents\\NetBeansProjects\\VicText\\DocumentosDeTexto"));
        int selec = fc.showOpenDialog(fc);

        try {
            if (selec == fc.APPROVE_OPTION) {
                File stf = fc.getSelectedFile();

                //SOLO VEO SI SIRVE SACAR LA RUTA
                pathSelected = stf.getAbsolutePath();

                BufferedReader bf = new BufferedReader(new FileReader(stf.getAbsolutePath()));
                String cadenaAyuda;
                String cadenaPasarAFinal = "";
                while ((cadenaAyuda = bf.readLine()) != null) {
                    cadenaPasarAFinal += cadenaAyuda + "\n";
                }
                strgRetorno = cadenaPasarAFinal;
            }
        } catch (Exception e) {

        }
        System.out.println("Path selected: " + pathSelected);
        return strgRetorno;
    }

    public void sobreEscribirArchivo(String nuevoTexto) {
        File archivo;  //Para manipular el archivo
        FileWriter escribir;  //Para escribir en el archivo
        PrintWriter linea;  //Para escribir también
        archivo = new File(pathSelected);  //Preparando el archivo
        try {
            if (archivo.exists()) {
                escribir =new FileWriter(archivo, false); //False es para que sobreescriba todo, si pongo true, solo escribe al final del archivo ya existente
                BufferedWriter intermediario = new BufferedWriter(escribir);
                linea = new PrintWriter(intermediario);
                
                linea.print(nuevoTexto);
                linea.close();
                escribir.close();
            }else{
                JOptionPane.showMessageDialog(null, "Aún no encuentro cuándo sale este error 1.");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Aún no encuentro cuándo sale este error 2.");
        }
    }

    public File getTexto() {
        return texto;
    }

    public void setTexto(File texto) {
        this.texto = texto;
    }

    public FileWriter getEscribir() {
        return escribir;
    }

    public void setEscribir(FileWriter escribir) {
        this.escribir = escribir;
    }

    public PrintWriter getLinea() {
        return linea;
    }

    public void setLinea(PrintWriter linea) {
        this.linea = linea;
    }

}
