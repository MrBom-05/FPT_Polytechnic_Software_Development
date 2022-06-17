package LAB1;

import java.util.Scanner;

public class CAU3 {
	public static void main(String[] args) {
		// The tich lap phuong
		double canh = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap canh cua khoi lap phuong: ");
		canh = scanner.nextDouble();
		double theTich = Math.pow(canh, 3);
		System.out.printf("The tich khoi lap phuong = "+ theTich);
	}
}
