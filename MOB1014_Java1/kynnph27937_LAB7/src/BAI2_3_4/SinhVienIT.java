package BAI2_3_4;

public class SinhVienIT extends SinhVienPoly{
	protected double diemJava;
	protected double diemHtml;
	protected double diemCss;
	
	public SinhVienIT(String hoTen, String nganh, double diemJava, double diemHtml, double diemCss) {
		super(hoTen, nganh);
		this.diemJava = diemJava;
		this.diemHtml = diemHtml;
		this.diemCss = diemCss;
	}
	
	@Override
	double getDiem() {
		return (2 * diemJava + diemHtml + diemCss)/4;
	}
	
}
