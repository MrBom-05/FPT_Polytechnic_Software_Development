package KhanhHang;

import java.io.Serializable;

public class KhachHang implements Serializable{
    private String loaiKH;
    private String maKH;
    private String tenKH;
    private String email;

    public KhachHang(String loaiKH, String maKH, String tenKH, String email) {
        this.loaiKH = loaiKH;
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.email = email;
    }

    public KhachHang() {
    }

    public String getLoaiKH() {
        return loaiKH;
    }

    public void setLoaiKH(String loaiKH) {
        this.loaiKH = loaiKH;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }  
}
