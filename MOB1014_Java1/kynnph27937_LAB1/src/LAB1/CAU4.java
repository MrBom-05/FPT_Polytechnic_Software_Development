package LAB1;

import java.util.Scanner;

public class CAU4 {
	public static void main(String[] args) {
		// Delta
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap he so a");
		int a = scanner.nextInt();
		System.out.println("Nhap he so b");
		int b = scanner.nextInt();
		System.out.println("Nhap he so c");
		int c = scanner.nextInt();
		double delta = Math.pow(b, 2)-4*a*c;
		System.out.printf("Dalte: "+ delta);
		double candelta = Math.sqrt(delta);
		System.out.printf("Can Dalte: "+ candelta);
	}
}
