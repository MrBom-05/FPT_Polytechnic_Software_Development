package kynnph27937_Java1_ThiThu;

public class NhanVien {
	private String maNV;
	private String hoTen;
	private String phone;
	private double luong;
	
	
	public NhanVien() {

	}
	public NhanVien(String maNV, String hoTen, String phone, double luong) {
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.phone = phone;
		this.luong = luong;
	}
	
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public double getLuong() {
		return luong;
	}
	public void setLuong(double luong) {
		this.luong = luong;
	}
	
	public void inThongTin() {
			System.out.println("----------------------------------------");
			System.out.println("Ma Nhan Vien:  "+getMaNV());
			System.out.println("Ten Nhan Vien: "+getHoTen());
			System.out.println("Phone:         "+getPhone());
			System.out.println("Luong:         "+getLuong());
	}
}
