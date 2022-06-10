package kynnph27937_Java1_ThiThu;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		QLNV dsnv = new QLNV();
		Scanner scanner = new Scanner(System.in);
		int chon = 0;
		do {
			System.out.println("---------Menu chuong trinh--------");
			System.out.println("1. Nhap mot danh sach doi tuong");
			System.out.println("2. Xuat danh sach doi tuong");
			System.out.println("3. Tim nhan vien theo ma");
			System.out.println("4. Sap xep danh sach cac NV theo thuoc tinh luong");
			System.out.println("5. Tim nhan vien theo so phone");
			System.out.println("0. Thoat");
			System.out.printf("Moi ban chon: ");
			chon = scanner.nextInt();
			switch (chon) {
			case 1:
				dsnv.nhap();
				break;
			case 2:
				dsnv.xuat();
				break;
			case 3:
				dsnv.tim();
				break;
			case 4:
				dsnv.sapXep();
				break;
			case 5:
				dsnv.timNVphone();
				break;
			case 0:
				System.out.println("Ban da thoat!");
				break;
				
			default:
				System.out.println("Vui long chon tu 0->5!");
			}
		} while (chon != 0);
	}
}
