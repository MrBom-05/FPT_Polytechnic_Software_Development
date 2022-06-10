package BAI2_3_4;

public abstract class SinhVienPoly {
	private String hoTen;
	private String nganh;
	
	public SinhVienPoly(String hoTen, String nganh) {
		this.hoTen = hoTen;
		this.nganh = nganh;
	}
	
	public String getHoTen() {
		return hoTen;
	}
	public String getNganh() {
		return nganh;
	}
	abstract double getDiem();
	
	
	public String getHocLuc() {
		String hocluc = null;
		double diem = getDiem();
		if(diem >= 9) {
			hocluc = "Xuat Xac";
		}
		else if (diem >= 7.5) {
			hocluc = "Gioi";
		}
		else if (diem >= 6.5) {
			hocluc = "Kha";
		}
		else if (diem >= 5) {
			hocluc = "Trung Binh";
		}
		else {
			hocluc = "Yeu";
		}
		return hocluc;
	}
}
