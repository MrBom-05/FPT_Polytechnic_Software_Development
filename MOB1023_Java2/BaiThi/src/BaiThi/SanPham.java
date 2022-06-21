package BaiThi;

import java.io.Serializable;

public class SanPham implements Serializable{
    private String tenSP;
    private String maSP;
    private String danhMuc;
    private int trangThai;
    private double donGia;

    public SanPham(String tenSP, String maSP, String danhMuc, int trangThai, double donGia) {
        this.tenSP = tenSP;
        this.maSP = maSP;
        this.danhMuc = danhMuc;
        this.trangThai = trangThai;
        this.donGia = donGia;
    }

    public SanPham() {
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    
}
