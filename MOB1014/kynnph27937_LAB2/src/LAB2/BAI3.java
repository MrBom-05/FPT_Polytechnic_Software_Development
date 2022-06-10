package LAB2;

import java.net.Socket;
import java.util.Scanner;

public class BAI3 {
	public static void main(String[] args) {
		// Tinh so dien
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so dien cua ban: ");
		float soDien = scanner.nextFloat();
		if(soDien <= 50) {
			System.out.println("Tien dien cua ban = "+(soDien*1000));
		}
		else {
			float tien = 50*1000+(soDien - 50)*1200;
			System.out.printf("Tien dien cua ba = %f", tien);
		}
	}
}
