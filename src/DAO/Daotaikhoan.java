/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Database.OracleJDBCconnection;
import javax.swing.JOptionPane;
import MODEL.Modeltaikhoan;

/**
 *
 * @author Thinkbook 16
 */
public class Daotaikhoan {
    public static Daotaikhoan getInstance() {
        return new Daotaikhoan();
    }

    public int insert(Modeltaikhoan t) {
        int ketQua = 0;
        try {
            Connection con = OracleJDBCconnection.getJDBCconnection();
            String sql = "INSERT INTO TAIKHOAN (username,password,role,email) VALUES (?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getUsername());
            pst.setString(2, t.getPassword());
            pst.setString(3, t.getRole());
            pst.setString(4, t.getEmail());
            ketQua = pst.executeUpdate();
            OracleJDBCconnection.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }
    public int update(Modeltaikhoan t) {
        int ketQua = 0;
        try {
            Connection con = OracleJDBCconnection.getJDBCconnection();
            String sql = "UPDATE TAIKHOAN SET username='" + t.getUsername() + 
                    ",password='" + t.getPassword() + ", role='" + t.getRole()+", email='"+t.getEmail();
            PreparedStatement pst = con.prepareStatement(sql);
            OracleJDBCconnection.closeConnection(con);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }
    public int delete(Modeltaikhoan t) {
        int ketQua = 0;
        try {
            Connection con = OracleJDBCconnection.getJDBCconnection();
            String sql = "DELETE FROM TAIKHOAN WHERE username=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getUsername());
            ketQua = pst.executeUpdate();
            OracleJDBCconnection.closeConnection(con);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }
    public ArrayList<Modeltaikhoan> selectAll() {
        ArrayList<Modeltaikhoan> ketQua = new ArrayList<Modeltaikhoan>();
        try {
            Connection con = OracleJDBCconnection.getJDBCconnection();
            String sql = "SELECT * FROM TAIKHOAN";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String username = rs.getString("username");
                String password = rs.getString("password");
                String role= rs.getString("role");
                String email= rs.getString("email");      
                Modeltaikhoan tk = new Modeltaikhoan(username,password,role,email);
                ketQua.add(tk);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }
    public Modeltaikhoan selectById(String t) {
    Modeltaikhoan ttdn = null;
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    try {
        con = OracleJDBCconnection.getJDBCconnection();
        String sql = "SELECT * FROM TAIKHOAN WHERE username=?";
        pst = con.prepareStatement(sql);
        pst.setString(1, t);
        rs = pst.executeQuery();

        if (rs.next()) {
            String username = rs.getString("username");
            String password = rs.getString("password");
            String role = rs.getString("role");
            String email = rs.getString("email");

            ttdn = new Modeltaikhoan(username, password, role, email);
        }
    } catch (Exception e) {
        e.printStackTrace();  // In ra lỗi nếu có
    } finally {
        // Đảm bảo đóng các tài nguyên đúng cách
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
            if (con != null) con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    return ttdn;
    }
    
    public int updatePassword(String email, String password) {
        int ketQua = 0;
        try {
            Connection con = OracleJDBCconnection.getJDBCconnection();
            String sql = "UPDATE TAIKHOAN SET password='" + password
                    + "' WHERE email='" + email + "'";
            PreparedStatement pst = con.prepareStatement(sql);

            ketQua = pst.executeUpdate();
            OracleJDBCconnection.closeConnection(con);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }
}
