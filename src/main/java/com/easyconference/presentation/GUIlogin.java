/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.easyconference.presentation;

import java.awt.Dimension;
import javax.swing.SpringLayout;

/**
 *
 * @author Ashlee Campaz
 */
public class GUIlogin extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
   
    public GUIlogin() {
        
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnlFondo = new javax.swing.JPanel();
        pnlSuperior = new javax.swing.JPanel();
        lbEasyConference = new javax.swing.JLabel();
        pnlInicio = new javax.swing.JPanel();
        txtfCorreo = new javax.swing.JTextField();
        pswfContrasenia = new javax.swing.JPasswordField();
        lbInicio_sesion = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        lbbtnVizualizar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(java.awt.Toolkit.getDefaultToolkit().getScreenSize());
        setMinimumSize(new java.awt.Dimension(408, 365));
        setPreferredSize(new java.awt.Dimension(408, 365));

        pnlFondo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondo.setMaximumSize(java.awt.Toolkit.getDefaultToolkit().getScreenSize());
        pnlFondo.setMinimumSize(new java.awt.Dimension(400, 360));
        pnlFondo.setPreferredSize(new java.awt.Dimension(400, 320));

        pnlSuperior.setBackground(new java.awt.Color(0, 153, 153));
        pnlSuperior.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 10));

        lbEasyConference.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        lbEasyConference.setForeground(new java.awt.Color(255, 255, 255));
        lbEasyConference.setText("easyConference");
        pnlSuperior.add(lbEasyConference);

        pnlInicio.setBackground(new java.awt.Color(255, 255, 255));
        pnlInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        pnlInicio.setForeground(new java.awt.Color(0, 153, 204));
        pnlInicio.setPreferredSize(new Dimension(408,314));
        pnlInicio.setLayout(new java.awt.GridBagLayout());

        txtfCorreo.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtfCorreo.setForeground(new java.awt.Color(102, 102, 102));
        txtfCorreo.setText("Ingrese su correo");
        txtfCorreo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Correo electronico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 12))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 70;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(9, 0, 9, 2);
        pnlInicio.add(txtfCorreo, gridBagConstraints);

        pswfContrasenia.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        pswfContrasenia.setForeground(new java.awt.Color(102, 102, 102));
        pswfContrasenia.setText("jPasswordField1");
        pswfContrasenia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contraseña", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 12))); // NOI18N
        pswfContrasenia.setCaretColor(new java.awt.Color(102, 102, 102));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 70;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 12, 0);
        pnlInicio.add(pswfContrasenia, gridBagConstraints);

        lbInicio_sesion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        lbInicio_sesion.setForeground(new java.awt.Color(0, 102, 102));
        lbInicio_sesion.setText("Inicio de sesion ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.insets = new java.awt.Insets(9, 0, 12, 0);
        pnlInicio.add(lbInicio_sesion, gridBagConstraints);

        btnIngresar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 71;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 15, 0);
        pnlInicio.add(btnIngresar, gridBagConstraints);

        lbbtnVizualizar.setText("visualizar");
        lbbtnVizualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbbtnVizualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbbtnVizualizarMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 70;
        gridBagConstraints.gridy = 2;
        pnlInicio.add(lbbtnVizualizar, gridBagConstraints);

        SpringLayout centrador = new SpringLayout();
        centrador.putConstraint(SpringLayout.HORIZONTAL_CENTER, pnlInicio, 0, SpringLayout.HORIZONTAL_CENTER, pnlFondo);
        centrador.putConstraint(SpringLayout.VERTICAL_CENTER, pnlInicio, 0, SpringLayout.VERTICAL_CENTER, pnlFondo);

        javax.swing.GroupLayout pnlFondoLayout = new javax.swing.GroupLayout(pnlFondo);
        pnlFondo.setLayout(pnlFondoLayout);
        pnlFondoLayout.setHorizontalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSuperior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFondoLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(pnlInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156))
        );
        pnlFondoLayout.setVerticalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addComponent(pnlSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        getContentPane().add(pnlSuperior, java.awt.BorderLayout.NORTH);

        pnlFondo.setLayout(centrador);

        getContentPane().add(pnlFondo, java.awt.BorderLayout.PAGE_START);
        getContentPane().add(pnlFondo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbbtnVizualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbbtnVizualizarMouseClicked
       if(pswfContrasenia.getEchoChar()==0){
           pswfContrasenia.setEchoChar('•');
       } 
      else{
        pswfContrasenia.setEchoChar((char)0);
       }
    }//GEN-LAST:event_lbbtnVizualizarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel lbEasyConference;
    private javax.swing.JLabel lbInicio_sesion;
    private javax.swing.JLabel lbbtnVizualizar;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlInicio;
    private javax.swing.JPanel pnlSuperior;
    private javax.swing.JPasswordField pswfContrasenia;
    private javax.swing.JTextField txtfCorreo;
    // End of variables declaration//GEN-END:variables
}