package BAI_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachSanPham {
	private ArrayList<SanPham> list = new ArrayList<>();
	
	public void nhap() {
        int i = 1;
        System.out.println("Nhap danh sach san pham");
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Nhap ten San Pham thu %d: ", i);
            String ten = scanner.nextLine();
            if (ten == null || ten.equals("")) {
                System.out.println("Nhap thong tin xong!");
                break;
            }
            i++;
            System.out.print("Gia san pham: ");
            double gia = scanner.nextDouble();
            list.add(new SanPham(ten, gia));
        }while (true);
    }
	
	public void xuat() {
        System.out.println("Danh sach san pham");
        System.out.println("Ten\t\t|Gia\t\t");
        for (SanPham sp : list) {
            System.out.printf("%s | %.2f \n", sp.getTenSP(), sp.getGia());
        }
    }
	
	public void sapXep() {
        Comparator<SanPham> comp = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Double.compare(o1.getGia(), o2.getGia());
            }
        };
        Collections.sort(list, comp);
        xuat();
    }
	
	public void timVaXoa() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham can tim: ");
        String ten = sc.nextLine();

        SanPham sp = null;

        for (SanPham sp1 : list) {
            if (sp1.getTenSP().equals(ten)) {
                sp = sp1;
                break;
            }
        }
        if (sp != null) {
            list.remove(sp);
            System.out.println("Da xoa san pham");
        }else {
            System.out.println("Khong tim thay san pham");
        }
    }
	
	public void trungBinh() {
		double avg = 0, sum = 0;
        for (SanPham sp : list) {
            sum += sp.getGia();
        }
        avg = sum / list.size();
        System.out.println("Gia trung binh la: " + avg);
	}
	
	public void menu() {
		Scanner scanner = new Scanner(System.in);
		int chon = 0;
		do {
			System.out.println("\nMenu chuong trinh");
			System.out.println("1. Nhập danh sách sản phẩm từ bàn phím");
			System.out.println("2. Xuất ra màn hình");
			System.out.println("3. Sắp xếp giảm dần theo giá và xuất ra màn hình");
			System.out.println("4. Tìm và xóa sản phẩm theo tên nhập từ bàn phím");
			System.out.println("5. Xuất giá trung bình của các sản phẩm");
			System.out.println("0. Thoat");
			System.out.println("Moi ban chon");
			chon = scanner.nextInt();
			switch (chon) {
			case 1:
				nhap();
				break;
			case 2:
				xuat();
				break;
			case 3:
				sapXep();
				break;
			case 4:
				timVaXoa();
				break;
			case 5:
				trungBinh();
				break;
			default: System.out.println("Nhap sai hay nhap lai!");
			}
		} while (chon != 0);
	}
}
