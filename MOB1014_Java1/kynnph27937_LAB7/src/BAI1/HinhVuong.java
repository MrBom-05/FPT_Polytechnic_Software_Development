package BAI1;

public class HinhVuong extends HinhChuNhat{
	public HinhVuong(double canh) {
		super(canh, canh);
	}
	public void xuat() {
		System.out.println("---------------------------------------------------------------------------------");
		System.out.printf("Canh: %f", rong);
		System.out.printf("Dien tich Hinh Vuong la: %f | Chu vi la: %f", getDienTich(), getChuVi());
	}
}
