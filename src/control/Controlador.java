package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.OperacionesTexto;
import vista.*;

public class Controlador implements ActionListener {

    Editor frmp;
    NuevoTexto objNuevoTexto;
    AbrirArchivoTexto objAbrir;
    OperacionesTexto objOperaciones = new OperacionesTexto();
    static private boolean isOpenNuevo = false, isOpenAbrir = false;

    public Controlador() {

        this.frmp = new Editor();

        //AGREGO LOS SUB MENÚS
        frmp.getMenuItemNuevo().addActionListener(this);
        frmp.getMenuItemAbrir().addActionListener(this);

    }

    public void iniciar() {
        setVisible(true);
    }

    public void setVisible(boolean b) {
        frmp.setVisible(b);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frmp.getMenuItemNuevo()) {
            try {
                if (isOpenNuevo == false) {
                    System.out.println("Cambiando comprobador a true");
                    isOpenNuevo = true;
                    this.objNuevoTexto = new NuevoTexto();
                    System.out.println("Comprobador está en: " + isOpenNuevo);
                    frmp.getEscritorio().add(objNuevoTexto);
                    objNuevoTexto.setVisible(true);

                } else if (isOpenNuevo == true) {
                    System.out.println("Comprobador en la otra parte está en: " + isOpenNuevo);
                    JOptionPane.showMessageDialog(null, "Ya hay uno abierto");
                }
            } catch (Exception exc) {
                exc.printStackTrace();
            }
        }

        if (e.getSource() == frmp.getMenuItemAbrir()) {
            this.objAbrir = new AbrirArchivoTexto();
            frmp.getEscritorio().add(objAbrir);
            objAbrir.setVisible(true);
        }

    }

    public String guardarNuevoTexto(String textoIr, String tituloIr) {
        String retorno = "";
        return retorno = objOperaciones.guardar(textoIr, tituloIr);
    }

    public void comprobadorVentanas(boolean open) {
        isOpenNuevo = false;
        System.out.println("Comprobador final está en: " + isOpenNuevo);
    }

    public String abrirArchivo() {
        return objOperaciones.abrir();
    }

    public String sobreescribiendo(String nuevoText) {
        objOperaciones.sobreEscribirArchivo(nuevoText);
        return "Archivo cambiado exitosamente.";
    }

}
