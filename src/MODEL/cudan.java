/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;
import java.time.LocalDate;
/**
 *
 * @author hoangxuanthuy
 */
public class cudan {
    private String MACD;
    private String hoten;
    private String gioitinh;
    private LocalDate ngsinh;
    private String cccd;
    private String sdt;
    private String email;
    private String loaicd;

    public cudan(String MACD, String hoten, String gioitinh, LocalDate ngsinh, String cccd, String sdt, String email, String loaicd) {
        this.MACD = MACD;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.ngsinh = ngsinh;
        this.cccd = cccd;
        this.sdt = sdt;
        this.email = email;
        this.loaicd = loaicd;
    }

    public String getMACD() {
        return MACD;
    }

    public String getHoten() {
        return hoten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public LocalDate getNgsinh() {
        return ngsinh;
    }

    public String getCccd() {
        return cccd;
    }

    public String getSdt() {
        return sdt;
    }

    public String getEmail() {
        return email;
    }

    public String getLoaicd() {
        return loaicd;
    }

    public void setMACD(String MACD) {
        this.MACD = MACD;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void setNgsinh(LocalDate ngsinh) {
        this.ngsinh = ngsinh;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLoaicd(String loaicd) {
        this.loaicd = loaicd;
    }

    @Override
    public String toString() {
        return "cudan{" + "MACD=" + MACD + ", hoten=" + hoten + ", gioitinh=" + gioitinh + ", ngsinh=" + ngsinh + ", cccd=" + cccd + ", sdt=" + sdt + ", email=" + email + ", loaicd=" + loaicd + '}';
    }
    
}
