package LAB1;

import java.util.Scanner;

public class CAU1 {
	public static void main(String[] args) {
		// Nhap
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ho va ten: ");
		String hoTen = scanner.nextLine();
		System.out.println("Diem TB: ");
		double diemTB = scanner.nextDouble();
		System.out.printf("%s %f diem",hoTen, diemTB);
	}
}
