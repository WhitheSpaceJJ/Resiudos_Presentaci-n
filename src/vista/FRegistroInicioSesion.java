/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import entidades.Administrador;
import entidades.Productor;
import entidades.Transportador;
import implementaciones.FNegocio;
import implementaciones.FabricaNegocios;
import implementaciones.INegocio;
import javax.swing.JOptionPane;

/**
 * Frame del inicio de sesion.
 * @author Equipo 1 Jose,Abraham y Oroz
 */
public class FRegistroInicioSesion extends javax.swing.JFrame {

    private final INegocio negocio;

    /**
     * Creates new form RegistroInicioSesion
     */
    public FRegistroInicioSesion() {
        initComponents();
        this.negocio = FabricaNegocios.crearFNegocio();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jButtonEntrarTransportador = new javax.swing.JButton();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelContraseña = new javax.swing.JLabel();
        jPasswordFieldUsuario = new javax.swing.JPasswordField();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabeltipoUsuario = new javax.swing.JLabel();
        jComboBoxTipoUsuario = new javax.swing.JComboBox<>();
        jPanelTitulo = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanelPie = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio Sesión");
        setMinimumSize(new java.awt.Dimension(288, 420));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel.setBackground(new java.awt.Color(255, 255, 255));
        jPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonEntrarTransportador.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonEntrarTransportador.setText("Entrar");
        jButtonEntrarTransportador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarTransportadorActionPerformed(evt);
            }
        });

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelUsuario.setText("Usuario;");

        jLabelContraseña.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelContraseña.setText("Contraseña;");

        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });

        jLabeltipoUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabeltipoUsuario.setText("Tipo;");

        jComboBoxTipoUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Transportador", "Productor" }));

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelContraseña)
                    .addComponent(jLabeltipoUsuario)
                    .addComponent(jLabelUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEntrarTransportador, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeltipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jButtonEntrarTransportador)
                .addGap(33, 33, 33))
        );

        getContentPane().add(jPanel);
        jPanel.setBounds(20, 80, 240, 240);

        jPanelTitulo.setBackground(new java.awt.Color(102, 255, 255));
        jPanelTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabelTitulo.setText("Inicio Sesión");

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTituloLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelTitulo);
        jPanelTitulo.setBounds(0, 0, 280, 80);

        jPanelPie.setBackground(new java.awt.Color(153, 255, 255));
        jPanelPie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanelPieLayout = new javax.swing.GroupLayout(jPanelPie);
        jPanelPie.setLayout(jPanelPieLayout);
        jPanelPieLayout.setHorizontalGroup(
            jPanelPieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        jPanelPieLayout.setVerticalGroup(
            jPanelPieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelPie);
        jPanelPie.setBounds(0, 320, 280, 70);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 20, 390);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(260, 0, 20, 390);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/**
 * Al pulsar el boton entrar primero comprobara que se hayan llenado ambos campos de texto, despues comprobará el tipo de usuario seleccionado en el comboBox,
 * despues tratará de hacer la consulta para ver si consigue algun resultado que coincida con el usuario, contraseña y tipo de usuario, si no encuentra coincidencias
 * advertira en un mensaje al usuario de ello, si si encuentra una coincidencia, entonces el usuario abrirá la ventana principal, inicializará los campos y esconderá esta ventana de login.
 * @param evt Evento Action Perfomed del boton Entrar
 */
    private void jButtonEntrarTransportadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarTransportadorActionPerformed
        String usuario = this.jTextFieldUsuario.getText();
        String contraseña = this.jPasswordFieldUsuario.getText();
        if (usuario.length() == 0) {
            JOptionPane.showMessageDialog(this, "Debe de ingresar su usuario.");
            return;
        }
        if (contraseña.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe de ingresar su contraseña.");
            return;
        }
        //,, Productor
        String tipoUsuario = (String) this.jComboBoxTipoUsuario.getSelectedItem();
        if (tipoUsuario.equalsIgnoreCase("Administrador")) {
            Administrador usuarioAuxiliar = (Administrador) this.negocio.getUsuario(1, usuario, contraseña);
            if (usuarioAuxiliar == null) {
                JOptionPane.showMessageDialog(this, "El usuario es invalido o no ha sido registrado.");
            } else {
                this.setVisible(false);
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        FPrincipal p = FPrincipal.getInstance();
                        p.botones(1, usuarioAuxiliar);
                        p.addWindowListener(new java.awt.event.WindowAdapter() {
                            @Override
                            public void windowClosing(java.awt.event.WindowEvent e) {
                                jTextFieldUsuario.setText("");
                                jPasswordFieldUsuario.setText("");
                                setVisible(true);
                            }
                        });
                        p.setVisible(true);
                    }
                });
            }
        } else if (tipoUsuario.equalsIgnoreCase("Transportador")) {
            Transportador usuarioAuxiliar = (Transportador) this.negocio.getUsuario(2, usuario, contraseña);
            if (usuarioAuxiliar == null) {
                JOptionPane.showMessageDialog(this, "El usuario es invalido o no ha sido registrado.");
            } else {
                this.setVisible(false);
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        FPrincipal p = FPrincipal.getInstance();
                        p.botones(3, usuarioAuxiliar);
                        p.addWindowListener(new java.awt.event.WindowAdapter() {
                            @Override
                            public void windowClosing(java.awt.event.WindowEvent e) {
                                jTextFieldUsuario.setText("");
                                jPasswordFieldUsuario.setText("");
                                setVisible(true);
                            }
                        });
                        p.setVisible(true);
                    }
                });
            }
        } else {
            Productor usuarioAuxiliar = (Productor) this.negocio.getUsuario(3, usuario, contraseña);
            if (usuarioAuxiliar == null) {
                JOptionPane.showMessageDialog(this, "El usuario es invalido o no ha sido registrado.");
            } else {
                this.setVisible(false);
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        FPrincipal p = FPrincipal.getInstance();
                        p.botones(2, usuarioAuxiliar);
                        p.addWindowListener(new java.awt.event.WindowAdapter() {
                            @Override
                            public void windowClosing(java.awt.event.WindowEvent e) {
                                jTextFieldUsuario.setText("");
                                jPasswordFieldUsuario.setText("");
                                setVisible(true);
                            }
                        });
                        p.setVisible(true);
                    }
                });
            }
        }


    }//GEN-LAST:event_jButtonEntrarTransportadorActionPerformed

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEntrarTransportador;
    private javax.swing.JComboBox<String> jComboBoxTipoUsuario;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JLabel jLabeltipoUsuario;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelPie;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JPasswordField jPasswordFieldUsuario;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
