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
public class hopdong {
    private String MAHOPDONG; // VARCHAR2(15) PRIMARY KEY
    private LocalDate NGAYBD; // DATE
    private String THOIHAN; // VARCHAR2(20)
    private String LOAIHD; // VARCHAR2(40)
    private double GIA; // NUMBER
    private String MACD; // VARCHAR2(6)
    private String MABQL; // VARCHAR2(6)

    public hopdong(String MAHOPDONG, LocalDate NGAYBD, String THOIHAN, String LOAIHD, double GIA, String MACD, String MABQL) {
        this.MAHOPDONG = MAHOPDONG;
        this.NGAYBD = NGAYBD;
        this.THOIHAN = THOIHAN;
        this.LOAIHD = LOAIHD;
        this.GIA = GIA;
        this.MACD = MACD;
        this.MABQL = MABQL;
    }

    public String getMAHOPDONG() {
        return MAHOPDONG;
    }

    public LocalDate getNGAYBD() {
        return NGAYBD;
    }

    public String getTHOIHAN() {
        return THOIHAN;
    }

    public String getLOAIHD() {
        return LOAIHD;
    }

    public double getGIA() {
        return GIA;
    }

    public String getMACD() {
        return MACD;
    }

    public String getMABQL() {
        return MABQL;
    }

    public void setMAHOPDONG(String MAHOPDONG) {
        this.MAHOPDONG = MAHOPDONG;
    }

    public void setNGAYBD(LocalDate NGAYBD) {
        this.NGAYBD = NGAYBD;
    }

    public void setTHOIHAN(String THOIHAN) {
        this.THOIHAN = THOIHAN;
    }

    public void setLOAIHD(String LOAIHD) {
        this.LOAIHD = LOAIHD;
    }

    public void setGIA(double GIA) {
        this.GIA = GIA;
    }

    public void setMACD(String MACD) {
        this.MACD = MACD;
    }

    public void setMABQL(String MABQL) {
        this.MABQL = MABQL;
    }

    @Override
    public String toString() {
        return "hopdong{" + "MAHOPDONG=" + MAHOPDONG + ", NGAYBD=" + NGAYBD + ", THOIHAN=" + THOIHAN + ", LOAIHD=" + LOAIHD + ", GIA=" + GIA + ", MACD=" + MACD + ", MABQL=" + MABQL + '}';
    }
    
    
}
