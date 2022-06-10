
package ASM;

import java.util.Scanner;


public class NhanVienTiepThi extends NhanVien{
    private double hoaHong;
    private double doanhSo;
    public NhanVienTiepThi() {
    }

    public NhanVienTiepThi(double doanhSo, double hueHong, String ma, String hoTen,double luong) {
        super(ma, hoTen,luong);
        
        this.doanhSo = doanhSo;
        this.hoaHong = hueHong;
    }
    @Override
    public void nhap(Scanner sc){
        super.nhap(sc);
        
        System.out.print("Doanh So: ");
        doanhSo = sc.nextDouble();
        System.out.print("Hoa Hong: ");
        hoaHong = sc.nextDouble();
        sc.nextLine();
    }
    @Override
    public void xuat(){
        super.xuat();
        
        System.out.printf("-Doanh so: %f - Hoa Hong: %f\n", doanhSo,hoaHong);
    }
    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHoaHong() {
        return hoaHong;
    }

    public void setHueHong(double hoaHong) {
        this.hoaHong = hoaHong;
    }

    @Override
    public double getThuNhap() {
       return luong + doanhSo * hoaHong / 100;
    }
    
}
