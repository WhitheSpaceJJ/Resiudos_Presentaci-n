/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import entidades.Residuo_Transporte;
import entidades.Solicitud_de_Traslado;
import entidades.Transporte;
import entidades.Usuario;
import implementaciones.FabricaNegocios;
import implementaciones.INegocio;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Frame del registro de asignacion de traslado.
 * @author Equipo 1 Jose,Abraham y Oroz
 */
public class FRegistroAsignacionTraslado extends javax.swing.JFrame {

    private static FRegistroAsignacionTraslado registroAsignacionTraslado;
    private INegocio negocio;
    private List<Solicitud_de_Traslado> listaSolcitudes;
    private List<Transporte> listaEmpresasT;

    /**
     * Patrón Singleton para que nomas se ocupe una instancia de este frame durante todo el transcurso del programa
     * @return  Instancia del frame de registro de asignacion de traslado
     */
    public static FRegistroAsignacionTraslado getInstance() {
        if (FRegistroAsignacionTraslado.registroAsignacionTraslado != null) {
            return FRegistroAsignacionTraslado.registroAsignacionTraslado;
        } else {
            FRegistroAsignacionTraslado.registroAsignacionTraslado = new FRegistroAsignacionTraslado();
            return FRegistroAsignacionTraslado.registroAsignacionTraslado;
        }
    }

    /**
     * Creates new form RegistroAsignacionTraslado
     */
    public FRegistroAsignacionTraslado() {
        initComponents();
        this.negocio = FabricaNegocios.crearFNegocio();
    }
    /**
     * Inicializa la lista de empresas de transporte
     * @param listaEmpresasT  Lista de empresas transportadoras a establecer.
     */
    public void setListaEmpresasT(List<Transporte> listaEmpresasT) {
        this.listaEmpresasT = listaEmpresasT;
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panelTablaProductos2 = new javax.swing.JScrollPane();
        tablaResiduos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButtonAsignar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Asignación Traslados");
        setPreferredSize(new java.awt.Dimension(755, 477));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel1.setText("Asignación Traslados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jLabel1)
                .addContainerGap(261, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 750, 50);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tablaResiduos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablaResiduos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Productor", "Fecha solicitada", "Residuos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaResiduos.setCellSelectionEnabled(true);
        tablaResiduos.getTableHeader().setReorderingAllowed(false);
        panelTablaProductos2.setViewportView(tablaResiduos);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Solicitudes no atendidas");

        jButtonAsignar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonAsignar.setText("Asignar Empresas");
        jButtonAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAsignarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelTablaProductos2, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jButtonAsignar)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(panelTablaProductos2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButtonAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 50, 750, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/**
 * Primero comprueba que se haya seleccionado alguna solicitud, una vez seleccionada se esconde la pantalla y abre un frame de DetallesAsignacion e inicializa las solicitudes y las empresas de transporte
 * @param evt Evento Action Perfomed del boton Asignar
 */
    private void jButtonAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAsignarActionPerformed

        int indice = this.tablaResiduos.getSelectedRow();
        if (indice == -1) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado alguna solicitud.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            this.setVisible(false);
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    FDetallesAsignacion p = FDetallesAsignacion.getInstance();
                    p.setSolicitudDeTraslado(listaSolcitudes.get(indice));
                    p.mostrarDatosSolicitud();
                    p.setListaEmpresasT(listaEmpresasT);
                    p.addWindowListener(new java.awt.event.WindowAdapter() {
                        @Override
                        public void windowClosing(java.awt.event.WindowEvent e) {
                            llenarTablaRegreso();
                            setVisible(true);
                        }
                    });
                    p.setVisible(true);
                }
            });
        }


    }//GEN-LAST:event_jButtonAsignarActionPerformed
  /**
   * Método para desactivar y activar el boton asignar
   */
    public void botones() {
        this.jButtonAsignar.setEnabled(false);
        this.jButtonAsignar.setEnabled(true);
    }

    /**
     * Método que llena la tabla de residuos con la lista de las solicitudes que se encuentren en un estatus de "En Proceso" y si la lista de solicitudes se encuentra vacia desactiva el boton de asignar
     */
    private void llenarTablaRegreso() {
        this.listaSolcitudes = this.negocio.consultarSolicitudesNoAtendidas();
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tablaResiduos.getModel();
        modeloTabla.setRowCount(0);

        listaSolcitudes.forEach(solicitudes -> {
            Object[] fila = new Object[3];
            fila[0] = solicitudes.getEmpresaProductora().getNombre();
            fila[1] = solicitudes.getFechaSolicitud().toString();
            String mensaje = "";
            for (int i = 0; i < solicitudes.getResiduos().size(); i++) {
                Residuo_Transporte residuo = solicitudes.getResiduos().get(i);
                if (residuo.getEstatus().equalsIgnoreCase("En Proceso")) {
                    mensaje += solicitudes.getResiduos().get(i).getResiduo().getNombre() + ",";
                }
            }
            fila[2] = mensaje;
            modeloTabla.addRow(fila);
        });
        if (listaSolcitudes.isEmpty()) {
            this.jButtonAsignar.setEnabled(false);
        }
    }
/**
 * Método para mostrar en la tabla de residuos la lista de solicitudes no atendidas
 * @param lista Lista de solicitudes no atendidas.
 */
    public void mostrarSolicitudesNoAtendidas(List<Solicitud_de_Traslado> lista) {
        this.listaSolcitudes = lista;
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tablaResiduos.getModel();
        modeloTabla.setRowCount(0);
        listaSolcitudes.forEach(solicitudes -> {
            Object[] fila = new Object[3];
            fila[0] = solicitudes.getEmpresaProductora().getNombre();
            fila[1] = solicitudes.getFechaSolicitud().toString();
            String mensaje = "";
            for (int i = 0; i < solicitudes.getResiduos().size(); i++) {
                Residuo_Transporte residuo = solicitudes.getResiduos().get(i);
                if (residuo.getEstatus().equalsIgnoreCase("En Proceso")) {
                    mensaje += solicitudes.getResiduos().get(i).getResiduo().getNombre() + ",";
                }
            }
            fila[2] = mensaje;
            modeloTabla.addRow(fila);
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAsignar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane panelTablaProductos2;
    private javax.swing.JTable tablaResiduos;
    // End of variables declaration//GEN-END:variables
}