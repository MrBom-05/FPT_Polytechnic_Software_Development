package BaiThi;

public class SuTu extends DongVat{
	private String ten;
	private float canNang;
	
	public SuTu() {
	
	}

	public SuTu(String ten, float canNang) {
		this.ten = ten;
		this.canNang = canNang;
	}

	public SuTu(int iD, String maDV, String chungLoai, String ten, float canNang) {
		super(iD, maDV, chungLoai);
		this.ten = ten;
		this.canNang = canNang;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public float getCanNang() {
		return canNang;
	}

	public void setCanNang(float canNang) {
		this.canNang = canNang;
	}
	
	@Override
	public void inThongTin() {
		super.inThongTin();
		System.out.println("Ten:      "+getTen());
		System.out.println("Can Nang: "+getCanNang());
	}
	
	
}
