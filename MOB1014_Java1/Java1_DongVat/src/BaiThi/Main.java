package BaiThi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		QLDV dsdv = new QLDV();
		Scanner scanner = new Scanner(System.in);
		int chon = 0;
		do {
			System.out.println("-----------Menu------------");
			System.out.println("1. Nhap danh sach doi tuong");
			System.out.println("2. Xuat danh sach doi tuong");
			System.out.println("3. Xuat danh sach co so ID chan");
			System.out.println("4. Tim doi tuong bat dau voi tu hoac chu theo Ma");
			System.out.println("5. Ke thua");
			System.out.print("Moi chon chuc nang: ");
			chon = scanner.nextInt();
			switch (chon) {
			case 1:
				dsdv.nhap();
				break;
			case 2:
				dsdv.xuat();
				break;
			case 3:
				dsdv.xuatIDchan();
				break;
			case 4:
				dsdv.tim();
				break;
			case 5:
				dsdv.keThua();
				break;
			case 0:
				System.out.println("Ban da Thoat!");
				break;
			default:
				System.out.println("Ban nhap sai, vui long nhap tu 0--->5!");
			}
		} while (chon != 0);
	}
}
