/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

/**
 *
 * @author ayodr
 */
import Control_Connector.DBConnect;
import java.sql.*;
import com.toedter.calendar.JDateChooser;
import optical.Patient;
import optical.Session;
import javax.swing.JOptionPane;
import UI.UpdateDetails;
import UI.MainWindow;
import UI.UpdateDetails;


public class ViewDeets extends javax.swing.JPanel {

    /**
     * Creates new form ViewDeets
     */

  private MainWindow mainWindow;
    public ViewDeets(MainWindow mainWindow) {
        initComponents();
        
        this.mainWindow = mainWindow;
        
        backButton.addActionListener(e -> {
            mainWindow.showDefaultPanel();  // Go back to the default panel
        });
}
    public void populateDetails(Patient patient) {
        if (patient != null) {
            lblPatientID.setText("Patient ID:   " + patient.getID());            // Display Patient ID with label
            lblName.setText("Patient Name:   " + patient.getName());              // Display Patient Name with label
            lblContactNumber.setText("Contact Number:   " + patient.getNumber()); // Display Contact Number with label
            lblEmail.setText("Email:   " + patient.getEmail());                   // Display Email with label
        } else {
            JOptionPane.showMessageDialog(this, "Patient data is null.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


        
        
    

 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblPatientID = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblContactNumber = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Oswald", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Patient Details");

        lblPatientID.setFont(new java.awt.Font("Source Sans Pro Black", 0, 18)); // NOI18N
        lblPatientID.setForeground(new java.awt.Color(0, 51, 51));

        lblName.setFont(new java.awt.Font("Source Sans Pro Black", 0, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 51, 51));

        lblContactNumber.setFont(new java.awt.Font("Source Sans Pro Black", 0, 18)); // NOI18N
        lblContactNumber.setForeground(new java.awt.Color(0, 51, 51));

        lblEmail.setFont(new java.awt.Font("Source Sans Pro Black", 1, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 51, 51));

        jButton1.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 14)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 14)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(lblPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(lblContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jButton1)
                        .addGap(60, 60, 60)
                        .addComponent(backButton)))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(backButton))
                .addContainerGap(75, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        UpdateDetails update = new UpdateDetails();
        update.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblContactNumber;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPatientID;
    // End of variables declaration//GEN-END:variables
}
