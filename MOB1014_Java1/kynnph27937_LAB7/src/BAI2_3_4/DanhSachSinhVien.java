package BAI2_3_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachSinhVien {
	ArrayList<SinhVienPoly> list =  new ArrayList<>();
	// Nhap
	public void nhap() {
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Nhap ho ten sinh vien: ");
			String hoTen = scanner.nextLine();
			if (hoTen == null || hoTen.equals("")) {
				break;
			}
			System.out.print("Nhap ten nganh (IT/Biz): ");
			String nganh = scanner.nextLine();
			if(nganh.equalsIgnoreCase("IT")) {
				System.out.print("Nhap Diem Java: ");
				double diemJava = scanner.nextDouble();
				System.out.print("Nhap Diem HTML: ");
				double diemHtml = scanner.nextDouble();
				System.out.print("Nhap Diem CSS: ");
				double diemCss = scanner.nextDouble();
				SinhVienPoly newSV = new SinhVienIT(hoTen, nganh, diemJava, diemHtml, diemCss);
				list.add(newSV);
			}
			else if (nganh.equalsIgnoreCase("Biz")) {
				System.out.print("Nhap Diem Marketing: ");
				double diemMarketing = scanner.nextDouble();
				System.out.print("Nhap Diem Sales: ");
				double diemSales = scanner.nextDouble();
				SinhVienPoly newSV = new SinhVienBiz(hoTen, nganh, diemMarketing, diemSales);
				list.add(newSV);
			}
		} while (true);
	}
	// Xuat
	public void xuat() {
		for(SinhVienPoly sv : list) {
			System.out.println("-------------------------------------------------------------------");
			System.out.printf("Ho Ten: %s | Nganh: %s\n", sv.getHoTen(), sv.getNganh());
			System.out.printf("Diem TB: %f | Hoc Luc: %s\n", sv.getDiem(), sv.getHocLuc());
		}
	}
	// Xuat hoc luc gioi
	public void xuatGioi() {
		for(SinhVienPoly sv : list) {
			if (sv.getHocLuc().equalsIgnoreCase("Gioi")) {
				System.out.println("-------------------------------------------------------------------");
				System.out.printf("Ho Ten: %s | Nganh: %s\n", sv.getHoTen(), sv.getNganh());
				System.out.printf("Diem TB: %f | Hoc Luc: %s\n", sv.getDiem(), sv.getHocLuc());
			}
		}
	}
	// Sap xep theo diem
	Comparator<SinhVienPoly> comparator = new Comparator<SinhVienPoly>() {
		@Override
		public int compare(SinhVienPoly o1, SinhVienPoly o2) {
			return Double.compare(o1.getDiem(), o2.getDiem());
		}
	};
	public void sapxepTheoDiem() {
		Collections.sort(list, comparator);
		System.out.println("Sap xep theo diem");
		xuat();
	}
	// Menu
	public void menu() {
		Scanner scanner = new Scanner(System.in);
		int chon = 0;
		do {
			System.out.println("\nMenu chuong trinh");
			System.out.println("1. Nhập danh sách sinh viên");
			System.out.println("2. Xuất thông tin danh sách sinh viên");
			System.out.println("3. Xuất danh sách sinh viên có học lực giỏi");
			System.out.println("4. Sắp xếp danh sách sinh viên theo điểm");
			System.out.println("5. Kết thúc");
			System.out.printf("Moi ban chon: ");
			chon = scanner.nextInt();
			switch (chon) {
			case 1:
				nhap();
				break;
			case 2:
				xuat();
				break;
			case 3:
				xuatGioi();
				break;
			case 4:
				sapxepTheoDiem();
				break;
			case 5:
				
			}
		} while (chon != 0);
	}
}
