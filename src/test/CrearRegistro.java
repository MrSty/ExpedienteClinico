/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Clinica;
import domain.Paciente;
import domain.Registro;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcelo
 */
public class CrearRegistro extends javax.swing.JFrame {

    /**
     * Creates new form BuscarCita
     */
    public CrearRegistro() {
        initComponents();
    }

    Clinica cln = new Clinica();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfPaciente = new javax.swing.JTextField();
        bAnterior = new javax.swing.JButton();
        bSiguiente = new javax.swing.JButton();
        tfDiagnostico = new javax.swing.JTextField();
        tfTratamiento = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        bVolver = new javax.swing.JButton();

        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1002, 556));
        setPreferredSize(new java.awt.Dimension(1058, 607));
        setResizable(false);
        setSize(new java.awt.Dimension(1058, 607));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nuevo Registro");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 330, 50));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 204));
        jLabel3.setText("Tratamiento:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 150, 30));

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 204));
        jLabel4.setText("Paciente:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 110, 30));

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("Diganostico:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 150, 30));

        tfPaciente.setEditable(false);
        tfPaciente.setBackground(new java.awt.Color(0, 0, 51));
        tfPaciente.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tfPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 340, -1));

        bAnterior.setBackground(new java.awt.Color(0, 0, 51));
        bAnterior.setForeground(new java.awt.Color(102, 204, 255));
        bAnterior.setText("<<");
        bAnterior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        bAnterior.setFocusPainted(false);
        bAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAnteriorActionPerformed(evt);
            }
        });
        jPanel1.add(bAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(826, 170, 30, 20));

        bSiguiente.setBackground(new java.awt.Color(0, 0, 51));
        bSiguiente.setForeground(new java.awt.Color(102, 204, 255));
        bSiguiente.setText(">>");
        bSiguiente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        bSiguiente.setFocusPainted(false);
        bSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(bSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 170, 30, 20));

        tfDiagnostico.setBackground(new java.awt.Color(0, 0, 51));
        tfDiagnostico.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tfDiagnostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 340, -1));

        tfTratamiento.setBackground(new java.awt.Color(0, 0, 51));
        tfTratamiento.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tfTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 360, 30));

        jButton1.setBackground(new java.awt.Color(0, 0, 51));
        jButton1.setForeground(new java.awt.Color(102, 204, 255));
        jButton1.setText("Guardar");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, 70, 30));

        bVolver.setBackground(new java.awt.Color(0, 0, 51));
        bVolver.setForeground(new java.awt.Color(102, 204, 255));
        bVolver.setText("Volver");
        bVolver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        bVolver.setFocusPainted(false);
        bVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverActionPerformed(evt);
            }
        });
        jPanel1.add(bVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnteriorActionPerformed
        Paciente e;
        boolean ant = this.cln.antPaciente();
        if(ant){
            e = this.cln.leerPacienteAct();
            this.mostrarPaciente(e);
        }else{
            JOptionPane.showMessageDialog(this, "Ya no hay pacientes para mostrar","Nueva Cita",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bAnteriorActionPerformed

    private void bSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSiguienteActionPerformed
        Paciente e;
        boolean sig = this.cln.sigPaciente();

        if(sig){
        e = this.cln.leerPacienteAct();
        this.mostrarPaciente(e);
        }else{
            JOptionPane.showMessageDialog(this, "Ya no hay pacientes para mostrar","Nueva Cita",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bSiguienteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     cln.cargarPacientes();
        Paciente s = this.cln.leerPaciente();
        this.mostrarPaciente(s);
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Registro n = new Registro();
        n.setPac(this.tfPaciente.getText());
        n.setDiagnostico(this.tfDiagnostico.getText());
        n.setTratamiento(this.tfTratamiento.getText());
        
        cln.crearRegistro(n);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
     this.dispose();
    }//GEN-LAST:event_bVolverActionPerformed

    private void mostrarPaciente(Paciente p) {
        if (p != null) {
            this.tfPaciente.setText(p.getNombre());
        }
    }
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
            java.util.logging.Logger.getLogger(CrearRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAnterior;
    private javax.swing.JButton bSiguiente;
    private javax.swing.JButton bVolver;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfDiagnostico;
    private javax.swing.JTextField tfPaciente;
    private javax.swing.JTextField tfTratamiento;
    // End of variables declaration//GEN-END:variables
}
