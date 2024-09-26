/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.easyconference.presentation;

import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import  javax.swing.JOptionPane;

import com.easyconference.access.ConferenceArrayListRepository;
import com.easyconference.domain.entities.Usuario;
import com.easyconference.domain.service.UserService;
import java.util.List;


public class GUIregister extends javax.swing.JFrame {

    private UserService registerService;
    

    public GUIregister(UserService registerService) {
        initComponents();
        this.registerService = registerService;
        setupEventListeners();
    }
    
   
    
    private void setupEventListeners() {
        btnRegistrar.addActionListener(e -> handleRegistration());
        // Añadir un nuevo botón para imprimir usuarios (si no existe, créalo en el diseño)
        btnImprimirUsuarios.addActionListener(e -> btnImprimirUsuariosActionPerformed(null)); 
    }
    
    private void handleRegistration() {
        String name = txtfNombre.getText();
        String lastName = txtfApellido.getText();
        String email = txtfCorreo.getText();
        String password = new String(txtfContrasenia.getText());
        String confirmPassword = new String(txtConContrasenia.getText());
        String country = txtfPais.getText();
        String organization = txtfOrganizacion.getText();
        String fields = txtaCamposInv.getText();

        // Validate that the passwords match
        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Register the user through the service
        boolean registered = registerService.registerUser(name, lastName, email, password, country, organization, fields);

        // Handle successful registration
        if (registered) {
            clearFields();  // Clear form fields after successful registration
            JOptionPane.showMessageDialog(this, "Usuario registrado con éxito.", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "El email ya está registrado. Intente con otro.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void clearFields() {
        txtfNombre.setText("");
        txtfNombre.setText("");
        txtfCorreo.setText("");
        txtfContrasenia.setText("");
        txtConContrasenia.setText("");
        txtfPais.setText("");
        txtfApellido.setText("");
        txtfOrganizacion.setText("");
        txtaCamposInv.setText("");
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
        pnlFormulario = new javax.swing.JPanel();
        txtfPais = new javax.swing.JTextField();
        txtfNombre = new javax.swing.JTextField();
        txtfCorreo = new javax.swing.JTextField();
        txtfContrasenia = new javax.swing.JTextField();
        txtConContrasenia = new javax.swing.JTextField();
        txtfOrganizacion = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        lbYatienesCuenta = new javax.swing.JLabel();
        sclpCamposInv = new javax.swing.JScrollPane();
        txtaCamposInv = new javax.swing.JTextArea();
        btnImprimirUsuarios = new javax.swing.JButton();
        txtfApellido = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(682, 542));
        setPreferredSize(new java.awt.Dimension(800, 690));
        setSize(new java.awt.Dimension(784, 649));

        pnlFondo.setBackground(new java.awt.Color(255, 255, 255));

        pnlSuperior.setBackground(new java.awt.Color(0, 153, 153));
        pnlSuperior.setPreferredSize(new java.awt.Dimension(192, 52));
        pnlSuperior.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 10));

        lbEasyConference.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        lbEasyConference.setForeground(new java.awt.Color(255, 255, 255));
        lbEasyConference.setText("easyConference");
        pnlSuperior.add(lbEasyConference);

