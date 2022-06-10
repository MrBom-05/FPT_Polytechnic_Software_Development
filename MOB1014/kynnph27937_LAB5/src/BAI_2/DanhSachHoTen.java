package BAI_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DanhSachHoTen {
	public ArrayList<String> ds = new ArrayList<>();
	//nhap
	public void nhap() {
		ds.clear();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap danh sach ho ten");
		while(true) {
			System.out.print("Nhap ho ten: ");
			String ten = scanner.nextLine();
			if(ten.isEmpty()) {
				System.out.println("Nhap du lieu thanh cong!");
				break;
			}
			ds.add(ten);
		}
	}
	//xuat
	public void xuat() {
		System.out.println("---------------------------------------------------");
		for(String item: ds) {
			System.out.println(item);
		}
	}
	//SapXepNgauNhien
	public void sapXepNgauNhien() {
		Collections.shuffle(ds);
		xuat();
	}
	//SapXep
	public void sapXep() {
		Collections.sort(ds);
		Collections.reverse(ds);
		xuat();
	}
	//xoa
	public void xoa() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao ten muon xoa: ");
		String hoTen = scanner.nextLine();
		for(String item : ds) {
			if (item.equalsIgnoreCase(hoTen)) {
				ds.remove(item);
				System.out.println("Xoa he ten thanh cong");
				break;
			}
		}
	}
	
	public void menu() {
		Scanner scanner = new Scanner(System.in);
		int chon = 0;
		do {
			System.out.println("\nMenu chuong trinh");
			System.out.println("1. Nhap danh sach ho ten");
			System.out.println("2. Hien thi danh sach ho ten");
			System.out.println("3. Sap xep ngau nhien");
			System.out.println("4. Sap xep");
			System.out.println("5. Xoa");
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
				sapXepNgauNhien();
				break;
			case 4:
				sapXep();
				break;
			case 5:
				xoa();
				break;
			case 0:
				
					break;
			}
		} while (chon != 0);
	}
}
