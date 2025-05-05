/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package SIstemaDeGestion.Presentacion;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import sistemagestionrecursoshumano.SistemaRecursosHumanos;
import sistemagestionrecursoshumano.Departamento;
/**
 *
 * @author juanc
 */
public class mostrarDepartamento extends javax.swing.JDialog {

    private SistemaRecursosHumanos sistema;
    private VentanaPrincipal ventanaPrincipal;
    private ArrayList<Departamento> departamentos;
    
    public mostrarDepartamento(java.awt.Frame parent, boolean modal,SistemaRecursosHumanos sistema,VentanaPrincipal ventana) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            this.setIconImage(new ImageIcon(getClass().getResource("/SistemaDeGestion.images/CasaInicio.png")).getImage());
        } catch (Exception e) {
            System.out.println("Error en tiempo de ejecución ");
        }
        
        this.ventanaPrincipal=ventana;
        this.sistema=sistema;
        this.departamentos=sistema.obtenerDepartamento();
        this.llenarTabla();
      
    }
    public void llenarTabla(){
       DefaultTableModel modeltabla = new DefaultTableModel(new String[]{"ID","NOMBRE"},this.departamentos.size());
       this.TablaDepartamentos.setModel(modeltabla);
       TableModel DatosModelO= TablaDepartamentos.getModel();
        for (int i = 0; i < this.departamentos.size(); i++) {
            Departamento p=this.departamentos.get(i);
            DatosModelO.setValueAt(p.getId(), i, 0);
            DatosModelO.setValueAt(p.getNombre(), i, 1);
        }
    }

      
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        bnoActualizarDepartamento = new javax.swing.JButton();
        btnBotonVolverMostrarDEpartamento = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDepartamentos = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(226, 220, 246));

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
        jLabel1.setText("Mostrar Departamentos");

        jButton1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bnoActualizarDepartamento.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        bnoActualizarDepartamento.setText("Actualizar");
        bnoActualizarDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnoActualizarDepartamentoActionPerformed(evt);
            }
        });

        btnBotonVolverMostrarDEpartamento.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnBotonVolverMostrarDEpartamento.setText("Volver");
        btnBotonVolverMostrarDEpartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBotonVolverMostrarDEpartamentoActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        TablaDepartamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaDepartamentos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TablaDepartamentos);
        if (TablaDepartamentos.getColumnModel().getColumnCount() > 0) {
            TablaDepartamentos.getColumnModel().getColumn(0).setResizable(false);
            TablaDepartamentos.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bnoActualizarDepartamento)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBotonVolverMostrarDEpartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(bnoActualizarDepartamento)
                        .addGap(106, 106, 106)
                        .addComponent(btnBotonVolverMostrarDEpartamento))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int fila=this.TablaDepartamentos.getSelectedRow();
        if (fila>=0) {
            Departamento P= this.departamentos.get(fila);
            int opcionEl=JOptionPane.showConfirmDialog(this,"¿seguro que desea el departamento: "+ P.getNombre());
            
            if (opcionEl==0) {
                this.sistema.eliminarDepartamento(P.getId());
            this.departamentos=this.sistema.obtenerDepartamento();
            this.llenarTabla();
        
            }     
        }else{
            JOptionPane.showMessageDialog(this, "No a seleccionado un producto a eliminar");
        }      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBotonVolverMostrarDEpartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBotonVolverMostrarDEpartamentoActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnBotonVolverMostrarDEpartamentoActionPerformed

    private void bnoActualizarDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnoActualizarDepartamentoActionPerformed
       int fila=this.TablaDepartamentos.getSelectedRow();
        if (fila>=0) {
            Departamento p= this.departamentos.get(fila);
            actualizarDepartamento ventaActualizar= new actualizarDepartamento(this.ventanaPrincipal,true,sistema,p,this);
            ventaActualizar.setVisible(true);
        }
    }//GEN-LAST:event_bnoActualizarDepartamentoActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDepartamentos;
    private javax.swing.JButton bnoActualizarDepartamento;
    private javax.swing.JButton btnBotonVolverMostrarDEpartamento;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
