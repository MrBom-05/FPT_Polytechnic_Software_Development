package LAB2;

import java.util.Scanner;

public class BAI1 {
	public static void main(String[] args) {
		// Phuong trinh bac mot
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap gia tri a: ");
		int a = scanner.nextInt();
		System.out.println("Nhap gia tri b: ");
		int b = scanner.nextInt();
		if(a == 0) {
			if(b == 0) {
				System.out.println("Phuong trinh vo so nghiem");
			}
			else {
				System.out.println("Phương trình vô nghiệm");
			}
		}
		else {
			System.out.println("Phuong trinh co nghiem x = "+(-b/a));
		}
	}
}