        pnlFormulario.setBackground(new java.awt.Color(255, 255, 255));
        pnlFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 24), new java.awt.Color(0, 153, 153))); // NOI18N
        pnlFormulario.setMinimumSize(new java.awt.Dimension(643, 456));
        pnlFormulario.setLayout(new java.awt.GridBagLayout());

        txtfPais.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtfPais.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "*Pais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 12))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BELOW_BASELINE;
        gridBagConstraints.insets = new java.awt.Insets(26, 32, 0, 0);
        pnlFormulario.add(txtfPais, gridBagConstraints);

        txtfNombre.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtfNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "*Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 12))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.8;
        gridBagConstraints.insets = new java.awt.Insets(18, 32, 0, 0);
        pnlFormulario.add(txtfNombre, gridBagConstraints);

        txtfCorreo.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtfCorreo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "*Correo electronico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 12))); // NOI18N
        txtfCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfCorreoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.8;
        gridBagConstraints.insets = new java.awt.Insets(18, 32, 0, 0);
        pnlFormulario.add(txtfCorreo, gridBagConstraints);

        txtfContrasenia.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtfContrasenia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "*Contraseña", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 12))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.8;
        gridBagConstraints.insets = new java.awt.Insets(18, 32, 0, 0);
        pnlFormulario.add(txtfContrasenia, gridBagConstraints);

        txtConContrasenia.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtConContrasenia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "*Confirmar contraseña", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 12))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.8;
        gridBagConstraints.insets = new java.awt.Insets(18, 32, 0, 0);
        pnlFormulario.add(txtConContrasenia, gridBagConstraints);

        txtfOrganizacion.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtfOrganizacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "*Organizacion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 12))); // NOI18N
        txtfOrganizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfOrganizacionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 151;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.insets = new java.awt.Insets(18, 32, 0, 0);
        pnlFormulario.add(txtfOrganizacion, gridBagConstraints);

        btnRegistrar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 66, 20, 16);
        pnlFormulario.add(btnRegistrar, gridBagConstraints);

        lbYatienesCuenta.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        lbYatienesCuenta.setForeground(new java.awt.Color(0, 102, 102));
        lbYatienesCuenta.setText("¿Ya tienes cuenta? De clic aquí");
        lbYatienesCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbYatienesCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbYatienesCuentaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbYatienesCuentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbYatienesCuentaMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(24, 32, 0, 0);
        pnlFormulario.add(lbYatienesCuenta, gridBagConstraints);

        txtaCamposInv.setColumns(20);
        txtaCamposInv.setLineWrap(true);
        txtaCamposInv.setRows(5);
        txtaCamposInv.setWrapStyleWord(true);
        txtaCamposInv.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "*Campos de investigacion"));
        sclpCamposInv.setViewportView(txtaCamposInv);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(28, 34, 28, 34);
        pnlFormulario.add(sclpCamposInv, gridBagConstraints);

        btnImprimirUsuarios.setText("ImprimirUsuarios");
        btnImprimirUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirUsuariosActionPerformed(evt);
            }
        });
        pnlFormulario.add(btnImprimirUsuarios, new java.awt.GridBagConstraints());

        txtfApellido.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtfApellido.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "*Apellido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 12))); // NOI18N
        txtfApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfApellidoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.8;
        gridBagConstraints.insets = new java.awt.Insets(18, 32, 0, 0);
        pnlFormulario.add(txtfApellido, gridBagConstraints);

        javax.swing.GroupLayout pnlFondoLayout = new javax.swing.GroupLayout(pnlFondo);
        pnlFondo.setLayout(pnlFondoLayout);
        pnlFondoLayout.setHorizontalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(pnlFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        pnlFondoLayout.setVerticalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addComponent(pnlSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(pnlFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        getContentPane().add(pnlSuperior, java.awt.BorderLayout.NORTH);

        getContentPane().add(pnlFondo, java.awt.BorderLayout.CENTER);
        SpringLayout centrador = new SpringLayout();
        centrador.putConstraint(SpringLayout.VERTICAL_CENTER, pnlFormulario, 20, SpringLayout.VERTICAL_CENTER, pnlFondo);
        centrador.putConstraint(SpringLayout.HORIZONTAL_CENTER, pnlFormulario, 20, SpringLayout.HORIZONTAL_CENTER, pnlFondo);
        centrador.putConstraint(SpringLayout.WIDTH, pnlFormulario, 20, SpringLayout.HEIGHT, pnlFondo);
        pnlFondo.setLayout(centrador);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtfNombreActionPerformed(java.awt.event.ActionEvent evt) {                                           
        txtfNombre.requestFocus(); 
    }                                          

    private void lbYatienesCuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbYatienesCuentaMouseEntered
        lbYatienesCuenta.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12));
    }//GEN-LAST:event_lbYatienesCuentaMouseEntered
    
    private void lbYatienesCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbYatienesCuentaMouseExited
        lbYatienesCuenta.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12));
    }//GEN-LAST:event_lbYatienesCuentaMouseExited
    
   

    private void lbYatienesCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbYatienesCuentaMouseClicked
        this.dispose();
        GUIlogin login = new GUIlogin(registerService);
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }//GEN-LAST:event_lbYatienesCuentaMouseClicked

    private void txtfCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfCorreoActionPerformed
        txtfContrasenia.requestFocus();
    }//GEN-LAST:event_txtfCorreoActionPerformed

    private void cmbPaisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPaisesActionPerformed
        txtfOrganizacion.requestFocus();
    }//GEN-LAST:event_cmbPaisesActionPerformed

    private void txtfOrganizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfOrganizacionActionPerformed
        txtaCamposInv.requestFocus();
    }//GEN-LAST:event_txtfOrganizacionActionPerformed

    private void btnImprimirUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirUsuariosActionPerformed
        // TODO add your handling code here:
        //List<Usuario> users = repository.listUsuario();
        System.out.println("Usuarios registrados:");
       /** for (Usuario user : users) {
            System.out.println("Nombre: " + user.getName() + " " + user.getLastName());
            System.out.println("Email: " + user.getEmail());
            System.out.println("País: " + user.getCountry());
            System.out.println("Organización: " + user.getOrganization());
            System.out.println("Campos de investigación: " + user.getIfields());
            System.out.println("--------------------");
        }
        */
    }//GEN-LAST:event_btnImprimirUsuariosActionPerformed

    private void txtfApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfApellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfApellido1ActionPerformed

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarMouseClicked
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimirUsuarios;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel lbEasyConference;
    private javax.swing.JLabel lbYatienesCuenta;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JPanel pnlSuperior;
    private javax.swing.JScrollPane sclpCamposInv;
    private javax.swing.JTextField txtConContrasenia;
    private javax.swing.JTextArea txtaCamposInv;
    private javax.swing.JTextField txtfApellido;
    private javax.swing.JTextField txtfContrasenia;
    private javax.swing.JTextField txtfCorreo;
    private javax.swing.JTextField txtfNombre;
    private javax.swing.JTextField txtfOrganizacion;
    private javax.swing.JTextField txtfPais;
    // End of variables declaration//GEN-END:variables
}
