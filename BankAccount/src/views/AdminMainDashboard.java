/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controllers.BankConnection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 63921
 */
public class AdminMainDashboard extends javax.swing.JFrame {

    /**
     * Creates new form MainDashboard
     */
     private String deleteAccountNumber;
     private PreparedStatement smt;
     private Connection conn;
    
    public AdminMainDashboard() {
        initComponents();
        setLocationRelativeTo(null);
        try {
            BankConnection connection = new BankConnection();
            conn = connection.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(AdminLogin.class.getName()).log(Level.SEVERE, null, ex);
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

        jMenu1 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem_addAccount = new javax.swing.JMenuItem();
        jMenuItem_deleteAccount = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem_userLogin = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jMenu2.setText("Accounts");

        jMenuItem_addAccount.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ADD, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem_addAccount.setText("Add Account");
        jMenuItem_addAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_addAccountActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_addAccount);

        jMenuItem_deleteAccount.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_SUBTRACT, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem_deleteAccount.setText("Delete Account");
        jMenuItem_deleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_deleteAccountActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_deleteAccount);

        jMenuItem1.setText("Add Admin Account");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Balance");
        jMenuBar1.add(jMenu3);

        jMenu5.setText("User");

        jMenuItem_userLogin.setText("Login");
        jMenuItem_userLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_userLoginActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem_userLogin);

        jMenuBar1.add(jMenu5);

        jMenu4.setText("Help");

        jMenuItem3.setText("About Bank Account");
        jMenu4.add(jMenuItem3);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 777, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_addAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_addAccountActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showInputDialog(null, evt, DISPOSE_ON_CLOSE);
        CreateUser accountUser = new CreateUser();
        accountUser.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_jMenuItem_addAccountActionPerformed

    private void jMenuItem_userLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_userLoginActionPerformed
        // TODO add your handling code here:
        UserLogin userLogin = new UserLogin();
        userLogin.setVisible(true);
        this.setVisible(false);   
    }//GEN-LAST:event_jMenuItem_userLoginActionPerformed

    private void jMenuItem_deleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_deleteAccountActionPerformed
        // TODO add your handling code here:
        deleteAccount();
    }//GEN-LAST:event_jMenuItem_deleteAccountActionPerformed

    private void deleteAccount(){
        try{
            deleteAccountNumber = JOptionPane.showInputDialog(null, "Input Account # to delete: ", "Delete Account", JOptionPane.INFORMATION_MESSAGE).trim();
            int confirmDeleteAccount = JOptionPane.showConfirmDialog(null, "Confirm Delete Account?", "Delete Account", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if(confirmDeleteAccount == JOptionPane.YES_OPTION){
                String query = "DELETE FROM bank_db.accounts WHERE account_number=?";
                smt = conn.prepareStatement(query);
                smt.setString(1, deleteAccountNumber);
                smt.executeUpdate();

                JOptionPane.showMessageDialog(null, "Account number: " + deleteAccountNumber + " is now deleted.", "Delete Account", JOptionPane.INFORMATION_MESSAGE);
            }
             
        } catch (SQLException | NullPointerException ex) {
            Logger.getLogger(AdminMainDashboard.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(AdminMainDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMainDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMainDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMainDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMainDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem_addAccount;
    private javax.swing.JMenuItem jMenuItem_deleteAccount;
    private javax.swing.JMenuItem jMenuItem_userLogin;
    // End of variables declaration//GEN-END:variables
}
