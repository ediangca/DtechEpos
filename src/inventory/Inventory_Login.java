/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

import classes.DBConnection;
import classes.MysqlConnect;
import javax.swing.*;
import java.sql.*;
import java.text.SimpleDateFormat;

/**
 *
 * @author Administrator
 */
public class Inventory_Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    Inventory_Mainframe inventory_mainframe;
    Connection connection = null;
    Statement statement;
    ResultSet result;

    public Inventory_Login() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/DTECH-LOGO.jpg")).getImage());
        field_username.requestFocusInWindow();
        setLocationRelativeTo(null);
    }

    public Inventory_Login(Inventory_Mainframe inventory_mainframe) {
        initComponents();
        this.inventory_mainframe = inventory_mainframe;
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/DTECH-LOGO.jpg")).getImage());
        field_username.requestFocusInWindow();
        setLocationRelativeTo(null);
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        field_username = new javax.swing.JTextField();
        field_pass = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DTECH SOLUTIONS - SALES AND INVENTORY SYSTEM");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 0));
        jLabel1.setText("SALES INVENTORY");

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Powered by D-Tech Solutions");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("X");
        jButton2.setToolTipText("Exit");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username");

        field_username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        field_username.setForeground(new java.awt.Color(153, 153, 153));
        field_username.setText("dtech");
        field_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                field_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                field_usernameFocusLost(evt);
            }
        });

        field_pass.setText("dtech-solutions");
        field_pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                field_passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                field_passFocusLost(evt);
            }
        });
        field_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_passActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(field_pass)
                    .addComponent(field_username))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field_username, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(field_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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

    private void field_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_field_usernameFocusGained
        // TODO add your handling code here:
        if (field_username.getText().equalsIgnoreCase("Please Enter your Username")) {
            field_username.setText(null);
        }
    }//GEN-LAST:event_field_usernameFocusGained

    private void field_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_field_usernameFocusLost
        // TODO add your handling code here:
        if (field_username.getText().isEmpty()) {
            field_username.setText("Please Enter your Username");
        }
    }//GEN-LAST:event_field_usernameFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int x = JOptionPane.showConfirmDialog(this, "Do you really want to exit?", "EXIT", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (x == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (field_username.getText().compareTo("dtech") == 0 && field_pass.getText().compareTo("dtech-solutions") == 0) {
            dispose();

            if (!(inventory_mainframe == null)) {
                JOptionPane.showConfirmDialog(this, "Welcome back D-TECH Administrator !!!", "D-TECH SOLUTIONS", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE);

                inventory_mainframe.setVisible(true);
                return;
            }
            JOptionPane.showConfirmDialog(this, "Welcome D-TECH Administrator !!!", "D-TECH SOLUTIONS", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE);

            inventory_mainframe = new Inventory_Mainframe(connection);
            inventory_mainframe.setVisible(true);
        } else {
            String userID = "";
            try {
                statement = connection.createStatement();
//                Treshold_No., User_ID, Count, Threshold, Datetime_Created, Datetime_Updated
                System.out.println("SELECT *, (select user_id from `user` where `username` = '" + field_username.getText() + "'), (select username from `user` where `username` = '" + field_username.getText() + "')as username  FROM user_threshold u where user_id = (select user_id from `user` where `username` = '" + field_username.getText() + "')");
                result = statement.executeQuery("SELECT *, (select user_id from `user` where `username` = '" + field_username.getText() + "'), (select username from `user` where `username` = '" + field_username.getText() + "')as username  FROM user_threshold u where user_id = (select user_id from `user` where `username` = '" + field_username.getText() + "')");
                if (result.next()) {
                    userID = result.getString(7);
                    if ((result.getString(8).compareTo(field_username.getText()) == 0)) {
                        if (result.getInt(3) == 5) {
                            statement.close();
                            statement = connection.createStatement();
                            System.out.println("update user_threshold set Threshold = 1 where user_id = '" + userID + "'");
                            statement.executeUpdate("update user_threshold set Threshold = 1 where user_id = '" + userID + "'");

                            JOptionPane.showConfirmDialog(this, "Attemp exceeded limit!\nYour Account has been Threshold \n\n Kindly coordinate with your administrator.", "D-TECH SOLUTIONS", JOptionPane.PLAIN_MESSAGE, JOptionPane.ERROR_MESSAGE);
                            statement.close();
                            return;
                        }
                    }
                }
                statement.close();

                statement = connection.createStatement();
                System.err.println("SELECT User_ID, Username, `Password`, AES_DECRYPT(`Password`, 9)as 'PASS_DECRYPT', `Company_No.`, `Profile_No.`, isActive, cancelflag FROM `user` u"
                        + " where  Username = '" + field_username.getText() + "' and cancelflag = 0;");
                result = statement.executeQuery("SELECT User_ID, Username, `Password`, AES_DECRYPT(`Password`, 9)as 'PASS_DECRYPT', `Company_No.`, `Profile_No.`, isActive, cancelflag FROM `user` u"
                        + " where  Username = '" + field_username.getText() + "' and cancelflag = 0;");
                if (result.next()) {
                    String user_id = result.getString(1);
                    if (!result.getBoolean(7)) {
                        JOptionPane.showConfirmDialog(this, "Your Account has been Disabled \n\n Kindly coordinate with your administrator.", "D-TECH SOLUTIONS", JOptionPane.PLAIN_MESSAGE, JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    System.out.println("Authenticating username : " + result.getString(2));
                    System.out.println("Authenticating password : " + result.getString(3));

                    if ((result.getString(2).compareTo(field_username.getText()) == 0) && (result.getString(4).compareTo(field_pass.getText()) == 0)) {

                        dispose();

                        if (!(inventory_mainframe == null)) {
                            JOptionPane.showConfirmDialog(this, "Welcome back " + getuserFullname(user_id) + " !!!", "D-TECH SOLUTIONS", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE);
                            inventory_mainframe.setVisible(true);
                            return;
                        }

                        JOptionPane.showConfirmDialog(this, "Welcome " + getuserFullname(user_id) + " !!!", "D-TECH SOLUTIONS", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE);
                        inventory_mainframe = new Inventory_Mainframe(connection);
                        inventory_mainframe.setuserID(user_id);

                        statement.close();
                        result.close();
                        inventory_mainframe.setVisible(true);
                    } else {
                        System.err.println("(" + result.getString(3) + ".compareTo(" + field_pass.getText() + ") == 0 ) >>> " + result.getString(3).compareTo(field_pass.getText()) + " >>> " + !(result.getString(3).compareTo(field_pass.getText()) == 0));
                        JOptionPane.showConfirmDialog(this, "Either Username or Password is incorrect. \n\n Note: You have only 5 attemps to avoid \n account threshold/lock.", "D-TECH WARNING", JOptionPane.PLAIN_MESSAGE, JOptionPane.WARNING_MESSAGE);
                        if (!(result.getString(3).compareTo(field_pass.getText()) == 0)) {
                            setThresholdCount(getuserID());
                        }
                    }
                } else {
                    JOptionPane.showConfirmDialog(this, "Either Username or Password is invalid. \n\n Note: You have only 5 attemps to avoid \n account threshold/lock.", "D-TECH WARNING", JOptionPane.PLAIN_MESSAGE, JOptionPane.ERROR_MESSAGE);
                }

            } catch (Exception e) {
                JOptionPane.showConfirmDialog(this, e.getMessage(), "D-TECH SOLUTIONS", JOptionPane.PLAIN_MESSAGE, JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void field_passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_field_passFocusGained
        // TODO add your handling code here:
        if (field_pass.getText().equalsIgnoreCase("Please Enter your Username")) {
            field_pass.setText(null);
        }
    }//GEN-LAST:event_field_passFocusGained

    private void field_passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_field_passFocusLost
        // TODO add your handling code here:
        if (field_pass.getText().isEmpty()) {
            field_pass.setText("Please Enter your Username");
        }
    }//GEN-LAST:event_field_passFocusLost

    private void field_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_passActionPerformed
        // TODO add your handling code here:
        jButton1ActionPerformed(evt);
    }//GEN-LAST:event_field_passActionPerformed

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
            java.util.logging.Logger.getLogger(Inventory_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventory_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField field_pass;
    private javax.swing.JTextField field_username;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

    private void setThresholdCount(String userID) {
        try {
            System.err.println("Threshold Count for User : " + userID);
            Statement statement1 = connection.createStatement();
//                Treshold_No., User_ID, Count, Threshold, Datetime_Created, Datetime_Updated
            System.out.println("Select * from user_threshold where user_id = '" + userID + "'");
            ResultSet result1 = statement1.executeQuery("Select * from user_threshold where user_id = '" + userID + "'");
            if (result1.next()) {
                statement1.close();
                statement1 = connection.createStatement();
                System.err.println("update user_threshold set Count = (Count+1), Datetime_Updated = '"
                        + new SimpleDateFormat("yyyy-MM-d HH:mm:ss").format(new java.util.Date()) + "' where `Treshold_No.` = '404-" + userID + "'");
                statement1.executeUpdate("update user_threshold set Count = (Count+1), Datetime_Updated = '"
                        + new SimpleDateFormat("yyyy-MM-d HH:mm:ss").format(new java.util.Date()) + "' where `Treshold_No.` = '404-" + userID + "'");
                statement1.close();
            } else {
                statement1.close();
                statement1 = connection.createStatement();
                System.err.println("insert into user_threshold values ('404-"
                        + userID + "','"
                        + userID + "',1,0,'"
                        + new SimpleDateFormat("yyyy-MM-d HH:mm:ss").format(new java.util.Date()) + "','"
                        + new SimpleDateFormat("yyyy-MM-d HH:mm:ss").format(new java.util.Date()) + "')");
                statement1.executeUpdate("insert into user_threshold values ('404-"
                        + userID + "','"
                        + userID + "',1,0,'"
                        + new SimpleDateFormat("yyyy-MM-d HH:mm:ss").format(new java.util.Date()) + "','"
                        + new SimpleDateFormat("yyyy-MM-d HH:mm:ss").format(new java.util.Date()) + "')");
                statement1.close();
            }
            field_pass.setText(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    String getuserID() {
        String userID = "";
        try {
            Statement statement1 = connection.createStatement();
            ResultSet result1 = statement1.executeQuery("SELECT User_ID, Username, `Password`, `Company_No.`, `Profile_No.`, isActive, cancelflag FROM `user` u"
                    + " where  Username = '" + field_username.getText() + "' and cancelflag = 0;");
            if (result1.next()) {
                userID = result.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userID;
    }

    String getuserFullname(String userID) {
        String userFullname = "";
        try {
            statement = connection.createStatement();
            result = statement.executeQuery("SELECT concat(lastname,', ',Firstname,' ',substr('Diangca',1,1))as userFullname FROM `user` u join `user_profile` up on u.`Profile_No.` = up.`Profile_No.` "
                    + "where u.User_ID = '" + userID + "'");

            if (result.next()) {
                userFullname = result.getString(1);
            }

            statement.close();
            result.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return userFullname;
    }
}