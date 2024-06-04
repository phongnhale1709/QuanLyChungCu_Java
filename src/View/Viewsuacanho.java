/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;


import DAO.Daocanho;
import MODEL.Modelcanho;
import javax.swing.JOptionPane;
import View.Viewcanho;
import java.awt.Frame;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Thinkbook 16
 */
public class Viewsuacanho extends javax.swing.JFrame {
    String ma = "" ; 
    public Viewsuacanho() {
        super();
        initComponents();
        setLocationRelativeTo(null);
    }
    public Viewsuacanho(Modelcanho a) {
        initComponents();
        setLocationRelativeTo(null);
     
        Modelcanho ch = a;
        
        txtMach.setText(ch.getMACH().trim());
        txtDientich.setText(ch.getDienTich() + " ");
        CBLoaicanho.setSelectedItem(ch.getLoaiCH());
        txtSophongngu.setText(ch.getSoPhongNgu() + " ");
        txtSophongtam.setText(ch.getSoPhongTam() + " ");
        txtTang.setText(ch.getTang() + " ");
        txtGiathue.setText(ch.getGiaThue() + " ");
        txtPhidichvu.setText(ch.getPHIDV() + " ");
        txtGiaxe.setText(ch.getGIAXE() + " ");
        txtSoluongxe.setText(ch.getSLXE() + " ");
        if (ch.getMACD() !=null)
        {
        txtMacudan.setText(ch.getMACD().trim());
        }
        else 
            
        {
             txtMacudan.setText("null");
        }
        if (ch.getMANV() !=null)
        {
        txtManhanvien.setText(ch.getMANV().trim());
}       else
        {
            txtManhanvien.setText("null");
        }
        if (ch.getMANV() !=null)
        {
        txtMahopdong.setText(ch.getMAHOPDONG().trim());
        }else 
        {
          txtMahopdong.setText("null");
        }
    }
    
