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

            if (isOpenNuevo == false) {
                this.objNuevoTexto = new NuevoTexto();
                isOpenNuevo = true;
                frmp.getEscritorio().add(objNuevoTexto);
                objNuevoTexto.setVisible(true);
            } else if (isOpenNuevo == true) {
                JOptionPane.showMessageDialog(null, "Ya hay uno abierto.");
            }

        }

        if (e.getSource() == frmp.getMenuItemAbrir()) {

            if (isOpenAbrir == false) {
                this.objAbrir = new AbrirArchivoTexto();
                this.isOpenAbrir = true;
                frmp.getEscritorio().add(objAbrir);
                objAbrir.setVisible(true);
            } else if (isOpenAbrir==true) {
                JOptionPane.showMessageDialog(null, "Ya hay uno abierto.");
            }

        }

    }

    public String guardarNuevoTexto(String textoIr, String tituloIr) {
        String retorno = "";
        return retorno = objOperaciones.guardar(textoIr, tituloIr);
    }

    public void comprobadorVentanaNuevo(boolean open) {
        isOpenNuevo = false;
    }
    
    public void comprobadorVentanaAbrir(boolean open) {
        isOpenAbrir = false;
    }

    public String abrirArchivo() {
        return objOperaciones.abrir();
    }

    public String sobreescribiendo(String nuevoText) {
        objOperaciones.sobreEscribirArchivo(nuevoText);
        return "Archivo cambiado exitosamente.";
    }

}
