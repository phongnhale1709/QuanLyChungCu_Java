/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DAO.Daorandom;
import DAO.Daotaikhoan;
import MODEL.Modeltaikhoan;
import controler.SendEmailSMTP;
import java.awt.Color;
import java.awt.Font;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 *
 * @author Thinkbook 16
 */
public class Viewquenmk extends javax.swing.JFrame {
    String Otp;
    
    public Viewquenmk() {
        initComponents();
        this.setLocationRelativeTo(null);
        init();
    }
    
    void init() {
        hienThiGoiY();
        maCapCha();
    }
    
    void maCapCha() {
        String  capcha = new Daorandom().SoNgauNhienString(5);
        txtMa.setText(capcha);
        txtMa.setFont(new Font (capcha, Font.HANGING_BASELINE, 14));
    }
    
    private String getOTP() {
        int min = 100000;
        int max = 999999;
        return Integer.toString((int)((Math.random()*(max-min))+min));
    }
    
    public void hienThiGoiY() {
        txtEmail.setText("Email...");
        txtEmail.setForeground(Color.gray);
        txtCapcha.setText("Capcha...");
        txtCapcha.setForeground(Color.gray);
        txtMa.requestFocus();
    }
    
    boolean kiemTraLoi() {
        if (txtEmail.getText().equalsIgnoreCase("email...")) {
            txtEmail.requestFocus();
            JOptionPane.showMessageDialog(this, "Không để trống Email");
            return false;
        }
        if (txtCapcha.getText().equalsIgnoreCase("capcha...")) {
            txtCapcha.requestFocus();
            JOptionPane.showMessageDialog(this, "Không để trống Capcha");
            return false;
        }
        if (txtEmail.getText().equalsIgnoreCase("")) {
            txtEmail.requestFocus();
            JOptionPane.showMessageDialog(this, "Không để trống Email");
            return false;
        }
        if (txtCapcha.getText().equalsIgnoreCase("")) {
            txtCapcha.requestFocus();
            JOptionPane.showMessageDialog(this, "Không để trống Capcha");
            return false;
        }
        if (!txtCapcha.getText().equalsIgnoreCase(txtCapcha.getText())) {
            txtCapcha.requestFocus();
            JOptionPane.showMessageDialog(this, "Mã Capcha không trùng khớp");
            maCapCha();
            return false;
        }
        return true;     
    }
    void lamMoi() {
        hienThiGoiY();
        maCapCha();
    }
    
    private boolean checkEmail(String e) {
        ArrayList<Modeltaikhoan> acc = Daotaikhoan.getInstance().selectAll();
        for (Modeltaikhoan i : acc) {
            if (i.getEmail().toLowerCase().equals(e.toLowerCase())) {
                return true;
            }
        }
        return false;
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
        jLabel1 = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabelCapcha = new javax.swing.JLabel();
        btnXacnhan = new javax.swing.JButton();
        txtMa = new javax.swing.JTextField();
        btnQuaylai = new javax.swing.JButton();
        txtCapcha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(55, 139, 167));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QUÊN MẬT KHẨU ?");

        jLabelEmail.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmail.setText("Email");

        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabelCapcha.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelCapcha.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCapcha.setText("Mã capcha");

        btnXacnhan.setBackground(new java.awt.Color(196, 233, 245));
        btnXacnhan.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnXacnhan.setText("Xác nhận");
        btnXacnhan.setBorder(null);
        btnXacnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacnhanActionPerformed(evt);
            }
        });

        txtMa.setEditable(false);

        btnQuaylai.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnQuaylai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-left-50.png"))); // NOI18N
        btnQuaylai.setBorder(null);
        btnQuaylai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuaylaiActionPerformed(evt);
            }
        });

        txtCapcha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCapchaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCapchaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnQuaylai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEmail)
                            .addComponent(jLabelCapcha)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtCapcha, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(118, 118, 118))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnXacnhan, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1))
                    .addComponent(btnQuaylai))
                .addGap(23, 23, 23)
                .addComponent(jLabelEmail)
                .addGap(18, 18, 18)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelCapcha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCapcha, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnXacnhan, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnXacnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacnhanActionPerformed
        if (kiemTraLoi()) {
                        
            try {
                if (checkEmail(txtEmail.getText()) && txtCapcha.getText().trim().equals(txtMa.getText().trim())) {
                    Otp = getOTP();
                    SendEmailSMTP.sendOTP(txtEmail.getText(), Otp);                
                    JOptionPane.showMessageDialog(this, "Yêu cầu đã được gửi thành công");
                    Viewotp o = new Viewotp(Otp,txtEmail.getText());
                    o.show();
                    dispose();
                    
                    
                } else{
                    JOptionPane.showMessageDialog(this, "Gửi yêu cầu thất bại");
                    lamMoi();
                }
            } catch (Exception ex) {
                Logger.getLogger(Viewquenmk.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else {
            JOptionPane.showMessageDialog(this, "Vui lòng không để trống");
            
        }

    }//GEN-LAST:event_btnXacnhanActionPerformed

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        if (txtEmail.getText().equalsIgnoreCase("Email...")) ;
            txtEmail.setText("");
            txtEmail.setForeground(Color.black);// TODO add your handling code here:
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
//         if (txtEmail.getText().equalsIgnoreCase("")) ;
//            txtEmail.setText("Email...");
//            txtEmail.setForeground(Color.gray);   // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailFocusLost

    private void btnQuaylaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuaylaiActionPerformed
        this.dispose();
        Viewdangnhap viewdn = new Viewdangnhap();
        viewdn.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnQuaylaiActionPerformed

    private void txtCapchaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCapchaFocusGained
         if (txtCapcha.getText().equalsIgnoreCase("Capcha...")) ;
            txtCapcha.setText("");
            txtCapcha.setForeground(Color.black);    // TODO add your handling code here:
    }//GEN-LAST:event_txtCapchaFocusGained

    private void txtCapchaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCapchaFocusLost
//     if (txtCapcha.getText().equalsIgnoreCase("")) ;
//            txtCapcha.setText("Capcha...");
//            txtCapcha.setForeground(Color.gray);     // TODO add your handling code here:
    }//GEN-LAST:event_txtCapchaFocusLost

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
            java.util.logging.Logger.getLogger(Viewquenmk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Viewquenmk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Viewquenmk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Viewquenmk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Viewquenmk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuaylai;
    private javax.swing.JButton btnXacnhan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCapcha;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCapcha;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMa;
    // End of variables declaration//GEN-END:variables
}