/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import entidades.Productora;
import entidades.Transporte;
import implementaciones.FNegocio;
import implementaciones.INegocio;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author josej
 */
public class FRegistrarEmpresas extends javax.swing.JFrame {

    private static FRegistrarEmpresas registrarEmpresas;
    private INegocio negocio;

    /**
     * Constructor vacio que inicializa Negocios y los componentes del frame
     */
    public FRegistrarEmpresas() {
        this.negocio = new FNegocio();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldDireccion = new javax.swing.JTextField();
        jTextFieldNombre2 = new javax.swing.JTextField();
        jTextFieldTamanho = new javax.swing.JTextField();
        jComboBoxTipoEmpresa = new javax.swing.JComboBox<>();
        jButtonGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro Empresas");
        setMinimumSize(new java.awt.Dimension(465, 385));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Registro de  Empresas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel1)
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 500, 63);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Dirección");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Teléfono");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Tipo Empresa");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Tamaño");

        jTextFieldTelefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jTextFieldDireccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jTextFieldNombre2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jTextFieldTamanho.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jComboBoxTipoEmpresa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxTipoEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empresa Transporte", "Empresa Productora" }));

        jButtonGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldTamanho, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(jComboBoxTipoEmpresa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTipoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 60, 500, 300);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/**
 * Comprueba que no hayan datos vacios y que el tamaño sea el correcto, si no hay problema con ello entonces asigna a nuevas variables los valores de cada campo
 * y se agregará la empresa en base al tipo de empresa especificada ya sea productora o de transporte, si no hubo problemas al agregar mostrará un mensaje indicando
 * que se agregó la empresa, si no, mostrará un mensaje indicando lo contrario
 * @param evt 
 */
    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        if (verificarDatosVacios()) {
            return;
        }
        if (verificarCantidadTamanho()) {
            return;
        }
        String nombre = this.jTextFieldNombre2.getText();
        String telefono = this.jTextFieldTelefono.getText();
        String direccion = this.jTextFieldDireccion.getText();
        double tamano = Double.valueOf(this.jTextFieldTamanho.getText());
        String tipoEmpresa = this.jComboBoxTipoEmpresa.getSelectedItem().toString();
        boolean seAgregoEmpresa = false;
        if (tipoEmpresa.equalsIgnoreCase("Empresa Productora")) {
            Productora productora = new Productora(nombre, telefono, direccion, tamano);
            seAgregoEmpresa = this.negocio.guardarEmpresa(1, productora);
        } else if (tipoEmpresa.equalsIgnoreCase("Empresa Transporte")) {
            Transporte transporte = new Transporte(nombre, telefono, direccion, tamano);
            seAgregoEmpresa = this.negocio.guardarEmpresa(3, transporte);
        }

        if (seAgregoEmpresa) {
            JOptionPane.showMessageDialog(this, "Se agregó la empresa.", "Información", JOptionPane.INFORMATION_MESSAGE);
            this.limpiarCaracteres();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo agregar la empresa.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButtonGuardarActionPerformed
/**
 * Método para verificar los posibles datos vacios que pueden haber antes de guardar
 * @return 
 */
    private boolean verificarDatosVacios() {
        if (this.jTextFieldNombre2.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Es necesario escribir el nombre antes de guardar.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        if (this.jTextFieldDireccion.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Es necesario escribir la dirección antes de guardar.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        if (this.jTextFieldTelefono.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Es necesario escribir el teléfono antes de guardar.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        if (this.jTextFieldTamanho.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Es necesario escribir el tamaño antes de guardar.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        return false;
    }
   /**
    * Método para limpiar los campos del frame
    */
    private void limpiarCaracteres() {
        this.jTextFieldNombre2.setText("");
        this.jTextFieldDireccion.setText("");
        this.jTextFieldTamanho.setText("");
        this.jTextFieldTelefono.setText("");
        this.jComboBoxTipoEmpresa.setSelectedIndex(0);
    }

    /**
     * Metodo que valida si la cadena es un entero.
     *
     * @param s La cadena a evaluar
     * @return true si es entero, false en caso contrario
     */
    private boolean validaEntero(String s) {
        CharSequence cadena = s.trim();
        String reCadena = "^\\d+$";
        Pattern pattern = Pattern.compile(reCadena);
        Matcher matcher = pattern.matcher(cadena);
        return matcher.matches();
    }

    /**
     * Metodo que valida el tamño de los campos de texto
     *
     * @return true si presentan alguna irregularidad, false en caso contrario.
     */
    private boolean verificarCantidadTamanho() {
        String nombre = this.jTextFieldNombre2.getText();
        String telefono = this.jTextFieldTelefono.getText();
        String dirección = this.jTextFieldDireccion.getText();
        String tamano = this.jTextFieldTamanho.getText();
        if (nombre.length() > 100) {
            JOptionPane.showMessageDialog(this, "El nombre es demasiado largo, máximo 100 caracteres.", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        if (dirección.length() > 200) {
            JOptionPane.showMessageDialog(this, "La dirección es demasiado larga, máximo 200 caracteres.", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }

        if (!validaEntero(telefono)) {
            JOptionPane.showMessageDialog(this, "El teléfono contiene caracteres inválidos.", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        } else if (Integer.valueOf(telefono) == 0) {
            JOptionPane.showMessageDialog(this, "El teléfono no debe de ser 0.", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        if (telefono.length() > 15) {
            JOptionPane.showMessageDialog(this, "El teléfono es demasiado largo, máximo 15 caracteres.", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        if (tamano.contains("d")) {
            JOptionPane.showMessageDialog(null, "El tamaño contiene caracteres inválidos.", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        Double b = new Double(1000000);
        double a = 0;
        try {
            a = new Double(tamano);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El tamaño contiene caracteres inválidos.", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        if (a >= b) {
            JOptionPane.showMessageDialog(this, "El tamaño es demasiado grande.", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        if (a <= 0) {
            JOptionPane.showMessageDialog(this, "El tamaño no debe de ser igual o menor a 0.", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        return false;
    }

    /**
     * patrón Singleton para que nomas exista una sola pantalla de Registrar Empresas durante toda la actividad de la aplicación
     * @return 
     */
    public static FRegistrarEmpresas getInstance() {
        if (FRegistrarEmpresas.registrarEmpresas != null) {
            return registrarEmpresas;
        } else {
            FRegistrarEmpresas.registrarEmpresas = new FRegistrarEmpresas();
            return registrarEmpresas;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JComboBox<String> jComboBoxTipoEmpresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldNombre2;
    private javax.swing.JTextField jTextFieldTamanho;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
