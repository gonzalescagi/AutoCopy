package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.JLabel;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import model.IconCellRenderer;
import model.Tarea;

public class Inicio extends javax.swing.JFrame {

    int e = 0;
    int dispositivos;
    Timer temporizador = new Timer();
    DefaultTableModel model;
    Tarea tarea;

    /**
     * Creates new form Inicioi
     */
    public Inicio() throws IOException, SQLException {
        initComponents();
        imprimirDispositivos();
        cargartabla();
        cargarArbol();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        txt1 = new javax.swing.JLabel();
        btn_scan = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        unidades = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnProcesar = new javax.swing.JToggleButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AUTOCOPY");

        jLabel2.setText("Seleccione su carpeta de destino");

        jTree1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTree1.setEnabled(false);
        jTree1.setOpaque(false);
        jScrollPane2.setViewportView(jTree1);

        jLabel3.setText("Dispositivos de almacenamiento USBs conectados");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Extraer carpeta de la USB");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Copiar carpeta a la USB");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jTextField1.setToolTipText("Carpeta de la raiz");
        jTextField1.setEnabled(false);

        txt1.setText("Ingrese la ruta de extracción:");

        btn_scan.setBackground(new java.awt.Color(255, 0, 0));
        btn_scan.setForeground(new java.awt.Color(255, 255, 255));
        btn_scan.setText("Scan USBs");
        btn_scan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_scanActionPerformed(evt);
            }
        });

        jButton1.setText("Informe");

        unidades.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        unidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "UNIDAD", "NOMBRE", "ESPACIO"
            }
        ));
        unidades.setGridColor(new java.awt.Color(51, 153, 255));
        unidades.setOpaque(false);
        unidades.setRowHeight(25);
        unidades.setShowHorizontalLines(false);
        unidades.setShowVerticalLines(false);
        jScrollPane3.setViewportView(unidades);

        jLabel4.setText("Trasnferencias USB:");

        jLabel6.setText("Errores:");

        jLabel5.setText("0");

        jLabel7.setText("0");

        btnProcesar.setText("Ejecutar");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jRadioButton2))
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_scan, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProcesar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addGap(12, 12, 12)
                        .addComponent(txt1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_scan, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        //Muestra un mensaje para pedir el nombre de la carperta copiar
        if (jRadioButton2.isSelected()) {
            jTextField1.setEnabled(false);
            jTree1.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void btn_scanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_scanActionPerformed

        if (btn_scan.isSelected()) {
            btn_scan.setBackground(Color.green);
            btn_scan.setForeground(Color.blue);
            btn_scan.setText("Scaneo en Proceso");
            actualizacion(0);

        } else {
            btn_scan.setBackground(Color.red);
            btn_scan.setForeground(Color.black);
            btn_scan.setText("Scan USBs");
            actualizacion(1);
        }

    }//GEN-LAST:event_btn_scanActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        //Muestra un mensaje para pedir el nombre de la carperta copiar
        if (jRadioButton1.isSelected()) {
            jTextField1.setEnabled(true);
            txt1.setText("Nombre de la carpeta a extraer:");
            jTree1.setEnabled(false);
        }

    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        cargarArbol();
    }//GEN-LAST:event_btnProcesarActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Inicio().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnProcesar;
    private javax.swing.JToggleButton btn_scan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel txt1;
    private javax.swing.JTable unidades;
    // End of variables declaration//GEN-END:variables

    private void imprimirDispositivos() {
//        ArrayList array = new ArrayList();
//        DefaultListModel modelo = new DefaultListModel();
//
//        modelo.removeAllElements();
//        File unidades[] = File.listRoots();
//        for (int i = 0; i < unidades.length; i++) {
////            modelo.addElement(FileSystemView.getFileSystemView().getSystemDisplayName(unidades[i]));
////            modelo.addElement(FileSystemView.getFileSystemView().getDefaultDirectory()); //ubicacion actual 
//            modelo.addElement(FileSystemView.getFileSystemView().getSystemIcon(unidades[i]));//iconos de las unicades
//            modelo.addElement(FileSystemView.getFileSystemView().getSystemTypeDescription(unidades[i]));
//            modelo.addElement(FileSystemView.getFileSystemView().getHomeDirectory());
//        }
//        jListDispositivos.setModel(modelo);

    }

    public void cargartabla() {

        model = (DefaultTableModel) unidades.getModel(); //se realiza un casteo para la tabla tbAlumnos
        //Se obtiene la informacion de los dispositivos icono y nombre
//        File vunidades[] = File.listRoots();
        File vunidades[] = File.listRoots();
        dispositivos = vunidades.length;
        ArrayList<Icon> listaImagenes = new ArrayList();
        FileSystemView view = FileSystemView.getFileSystemView();
        for (int i = 0; i < dispositivos; i++) {
            Icon icon = view.getSystemIcon(vunidades[i]);
            listaImagenes.add(icon);
        }
        //se actualiza
        int a;
        for (a = 0; a < model.getColumnCount(); a++) {
            int b;
            for (b = 0; b < vunidades.length; b++) {

                if (model.getValueAt(a, 1) != vunidades[b]) {

                } else {
                }
            }
        }

        model.setRowCount(0);//se vacea la tabla
        unidades.setModel(model);//se asigna
        TableColumnModel columnModel = unidades.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(70);
        columnModel.getColumn(1).setPreferredWidth(250);

        unidades.setDefaultRenderer(Object.class, new IconCellRenderer());

        for (int i = 0; i < vunidades.length; i++) {
            String des = view.getSystemDisplayName(vunidades[i]);
            Object[] fila = {new JLabel(listaImagenes.get(i)), des, "2"};
            model.addRow(fila);
        }
    }

    private void actualizacion(int val) {
        if (val == 0) {
           tarea = new Tarea();
           temporizador.scheduleAtFixedRate(tarea, 0, 1000 * 3);
        }else{
            tarea.cancel();
        }
    }

    public class ClaseTime implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("nuvo cambio a la vista");
        }
    }

    public class Tarea extends TimerTask {
       
        public Tarea() {
        }

        @Override
        public void run() {
             try {  
            File tem[] = File.listRoots();
            System.out.println(model.getRowCount());
            System.out.println(tem.length);
            System.out.println("........................");
            if (model.getRowCount() != tem.length) {
                cargartabla();
                System.out.println("NUEVO CICLO ok");
            } else {
                System.out.println("----------");
            }
            } finally {
                }
        }
    }
    //ARBOL DE ARCHIVOS

    private void cargarArbol() {
        btnProcesar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {

                DefaultTreeModel arbol = (DefaultTreeModel) jTree1.getModel();
                DefaultMutableTreeNode nroot = new DefaultMutableTreeNode("Árbol de directorios");
               
                arbol.setRoot(nroot);
                CargaEstD(arbol, nroot, "/");
            }
        });

    }

    private void CargaEstD(DefaultTreeModel arbol, DefaultMutableTreeNode padre, String ruta) {
        DefaultMutableTreeNode aux = null;

        File archivo = new File(ruta);
        File[] archivos = archivo.listFiles();

        if (archivos != null) {
            for (int i = 0; i < archivos.length; i++) {

                aux = new DefaultMutableTreeNode(archivos[i].getName());
                arbol.insertNodeInto(aux, padre, i);

                if (archivos[i].isDirectory()) {
                    try {
                        CargaEstD(arbol, aux, archivos[i].getAbsolutePath() + "/");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }

            }

        }
    }

}

//con ese código saldrán las letras de las unidades y si uno quiere saber las etiquetas habrá que importar también javax.swing.filechooser.FileSystemView
//File unidades[] = File.listRoots();
//for(int i=0;i<unidades.length;i++)
//{
//        System.out.println(unidades[i]);
//       System.out.println(FileSystemView.getFileSystemView().getSystemDisplayName (unidades[i]));
//}

