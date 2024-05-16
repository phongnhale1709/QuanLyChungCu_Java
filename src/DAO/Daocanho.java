
package DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Database.OracleJDBCconnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import MODEL.Modelcanho;
import java.sql.CallableStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

        public class Daocanho   {

            public static Daocanho getInstance() {
            return new Daocanho();
                 }

    //@Override
    public void addcanho (Modelcanho ch) throws SQLException, ParseException {
        Connection c = OracleJDBCconnection.getJDBCconnection();
            
            CallableStatement callableStatement = c.prepareCall("{CALL INSERT_CANHO(?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            
            callableStatement.setString(1, ch.getMACH());
            callableStatement.setDouble(2, ch.getDienTich());
            callableStatement.setString(3, ch.getLoaiCH());
            callableStatement.setInt(4, ch.getSoPhongNgu());
            callableStatement.setInt(5, ch.getSoPhongTam());
            callableStatement.setInt(6, ch.getTang());
            callableStatement.setDouble(7, ch.getGiaThue());
            callableStatement.setDouble(8, ch.getPHIDV());
            callableStatement.setDouble(9, ch.getGIAXE());
            callableStatement.setInt(10, ch.getSLXE());
            callableStatement.setString(11, ch.getMACD());
            callableStatement.setString(12, ch.getMANV());
            callableStatement.setString(13, ch.getMAHOPDONG());
    
            callableStatement.executeUpdate();
    
            // Close resources
            callableStatement.close();
            c.close();
    }
    

      public void updatecanho(Modelcanho ch) throws SQLException, ParseException {
        try (Connection c =OracleJDBCconnection.getJDBCconnection();
            CallableStatement callableStatement = c.prepareCall("{CALL UPDATE_BENHNHAN(?,?,?,?,?,?,?,?)}")) {
            
            callableStatement.setString(1, bn.getCcccd());
            callableStatement.setString(2, bn.getTen());
            
            SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY"); // Sửa đổi định dạng ngày
            java.util.Date date = sdf.parse(bn.getNgaysinh());
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            callableStatement.setDate(3, sqlDate);
            
            callableStatement.setString(4, bn.getGt());
            callableStatement.setString(5, bn.getSdt());
            callableStatement.setString(6, bn.getDiachi());
            callableStatement.setString(7, bn.getGhichu());
            callableStatement.setString(8, bn.getTinhtrang());
            
            callableStatement.executeUpdate();
        }
}

  
    
   public int delete(Modelcanho s) {
        int ketQua = 0;
        try {
            Connection con = OracleJDBCconnection.getJDBCconnection();
            String sql = "DELETE FROM SANPHAM WHERE masp=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, s.getMACH());
            ketQua = pst.executeUpdate();
            OracleJDBCconnection.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    //Override
    public ArrayList<Modelcanho> selectAll() {
        ArrayList<Modelcanho> ketQua = new ArrayList<Modelcanho>();
        try {
            Connection con = OracleJDBCconnection.getJDBCconnection();
            String sql = "SELECT * FROM CANHO";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String MACH = rs.getString("MACH");
                Double DienTich= rs.getDouble("DienTich");
                String LoaiCH = rs.getString("LoaiCH");
                int SoPhongNgu = rs.getInt("SoPhongNgu");
                int SoPhongTam = rs.getInt("SoPhongTam");
                int Tang = rs.getInt("Tang");
                Double GiaThue = rs.getDouble("GiaThue");
                Double PHIDV= rs.getDouble("PHIDV");
                Double GIAXE = rs.getDouble("GIAXE");
                int SLXE= rs.getInt("SLXE");
                String MACD=rs.getString("MACD");
                String MANV=rs.getString("MANV");
                String MAHOPDONG=rs.getString("MAHOPDONG");
                
                Modelcanho ch = new Modelcanho(MACH, DienTich ,LoaiCH, SoPhongNgu, SoPhongTam, Tang, GiaThue, PHIDV,GIAXE,SLXE,MACD,MANV,MAHOPDONG);
                ketQua.add(ch);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    public ArrayList<Modelcanho> selectAllE() {
        ArrayList<Modelcanho> ketQua = new ArrayList<Modelcanho>();
        try {
            Connection con = OracleJDBCconnection.getJDBCconnection();
            String sql = "SELECT * FROM CANHO WHERE soluong > 0";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String MACH = rs.getString("MACH");
                Double DienTich= rs.getDouble("DienTich");
                String LoaiCH = rs.getString("LoaiCH");
                int SoPhongNgu = rs.getInt("SoPhongNgu");
                int SoPhongTam = rs.getInt("SoPhongTam");
                int Tang = rs.getInt("Tang");
                Double GiaThue = rs.getDouble("GiaThue");
                Double PHIDV= rs.getDouble("PHIDV");
                Double GIAXE = rs.getDouble("GIAXE");
                int SLXE= rs.getInt("SLXE");
                String MACD=rs.getString("MACD");
                String MANV=rs.getString("MANV");
                String MAHOPDONG=rs.getString("MAHOPDONG");
                
                Modelcanho ch = new Modelcanho(MACH, DienTich ,LoaiCH, SoPhongNgu, SoPhongTam, Tang, GiaThue, PHIDV,GIAXE,SLXE,MACD,MANV,MAHOPDONG);
                ketQua.add(ch);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }
}