/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

/**
 *
 * @author hoangxuanthuy
 */
public class yeucaucudan {
    // Member variables
    private String mayc;
    private String loaiYC;
    private String noiDungYC;
    private String trangThaiYC;
    private String maCD;
    
    public yeucaucudan(String mayc, String loaiYC, String noiDungYC, String trangThaiYC, String maCD) {
        this.mayc = mayc;
        this.loaiYC = loaiYC;
        this.noiDungYC = noiDungYC;
        this.trangThaiYC = trangThaiYC;
        this.maCD = maCD;
    }
    public String getmayc() {
        return mayc;
    }

    public String getLoaiYC() {
        return loaiYC;
    }

    public String getNoiDungYC() {
        return noiDungYC;
    }

    public String getTrangThaiYC() {
        return trangThaiYC;
    }

    public String getMaCD() {
        return maCD;
    }

    public void setMayc(String mayc) {
        this.mayc = mayc;
    }

    public void setLoaiYC(String loaiYC) {
        this.loaiYC = loaiYC;
    }

    public void setNoiDungYC(String noiDungYC) {
        this.noiDungYC = noiDungYC;
    }

    public void setTrangThaiYC(String trangThaiYC) {
        this.trangThaiYC = trangThaiYC;
    }

    public void setMaCD(String maCD) {
        this.maCD = maCD;
    }

    @Override
    public String toString() {
        return "YeuCauCuDan{" + "mayc=" + mayc + ", loaiYC=" + loaiYC + ", noiDungYC=" + noiDungYC + ", trangThaiYC=" + trangThaiYC + ", maCD=" + maCD + '}';
    }
        
}
