/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import entidades.Productor;
import entidades.Productora;
import entidades.Quimico;
import entidades.Residuo;
import entidades.Usuario;
import implementaciones.FNegocio;
import implementaciones.FabricaNegocios;
import interfaces.INegocio;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import org.bson.types.ObjectId;

/**
 * Frame del registro de residuos.
 *
 * @author Equipo 1 Jose,Abraham y Oroz
 */
public class FRegistroResiduos extends javax.swing.JFrame {

    private static FRegistroResiduos registroResiduos;
    private INegocio negocio;
    private Usuario usuario;
    private List<Quimico> quimicosSistema;
    private List<Quimico> seleccionados;

    /**
     * Constructor que inicializa el Negocio y los componentes del frame
     */
    public FRegistroResiduos() {
        initComponents();
        this.negocio = FabricaNegocios.crearFNegocio();
    }

    /**
     * Patrón Singleton para que nomas exista una ventana de este tipo durante
     * todo el transcurso de la aplicación
     *
     * @return Instancia del registro de de residuos
     */
    public static FRegistroResiduos getInstance() {
        if (FRegistroResiduos.registroResiduos != null) {
            return FRegistroResiduos.registroResiduos;
        } else {
            FRegistroResiduos.registroResiduos = new FRegistroResiduos();
            return registroResiduos;
        }
    }

