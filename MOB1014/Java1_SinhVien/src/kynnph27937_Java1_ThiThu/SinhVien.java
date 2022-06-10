package kynnph27937_Java1_ThiThu;

public class SinhVien {
	private String maSV;
	private String hoTen;
	private String chuyenNganh;
	
	public SinhVien() {
		
	}
	public SinhVien(String maSV, String hoTen, String chuyenNganh) {
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.chuyenNganh = chuyenNganh;
	}
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getChuyenNganh() {
		return chuyenNganh;
	}
	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}
	
	public void inThongTin() {
		System.out.println("Ma Sinh Vien:      "+ getMaSV());
		System.out.println("Ten Sinh Vien:     "+getHoTen());
		System.out.println("Chuyen Nganh:      "+getChuyenNganh());
	}
}
