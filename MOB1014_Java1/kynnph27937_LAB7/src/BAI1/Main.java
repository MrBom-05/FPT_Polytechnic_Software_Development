package BAI1;

public class Main {
	public static void main(String[] args) {
		HinhChuNhat cn1 = new HinhChuNhat(6, 9);
		cn1.xuat();
		System.out.println();
		HinhChuNhat cn2 = new HinhChuNhat(20, 50);
		cn2.xuat();
		System.out.println();
		HinhVuong hv1 = new HinhVuong(10);
		hv1.xuat();
	}
}
