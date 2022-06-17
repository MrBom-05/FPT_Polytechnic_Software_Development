package kynnph27937_Java1_ThiThu;

public class SinhVienPoLy extends SinhVien{
	private int chuyenNganhHep;

	
	public SinhVienPoLy() {
		
	}

	public SinhVienPoLy(int chuyenNganhHep) {
		this.chuyenNganhHep = chuyenNganhHep;
	}

	public SinhVienPoLy(String maSV, String hoTen, String chuyenNganh, int chuyenNganhHep) {
		super(maSV, hoTen, chuyenNganh);
		this.chuyenNganhHep = chuyenNganhHep;
	}

	public int getChuyenNganhHep() {
		return chuyenNganhHep;
	}

	public void setChuyenNganhHep(int chuyenNganhHep) {
		this.chuyenNganhHep = chuyenNganhHep;
	}
	
	@Override
	public void inThongTin() {
		super.inThongTin();
		System.out.println("Chuyen Nganh Hep : "+getNganhHep());
	}
	
	public String getNganhHep() {
		String nganhHep = null;
		int NganhHep = getChuyenNganhHep();
		if(NganhHep == 1) {
			nganhHep = "Java";
		}
		else if (NganhHep == 2) {
			nganhHep = "C#";
		}
		return nganhHep;
	}
}
