package View;
import java.util.*;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.TTDangNhapModel;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author hyn09
 */
 public class Mainnv extends javax.swing.JFrame {

    private TTDangNhapModel currentAcc;
    public JPanel selectedPanel; 
    public void setPanelBackground(JPanel panel, boolean isSelected) {
        if (isSelected) {
            panel.setBackground(Color.WHITE); // Thiết lập màu nền trắng khi được chọn
        } else {
            panel.setBackground(new Color(152, 205, 205)); // Màu nền mặc định khi không được chọn
        }
    }
    
    public void selectPanel(JPanel panel) {
        if (selectedPanel != null) {
            setPanelBackground(selectedPanel, false); // Đặt màu nền trở lại mặc định cho panel trước
        }
        selectedPanel = panel; // Đặt panel mới là panel được chọn
        setPanelBackground(selectedPanel, true); // Thiết lập màu nền trắng cho panel mới
    }
    
    public TTDangNhapModel getCurrentAcc() {
        return currentAcc;
    }
    
    public void setCurrentAcc(TTDangNhapModel currentAcc) {
        this.currentAcc = currentAcc;
    }
    
    private Mainnv() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public Mainnv(TTDangNhapModel t) {
        initComponents();
        setLocationRelativeTo(null);
        this.currentAcc = t;
        
        setTitle("QUẢN LÝ CỬA HÀNG BÁN QUẦN ÁO");
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        TrangChu trangChu = new TrangChu();
        jpnView.add(trangChu);
        jpnView.repaint();
        jpnView.revalidate();
       
        jpnTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            // Gọi phương thức hiển thị màn hình trang chủ khi jpaneltrangchu được nhấn
            super.mouseClicked(evt);
                // Xóa tất cả các thành phần hiển thị trên jpnView
            jpnView.removeAll();
            jpnView.setLayout(new BorderLayout());
            TrangChu trangChu = new TrangChu();
            jpnView.add(trangChu);
            jpnView.repaint();
            jpnView.revalidate();
            

        }
        @Override
        public void mousePressed(java.awt.event.MouseEvent evt) {
            jpnTrangChu.setBackground(new Color(125,125,125));
            jlbTrangChu.setBackground(new Color(125,125,125));
               
        }
        public void jpnTrangChuMousePressed(java.awt.event.MouseEvent evt) {
            jpnTrangChu.setBackground(new Color(125,125,125));
            jlbTrangChu.setBackground(new Color(125,125,125));
               
        }
        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jpnTrangChu.setBackground(new Color(255, 255, 255));
            jlbTrangChu.setBackground(new Color(255, 255, 255));
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
                jpnTrangChu.setBackground(new Color(152,205,205));
                jlbTrangChu.setBackground(new Color(152,205,205));
            
        }
    });
        jfr.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            // Gọi phương thức hiển thị màn hình trang chủ khi jpaneltrangchu được nhấn
            super.mouseClicked(evt);
                // Xóa tất cả các thành phần hiển thị trên jpnView
            jpnView.removeAll();
            jpnView.setLayout(new BorderLayout());
            SanPham sanpham = new SanPham();
            jpnView.add(sanpham);
            jpnView.repaint();
            jpnView.revalidate();
            
            selectPanel(jfr);
        }
        @Override
        public void mousePressed(java.awt.event.MouseEvent evt) {
            jfr.setBackground(new Color(125,125,125));
            jframecanho.setBackground(new Color(125,125,125));
               
        }

        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jfr.setBackground(new Color(255, 255, 255));
            jframecanho.setBackground(new Color(255, 255, 255));
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
                jfr.setBackground(new Color(152,205,205));
                jframecanho.setBackground(new Color(152,205,205));
            
        }
    });
        jpn.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            // Gọi phương thức hiển thị màn hình trang chủ khi jpaneltrangchu được nhấn
            super.mouseClicked(evt);
                // Xóa tất cả các thành phần hiển thị trên jpnView
            jpnView.removeAll();
            jpnView.setLayout(new BorderLayout());
            NhaCungCap nhacungcap = new NhaCungCap();
            jpnView.add(nhacungcap);
            jpnView.repaint();
            jpnView.revalidate();
             
        }
        @Override
        public void mousePressed(java.awt.event.MouseEvent evt) {
            jpn.setBackground(new Color(125,125,125));
            jframecudan.setBackground(new Color(125,125,125));
               
        }

        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jpn.setBackground(new Color(255, 255, 255));
            jframecudan.setBackground(new Color(255, 255, 255));
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
                jpn.setBackground(new Color(152,205,205));
                jframecudan.setBackground(new Color(152,205,205));
            
        }
    });

        jpnBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            // Gọi phương thức hiển thị màn hình trang chủ khi jpaneltrangchu được nhấn
            super.mouseClicked(evt);
                // Xóa tất cả các thành phần hiển thị trên jpnView
            jpnView.removeAll();
            jpnView.setLayout(new BorderLayout());
            BanHang banhang = new BanHang();
            jpnView.add(banhang);
            banhang.setNguoiTao(currentAcc.getMaNV());
            jpnView.repaint();
            jpnView.revalidate();
             
        }
        @Override
        public void mousePressed(java.awt.event.MouseEvent evt) {
            jpnBanHang.setBackground(new Color(125,125,125));
            jframehopdong.setBackground(new Color(125,125,125));
               
        }

        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jpnBanHang.setBackground(new Color(255, 255, 255));
            jframehopdong.setBackground(new Color(255, 255, 255));
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
                jpnBanHang.setBackground(new Color(152,205,205));
                jframehopdong.setBackground(new Color(152,205,205));
            
        }
    });
        jpnNhapHang.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            // Gọi phương thức hiển thị màn hình trang chủ khi jpaneltrangchu được nhấn
            super.mouseClicked(evt);
                // Xóa tất cả các thành phần hiển thị trên jpnView
            jpnView.removeAll();
            jpnView.setLayout(new BorderLayout());
            NhapHang nhaphang = new NhapHang();
            jpnView.add(nhaphang);
            nhaphang.setNguoiNhapHang(currentAcc.getMaNV());
            jpnView.repaint();
            jpnView.revalidate();
             
        }
        @Override
        public void mousePressed(java.awt.event.MouseEvent evt) {
            jpnNhapHang.setBackground(new Color(125,125,125));
            jlbhoadon.setBackground(new Color(125,125,125));
               
        }

        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jpnNhapHang.setBackground(new Color(255, 255, 255));
            jlbhoadon.setBackground(new Color(255, 255, 255));
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
                jpnNhapHang.setBackground(new Color(152,205,205));
                jlbhoadon.setBackground(new Color(152,205,205));
            
        }
    });
        jpnHoaDonBH.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            // Gọi phương thức hiển thị màn hình trang chủ khi jpaneltrangchu được nhấn
            Viewcanho viewch=new Viewcanho();
            viewch.show();
            dispose(); 
        }
        @Override
        public void mousePressed(java.awt.event.MouseEvent evt) {
            jpnHoaDonBH.setBackground(new Color(125,125,125));
            jframexe.setBackground(new Color(125,125,125));
               
        }

        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jpnHoaDonBH.setBackground(new Color(255, 255, 255));
            jframexe.setBackground(new Color(255, 255, 255));
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
                jpnHoaDonBH.setBackground(new Color(152,205,205));
                jframexe.setBackground(new Color(152,205,205));
            
        }
    });
        jpnHoaDonNH.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            // Gọi phương thức hiển thị màn hình trang chủ khi jpaneltrangchu được nhấn
            super.mouseClicked(evt);
                // Xóa tất cả các thành phần hiển thị trên jpnView
            jpnView.removeAll();
            jpnView.setLayout(new BorderLayout());
            HoaDonNH hoadonnh = new HoaDonNH();
            jpnView.add(hoadonnh);
            jpnView.repaint();
            jpnView.revalidate();
             
        }
        @Override
        public void mousePressed(java.awt.event.MouseEvent evt) {
            jpnHoaDonNH.setBackground(new Color(125,125,125));
            jframeyeucau.setBackground(new Color(125,125,125));
               
        }

        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jpnHoaDonNH.setBackground(new Color(255, 255, 255));
            jframeyeucau.setBackground(new Color(255, 255, 255));
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
                jpnHoaDonNH.setBackground(new Color(152,205,205));
                jframeyeucau.setBackground(new Color(152,205,205));
            
        }
    });
        jpnNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            // Gọi phương thức hiển thị màn hình trang chủ khi jpaneltrangchu được nhấn
            super.mouseClicked(evt);
                // Xóa tất cả các thành phần hiển thị trên jpnView
            jpnView.removeAll();
            jpnView.setLayout(new BorderLayout());
            NhanVien nhanvien = new NhanVien();
            jpnView.add(nhanvien);
            jpnView.repaint();
            jpnView.revalidate();
             
        }
        @Override
        public void mousePressed(java.awt.event.MouseEvent evt) {
            jpnNhanVien.setBackground(new Color(125,125,125));
            jlbNhanVien.setBackground(new Color(125,125,125));
               
        }

        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jpnNhanVien.setBackground(new Color(255, 255, 255));
            jlbNhanVien.setBackground(new Color(255, 255, 255));
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
                jpnNhanVien.setBackground(new Color(152,205,205));
                jlbNhanVien.setBackground(new Color(152,205,205));
            
        }
    });
        jpnTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            // Gọi phương thức hiển thị màn hình trang chủ khi jpaneltrangchu được nhấn
            super.mouseClicked(evt);
                // Xóa tất cả các thành phần hiển thị trên jpnView
            jpnView.removeAll();
            jpnView.setLayout(new BorderLayout());
            TTDangNhap ttdangnhap = new TTDangNhap();
            jpnView.add(ttdangnhap);
            jpnView.repaint();
            jpnView.revalidate();
             
        }
        @Override
        public void mousePressed(java.awt.event.MouseEvent evt) {
            jpnTaiKhoan.setBackground(new Color(125,125,125));
            jlbTaiKhoan.setBackground(new Color(125,125,125));
               
        }

        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jpnTaiKhoan.setBackground(new Color(255, 255, 255));
            jlbTaiKhoan.setBackground(new Color(255, 255, 255));
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
                jpnTaiKhoan.setBackground(new Color(152,205,205));
                jlbTaiKhoan.setBackground(new Color(152,205,205));
            
        }
    });
        jpnThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            // Gọi phương thức hiển thị màn hình trang chủ khi jpaneltrangchu được nhấn
            super.mouseClicked(evt);
                // Xóa tất cả các thành phần hiển thị trên jpnView
            jpnView.removeAll();
            jpnView.setLayout(new BorderLayout());
            ThongKe thongke = new ThongKe();
            jpnView.add(thongke);
            jpnView.repaint();
            jpnView.revalidate();
             
        }
        @Override
        public void mousePressed(java.awt.event.MouseEvent evt) {
            jpnThongKe.setBackground(new Color(125,125,125));
            jlbThongKe.setBackground(new Color(125,125,125));
               
        }

        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jpnThongKe.setBackground(new Color(255, 255, 255));
            jlbThongKe.setBackground(new Color(255, 255, 255));
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
                jpnThongKe.setBackground(new Color(152,205,205));
                jlbThongKe.setBackground(new Color(152,205,205));
            
        }
    });
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jpnRoot = new javax.swing.JPanel();
        jpnMenu = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jpnTrangChu = new javax.swing.JPanel();
        jlbTrangChu = new javax.swing.JLabel();
        jfr = new javax.swing.JPanel();
        jframecanho = new javax.swing.JLabel();
        jpn = new javax.swing.JPanel();
        jframecudan = new javax.swing.JLabel();
        jpnNhapHang = new javax.swing.JPanel();
        jlbhoadon = new javax.swing.JLabel();
        LogOut = new javax.swing.JButton();
        jpnView = new javax.swing.JPanel();

        jPanel6.setBackground(new java.awt.Color(152, 205, 205));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("HÓA ĐƠN");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(26, 26, 26))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(152, 205, 205));

        jpnMenu.setBackground(new java.awt.Color(196, 233, 245));

        jPanel11.setBackground(new java.awt.Color(153, 204, 255));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel7.setText("Minions Apartment");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lo_go.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jpnTrangChu.setBackground(new java.awt.Color(255, 255, 255));
        jpnTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpnTrangChuMousePressed(evt);
            }
        });

        jlbTrangChu.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jlbTrangChu.setText("TRANG CHỦ");

        javax.swing.GroupLayout jpnTrangChuLayout = new javax.swing.GroupLayout(jpnTrangChu);
        jpnTrangChu.setLayout(jpnTrangChuLayout);
        jpnTrangChuLayout.setHorizontalGroup(
            jpnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTrangChuLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jlbTrangChu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnTrangChuLayout.setVerticalGroup(
            jpnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnTrangChuLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jlbTrangChu)
                .addContainerGap())
        );

        jfr.setBackground(new java.awt.Color(255, 255, 255));

        jframecanho.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jframecanho.setText("CĂN HỘ");

        javax.swing.GroupLayout jfrLayout = new javax.swing.GroupLayout(jfr);
        jfr.setLayout(jfrLayout);
        jfrLayout.setHorizontalGroup(
            jfrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jfrLayout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(jframecanho)
                .addGap(105, 105, 105))
        );
        jfrLayout.setVerticalGroup(
            jfrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jfrLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jframecanho)
                .addContainerGap())
        );

        jpn.setBackground(new java.awt.Color(255, 255, 255));

        jframecudan.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jframecudan.setText("CƯ DÂN");

        javax.swing.GroupLayout jpnLayout = new javax.swing.GroupLayout(jpn);
        jpn.setLayout(jpnLayout);
        jpnLayout.setHorizontalGroup(
            jpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jframecudan)
                .addGap(104, 104, 104))
        );
        jpnLayout.setVerticalGroup(
            jpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jframecudan)
                .addContainerGap())
        );

        jpnNhapHang.setBackground(new java.awt.Color(255, 255, 255));

        jlbhoadon.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jlbhoadon.setText("HOÁ ĐƠN");

        javax.swing.GroupLayout jpnNhapHangLayout = new javax.swing.GroupLayout(jpnNhapHang);
        jpnNhapHang.setLayout(jpnNhapHangLayout);
        jpnNhapHangLayout.setHorizontalGroup(
            jpnNhapHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnNhapHangLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbhoadon)
                .addGap(95, 95, 95))
        );
        jpnNhapHangLayout.setVerticalGroup(
            jpnNhapHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnNhapHangLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jlbhoadon)
                .addContainerGap())
        );

        LogOut.setBackground(new java.awt.Color(153, 204, 255));
        LogOut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LogOut.setForeground(new java.awt.Color(255, 255, 255));
        LogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dangxuat.png"))); // NOI18N
        LogOut.setText("ĐĂNG XUẤT");
        LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutMouseClicked(evt);
            }
        });
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnNhapHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpnMenuLayout.createSequentialGroup()
                        .addComponent(jfr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jfr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnNhapHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 642, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpnView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void LogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseClicked
        // TODO add your handling code here:
        int relly = JOptionPane.showConfirmDialog(
            null,
            "Bạn muốn thoát khỏi chương trình ?",
            "Xác nhận",
            JOptionPane.YES_NO_OPTION);
        if (relly == JOptionPane.YES_OPTION) {
            this.dispose();
            DangNhap dialog = new DangNhap(new javax.swing.JFrame(), true);
            //dialog.setVisible(true);
        }
    }//GEN-LAST:event_LogOutMouseClicked

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogOutActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainnv().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jfr;
    private javax.swing.JLabel jframecanho;
    private javax.swing.JLabel jframecudan;
    private javax.swing.JLabel jlbTrangChu;
    private javax.swing.JLabel jlbhoadon;
    private javax.swing.JPanel jpn;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnNhapHang;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnTrangChu;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables
}
