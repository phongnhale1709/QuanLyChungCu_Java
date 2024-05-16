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
public class lsyc {
    private String MAYC; // VARCHAR2(6)
    private String MABQL; // VARCHAR2(6)
    private String NoiDungXuLy; // VARCHAR2(100)
    private LocalDate ThoiGianXuLy; // DATE

    public lsyc(String MAYC, String MABQL, String NoiDungXuLy, LocalDate ThoiGianXuLy) {
        this.MAYC = MAYC;
        this.MABQL = MABQL;
        this.NoiDungXuLy = NoiDungXuLy;
        this.ThoiGianXuLy = ThoiGianXuLy;
    }

    public String getMAYC() {
        return MAYC;
    }

    public String getMABQL() {
        return MABQL;
    }

    public String getNoiDungXuLy() {
        return NoiDungXuLy;
    }

    public LocalDate getThoiGianXuLy() {
        return ThoiGianXuLy;
    }

    public void setMAYC(String MAYC) {
        this.MAYC = MAYC;
    }

    public void setMABQL(String MABQL) {
        this.MABQL = MABQL;
    }

    public void setNoiDungXuLy(String NoiDungXuLy) {
        this.NoiDungXuLy = NoiDungXuLy;
    }

    public void setThoiGianXuLy(LocalDate ThoiGianXuLy) {
        this.ThoiGianXuLy = ThoiGianXuLy;
    }

    @Override
    public String toString() {
        return "lsyc{" + "MAYC=" + MAYC + ", MABQL=" + MABQL + ", NoiDungXuLy=" + NoiDungXuLy + ", ThoiGianXuLy=" + ThoiGianXuLy + '}';
    }
    
}
