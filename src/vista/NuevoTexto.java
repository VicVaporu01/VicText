/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import control.Controlador;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author vicjo
 */
public class NuevoTexto extends javax.swing.JInternalFrame {

    Controlador objControlador = new Controlador();

    public NuevoTexto() {
        initComponents();
        this.setBorder(null);
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnBc = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaTextoNuevo = new javax.swing.JTextArea();
        jpnBtnGuardarNuevo = new javax.swing.JPanel();
        lblBtnGuardarNuevo = new javax.swing.JLabel();
        jpnBtnCancelarNuevo = new javax.swing.JPanel();
        lblBtnCancelarNuevo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnBc.setBackground(new java.awt.Color(255, 255, 255));
        jpnBc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpnBc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAreaTextoNuevo.setBackground(new java.awt.Color(255, 255, 255));
        txtAreaTextoNuevo.setColumns(20);
        txtAreaTextoNuevo.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtAreaTextoNuevo.setForeground(new java.awt.Color(0, 0, 0));
        txtAreaTextoNuevo.setRows(5);
        jScrollPane1.setViewportView(txtAreaTextoNuevo);

        jpnBc.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 290));

        jpnBtnGuardarNuevo.setBackground(new java.awt.Color(204, 204, 204));
        jpnBtnGuardarNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpnBtnGuardarNuevo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBtnGuardarNuevo.setBackground(new java.awt.Color(255, 255, 255));
        lblBtnGuardarNuevo.setFont(new java.awt.Font("Roboto Black", 0, 13)); // NOI18N
        lblBtnGuardarNuevo.setForeground(new java.awt.Color(0, 0, 0));
        lblBtnGuardarNuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnGuardarNuevo.setText("GUARDAR");
        lblBtnGuardarNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBtnGuardarNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnGuardarNuevoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnGuardarNuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnGuardarNuevoMouseExited(evt);
            }
        });
        jpnBtnGuardarNuevo.add(lblBtnGuardarNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));

        jpnBc.add(jpnBtnGuardarNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 90, 30));

        jpnBtnCancelarNuevo.setBackground(new java.awt.Color(204, 204, 204));
        jpnBtnCancelarNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpnBtnCancelarNuevo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBtnCancelarNuevo.setFont(new java.awt.Font("Roboto Black", 0, 13)); // NOI18N
        lblBtnCancelarNuevo.setForeground(new java.awt.Color(0, 0, 0));
        lblBtnCancelarNuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnCancelarNuevo.setText("CANCELAR");
        lblBtnCancelarNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBtnCancelarNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnCancelarNuevoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnCancelarNuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnCancelarNuevoMouseExited(evt);
            }
        });
        jpnBtnCancelarNuevo.add(lblBtnCancelarNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        jpnBc.add(jpnBtnCancelarNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 100, 30));

        getContentPane().add(jpnBc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBtnCancelarNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnCancelarNuevoMouseClicked
        objControlador.comprobadorVentanaNuevo(false);
        this.dispose();
    }//GEN-LAST:event_lblBtnCancelarNuevoMouseClicked

    private void lblBtnGuardarNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnGuardarNuevoMouseClicked
        JOptionPane.showMessageDialog(null, objControlador.guardarNuevoTexto(txtAreaTextoNuevo.getText(), JOptionPane.showInputDialog("Ingrese el título del archivo")));
        objControlador.comprobadorVentanaNuevo(false);
        this.dispose();
    }//GEN-LAST:event_lblBtnGuardarNuevoMouseClicked

    private void lblBtnGuardarNuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnGuardarNuevoMouseEntered
        lblBtnGuardarNuevo.setForeground(Color.white);
        jpnBtnGuardarNuevo.setBackground(Color.black);
    }//GEN-LAST:event_lblBtnGuardarNuevoMouseEntered

    private void lblBtnGuardarNuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnGuardarNuevoMouseExited
        lblBtnGuardarNuevo.setForeground(Color.black);
        jpnBtnGuardarNuevo.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_lblBtnGuardarNuevoMouseExited

    private void lblBtnCancelarNuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnCancelarNuevoMouseEntered
        lblBtnCancelarNuevo.setForeground(Color.white);
        jpnBtnCancelarNuevo.setBackground(Color.black);
    }//GEN-LAST:event_lblBtnCancelarNuevoMouseEntered

    private void lblBtnCancelarNuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnCancelarNuevoMouseExited
        lblBtnCancelarNuevo.setForeground(Color.black);
        jpnBtnCancelarNuevo.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_lblBtnCancelarNuevoMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpnBc;
    private javax.swing.JPanel jpnBtnCancelarNuevo;
    private javax.swing.JPanel jpnBtnGuardarNuevo;
    private javax.swing.JLabel lblBtnCancelarNuevo;
    private javax.swing.JLabel lblBtnGuardarNuevo;
    private javax.swing.JTextArea txtAreaTextoNuevo;
    // End of variables declaration//GEN-END:variables

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTextArea getTxtAreaTextoNuevo() {
        return txtAreaTextoNuevo;
    }

    public void setTxtAreaTextoNuevo(JTextArea txtAreaTextoNuevo) {
        this.txtAreaTextoNuevo = txtAreaTextoNuevo;
    }

    public JPanel getJpnBtnCancelarNuevo() {
        return jpnBtnCancelarNuevo;
    }

    public void setJpnBtnCancelarNuevo(JPanel jpnBtnCancelarNuevo) {
        this.jpnBtnCancelarNuevo = jpnBtnCancelarNuevo;
    }

    public JPanel getJpnBtnGuardarNuevo() {
        return jpnBtnGuardarNuevo;
    }

    public void setJpnBtnGuardarNuevo(JPanel jpnBtnGuardarNuevo) {
        this.jpnBtnGuardarNuevo = jpnBtnGuardarNuevo;
    }

    public JLabel getLblBtnCancelarNuevo() {
        return lblBtnCancelarNuevo;
    }

    public void setLblBtnCancelarNuevo(JLabel lblBtnCancelarNuevo) {
        this.lblBtnCancelarNuevo = lblBtnCancelarNuevo;
    }

    public JLabel getLblBtnGuardarNuevo() {
        return lblBtnGuardarNuevo;
    }

    public void setLblBtnGuardarNuevo(JLabel lblBtnGuardarNuevo) {
        this.lblBtnGuardarNuevo = lblBtnGuardarNuevo;
    }

}
