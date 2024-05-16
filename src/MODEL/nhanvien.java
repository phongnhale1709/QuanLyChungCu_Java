/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

/**
 *
 * @author hoangxuanthuy
 */
public class nhanvien {
   private String MANV;
   private String SDT;
   private String HOTEN;
   private  String Email;
   private  String MABQL;
    public nhanvien(String MANV, String SDT, String HOTEN, String Email, String MABQL) {
        this.MANV = MANV;
        this.SDT = SDT;
        this.HOTEN = HOTEN;
        this.Email = Email;
        this.MABQL = MABQL;
    }
   

    public String getMANV() {
        return MANV;
    }

    public String getSDT() {
        return SDT;
    }

    public String getHOTEN() {
        return HOTEN;
    }

    public String getEmail() {
        return Email;
    }

    public String getMABQL() {
        return MABQL;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public void setHOTEN(String HOTEN) {
        this.HOTEN = HOTEN;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setMABQL(String MABQL) {
        this.MABQL = MABQL;
    }

    @Override
    public String toString() {
        return "nhanvien{" + "MANV=" + MANV + ", SDT=" + SDT + ", HOTEN=" + HOTEN + ", Email=" + Email + ", MABQL=" + MABQL + '}';
    }
    
}
