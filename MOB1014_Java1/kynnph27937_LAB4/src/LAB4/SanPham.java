package LAB4;

import java.util.Scanner;

public class SanPham {
	 private String tenSP;
	 private double donGia;
	 private double giamGia;
	//tenSP 
	public String gettenSP() {
		return tenSP;
	}
	public void settenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	//donGia
	public double getdonGia() {
		return donGia;
	}
	public void settenSP(double donGia) {
		this.donGia = donGia;
	}
	//giamGia
	public double getgiamGia() {
		return giamGia;
	}
	public void setgiamGia(double giamGia) {
		this.giamGia = giamGia;
	}
	
	public SanPham(String tenSP, double donGia, double giamGia) {
		this.tenSP = tenSP;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
	public SanPham(String tenSP, double donGia) {
		this.tenSP = tenSP;
		this.donGia = donGia;
		this.giamGia = 0;
	}
	
	private double getThueNhapKhau() {
		return donGia * 0.1;
	}
	//xuat
	public void xuat() {
		System.out.println("Ten san pham: "+ tenSP);
		System.out.println("Don gia: "+ donGia);
		System.out.println("Giam gia: "+ giamGia);
		System.out.println("The nhap khau: "+ getThueNhapKhau());
	}
	//nhap
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ten san pham: ");
		tenSP = scanner.nextLine();
		System.out.println("Nhap don gia: ");
		donGia = scanner.nextDouble();
		System.out.println("Nhap giam gia: ");
		giamGia = scanner.nextDouble();
	}
}
