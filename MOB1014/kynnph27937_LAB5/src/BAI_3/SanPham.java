package BAI_3;

public class SanPham {
	private String tenSP;
	private double gia;
	
	public SanPham() {
		this.tenSP = null;
		this.gia = 0;
	}
	public SanPham(String tenSP, double gia) {
        this.tenSP = tenSP;
        this.gia = gia;
    }
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	
	public double getGia() {
		return gia;
	}
	public void setgia(double gia) {
		this.gia = gia;
	}
	
	
}
