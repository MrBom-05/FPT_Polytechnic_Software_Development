package NhanVien;

import java.io.Serializable;

public class NhanVien implements Serializable{
    private String hoTen;
    private String ngaySinh;
    private double luong;
    private int gioiTinh;
    private String chucVu;

    public NhanVien() {
    }

    public NhanVien(String hoTen, String ngaySinh, double luong, int gioiTinh, String chưcVu) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.luong = luong;
        this.gioiTinh = gioiTinh;
        this.chucVu = chưcVu;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getChưcVu() {
        return chucVu;
    }

    public void setChưcVu(String chưcVu) {
        this.chucVu = chưcVu;
    }
    
    
    
}
