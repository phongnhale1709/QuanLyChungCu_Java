/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

/**
 *
 * @author hoangxuanthuy
 */
public class cthd {
    private String MAHD; // VARCHAR2(6) PRIMARY KEY
    private double GIATHUE; // NUMBER
    private double PHIXE; // NUMBER
    private double PHIDV; // NUMBER
    private double TIENDIEN; // NUMBER
    private double TIENNUOC; // NUMBER

    public cthd(String MAHD, double GIATHUE, double PHIXE, double PHIDV, double TIENDIEN, double TIENNUOC) {
        this.MAHD = MAHD;
        this.GIATHUE = GIATHUE;
        this.PHIXE = PHIXE;
        this.PHIDV = PHIDV;
        this.TIENDIEN = TIENDIEN;
        this.TIENNUOC = TIENNUOC;
    }

    public String getMAHD() {
        return MAHD;
    }

    public double getGIATHUE() {
        return GIATHUE;
    }

    public double getPHIXE() {
        return PHIXE;
    }

    public double getPHIDV() {
        return PHIDV;
    }

    public double getTIENDIEN() {
        return TIENDIEN;
    }

    public double getTIENNUOC() {
        return TIENNUOC;
    }

    public void setMAHD(String MAHD) {
        this.MAHD = MAHD;
    }

    public void setGIATHUE(double GIATHUE) {
        this.GIATHUE = GIATHUE;
    }

    public void setPHIXE(double PHIXE) {
        this.PHIXE = PHIXE;
    }

    public void setPHIDV(double PHIDV) {
        this.PHIDV = PHIDV;
    }

    public void setTIENDIEN(double TIENDIEN) {
        this.TIENDIEN = TIENDIEN;
    }

    public void setTIENNUOC(double TIENNUOC) {
        this.TIENNUOC = TIENNUOC;
    }

    @Override
    public String toString() {
        return "cthd{" + "MAHD=" + MAHD + ", GIATHUE=" + GIATHUE + ", PHIXE=" + PHIXE + ", PHIDV=" + PHIDV + ", TIENDIEN=" + TIENDIEN + ", TIENNUOC=" + TIENNUOC + '}';
    }
    
}
