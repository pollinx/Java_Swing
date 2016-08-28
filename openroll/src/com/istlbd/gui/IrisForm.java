/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istlbd.gui;

import com.faisal.iris.DeviceEventConsumer;
import com.faisal.iris.GUIEventDelegator;
import com.faisal.iris.IrisCanvas;
import com.faisal.iris.IrisFeaturesMonocular;
import com.faisal.iris.IrisUtils;
import com.iritech.iddk.standard.IddkImage;
import com.istlbd.utils.Defs;
import com.istlbd.utils.Lookup;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class IrisForm extends javax.swing.JFrame implements DeviceEventConsumer, WindowListener {

    private GUIEventDelegator delegator = null;
    private IrisFeaturesMonocular monoFeatures = null;
    private IrisCanvas irisCanvas = null;
    private String eyeindex;

    /**
     * Creates new form IrisForm
     */
    public IrisForm(String whichEye) {

        initComponents();

        addWindowListener(this);

        irisCanvas = new IrisCanvas();
        irisCanvas.setSize(iris_capture_panel.getWidth() - 2, iris_capture_panel.getHeight() - 2);
        irisCanvas.setBounds(2, 2, irisCanvas.getWidth() - 2, irisCanvas.getHeight() - 2);
        irisCanvas.setBackground(Color.WHITE);
        iris_capture_panel.add(irisCanvas);

        this.eyeindex = whichEye;
        inp_eye_index.setText(eyeindex);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_iris_content = new javax.swing.JPanel();
        lbl_capture_status = new javax.swing.JLabel();
        lbl_capture_score = new javax.swing.JLabel();
        lbl_capture_ua = new javax.swing.JLabel();
        lbl_eye_index = new javax.swing.JLabel();
        inp_capture_ua = new javax.swing.JTextField();
        inp_eye_index = new javax.swing.JTextField();
        inp_capture_score = new javax.swing.JTextField();
        iris_capture_panel = new javax.swing.JPanel();
        btn_iris_done = new javax.swing.JButton();
        btn_iris_capture = new javax.swing.JButton();

        setTitle("IRIS Capture");
        setMinimumSize(new java.awt.Dimension(800, 400));
        setResizable(false);

        panel_iris_content.setMaximumSize(new java.awt.Dimension(800, 400));
        panel_iris_content.setMinimumSize(new java.awt.Dimension(800, 400));
        panel_iris_content.setPreferredSize(new java.awt.Dimension(800, 400));
        panel_iris_content.setLayout(null);

        lbl_capture_status.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_capture_status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel_iris_content.add(lbl_capture_status);
        lbl_capture_status.setBounds(490, 30, 290, 80);

        lbl_capture_score.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_capture_score.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_capture_score.setText("Score");
        lbl_capture_score.setMaximumSize(new java.awt.Dimension(100, 30));
        lbl_capture_score.setMinimumSize(new java.awt.Dimension(100, 30));
        lbl_capture_score.setPreferredSize(new java.awt.Dimension(100, 30));
        panel_iris_content.add(lbl_capture_score);
        lbl_capture_score.setBounds(520, 190, 70, 30);

        lbl_capture_ua.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_capture_ua.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_capture_ua.setText("<html>Useable <br> Area (%)</html>");
        panel_iris_content.add(lbl_capture_ua);
        lbl_capture_ua.setBounds(520, 230, 70, 30);

        lbl_eye_index.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_eye_index.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_eye_index.setText("Eye  (L/R)");
        lbl_eye_index.setMaximumSize(new java.awt.Dimension(100, 30));
        lbl_eye_index.setMinimumSize(new java.awt.Dimension(100, 30));
        lbl_eye_index.setPreferredSize(new java.awt.Dimension(100, 30));
        panel_iris_content.add(lbl_eye_index);
        lbl_eye_index.setBounds(520, 150, 70, 30);

        inp_capture_ua.setEditable(false);
        inp_capture_ua.setBackground(new java.awt.Color(255, 255, 255));
        inp_capture_ua.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        inp_capture_ua.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inp_capture_ua.setToolTipText("");
        inp_capture_ua.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        panel_iris_content.add(inp_capture_ua);
        inp_capture_ua.setBounds(600, 230, 180, 30);

        inp_eye_index.setEditable(false);
        inp_eye_index.setBackground(new java.awt.Color(255, 255, 255));
        inp_eye_index.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        inp_eye_index.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inp_eye_index.setToolTipText("");
        inp_eye_index.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        panel_iris_content.add(inp_eye_index);
        inp_eye_index.setBounds(600, 150, 180, 30);

        inp_capture_score.setEditable(false);
        inp_capture_score.setBackground(new java.awt.Color(255, 255, 255));
        inp_capture_score.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        inp_capture_score.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inp_capture_score.setToolTipText("");
        inp_capture_score.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        panel_iris_content.add(inp_capture_score);
        inp_capture_score.setBounds(600, 190, 180, 30);

        iris_capture_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout iris_capture_panelLayout = new javax.swing.GroupLayout(iris_capture_panel);
        iris_capture_panel.setLayout(iris_capture_panelLayout);
        iris_capture_panelLayout.setHorizontalGroup(
            iris_capture_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );
        iris_capture_panelLayout.setVerticalGroup(
            iris_capture_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
        );

        panel_iris_content.add(iris_capture_panel);
        iris_capture_panel.setBounds(20, 30, 450, 250);

        btn_iris_done.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_iris_done.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_img_done_20.png"))); // NOI18N
        btn_iris_done.setText("Done");
        btn_iris_done.setIconTextGap(10);
        btn_iris_done.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn_iris_done.setMaximumSize(new java.awt.Dimension(120, 30));
        btn_iris_done.setMinimumSize(new java.awt.Dimension(120, 30));
        btn_iris_done.setPreferredSize(new java.awt.Dimension(120, 30));
        btn_iris_done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iris_doneActionPerformed(evt);
            }
        });
        panel_iris_content.add(btn_iris_done);
        btn_iris_done.setBounds(660, 320, 120, 30);

        btn_iris_capture.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_iris_capture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_img_eye_20.png"))); // NOI18N
        btn_iris_capture.setText("Capture");
        btn_iris_capture.setActionCommand("startCapture");
        btn_iris_capture.setIconTextGap(10);
        btn_iris_capture.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn_iris_capture.setMaximumSize(new java.awt.Dimension(120, 30));
        btn_iris_capture.setMinimumSize(new java.awt.Dimension(120, 30));
        btn_iris_capture.setPreferredSize(new java.awt.Dimension(120, 30));
        panel_iris_content.add(btn_iris_capture);
        btn_iris_capture.setBounds(520, 320, 120, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_iris_content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_iris_content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_iris_doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iris_doneActionPerformed

//        monoFeatures.finalize_device();
        setVisible(false);

    }//GEN-LAST:event_btn_iris_doneActionPerformed

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
            java.util.logging.Logger.getLogger(IrisForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IrisForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IrisForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IrisForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IrisForm("").setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_iris_capture;
    private javax.swing.JButton btn_iris_done;
    public static javax.swing.JTextField inp_capture_score;
    public static javax.swing.JTextField inp_capture_ua;
    private javax.swing.JTextField inp_eye_index;
    private javax.swing.JPanel iris_capture_panel;
    private javax.swing.JLabel lbl_capture_score;
    private javax.swing.JLabel lbl_capture_status;
    private javax.swing.JLabel lbl_capture_ua;
    private javax.swing.JLabel lbl_eye_index;
    private javax.swing.JPanel panel_iris_content;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setImage(int eyeIdx, IddkImage image) {

        irisCanvas.setmImg(image);
        irisCanvas.repaint();

        //change this part
        try {

            BufferedImage bImg = IrisUtils.getGrayscale(image.getImageWidth(), image.getImageHeight(), image.getImageData());
            //System.out.println("BufferedImage value dekhte kemon -> "+bImg);
            
            if (eyeindex.equalsIgnoreCase(Defs.IRIS_IDX_LEFT)) {
                /*
                 ApplicationNidPanel.applicationData.setLeft_eye(image.getImageData());
                
                 ApplicationNidPanel.lbl_left_eye.setText(null);
                 ApplicationNidPanel.lbl_left_eye.setIcon(new ImageIcon(
                 bImg.getScaledInstance(ApplicationNidPanel.lbl_left_eye.getWidth(), ApplicationNidPanel.lbl_left_eye.getHeight(), Image.SCALE_DEFAULT)));
                 */

                BiometricNidPanel.applicationData.setLeft_eye(image.getImageData());

                BiometricNidPanel.lbl_left_eye.setText(null);
                BiometricNidPanel.lbl_left_eye.setIcon(new ImageIcon(
                        bImg.getScaledInstance(BiometricNidPanel.lbl_left_eye.getWidth(), BiometricNidPanel.lbl_left_eye.getHeight(), Image.SCALE_DEFAULT)));

            } else {
                /*
                 ApplicationNidPanel.applicationData.setRight_eye(image.getImageData());
                
                 ApplicationNidPanel.lbl_right_eye.setText(null);
                 ApplicationNidPanel.lbl_right_eye.setIcon(new ImageIcon(
                 bImg.getScaledInstance(ApplicationNidPanel.lbl_right_eye.getWidth(), ApplicationNidPanel.lbl_right_eye.getHeight(), Image.SCALE_DEFAULT)));
                 */

                BiometricNidPanel.applicationData.setRight_eye(image.getImageData());

                BiometricNidPanel.lbl_right_eye.setText(null);
                BiometricNidPanel.lbl_right_eye.setIcon(new ImageIcon(
                        bImg.getScaledInstance(BiometricNidPanel.lbl_right_eye.getWidth(), BiometricNidPanel.lbl_right_eye.getHeight(), Image.SCALE_DEFAULT)));

            }

        } catch (Exception e) {
        }


    }

    @Override
    public void setISOImage(int eyeIdx, byte[] isoData, int len) {
    }

    @Override
    public void setTemplate(int eyeIdx, byte[] tpl, int len) {
    }

    @Override
    public void updateLabel(String str) {

        lbl_capture_status.setText(str);

    }

    @Override
    public void deviceDetected(ArrayList<String> devices) {
    }

    @Override
    public void deviceNotPresent() {
    }

    @Override
    public void deviceConfigDetected() {
    }

    @Override
    public void windowOpened(WindowEvent e) {

        try {
            IrisFeaturesMonocular.g_binDir = System.getProperty("user.dir");
            monoFeatures = new IrisFeaturesMonocular(this);
            delegator = new GUIEventDelegator(this, monoFeatures);

            btn_iris_capture.addActionListener(delegator);
//            comm.addItemListener(delegator);
//            eyeType.addItemListener(delegator);
//            imgFormat.addItemListener(delegator);
//            deviceType.addItemListener(delegator);
//            isoFmt.addItemListener(delegator);

            monoFeatures.open_device();

        } catch (Exception exc) {
            exc.printStackTrace();
        }

    }

    @Override
    public void windowClosing(WindowEvent e) {

        try {
            monoFeatures.finalize_device();
        } catch (Exception exc) {
        }

    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
}