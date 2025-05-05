
package SIstemaDeGestion.Presentacion;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import sistemagestionrecursoshumano.SistemaRecursosHumanos;

/**
 *
 * @author juanc
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private SistemaRecursosHumanos sistema;
    public VentanaPrincipal(SistemaRecursosHumanos sistema) {
        this.sistema = sistema;
        initComponents();
        this.setEnabled(true);
        this.setLocationRelativeTo(null);
        try {
            this.setIconImage(new ImageIcon(getClass().getResource("/SistemaDeGestion.images/grupoDePersonas8080.png")).getImage());
        } catch (Exception e) {
            System.out.println("Error en tiempo de ejecución ");
        }
      
        
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TituloVentanaPrincipal = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnCrearEmpleado = new javax.swing.JPanel();
        jlabelcrearEmpleado = new javax.swing.JLabel();
        jLabelcrearEmpleado1 = new javax.swing.JLabel();
        bnoCrearDepartamento = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblMenuPrincipal = new javax.swing.JLabel();
        BtnMostrarEmpleado = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnMostrarDepartamento = new javax.swing.JPanel();
        jLabelDE = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnBuscarEmpleado = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnBuscarDepartamento = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VentanaPrincipal");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setEnabled(false);
        setPreferredSize(new java.awt.Dimension(750, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 500));

        jPanel1.setBackground(new java.awt.Color(226, 220, 243));

        TituloVentanaPrincipal.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        TituloVentanaPrincipal.setText("SISTEMA DE RECURSOS HUMANOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(TituloVentanaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(TituloVentanaPrincipal)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 400));

        btnCrearEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        btnCrearEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearEmpleadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCrearEmpleadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCrearEmpleadoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCrearEmpleadoMousePressed(evt);
            }
        });

        jlabelcrearEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeGestion.images/crear_persona_80x80.png"))); // NOI18N

        jLabelcrearEmpleado1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelcrearEmpleado1.setText("Crear Empleado");

        javax.swing.GroupLayout btnCrearEmpleadoLayout = new javax.swing.GroupLayout(btnCrearEmpleado);
        btnCrearEmpleado.setLayout(btnCrearEmpleadoLayout);
        btnCrearEmpleadoLayout.setHorizontalGroup(
            btnCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCrearEmpleadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btnCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCrearEmpleadoLayout.createSequentialGroup()
                        .addComponent(jlabelcrearEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCrearEmpleadoLayout.createSequentialGroup()
                        .addComponent(jLabelcrearEmpleado1)
                        .addContainerGap())))
        );
        btnCrearEmpleadoLayout.setVerticalGroup(
            btnCrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCrearEmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlabelcrearEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelcrearEmpleado1)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        bnoCrearDepartamento.setBackground(new java.awt.Color(255, 255, 255));
        bnoCrearDepartamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bnoCrearDepartamentoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bnoCrearDepartamentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bnoCrearDepartamentoMouseExited(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeGestion.images/agregarDepartameto.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setText("Agregar ");

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setText("Departamento");

        javax.swing.GroupLayout bnoCrearDepartamentoLayout = new javax.swing.GroupLayout(bnoCrearDepartamento);
        bnoCrearDepartamento.setLayout(bnoCrearDepartamentoLayout);
        bnoCrearDepartamentoLayout.setHorizontalGroup(
            bnoCrearDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bnoCrearDepartamentoLayout.createSequentialGroup()
                .addGroup(bnoCrearDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bnoCrearDepartamentoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(bnoCrearDepartamentoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(bnoCrearDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(bnoCrearDepartamentoLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        bnoCrearDepartamentoLayout.setVerticalGroup(
            bnoCrearDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bnoCrearDepartamentoLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        lblMenuPrincipal.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblMenuPrincipal.setText("Menú Principal");

        BtnMostrarEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        BtnMostrarEmpleado.setPreferredSize(new java.awt.Dimension(116, 118));
        BtnMostrarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnMostrarEmpleadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnMostrarEmpleadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnMostrarEmpleadoMouseExited(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeGestion.images/mostrarempleado.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText(" Mostrar");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("Empleados");

        javax.swing.GroupLayout BtnMostrarEmpleadoLayout = new javax.swing.GroupLayout(BtnMostrarEmpleado);
        BtnMostrarEmpleado.setLayout(BtnMostrarEmpleadoLayout);
        BtnMostrarEmpleadoLayout.setHorizontalGroup(
            BtnMostrarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnMostrarEmpleadoLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(BtnMostrarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BtnMostrarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );
        BtnMostrarEmpleadoLayout.setVerticalGroup(
            BtnMostrarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnMostrarEmpleadoLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnMostrarDepartamento.setBackground(new java.awt.Color(255, 255, 255));
        btnMostrarDepartamento.setPreferredSize(new java.awt.Dimension(148, 136));
        btnMostrarDepartamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMostrarDepartamentoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMostrarDepartamentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMostrarDepartamentoMouseExited(evt);
            }
        });

        jLabelDE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeGestion.images/mostarDepartamento.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText("  Mostrar");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setText("Departamentos");

        javax.swing.GroupLayout btnMostrarDepartamentoLayout = new javax.swing.GroupLayout(btnMostrarDepartamento);
        btnMostrarDepartamento.setLayout(btnMostrarDepartamentoLayout);
        btnMostrarDepartamentoLayout.setHorizontalGroup(
            btnMostrarDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMostrarDepartamentoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(btnMostrarDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(btnMostrarDepartamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnMostrarDepartamentoLayout.setVerticalGroup(
            btnMostrarDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMostrarDepartamentoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabelDE, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        btnBuscarEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarEmpleadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarEmpleadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarEmpleadoMouseExited(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeGestion.images/Buscar Empleado.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel14.setText(" Buscar");

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel15.setText("Empleado");

        javax.swing.GroupLayout btnBuscarEmpleadoLayout = new javax.swing.GroupLayout(btnBuscarEmpleado);
        btnBuscarEmpleado.setLayout(btnBuscarEmpleadoLayout);
        btnBuscarEmpleadoLayout.setHorizontalGroup(
            btnBuscarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBuscarEmpleadoLayout.createSequentialGroup()
                .addGroup(btnBuscarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnBuscarEmpleadoLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(btnBuscarEmpleadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(btnBuscarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(btnBuscarEmpleadoLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnBuscarEmpleadoLayout.setVerticalGroup(
            btnBuscarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBuscarEmpleadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        btnBuscarDepartamento.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarDepartamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarDepartamentoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarDepartamentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarDepartamentoMouseExited(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeGestion.images/BuscardePartamento.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setText("      Buscar");

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel12.setText("Departamento");

        javax.swing.GroupLayout btnBuscarDepartamentoLayout = new javax.swing.GroupLayout(btnBuscarDepartamento);
        btnBuscarDepartamento.setLayout(btnBuscarDepartamentoLayout);
        btnBuscarDepartamentoLayout.setHorizontalGroup(
            btnBuscarDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btnBuscarDepartamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnBuscarDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10))
                .addGap(0, 3, Short.MAX_VALUE))
        );
        btnBuscarDepartamentoLayout.setVerticalGroup(
            btnBuscarDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBuscarDepartamentoLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(bnoCrearDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMostrarDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnCrearEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(BtnMostrarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBuscarDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMenuPrincipal)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnMostrarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(btnCrearEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 132, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bnoCrearDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarDepartamento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(393, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnoCrearDepartamentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnoCrearDepartamentoMouseExited
        this.mouseSaliendo(bnoCrearDepartamento);
    }//GEN-LAST:event_bnoCrearDepartamentoMouseExited

    private void bnoCrearDepartamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnoCrearDepartamentoMouseEntered
        this.mouseEntrando(bnoCrearDepartamento);
    }//GEN-LAST:event_bnoCrearDepartamentoMouseEntered

    private void bnoCrearDepartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnoCrearDepartamentoMouseClicked
        agregarDepartamento agregarI = new agregarDepartamento(this, true, sistema, this);
        agregarI.setVisible(true);
    }//GEN-LAST:event_bnoCrearDepartamentoMouseClicked

    private void btnCrearEmpleadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearEmpleadoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearEmpleadoMousePressed

    private void btnCrearEmpleadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearEmpleadoMouseExited
        this.mouseSaliendo(btnCrearEmpleado);
    }//GEN-LAST:event_btnCrearEmpleadoMouseExited

    private void btnCrearEmpleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearEmpleadoMouseEntered
        this.mouseEntrando(btnCrearEmpleado);
    }//GEN-LAST:event_btnCrearEmpleadoMouseEntered

    private void btnCrearEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearEmpleadoMouseClicked
        agregarEmpleados agregar=new agregarEmpleados(this,true,sistema,this);
        agregar.setVisible(true);
    }//GEN-LAST:event_btnCrearEmpleadoMouseClicked

    private void btnBuscarEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarEmpleadoMouseClicked
        buscarEmpleado buscarI= new buscarEmpleado(this,true,sistema,this);
        buscarI.setVisible(true);
    }//GEN-LAST:event_btnBuscarEmpleadoMouseClicked

    private void btnBuscarEmpleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarEmpleadoMouseEntered
        this.mouseEntrando(btnBuscarEmpleado);
    }//GEN-LAST:event_btnBuscarEmpleadoMouseEntered

    private void btnBuscarEmpleadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarEmpleadoMouseExited
        this.mouseSaliendo(btnBuscarEmpleado);
    }//GEN-LAST:event_btnBuscarEmpleadoMouseExited

    private void btnBuscarDepartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarDepartamentoMouseClicked
        buscarDepartamento buscar= new buscarDepartamento(this,true,sistema,this);
        buscar.setVisible(true);
    }//GEN-LAST:event_btnBuscarDepartamentoMouseClicked

    private void btnBuscarDepartamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarDepartamentoMouseEntered
        this.mouseEntrando(btnBuscarDepartamento);
    }//GEN-LAST:event_btnBuscarDepartamentoMouseEntered

    private void btnBuscarDepartamentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarDepartamentoMouseExited
        this.mouseSaliendo(btnBuscarDepartamento);
    }//GEN-LAST:event_btnBuscarDepartamentoMouseExited

    private void btnMostrarDepartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarDepartamentoMouseClicked
        mostrarDepartamento mostrarI= new mostrarDepartamento(this,true,sistema,this);
        mostrarI.setVisible(true);
    }//GEN-LAST:event_btnMostrarDepartamentoMouseClicked

    private void btnMostrarDepartamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarDepartamentoMouseEntered
        this.mouseEntrando(btnMostrarDepartamento);
    }//GEN-LAST:event_btnMostrarDepartamentoMouseEntered

    private void btnMostrarDepartamentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarDepartamentoMouseExited
        this.mouseSaliendo(btnMostrarDepartamento);
    }//GEN-LAST:event_btnMostrarDepartamentoMouseExited

    private void BtnMostrarEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMostrarEmpleadoMouseClicked
        mostrarEmpleados mostrarD= new mostrarEmpleados(this,true,sistema,this);
        mostrarD.setVisible(true);
    }//GEN-LAST:event_BtnMostrarEmpleadoMouseClicked

    private void BtnMostrarEmpleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMostrarEmpleadoMouseEntered
        this.mouseEntrando(BtnMostrarEmpleado);
    }//GEN-LAST:event_BtnMostrarEmpleadoMouseEntered

    private void BtnMostrarEmpleadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMostrarEmpleadoMouseExited
        this.mouseSaliendo(BtnMostrarEmpleado);
    }//GEN-LAST:event_BtnMostrarEmpleadoMouseExited

    private void mouseEntrando(JPanel panel){
        panel.setBackground(new Color(181,216,252));
    }
    private void mouseSaliendo(JPanel panel){
        panel.setBackground(Color.WHITE);
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnMostrarEmpleado;
    private javax.swing.JLabel TituloVentanaPrincipal;
    private javax.swing.JPanel bnoCrearDepartamento;
    private javax.swing.JPanel btnBuscarDepartamento;
    private javax.swing.JPanel btnBuscarEmpleado;
    private javax.swing.JPanel btnCrearEmpleado;
    private javax.swing.JPanel btnMostrarDepartamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDE;
    private javax.swing.JLabel jLabelcrearEmpleado1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlabelcrearEmpleado;
    private javax.swing.JLabel lblMenuPrincipal;
    // End of variables declaration//GEN-END:variables
}
