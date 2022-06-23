package HocVien_BaiThi_1;

import java.io.Serializable;

public class HocVien implements Serializable{
    private String lop;
    private String maHV;
    private String email;
    private String ngaySinh;

    public HocVien(String lop, String maHV, String email, String ngaySinh) {
        this.lop = lop;
        this.maHV = maHV;
        this.email = email;
        this.ngaySinh = ngaySinh;
    }

    public HocVien() {
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getMaHV() {
        return maHV;
    }

    public void setMaHV(String maHV) {
        this.maHV = maHV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
    
}