    public Viewsuacanho(Modelcanho a , String ma) {
        initComponents();
        setLocationRelativeTo(null);
        this.ma = ma ;
     
        Modelcanho ch = a;
        
        txtMach.setText(ch.getMACH().trim());
        txtDientich.setText(ch.getDienTich() + " ");
        CBLoaicanho.setSelectedItem(ch.getLoaiCH());
        txtSophongngu.setText(ch.getSoPhongNgu() + " ");
        txtSophongtam.setText(ch.getSoPhongTam() + " ");
        txtTang.setText(ch.getTang() + " ");
        txtGiathue.setText(ch.getGiaThue() + " ");
        txtPhidichvu.setText(ch.getPHIDV() + " ");
        txtGiaxe.setText(ch.getGIAXE() + " ");
        txtSoluongxe.setText(ch.getSLXE() + " ");
        txtMacudan.setText(ch.getMACD().trim());
        txtManhanvien.setText(ch.getMANV().trim());
        txtMahopdong.setText(ch.getMAHOPDONG().trim());
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
        jLabelMach = new javax.swing.JLabel();
        jLabelDientich = new javax.swing.JLabel();
        jLabelLoaiCH = new javax.swing.JLabel();
        jLabelSopngu = new javax.swing.JLabel();
        jLabelSoptam = new javax.swing.JLabel();
        jLabelPhidichvu = new javax.swing.JLabel();
        jLableSlxe = new javax.swing.JLabel();
        jLabelGiathue = new javax.swing.JLabel();
        jLabelTang = new javax.swing.JLabel();
        jLabelGiaxe = new javax.swing.JLabel();
        txtMach = new javax.swing.JTextField();
        txtDientich = new javax.swing.JTextField();
        txtSophongngu = new javax.swing.JTextField();
        txtSophongtam = new javax.swing.JTextField();
        txtTang = new javax.swing.JTextField();
        txtGiathue = new javax.swing.JTextField();
        txtPhidichvu = new javax.swing.JTextField();
        txtSoluongxe = new javax.swing.JTextField();
        CBLoaicanho = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtGiaxe = new javax.swing.JTextField();
        txtMacudan = new javax.swing.JTextField();
        txtManhanvien = new javax.swing.JTextField();
        txtMahopdong = new javax.swing.JTextField();
        btnSuacanho = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(55, 139, 167));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(449, 555));

        jLabelMach.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelMach.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMach.setText("Mã căn hộ");

        jLabelDientich.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelDientich.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDientich.setText("Diện tích");

        jLabelLoaiCH.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelLoaiCH.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLoaiCH.setText("Loại căn hộ");

        jLabelSopngu.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelSopngu.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSopngu.setText("Số Phòng Ngủ");

        jLabelSoptam.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelSoptam.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSoptam.setText("Số Phòng Tắm");

        jLabelPhidichvu.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelPhidichvu.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPhidichvu.setText("Phí Dịch Vụ");

        jLableSlxe.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLableSlxe.setForeground(new java.awt.Color(255, 255, 255));
        jLableSlxe.setText("Số Lượng Xe");

        jLabelGiathue.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelGiathue.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGiathue.setText("Giá Thuê");

        jLabelTang.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelTang.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTang.setText("Tầng");

        jLabelGiaxe.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelGiaxe.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGiaxe.setText("Giá Xe");

        txtMach.setEditable(false);
        txtMach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMachActionPerformed(evt);
            }
        });

        txtDientich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDientichActionPerformed(evt);
            }
        });

        CBLoaicanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thường", "Studio", " ", " " }));
        CBLoaicanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBLoaicanhoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mã Cư Dân");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mã Nhân Viên");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mã Hợp Đồng");

        btnSuacanho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-update-item (2).png"))); // NOI18N
        btnSuacanho.setText("Sửa");
        btnSuacanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuacanhoActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-update-30 (1).png"))); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-left-50.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDientich, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelLoaiCH, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelSopngu, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelSoptam, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelTang, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelGiathue)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabelPhidichvu, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelGiaxe, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLableSlxe))
                                .addGap(74, 74, 74))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSuacanho)
                                .addGap(1, 1, 1)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtGiaxe, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CBLoaicanho, 0, 188, Short.MAX_VALUE)
                                    .addComponent(txtDientich, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                    .addComponent(txtSophongngu)
                                    .addComponent(txtSophongtam)
                                    .addComponent(txtTang)
                                    .addComponent(txtGiathue)
                                    .addComponent(txtPhidichvu))
                                .addComponent(txtSoluongxe, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMacudan, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtManhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMahopdong, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMach, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton2)))
                    .addComponent(jLabelMach, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton3)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMach)
                    .addComponent(txtMach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDientich)
                    .addComponent(txtDientich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLoaiCH)
                    .addComponent(CBLoaicanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSopngu)
                    .addComponent(txtSophongngu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSoptam)
                    .addComponent(txtSophongtam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTang)
                    .addComponent(txtTang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGiathue)
                    .addComponent(txtGiathue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPhidichvu)
                    .addComponent(txtPhidichvu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGiaxe)
                    .addComponent(txtGiaxe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLableSlxe)
                    .addComponent(txtSoluongxe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMacudan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtManhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMahopdong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSuacanho)
                    .addComponent(jButton2))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMachActionPerformed

    private void txtDientichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDientichActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDientichActionPerformed

    private void CBLoaicanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBLoaicanhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBLoaicanhoActionPerformed

    private void btnSuacanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuacanhoActionPerformed
