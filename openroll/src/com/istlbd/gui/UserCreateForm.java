/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istlbd.gui;

import business.bean.RoleManagerBean;
import business.bean.UserManagerBean;
import business.bean.Utils;
import business.entity.BioRole;
import business.entity.BioUser;
import business.entity.Item;
import com.istlbd.utils.Lookup;
import database.bean.UserEntityManagerBean;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

import remote.dao.ServiceException;
import ws.response.GetRoleSummaryResponse;

/**
 *
 * @author Rezwan
 */
public class UserCreateForm extends javax.swing.JFrame {

    /**
     * Creates new form UserCreateForm
     */
    public UserCreateForm() {
        initComponents();
//        getRoleList();
        this.setTitle("Create/Edit User");
    }

    public void getRoleList() {
        GetRoleSummaryResponse resp = new GetRoleSummaryResponse();
        RoleManagerBean rmb = new RoleManagerBean();
        BioRole role = new BioRole();
        resp = rmb.getAdvancedSearchRoleInfo(0L, 100L, role);
        if (resp != null && resp.isOperationStatus() && resp.getRoleList() != null && resp.getRoleList().size() > 0) {
        } else {
            Utils.showErrorMsg("Failed to get role list");
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
        userNameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fullnameField = new javax.swing.JTextField();
        designationField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        phoneNoField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        nidField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        roleField = new JComboBox<Item<String>>();
        saveButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("User name");

        userNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Password");

        jLabel3.setText("Full Name");

        jLabel4.setText("Designation");

        jLabel5.setText("Phone No");

        phoneNoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNoFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Email");

        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        jLabel7.setText("NID");

        jLabel8.setText("Role");

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(closeButton))
                    .addComponent(emailField)
                    .addComponent(phoneNoField)
                    .addComponent(designationField)
                    .addComponent(userNameField)
                    .addComponent(fullnameField)
                    .addComponent(nidField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(roleField, javax.swing.GroupLayout.Alignment.TRAILING, 0, 191, Short.MAX_VALUE)
                    .addComponent(passwordField))
                .addContainerGap(276, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fullnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(designationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(phoneNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(nidField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(roleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(closeButton))
                .addGap(33, 33, 33))
        );

        passwordField.getAccessibleContext().setAccessibleParent(passwordField);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameFieldActionPerformed

    private void phoneNoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNoFieldActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        Lookup.userData.setUsername(userNameField.getText());
        Lookup.userData.setPassword(passwordField.getText());
        Lookup.userData.setFullName(fullnameField.getText());
        Lookup.userData.setDesignation(designationField.getText());
        Lookup.userData.setEmail(emailField.getText());
        Lookup.userData.setPhoneNo(phoneNoField.getText());
        Lookup.userData.setNationalIdNo(nidField.getText());

        try {

            String roleStr = ((Item) (roleField.getSelectedItem())).getValue().toString();
            System.out.println("role str=" + roleStr);

            if (roleStr != null) {
                Lookup.userData.setRoleId(Long.parseLong(roleStr));
            } else {
                Lookup.userData.setRoleId(null);
            }

        } catch (Exception ex) {
        }


//        database.entity.BioUser userEO=Lookup.userData.convertToEO();
        Object obj = new Object();

        UserManagerBean umb = new UserManagerBean();
        try {
            obj = umb.createUpdateUser(Lookup.userData);
        } catch (ServiceException se) {
            System.out.println("error occurred during user saved");
            Utils.showErrorMsg("Error Occured.\nUser not saved.\n" + se.getMessage());
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(UserCreateForm.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (obj != null && obj instanceof BioUser) {
            System.out.println("success");
            BioUser tmpUser = (BioUser) obj;
            Lookup.userData.setId(tmpUser.getId());
            Utils.showSuccessMsg("User Saved Successfully");
        } else {
            System.out.println("error occurred during user creation");
            Utils.showErrorMsg("Error Occured.User not saved.");

        }

    }//GEN-LAST:event_saveButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();

    }//GEN-LAST:event_closeButtonActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

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
            java.util.logging.Logger.getLogger(UserCreateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserCreateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserCreateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserCreateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserCreateForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    public static javax.swing.JTextField designationField;
    public static javax.swing.JTextField emailField;
    public static javax.swing.JTextField fullnameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JTextField nidField;
    public static javax.swing.JPasswordField passwordField;
    public static javax.swing.JTextField phoneNoField;
    public static javax.swing.JComboBox roleField;
    private javax.swing.JButton saveButton;
    public static javax.swing.JTextField userNameField;
    // End of variables declaration//GEN-END:variables

    public static void setSelectedValueRole(JComboBox comboBox, String value) {
        String desc = "";
        for (database.entity.BioRole dv : Lookup.ROLE_LIST) {
            if (dv.getId().toString().equalsIgnoreCase(value)) {
                desc = dv.getRolename();
                break;
            }
        }

        if (desc == "") {
            return;
        }

        for (int i = 0; i < comboBox.getItemCount(); i++) {
            String val = (String) comboBox.getItemAt(i).toString();
            if (val.equalsIgnoreCase(desc)) {
                comboBox.setSelectedIndex(i);
                break;
            }
        }
    }

    public static void prepareRoleDropDown() {

        Long roleId = Lookup.userData.getRoleId();
        String roleStr = "";

        if (roleId != null) {
            roleStr = roleId.toString();
        }
        int selectedIndx = 0;

        roleField.removeAllItems();
//        roleField.addItem(new Item<String>("", "SELECT"));        

        int cnt = 0;
        roleField.addItem(new Item<String>(null, "SELECT"));
        for (database.entity.BioRole dc : Lookup.ROLE_LIST) {
            ++cnt;
            roleField.addItem(new Item<String>(dc.getId().toString(), dc.getRolename()));
            if (dc.getId().toString().equalsIgnoreCase(roleStr)) {
                selectedIndx = cnt;
            }
        }
        roleField.setSelectedIndex(selectedIndx);
    }
}
