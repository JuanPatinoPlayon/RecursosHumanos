/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package SIstemaDeGestion.Presentacion;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import sistemagestionrecursoshumano.Empleado;
import sistemagestionrecursoshumano.SistemaRecursosHumanos;

/**
 *
 * @author juanc
 */
public class actualizarEmpleado extends javax.swing.JDialog {

    private SistemaRecursosHumanos sistema;
    private mostrarEmpleados ventanaEmpleado;
    private Empleado empleado;
    
    public actualizarEmpleado(java.awt.Frame parent, boolean modal,SistemaRecursosHumanos sistema,Empleado empleado,mostrarEmpleados ventanaEmpleado) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            this.setIconImage(new ImageIcon(getClass().getResource("/SistemaDeGestion.images/CasaInicio.png")).getImage());
        } catch (Exception e) {
            System.out.println("Error en tiempo de ejecución ");
        }
        this.sistema=sistema;
        this.ventanaEmpleado=ventanaEmpleado;
        this.empleado=empleado;
        
        this.TxtNombreActualizarEmpleado.setText(this.empleado.getNombre());
        this.TxtApellidoActualizarEmpleado.setText(this.empleado.getApellido());
      
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
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtNombreActualizarEmpleado = new javax.swing.JTextField();
        btnActualisarEmpleado = new javax.swing.JButton();
        btnVolverActualizarEmpleado = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        TxtApellidoActualizarEmpleado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(503, 375));

        jPanel1.setBackground(new java.awt.Color(222, 220, 246));
        jPanel1.setPreferredSize(new java.awt.Dimension(504, 117));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 26)); // NOI18N
        jLabel8.setText("SISTEMA DE RECURSOS HUMANOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel8)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setText("Actualizar Empleado");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");

        btnActualisarEmpleado.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnActualisarEmpleado.setText("Actualizar");
        btnActualisarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualisarEmpleadoActionPerformed(evt);
            }
        });

        btnVolverActualizarEmpleado.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnVolverActualizarEmpleado.setText("Volver");
        btnVolverActualizarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActualizarEmpleadoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setText("Apellido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnActualisarEmpleado)
                                .addGap(50, 50, 50)
                                .addComponent(btnVolverActualizarEmpleado))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtNombreActualizarEmpleado)
                                    .addComponent(TxtApellidoActualizarEmpleado))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TxtNombreActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3))
                    .addComponent(TxtApellidoActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualisarEmpleado)
                    .addComponent(btnVolverActualizarEmpleado))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualisarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualisarEmpleadoActionPerformed
        String nombre=this.TxtNombreActualizarEmpleado.getText();
        try  {
            String apellido=this.TxtApellidoActualizarEmpleado.getText();
            this.empleado.setNombre(nombre);
            this.empleado.setApellido(apellido);
            this.sistema.actualizarEmpleado(this.empleado.getId(), empleado);
            JOptionPane.showMessageDialog(this, "Producto actualizado");
            this.dispose();
            this.ventanaEmpleado.llenarTabla();
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_btnActualisarEmpleadoActionPerformed

    private void btnVolverActualizarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActualizarEmpleadoActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActualizarEmpleadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtApellidoActualizarEmpleado;
    private javax.swing.JTextField TxtNombreActualizarEmpleado;
    private javax.swing.JButton btnActualisarEmpleado;
    private javax.swing.JButton btnVolverActualizarEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
