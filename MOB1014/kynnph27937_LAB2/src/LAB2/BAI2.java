package LAB2;

import java.util.Scanner;

public class BAI2 {
	public static void main(String[] args) {
		// Phuong trinh bac 2
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap gia tri a: ");
		double a = scanner.nextDouble();
		System.out.print("Nhap gia tri b: ");
		double b = scanner.nextDouble();
		System.out.print("Nhap gia tri c: ");
		double c = scanner.nextDouble();
			if (a == 0) {
		           if (b == 0) {
		              if (c == 0) {
		            	  System.out.println("Phuong trinh vo so nghiem");
		              }
		              else {
		            	  System.out.println("Phuong trinh vo nghiem");
		              }
		           } else {
		               System.out.println("Phuong trinh co mot nghiem: " + (-c / b));
		           }
		       }
			else if (a != 0) {
				double delta = b*b - 4*a*c;
				double x1;
		        double x2;
		        if (delta <= 0) {
		            if(delta < 0) {
		            	System.out.println("Phuong trinh vo nghiem");
		            }else {
		            	System.out.println("Phuong trinh co nghiem kep la: ");
		            	x1 = x2 = -b/(2*a);
		            }
		        }else {
		            	 
		             x1 =(-b + Math.sqrt(delta))/(2*a);
		            	System.out.println("Phuong trinh co nghiem la x1: " + x1);
		 	          
		 	         x2 = (-b - Math.sqrt(delta))/(2*a);
		 	          	System.out.println("Phuong trinh co nghiem la x2: "+x2);
						
					}      
			}
		}
}

