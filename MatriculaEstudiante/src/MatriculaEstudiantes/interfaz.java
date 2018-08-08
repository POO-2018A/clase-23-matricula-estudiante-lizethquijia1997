package MatriculaEstudiantes;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class interfaz extends javax.swing.JFrame {
    String estudiantes[][]; 
    List<Estudiantes> listaEstudiantes = new ArrayList<Estudiantes>(); 
    DefaultTableModel modeloTablaEstudiantes;
    DefaultComboBoxModel modeloComboBoxEstudiantes = new DefaultComboBoxModel(listaEstudiantes.toArray());
    
    String materias[][];
    List<Materias> listaMaterias = new ArrayList<Materias>();
    DefaultTableModel modeloTablaMaterias;
    DefaultComboBoxModel modeloComboBoxMaterias = new DefaultComboBoxModel(listaMaterias.toArray());
    
    String matriculas[][];
    DefaultTableModel modeloTablaMatricula;

    /**
     * Creates new form GUIMatriculaEstudiantes
     */
    public interfaz() {
        initComponents();
        
        String titulosTablaEstudiante[] = new String[]{"Nombre", "Apellido"};
        modeloTablaEstudiantes = new DefaultTableModel(estudiantes, titulosTablaEstudiante); 
        tbnEstudiante.setModel(modeloTablaEstudiantes);
        
        String titulosTablaMaterias[] = new String[]{"Materia"};
        modeloTablaMaterias = new DefaultTableModel(materias, titulosTablaMaterias);
        tblMaterias.setModel(modeloTablaMaterias);
        
        String titulosTablaMatricula[] = new String[]{"Materia","Estudiante"};
        modeloTablaMatricula = new DefaultTableModel(matriculas, titulosTablaMatricula);
        tblMatricula.setModel(modeloTablaMatricula);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbpEstudiante = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbnEstudiante = new javax.swing.JTable();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        btnEstudiante = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMaterias = new javax.swing.JTable();
        lblMateria = new javax.swing.JLabel();
        txtMateria = new javax.swing.JTextField();
        buttonRegistrarMaterias = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblEstudiante = new javax.swing.JLabel();
        lblMateriaM = new javax.swing.JLabel();
        cmbMateria = new javax.swing.JComboBox();
        cmbEstudiantes = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMatricula = new javax.swing.JTable();
        btnRegistroMatricula = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbnEstudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbnEstudiante);

        lblNombre.setText("Nombre:");

        lblApellido.setText("Apellido:");

        btnEstudiante.setText("Registrar");
        btnEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstudianteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblApellido)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 345, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(btnEstudiante)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnEstudiante)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        tbpEstudiante.addTab("Estudiante", jPanel1);

        tblMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblMaterias);

        lblMateria.setText("Materia:");

        buttonRegistrarMaterias.setText("Registrar materia");
        buttonRegistrarMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarMateriasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(buttonRegistrarMaterias))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(lblMateria)
                        .addGap(18, 18, 18)
                        .addComponent(txtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMateria)
                    .addComponent(txtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(buttonRegistrarMaterias)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        tbpEstudiante.addTab("Materia", jPanel2);

        lblEstudiante.setText("Estudiante:");

        lblMateriaM.setText("Materia:");

        cmbEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEstudiantesActionPerformed(evt);
            }
        });

        tblMatricula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblMatricula);

        btnRegistroMatricula.setText("Registrar Matricula");
        btnRegistroMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroMatriculaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(btnRegistroMatricula))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblMateriaM)
                                .addGap(18, 18, 18)
                                .addComponent(cmbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(lblEstudiante)
                                .addGap(18, 18, 18)
                                .addComponent(cmbEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMateriaM)
                    .addComponent(lblEstudiante)
                    .addComponent(cmbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btnRegistroMatricula)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(199, Short.MAX_VALUE))
        );

        tbpEstudiante.addTab("Matricula", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(tbpEstudiante)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbpEstudiante)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstudianteActionPerformed
        
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        
        
        if(nombre.equals("") || apellido.equals("") ){
            int iconoAdvertencia = JOptionPane.WARNING_MESSAGE;
            JOptionPane.showMessageDialog(rootPane, "Ingresa los datos, debe estar todo lleno", "ADVERTENCIA", iconoAdvertencia);
        }else{
            modeloTablaEstudiantes.addRow(new String[]{nombre,apellido});
            Estudiantes persona1 = new Estudiantes(nombre,apellido); 
            cmbEstudiantes.addItem(persona1); 
        
        }
        
        
    }//GEN-LAST:event_btnEstudianteActionPerformed

    private void buttonRegistrarMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarMateriasActionPerformed
        
        String materia = txtMateria.getText(); 
        
         if(materia.equals("")){
            int iconoAdvertencia = JOptionPane.WARNING_MESSAGE;
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar una materia", "ADVERTENCIA", iconoAdvertencia);
        }else{
            modeloTablaMaterias.addRow(new String[]{materia});
            Materias asignatura = new Materias(materia);
            cmbMateria.addItem(asignatura); 
           
         }
    }//GEN-LAST:event_buttonRegistrarMateriasActionPerformed

    private void btnRegistroMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroMatriculaActionPerformed
        
        String materias = cmbMateria.getSelectedItem().toString();
        String estudiantes = cmbEstudiantes.getSelectedItem().toString();
        modeloTablaMatricula.addRow(new String[]{materias, estudiantes});
        
        System.out.println("Usted seleccionó la materia: "+cmbMateria.getSelectedItem());
        System.out.println("Usted seleccionó el estudiante: "+cmbEstudiantes.getSelectedItem());
        System.out.println("");
    }//GEN-LAST:event_btnRegistroMatriculaActionPerformed

    private void cmbEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstudiantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEstudiantesActionPerformed

    
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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEstudiante;
    private javax.swing.JButton btnRegistroMatricula;
    private javax.swing.JButton buttonRegistrarMaterias;
    private javax.swing.JComboBox cmbEstudiantes;
    private javax.swing.JComboBox cmbMateria;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblEstudiante;
    private javax.swing.JLabel lblMateria;
    private javax.swing.JLabel lblMateriaM;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTable tblMaterias;
    private javax.swing.JTable tblMatricula;
    private javax.swing.JTable tbnEstudiante;
    private javax.swing.JTabbedPane tbpEstudiante;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtMateria;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
