package kynnph27937_Java1_ThiThu;

public class NhanVienIT extends NhanVien{
	private int type;

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public NhanVienIT() {
		
	}

	public NhanVienIT(int type) {
		this.type = type;
	}

	public NhanVienIT(String maNV, String hoTen, String phone, double luong, int type) {
		super(maNV, hoTen, phone, luong);
		this.type = type;
	}
	
	@Override
	public void inThongTin() {
		super.inThongTin();
		System.out.printf("Type: %d\n", getType());
	}
	
}
