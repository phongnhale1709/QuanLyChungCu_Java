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
public class hoadon {
    private String MAHD; // VARCHAR2(6) PRIMARY KEY
    private  LocalDate NGAYHD; // DATE
    private double TRIGIA; // NUMBER
    private String MACH; // VARCHAR2(6)

    public hoadon(String MAHD, LocalDate NGAYHD, double TRIGIA, String MACH) {
        this.MAHD = MAHD;
        this.NGAYHD = NGAYHD;
        this.TRIGIA = TRIGIA;
        this.MACH = MACH;
    }

    public String getMAHD() {
        return MAHD;
    }

    public LocalDate getNGAYHD() {
        return NGAYHD;
    }

    public double getTRIGIA() {
        return TRIGIA;
    }

    public String getMACH() {
        return MACH;
    }

    public void setMAHD(String MAHD) {
        this.MAHD = MAHD;
    }

    public void setNGAYHD(LocalDate NGAYHD) {
        this.NGAYHD = NGAYHD;
    }

    public void setTRIGIA(double TRIGIA) {
        this.TRIGIA = TRIGIA;
    }

    public void setMACH(String MACH) {
        this.MACH = MACH;
    }

    @Override
    public String toString() {
        return "hoadon{" + "MAHD=" + MAHD + ", NGAYHD=" + NGAYHD + ", TRIGIA=" + TRIGIA + ", MACH=" + MACH + '}';
    }
    
}
