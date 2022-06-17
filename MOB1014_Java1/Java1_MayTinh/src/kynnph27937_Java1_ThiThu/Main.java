package kynnph27937_Java1_ThiThu;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		QLMT dsmt = new QLMT();
		Scanner scanner = new Scanner(System.in);
		int chon = 0;
		do {
			System.out.println("-------Menu-------");
			System.out.println("1. Nhap 1 danh sach doi tuong");
			System.out.println("2. Xuat danh sach doi tuong");
			System.out.println("3. Tim theo Title");
			System.out.println("4. Tim theo khoang can nang");
			System.out.println("5. Sap xep theo ten");
			System.out.println("6. Sap xep theo can nang");
			System.out.println("0. Thoat");
			System.out.print("Chon chuc nang: ");
			chon = scanner.nextInt();
			switch(chon){
			case 1: 
				dsmt.nhap();
				break;
			case 2: 
				dsmt.xuat();		
				break;
			case 3: 
				dsmt.tim();
				break;
			case 4: 
				dsmt.timCanNang();
				break;
			case 5: 
				dsmt.sapXepTen();
				break;
			case 6: 
				dsmt.sapXepCanNang();
				break;
			case 0: 
				System.out.println("Ban da thoat!");
				break;
			default:
				System.out.println("Ban nhap sai vui long nhap lai tu 0-->4!");
			}
			
		} while (chon != 0);
		
	}
}
