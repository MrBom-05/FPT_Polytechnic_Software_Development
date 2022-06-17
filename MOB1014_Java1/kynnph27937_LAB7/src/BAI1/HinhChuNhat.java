package BAI1;

public class HinhChuNhat {
	protected double dai;
	protected double rong;
	
	public HinhChuNhat(double dai, double rong) {
		this.dai = dai;
		this.rong = rong;
	}
	 public double getChuVi() {
		 return (dai + rong) *2;
	 }
	 public double getDienTich() {
		 return dai * rong;
	 }
	 
	 public void xuat() {
		System.out.println("---------------------------------------------------------------------------------");
		System.out.printf("Chieu Dai: %f | Chieu Rong: %f", dai, rong);
		System.out.printf("\nDien tich Hinh Chu Nhat la: %f | Chu vi la: %f", getDienTich(), getChuVi());
	}
}
