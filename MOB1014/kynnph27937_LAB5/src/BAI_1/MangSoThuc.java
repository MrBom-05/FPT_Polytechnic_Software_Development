package BAI_1;

import java.util.ArrayList;
import java.util.Scanner;

public class MangSoThuc {
	private ArrayList<Double> list = new ArrayList<>();
	
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap danh sach so thuc");
		while (true) {
			System.out.print("Nhap so: ");
			double x = Double.parseDouble(scanner.nextLine());
			list.add(x);
			System.out.print("Nhap them (y/n)? ");
			if(scanner.nextLine().equals("n")){
				break;
			}
		}
	}
	
	public void hienThi() {
		System.out.println("-------------------------------------------------------------------------------");
		for(Double item : list) {
			System.out.print("     "+ item);
		}
	}
	public void tinhTong() {
		double tong = 0;
		for(Double item: list) {
			tong += item;
		}
		System.out.print("     Tong: "+ tong);
	}
}
