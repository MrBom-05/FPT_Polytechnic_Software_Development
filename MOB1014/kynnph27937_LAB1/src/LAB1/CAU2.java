package LAB1;

import java.util.Scanner;

public class CAU2 {
	public static void main(String[] args) {
		// Chu vi, Dien tich, canh nho nhat
		double dai = 0;
		double rong = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap chieu dai: ");
		dai = scanner.nextDouble();
		System.out.println("Nhap chieu rong: ");
		rong = scanner.nextDouble();
		double canhnn = Math.min(dai, rong);
		System.out.println("Chu vi = "+((dai+rong)*2));
		System.out.println("Dien tich = "+(dai*rong));
		System.out.printf("Canh nho nhat = "+ canhnn);
	}
}