if (ma.equals("")) {     
Daocanho ch = new Daocanho();
        Modelcanho s = new Modelcanho();
        
        s.setMACH(txtMach.getText());
        s.setDienTich (Double.parseDouble(txtDientich.getText().trim()));
        String selectedValue = (String) CBLoaicanho.getSelectedItem();
        if ("Thường".equals(selectedValue)) {
            s.setLoaiCH("Thuong");
        } else {
            s.setLoaiCH("Studio");
}
      
        s.setSoPhongNgu (Integer.parseInt(txtSophongngu.getText().trim()));
        s.setSoPhongTam (Integer.parseInt(txtSophongtam.getText().trim()));
        s.setTang (Integer.parseInt(txtTang.getText().trim()));
        s.setGiaThue (Double.parseDouble(txtGiathue.getText()));
        s.setPHIDV (Double.parseDouble(txtPhidichvu.getText()));
        s.setGIAXE (Double.parseDouble(txtGiaxe.getText()));
        s.setSLXE (Integer.parseInt(txtSoluongxe.getText().trim()));
        s.setMACD(txtMacudan.getText());
        s.setMANV(txtManhanvien.getText());
        s.setMAHOPDONG(txtMahopdong.getText());
        
        
        
             
        try {
            ch.update(s);
            JOptionPane.showMessageDialog(this, "Sửa căn hộ thành công");
        } catch (SQLException ex) {
            Logger.getLogger(Viewsuacanho.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Viewsuacanho.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            new Viewcanho().setVisible(true);
            this.dispose();
        } 
        
        else {
            
Daocanho ch = new Daocanho();
        Modelcanho s = new Modelcanho();
        
        s.setMACH(txtMach.getText());
        s.setDienTich (Double.parseDouble(txtDientich.getText().trim()));
        String selectedValue = (String) CBLoaicanho.getSelectedItem();
        if ("Thường".equals(selectedValue)) {
            s.setLoaiCH("Thuong");
        } else {
            s.setLoaiCH("Studio");
}
      
        s.setSoPhongNgu (Integer.parseInt(txtSophongngu.getText().trim()));
        s.setSoPhongTam (Integer.parseInt(txtSophongtam.getText().trim()));
        s.setTang (Integer.parseInt(txtTang.getText().trim()));
        s.setGiaThue (Double.parseDouble(txtGiathue.getText()));
        s.setPHIDV (Double.parseDouble(txtPhidichvu.getText()));
        s.setGIAXE (Double.parseDouble(txtGiaxe.getText()));
        s.setSLXE (Integer.parseInt(txtSoluongxe.getText().trim()));
        s.setMACD(txtMacudan.getText());
        s.setMANV(txtManhanvien.getText());
        s.setMAHOPDONG(txtMahopdong.getText());
        
        
        
             
        try {
            ch.update(s);
            JOptionPane.showMessageDialog(this, "Sửa căn hộ thành công");
        } catch (SQLException ex) {
            Logger.getLogger(Viewsuacanho.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Viewsuacanho.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            new Viewcanho(ma).setVisible(true);
            this.dispose();
}


    }//GEN-LAST:event_btnSuacanhoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtDientich.setText("");
        txtGiathue.setText("");
        txtGiaxe.setText("");
        txtSophongngu.setText("");
        txtSophongtam.setText("");
        txtTang.setText("");
        txtPhidichvu.setText("");
        txtSoluongxe.setText("");
        txtMacudan.setText("");
        txtManhanvien.setText("");
        txtMahopdong.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (ma.equals("")) { 
        Viewcanho viewch=new Viewcanho();
        viewch.show();
        dispose();
        } else {
            Viewcanho viewch=new Viewcanho(ma);
            viewch.show();
            dispose();
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Viewsuacanho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Viewsuacanho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Viewsuacanho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Viewsuacanho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Viewsuacanho().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBLoaicanho;
    private javax.swing.JButton btnSuacanho;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelDientich;
    private javax.swing.JLabel jLabelGiathue;
    private javax.swing.JLabel jLabelGiaxe;
    private javax.swing.JLabel jLabelLoaiCH;
    private javax.swing.JLabel jLabelMach;
    private javax.swing.JLabel jLabelPhidichvu;
    private javax.swing.JLabel jLabelSopngu;
    private javax.swing.JLabel jLabelSoptam;
    private javax.swing.JLabel jLabelTang;
    private javax.swing.JLabel jLableSlxe;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDientich;
    private javax.swing.JTextField txtGiathue;
    private javax.swing.JTextField txtGiaxe;
    private javax.swing.JTextField txtMach;
    private javax.swing.JTextField txtMacudan;
    private javax.swing.JTextField txtMahopdong;
    private javax.swing.JTextField txtManhanvien;
    private javax.swing.JTextField txtPhidichvu;
    private javax.swing.JTextField txtSoluongxe;
    private javax.swing.JTextField txtSophongngu;
    private javax.swing.JTextField txtSophongtam;
    private javax.swing.JTextField txtTang;
    // End of variables declaration//GEN-END:variables
}