    /**
     * Asigna al usuario ingresado como parámetro
     *
     * @param usuario Usuario a establecer.
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListQuimicosSeleccionados = new javax.swing.JList<>();
        jButtonEliminar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListQuimicosSistema = new javax.swing.JList<>();
        jButtonAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Residuos");
        setMinimumSize(new java.awt.Dimension(807, 425));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelTitulo.setText("Registro de Residuo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(jLabelTitulo)
                .addContainerGap(286, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 50);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Descripción");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Código");

        txtCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtDescripcion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel5.setText("Datos Residuo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(32, 32, 32))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 50, 280, 360);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel1.setText("Químico Seleccionados");

        jScrollPane1.setViewportView(jListQuimicosSeleccionados);

        jButtonEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEliminar))
                    .addComponent(jLabel1))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEliminar)
                        .addGap(60, 60, 60))))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(280, 230, 520, 180);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel6.setText("Químico ");

        jScrollPane2.setViewportView(jListQuimicosSistema);

        jButtonAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAgregar)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAgregar)
                        .addGap(55, 55, 55))))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(280, 50, 520, 180);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/**
     * Al pulsar el botón cancelar se llama al método limpiar
     *
     * @param evt Evento Action Perfomed del boton Cancelar
     */
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed
    /**
     * Comprueba que se haya seleccionado un químico de la lista para despues
     * agregarlo a la lista, actualizarla, habilitar los botones de eliminar ,
     * inhabilitar el boton de agregar, llenar la lista de químicos
     * seleccionados y la lista de químicos sistema
     *
     * @param evt Evento Action Perfomed del boton Agregar
     */
    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        // TODO add your handling code here:
        int indice = this.jListQuimicosSistema.getSelectedIndex();
        if (indice == -1) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado algún químico para agregar.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            this.agregarQuimicoLista(indice);
            this.actualizarLista(1, indice);
            this.habilitarBotonEliminar();
            this.inhabilitarBotonAgregar();
            this.llenarListaQuimicosSeleccionados(seleccionados);
            this.llenarListaQuimicosSistema(quimicosSistema);
        }

    }//GEN-LAST:event_jButtonAgregarActionPerformed

    /**
     * Método para agregar un químico a la lista
     *
     * @param indice Indice del quimico a agregar a lista.
     */
    public void agregarQuimicoLista(int indice) {
        seleccionados.add(quimicosSistema.get(indice));
    }

    /**
     * Método para actualizar la lista, recibe de parámetros el tipo y el
     * indice, dependiendo del tipo de lista se borrará el indice especificado
     * en una u otra lista
     *
     * @param tipo Tipo de actualizacion.
     * @param indice Indice para actualizacion.
     */
    public void actualizarLista(int tipo, int indice) {
        if (tipo == 1) {
            quimicosSistema.remove(indice);
        }
        if (tipo == 2) {
            seleccionados.remove(indice);
        }
    }

    /**
     * Método para hablitar el boton de eliminar
     */
    public void habilitarBotonEliminar() {
        this.jButtonEliminar.setEnabled(true);
    }

    /**
     * Método para inhabilitar el boton de agregar
     */
    public void inhabilitarBotonAgregar() {
        if (quimicosSistema.isEmpty()) {
            this.jButtonAgregar.setEnabled(false);
        }
    }

    /**
     * Método que comprueba que se haya seleccionado algun químico para despues
     * eliminarlo, habilitar el botón de agregar, inhabilitar el botón de
     * eliminar y actualizar ambas listas de químicos
     *
     * @param evt Evento Action Perfomed del boton Eliminar
     */
    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        int indice = this.jListQuimicosSeleccionados.getSelectedIndex();
        if (indice == -1) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado algún químico para eliminar.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            this.eliminarQuimicoLista(indice);
            this.actualizarLista(2, indice);
            this.habilitarBotonAgregar();
            this.inabilitarBotonEliminar();
            this.llenarListaQuimicosSeleccionados(seleccionados);
            this.llenarListaQuimicosSistema(quimicosSistema);
        }

    }//GEN-LAST:event_jButtonEliminarActionPerformed
    /**
     * Método para eliminar el químico de una lista especificado por el índice
     *
     * @param indice Indice del quimico a eliminar.
     */
    public void eliminarQuimicoLista(int indice) {
        quimicosSistema.add(seleccionados.get(indice));
    }

    /**
     * Método para habilitar el boton de agregar
     */
    public void habilitarBotonAgregar() {
        this.jButtonAgregar.setEnabled(true);

    }

    /**
     * Método para inhabilitar el boton de eliminar
     */
    public void inabilitarBotonEliminar() {
        if (seleccionados.isEmpty()) {
            this.jButtonEliminar.setEnabled(false);
        }
    }

    /**
     * Método para verificar los campos, que estos no se encuentren vacios, que
     * tengan tamaño correcto y los datos se encuentren validados
     *
     * @return true si se presenta alguna irregularidad, false, en caso
     * contrario.
     */
    public boolean verificarCampos() {
        if (verificarDatosVacios()) {
            return true;
        }
         if (validarDatos()) {
            return true;
        }
        if (verificarCantidadTamanho()) {
            return true;
        }
        return false;
    }

    /**
     * Método que obtiene todos los datos de los campos, valida que el residuo
     * no exista e intenta guardar el residuo, en caso de que lo logre informará
     * al usuario de ello y si no lo logra advertira al usuario de ello. Una vez
     * hecha la operación limpiará los campos
     *
     * @param evt Evento Action Perfomed del boton Guardar
     */
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (verificarCampos()) {
            return;
        }
        String nombre = this.txtNombre.getText().trim();
        String idResiduo = this.txtCodigo.getText();
        String descripcion = this.txtDescripcion.getText();
        ObjectId idEmpresaProductora = ((Productor) usuario).getIdEmpresaProductora();
        List<Quimico> listaD = seleccionados;

        Residuo residuo = new Residuo(idResiduo, nombre, descripcion, idEmpresaProductora, listaD);
        String validarResiduo = this.negocio.validarResiduo(residuo);

        if (validarResiduo.length() != 0) {
            this.mostrarMensajeCoincidencia(validarResiduo);
        } else {
            boolean validarGuardar = this.negocio.guardarResiduo(residuo);
            if (validarGuardar) {
                this.mostrarMensajeConfirmacion("Se agregó el residuo.");
            } else {
                this.mostrarMensajeAdvertencia("No se pudo agregar el residuo.");
            }
            this.limpiar();
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    /**
     * Método para mostrar un mensaje de error en caso de encontrar alguna
     * coincidencia
     *
     * @param mensaje Mensaje a mostrar
     */
    public void mostrarMensajeCoincidencia(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje,
                "Error", JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Método para mostrar mensaje de confirmación
     *
     * @param mensaje Mensaje a mostrar
     */
    public void mostrarMensajeConfirmacion(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Método para validar que los datos ingresados en los campos cumplan los
     * requisitos adecuados
     *
     * @return true si se presenta alfuna inrregularidad, false en caso
     * contrario.
     */
    private boolean validarDatos() {
        if (!this.validaEntero(this.txtCodigo.getText())) {
            this.mostrarMensajeAdvertencia("Solo se aceptan números positivos en el código.");
            return true;
        }
        if (seleccionados.isEmpty()) {
            this.mostrarMensajeAdvertencia("La lista de químicos seleccionados se encuentra vacía.");
            return true;
        }
        return false;
    }

    /**
     * Método para verificar los datos vacios
     *
     * @return true si se presenta alfuna inrregularidad, false en caso
     * contrario.
     */
    private boolean verificarDatosVacios() {
        if (this.txtNombre.getText().length() == 0) {
            this.mostrarMensajeAdvertencia("Es necesario escribir el nombre antes de guardar.");

            return true;
        }
        if (this.txtDescripcion.getText().length() == 0) {
            this.mostrarMensajeAdvertencia("Es necesario escribir la descripción antes de guardar.");

            return true;
        }
        if (this.txtCodigo.getText().length() == 0) {
            this.mostrarMensajeAdvertencia("Es necesario escribir el código antes de guardar.");

            return true;
        }

        return false;
    }

    /**
     * Método para mostrar un mensaje de advertencia
     *
     * @param mensaje Mensaje a mostrar
     */
    public void mostrarMensajeAdvertencia(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje,
                "Error", JOptionPane.ERROR_MESSAGE);
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
        String nombre = this.txtNombre.getText();
        String codigo = this.txtCodigo.getText();
        String descripcion = this.txtDescripcion.getText();
        if (codigo.length() > 6) {
            this.mostrarMensajeAdvertencia("El código es demasiado largo.");
            return true;
        } else if (codigo.length() < 6) {
            this.mostrarMensajeAdvertencia("El código debe de contener seis caracteres.");
            return true;
        }
        if (nombre.length() > 30) {
            this.mostrarMensajeAdvertencia("El nombre es demasiado largo, máximo 30 caracteres.");
            return true;
        }

        if (descripcion.length() > 50) {
            this.mostrarMensajeAdvertencia("La descripción es demasiado larga, máximo 50 caracteres.");
            return true;
        }
        return false;
    }

    /**
     * Método para llenar la lista de químicos sistema dentro de una tabla
     *
     * @param lista Lista de quimicos del sistema
     */
    private void llenarListaQuimicosSistema(List<Quimico> lista) {
        DefaultListModel d = new DefaultListModel();
        this.jListQuimicosSistema.setModel(d);
        DefaultListModel a = (DefaultListModel) this.jListQuimicosSistema.getModel();
        for (int i = 0; i < lista.size(); i++) {
            Quimico get = lista.get(i);
            a.addElement(String.valueOf(i + 1) + ". Nombre; " + get.getNombre() + ", Descripción; " + get.getDescripcion());
        }
    }

    /**
     * Método para llenar la lista de químicos seleccionados dentro de una tabla
     *
     * @param lista Lista de quimicos seleccionados
     */
    private void llenarListaQuimicosSeleccionados(List<Quimico> lista) {
        DefaultListModel d = new DefaultListModel();
        this.jListQuimicosSeleccionados.setModel(d);
        DefaultListModel a = (DefaultListModel) this.jListQuimicosSeleccionados.getModel();
        for (int i = 0; i < lista.size(); i++) {
            Quimico get = lista.get(i);
            a.addElement(String.valueOf(i + 1) + ". Nombre; " + get.getNombre() + ", Descripción; " + get.getDescripcion());
        }
    }

    /**
     * Limpia campos de texto,
     */
    private void limpiar() {
        this.txtCodigo.setText("");
        this.txtDescripcion.setText("");
        this.txtNombre.setText("");
        this.quimicosSistema = this.negocio.getQuimicos();
        this.seleccionados = new ArrayList<>();
        this.botones();
        DefaultListModel d = new DefaultListModel();
        this.jListQuimicosSistema.setModel(d);
        DefaultListModel a = (DefaultListModel) this.jListQuimicosSistema.getModel();
        for (int i = 0; i < quimicosSistema.size(); i++) {
            Quimico get = quimicosSistema.get(i);
            a.addElement(String.valueOf(i + 1) + ". Nombre; " + get.getNombre() + ", Descripción; " + get.getDescripcion());
        }
        DefaultListModel dd = new DefaultListModel();
        this.jListQuimicosSeleccionados.setModel(dd);
    }

    /**
     * Método para desactivar y activar los botones de agregar y eliminar
     */
    private void botones() {
        this.jButtonAgregar.setEnabled(false);
        this.jButtonEliminar.setEnabled(false);
        this.jButtonAgregar.setEnabled(true);
        this.jButtonEliminar.setEnabled(true);
    }

    /**
     * Método para llenar la lista de químicos y agregarlas dentro de una tabla
     *
     * @param lista Lista de quimicos del sistema
     */
    public void llenarListaQuimicos(List<Quimico> lista) {
        this.quimicosSistema = lista;
        this.seleccionados = new ArrayList<>();
        this.botones();
        DefaultListModel d = new DefaultListModel();
        this.jListQuimicosSistema.setModel(d);
        DefaultListModel a = (DefaultListModel) this.jListQuimicosSistema.getModel();
        for (int i = 0; i < lista.size(); i++) {
            Quimico get = lista.get(i);
            a.addElement(String.valueOf(i + 1) + ". Nombre; " + get.getNombre() + ", Descripción; " + get.getDescripcion());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JList<String> jListQuimicosSeleccionados;
    private javax.swing.JList<String> jListQuimicosSistema;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
