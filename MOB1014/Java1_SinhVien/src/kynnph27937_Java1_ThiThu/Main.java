package kynnph27937_Java1_ThiThu;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		QLSV dssv = new QLSV();
		Scanner scanner = new Scanner(System.in);
		int chon = 0;
		do {
			System.out.println("------------------------------Menu--------------------------------");
			System.out.println("1. Nhập một danh sách đối tượng");
			System.out.println("2. Xuất danh sách đối tượng");
			System.out.println("3. Tìm Sinh Viên theo mã");
			System.out.println("4. Sắp xếp danh sách các Sinh Viên theo thuộc tính Chuyên Ngành");
			System.out.println("5. Kế thừa");
			System.out.println("0. Thoát");
			System.out.print("Mơi chọn chức năng: ");
			chon = scanner.nextInt();
				switch (chon) {
				case 1: 
					dssv.nhap();
					break;
				
				case 2: 
					dssv.xuat();
					break;
				
				case 3: 
					dssv.tim();
					break;
				
				case 4: 
					dssv.sapXep();
					break;
				
				case 5: 
					dssv.keThua();
					break;
				
				case 0: 
					System.out.println("Bạn đã thoát!");
					break;
				
				default:
					System.out.println("Bạn nhập sai vui lòng chọn các chức năng từ 0 -> 5!");
				}
		} while (chon != 0);
	}
}
