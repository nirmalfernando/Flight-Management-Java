/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MSii
 */
public class UserData extends javax.swing.JFrame {

    /**
     * Creates new form UserDetails
     */
    public UserData() {
        initComponents();
        txtUser.setText(user.username);
        Connection conn = controller.TravelController.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT hotel.Location , hotel.HDate , hotel.Type , flights.FType , flights.AgeGroup , flights.Class , flights.FromThis , flights.ToThis , flights.FDate , flights.UserName FROM travel.hotel INNER JOIN travel.flights ON (hotel.UserName = flights.UserName);");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getString("UserName").equals(user.username)) {
                    String hLocation = rs.getString("Location");
                    txtPlace.setText(hLocation);
                    String hDate = rs.getString("HDate");
                    txtHDate.setText(hDate);
                    String hType = rs.getString("Type");
                    txtHType.setText(hType);
                    String fFrom = rs.getString("FromThis");
                    txtFFrom1.setText(fFrom);
                    String fTo = rs.getString("ToThis");
                    txtFTo.setText(fTo);
                    String fDate = rs.getString("FDate");
                    txtFDate1.setText(fDate);
                    String fType = rs.getString("FType");
                    txtFType.setText(fType);
                    String fPerson = rs.getString("AgeGroup");
                    txtFPerson.setText(fPerson);
                    String fClass = rs.getString("Class");
                    txtFClass.setText(fClass);
                }
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            System.err.println(e.toString());
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

        jPanel1 = new javax.swing.JPanel();
        btnRX = new javax.swing.JButton();
        lblUserProfile = new javax.swing.JLabel();
        btnCAFormX = new javax.swing.JButton();
        lblHotelDetails = new javax.swing.JLabel();
        lblUPFormPlace = new javax.swing.JLabel();
        lblUserName1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtHDate = new javax.swing.JTextField();
        lblUPForm = new javax.swing.JLabel();
        txtPlace = new javax.swing.JTextField();
        lblUPFormDate = new javax.swing.JLabel();
        txtHType = new javax.swing.JTextField();
        lblUPFormFlightDetails = new javax.swing.JLabel();
        lblUPFormFrom = new javax.swing.JLabel();
        lblUPFormTo = new javax.swing.JLabel();
        lblUPFormFlightDate = new javax.swing.JLabel();
        txtFTo = new javax.swing.JTextField();
        txtFType = new javax.swing.JTextField();
        lblUPFormTripType = new javax.swing.JLabel();
        txtFFrom1 = new javax.swing.JTextField();
        txtFDate1 = new javax.swing.JTextField();
        lblUPFormPersonType = new javax.swing.JLabel();
        lblUPFormClass = new javax.swing.JLabel();
        txtFClass = new javax.swing.JTextField();
        txtFPerson = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 59, 149));

        btnRX.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRX.setText("X");
        btnRX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRXActionPerformed(evt);
            }
        });

        lblUserProfile.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblUserProfile.setForeground(new java.awt.Color(255, 255, 255));
        lblUserProfile.setText("User profile");

        btnCAFormX.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCAFormX.setText("←");
        btnCAFormX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCAFormXActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblUserProfile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCAFormX)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRX)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRX)
                            .addComponent(btnCAFormX)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblUserProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        lblHotelDetails.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblHotelDetails.setText("Hotel Details ");

        lblUPFormPlace.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUPFormPlace.setText("Place :");

        lblUserName1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUserName1.setText("User Name :");

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        lblUPForm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUPForm.setText("Type:");

        lblUPFormDate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUPFormDate.setText("Date :");

        lblUPFormFlightDetails.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblUPFormFlightDetails.setText("Flight Details ");

        lblUPFormFrom.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUPFormFrom.setText("From :");

        lblUPFormTo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUPFormTo.setText("To :");

        lblUPFormFlightDate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUPFormFlightDate.setText("Date :");

        lblUPFormTripType.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUPFormTripType.setText("Trip Type :");

        lblUPFormPersonType.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUPFormPersonType.setText("Person Type :");

        lblUPFormClass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUPFormClass.setText("Class :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblHotelDetails)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtHType, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblUPFormDate)
                                            .addComponent(lblUPFormPlace))
                                        .addGap(59, 59, 59)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPlace, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtHDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(lblUPForm)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUserName1)
                        .addGap(18, 18, 18)
                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUPFormClass)
                            .addComponent(lblUPFormPersonType)
                            .addComponent(lblUPFormTripType)
                            .addComponent(lblUPFormFlightDate)
                            .addComponent(lblUPFormTo)
                            .addComponent(lblUPFormFrom))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFClass, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFType, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFTo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFFrom1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblUPFormFlightDetails))
                .addGap(156, 156, 156))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lblUPFormFlightDetails))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUserName1)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblUPFormFrom)
                                .addGap(18, 18, 18)
                                .addComponent(lblUPFormTo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtFFrom1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFTo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFType, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblHotelDetails)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUPFormPlace)
                            .addComponent(txtPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUPFormFlightDate, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblUPFormDate)
                                        .addGap(16, 16, 16)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(lblUPFormTripType))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(txtHType, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblUPForm)))
                                .addGap(19, 19, 19)
                                .addComponent(lblUPFormPersonType))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtHDate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFClass, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUPFormClass))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRXActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnRXActionPerformed

    private void btnCAFormXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCAFormXActionPerformed
        // TODO add your handling code here:
        SignedForm fm = new SignedForm();
        fm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCAFormXActionPerformed


    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

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
            java.util.logging.Logger.getLogger(UserData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCAFormX;
    private javax.swing.JButton btnRX;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblHotelDetails;
    private javax.swing.JLabel lblUPForm;
    private javax.swing.JLabel lblUPFormClass;
    private javax.swing.JLabel lblUPFormDate;
    private javax.swing.JLabel lblUPFormFlightDate;
    private javax.swing.JLabel lblUPFormFlightDetails;
    private javax.swing.JLabel lblUPFormFrom;
    private javax.swing.JLabel lblUPFormPersonType;
    private javax.swing.JLabel lblUPFormPlace;
    private javax.swing.JLabel lblUPFormTo;
    private javax.swing.JLabel lblUPFormTripType;
    private javax.swing.JLabel lblUserName1;
    private javax.swing.JLabel lblUserProfile;
    private javax.swing.JTextField txtFClass;
    private javax.swing.JTextField txtFDate1;
    private javax.swing.JTextField txtFFrom1;
    private javax.swing.JTextField txtFPerson;
    private javax.swing.JTextField txtFTo;
    private javax.swing.JTextField txtFType;
    private javax.swing.JTextField txtHDate;
    private javax.swing.JTextField txtHType;
    private javax.swing.JTextField txtPlace;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
