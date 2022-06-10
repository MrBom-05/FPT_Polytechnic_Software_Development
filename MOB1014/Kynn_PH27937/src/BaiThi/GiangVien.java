package BaiThi;

public class GiangVien extends Nguoi{
	private String ten;
	private float CanNang;
	
	
	public GiangVien(int iD, String ten, String sDT, String ten2, float canNang) {
		super(iD, ten, sDT);
		ten = ten2;
		CanNang = canNang;
	}
	public GiangVien(String ten, float CanNang) {
		this.ten = ten;
		this.CanNang = CanNang;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public float getCanNang() {
		return CanNang;
	}
	public void setCanNang(float canNang) {
		CanNang = canNang;
	}
	
	@Override
	
	public void inThongTin() {
		super.inThongTin();
		System.out.println("Ten:      "+getTen());
		System.out.println("Can Nang: "+getCanNang());
	}
}
