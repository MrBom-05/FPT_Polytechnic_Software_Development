package KhachHang_BaiThi_2;

import java.io.Serializable;

public class KhachHang implements Serializable{
    private String tenKH;
    private int tuoiKH;
    private int gioiTinh;

    public KhachHang(String tenKH, int tuoiKH, int gioiTinh) {
        this.tenKH = tenKH;
        this.tuoiKH = tuoiKH;
        this.gioiTinh = gioiTinh;
    }

    public KhachHang() {
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public int getTuoiKH() {
        return tuoiKH;
    }

    public void setTuoiKH(int tuoiKH) {
        this.tuoiKH = tuoiKH;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    public String getStatus(int tuoiKH){
        String trangThai = null;
        tuoiKH = getTuoiKH();
        if(tuoiKH >= 18){
            trangThai = "Thành niên";
        }
        else{
            trangThai = "Vị thành niên";
        }
        return trangThai;
    }
}
