package BaiThi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		QLN dsn = new QLN();
		Scanner scanner = new Scanner(System.in);
		int chon = 0;
		do {
			System.out.println("----------Menu---------");
			System.out.println("1. Nhap vao danh sach doi tuong");
			System.out.println("2. Xuat danh sach doi tuong");
			System.out.println("3. Xuat danh sach cac SDT doi tuong co dau so 09");
			System.out.println("4. Xoa sinh vien theo SDT vua nhap vao");
			System.out.println("5. Ke thua");
			System.out.println("0. Thoat");
			System.out.print("Moi chon chuc nang: ");
			chon = scanner.nextInt();
			switch (chon) {
			case 1:
				dsn.nhap();
				break;
			case 2:
				dsn.xuat();
				break;
			case 3:
				dsn.xuatTheoSDT();
				break;
			case 4:
				dsn.xoa();
				break;
			case 5:
				dsn.keThua();
				break;
			case 0:
				System.out.println("Ban Da Thoat!");
				break;
			default:
				System.out.println("Ban da chon sai, vui long chon cac chuc nang tu 0-->5");
			}
		} while (chon != 0);
	}
}
