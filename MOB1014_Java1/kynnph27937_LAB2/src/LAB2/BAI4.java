package LAB2;

import java.util.Scanner;

public class BAI4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("+---------------------------------------------------+\r\n"
				+ "1. Giai phuong trinh bac nhat\r\n"
				+ "2. Giai phuong trinh bac hai\r\n"
				+ "3. Tinh tien dien\r\n"
				+ "4. Ket thuc\r\n"
				+ "+---------------------------------------------------+\n");
		System.out.println("Cho chuc nang: ");
		int menu = scanner.nextInt();
			switch (menu) {
			// Phuong trinh bac mot
			case 1:
				System.out.println("Nhap gia tri a: ");
				int a = scanner.nextInt();
				System.out.println("Nhap gia tri b: ");
				int b = scanner.nextInt();
				if(a == 0) {
					if(b == 0) {
						System.out.println("Phuong trinh vo so nghiem");
					}
					else {
						System.out.println("Phuong trinh vo nghiem");
					}
				}
				else {
					System.out.println("Phuong trinh co nghiem x = "+(-b/a));
				}
				break;
			// Phuong trinh bac 2
			case 2:
				System.out.print("Nhap gia tri a: ");
				double a1 = scanner.nextDouble();
				System.out.print("Nhap gia tri b: ");
				double b1 = scanner.nextDouble();
				System.out.print("Nhap gia tri c: ");
				double c = scanner.nextDouble();
					if (a1 == 0) {
				           if (b1 == 0) {
				              if (c == 0) {
				            	  System.out.println("Phuong trinh vo so nghiem");
				              }
				              else {
				            	  System.out.println("Phuong trinh vo nghiem");
				              }
				           } else {
				               System.out.println("Phuong trinh co mot nghiem: " + (-c / b1));
				           }
				       }
					else if (a1 != 0) {
						double delta = b1*b1 - 4*a1*c;
						double x1;
				        double x2;
				        if (delta <= 0) {
				            if(delta < 0) {
				            	System.out.println("Phuong trinh vo nghiem");
				            }else {
				            	System.out.println("Phuong trinh co nghiem kep la: ");
				            	x1 = x2 = -b1/(2*a1);
				            }
				        }else {
				            	 
				             x1 =(-b1 + Math.sqrt(delta))/(2*a1);
				            	System.out.println("Phuong trinh co nghiem la x1: " + x1);
				 	          
				 	         x2 = (-b1 - Math.sqrt(delta))/(2*a1);
				 	          	System.out.println("Phuong trinh co nghiem la x2: "+x2);
								
							}      
					}
				break;
			// Tinh so dien
			case 3:
				System.out.println("Nhap so dien cua ban: ");
				float soDien = scanner.nextFloat();
				if(soDien <= 50) {
					System.out.println("Tien dien cua ban = "+(soDien*1000));
				}
				else {
					float tien = 50*1000+(soDien - 50)*1200;
					System.out.printf("Tien dien cua ba = %f", tien);
				}
				break;
			case 4:
				System.out.println("Ket thuc");
				break;
			default:
				System.out.println("Ban nhap sai vui long nhap lai");
				break;
			}
	}
}
