package SinhVien;

import java.io.Serializable;

public class SinhVien extends Nguoi implements Serializable{
    private String maSv;
    private String chuyenNganh;

    public SinhVien() {
    }

    public SinhVien(String maSv, String chuyenNganh, 
        String hoTen, int gioiTinh, String diaChi) {
        super(hoTen, gioiTinh, diaChi);
        this.maSv = maSv;
        this.chuyenNganh = chuyenNganh;
    }

    public String getMaSv() {
        return maSv;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
}
