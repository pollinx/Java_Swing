/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istlbd.gui;

import ImageProcessing.ImageAndFileProcessing;
import business.bean.PersonManagerBean;
import business.bean.Utils;
import business.entity.BioPerson;
import client.bean.UserSession;
import com.istl.card.ReaderListener;
import com.istl.card.terminal.ITokenManager;
import com.istl.card.terminal.TokenManager;
import com.istlbd.utils.Defs;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import ws.response.GetPersonSummaryResponse;

/**
 *
 * @author Abdur Razzak
 */
//public class OffLineApplicationNidPanel extends javax.swing.JPanel implements ReaderListener {
public class OffLineApplicationNidPanel extends javax.swing.JPanel {

    /**
     * Creates new form NidRegistrationPanel
     */
    public static UserSession userSession;

    public OffLineApplicationNidPanel() {

        initComponents();
        // tokenManager = new TokenManager(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nid_reg_content_panel = new javax.swing.JPanel();
        lbl_nid_reg_status = new javax.swing.JLabel();
        inp_nid_number = new javax.swing.JTextField();
        lbl_date_of_birth = new javax.swing.JLabel();
        lbl_nid_number = new javax.swing.JLabel();
        btn_nid_offline_submit = new javax.swing.JButton();
        cal_date_of_birth = new com.toedter.calendar.JDateChooser();

        setMaximumSize(new java.awt.Dimension(1350, 650));
        setMinimumSize(new java.awt.Dimension(1350, 650));
        setName(""); // NOI18N
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1350, 650));
        setLayout(null);

        nid_reg_content_panel.setBackground(new java.awt.Color(204, 204, 204));
        nid_reg_content_panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        nid_reg_content_panel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                nid_reg_content_panelComponentShown(evt);
            }
        });
        nid_reg_content_panel.setLayout(null);

        lbl_nid_reg_status.setBackground(new java.awt.Color(204, 204, 204));
        lbl_nid_reg_status.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_nid_reg_status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nid_reg_content_panel.add(lbl_nid_reg_status);
        lbl_nid_reg_status.setBounds(100, 30, 350, 80);

        inp_nid_number.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inp_nid_number.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inp_nid_number.setMaximumSize(new java.awt.Dimension(200, 30));
        inp_nid_number.setMinimumSize(new java.awt.Dimension(200, 30));
        inp_nid_number.setPreferredSize(new java.awt.Dimension(200, 30));
        nid_reg_content_panel.add(inp_nid_number);
        inp_nid_number.setBounds(250, 120, 200, 30);

        lbl_date_of_birth.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_date_of_birth.setText("Date Of Birth");
        lbl_date_of_birth.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0)));
        nid_reg_content_panel.add(lbl_date_of_birth);
        lbl_date_of_birth.setBounds(100, 160, 150, 30);

        lbl_nid_number.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_nid_number.setText("NID Number");
        lbl_nid_number.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0)));
        nid_reg_content_panel.add(lbl_nid_number);
        lbl_nid_number.setBounds(100, 120, 150, 30);

        btn_nid_offline_submit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_nid_offline_submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/b_done_rsz.png"))); // NOI18N
        btn_nid_offline_submit.setText("SUBMIT");
        btn_nid_offline_submit.setIconTextGap(15);
        btn_nid_offline_submit.setMargin(new java.awt.Insets(1, 1, 1, 1));
        btn_nid_offline_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nid_offline_submitActionPerformed(evt);
            }
        });
        nid_reg_content_panel.add(btn_nid_offline_submit);
        btn_nid_offline_submit.setBounds(250, 210, 200, 30);

        cal_date_of_birth.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
        cal_date_of_birth.setDateFormatString("yyyy/MM/dd");
        cal_date_of_birth.setMinimumSize(new java.awt.Dimension(200, 30));
        cal_date_of_birth.setPreferredSize(new java.awt.Dimension(200, 30));
        nid_reg_content_panel.add(cal_date_of_birth);
        cal_date_of_birth.setBounds(250, 160, 200, 30);

        add(nid_reg_content_panel);
        nid_reg_content_panel.setBounds(410, 180, 560, 310);
    }// </editor-fold>//GEN-END:initComponents

    private void nid_reg_content_panelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_nid_reg_content_panelComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_nid_reg_content_panelComponentShown

    private void btn_nid_offline_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nid_offline_submitActionPerformed
        String nid_num = null;
        String dob = null;
        String checkNID = null;
        String checkDOB = null;
        String bioPersonId = null;
        String bioMetricId = "";

        nid_num = inp_nid_number.getText();
        dob = cal_date_of_birth.getDate() != null ? Defs.SDF.format(cal_date_of_birth.getDate()) : "";

        //dob = dob.replaceAll("/", "-");
        //ystem.out.println("NID - > " + nid_num + " " + "DOB - > " + dob);

        PersonManagerBean pmb = new PersonManagerBean();
        BioPerson bioPersonBO = new BioPerson();

        bioPersonBO.setPinNo(nid_num);
        bioPersonBO.setDateOfBirth(dob);


        GetPersonSummaryResponse resp = pmb.getAdvancedSearchPersonInfo(0L, 100L, bioPersonBO);
        System.out.println("GetPersonSummaryResponse Status -> " + resp.isOperationStatus());

        List< BioPerson> biolist = resp.getPersonList();

        for (BioPerson bio : biolist) {
            bioPersonId = bio.getId().toString();
            checkNID = bio.getPinNo();
            checkDOB = bio.getDateOfBirth();
            System.out.println(bioMetricId);
        }

        if (resp != null && resp.isOperationStatus() && !nid_num.equals("") && !dob.equals("")) {

            if (nid_num.equals(checkNID) && dob.equals(checkDOB)) {

                System.out.println("Bio ID - > " + bioPersonId);

                ContainerJFrame.MenuBarVar.setVisible(true);
                ContainerJFrame.offline.setVisible(false);
                ContainerJFrame.showBiomatricPanel(bioPersonId );
                System.out.println("OK LOGIN SUCCCEESS------------");
                inp_nid_number.setText("");
                cal_date_of_birth.setDate(null);
            } else {
                Utils.showErrorMsg("NID or Date of Birth Invalid ");
            }
        } else {
            Utils.showErrorMsg("No user register with this NID number or Date of Birth");
        }
    }//GEN-LAST:event_btn_nid_offline_submitActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_nid_offline_submit;
    public static com.toedter.calendar.JDateChooser cal_date_of_birth;
    private javax.swing.JTextField inp_nid_number;
    private javax.swing.JLabel lbl_date_of_birth;
    private javax.swing.JLabel lbl_nid_number;
    private javax.swing.JLabel lbl_nid_reg_status;
    private javax.swing.JPanel nid_reg_content_panel;
    // End of variables declaration//GEN-END:variables
}
