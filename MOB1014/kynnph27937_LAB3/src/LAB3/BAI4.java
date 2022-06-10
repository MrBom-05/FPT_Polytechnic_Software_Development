package LAB3;

import java.lang.reflect.Array;
import java.util.Scanner;

public class BAI4 {
	static int soluong;
	static String[] name;
	static double[] diem;
	public static void sortSV(String name[], double diem[]) {
	    for (int i = 0; i < name.length - 1; i++) {
	        for (int j = i + 1; i < name.length; j++) {
	             if (diem[i] > diem[j]) {
	                 double temp = diem[i];
	                 diem[i] = diem[j];
	                 diem[j] = temp;
	                 String svTemp = name[i];
	                 name[i] = name[j];
	                 name[j] = svTemp;
	             }
	        }
	    }
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Moi ban nhap so luong sinh vien: ");
		soluong = Integer.parseInt(scanner.nextLine());
		name = new String[soluong];
		diem = new double[soluong];
		for(int i = 0;i < soluong;i++) 
		{
			System.out.printf("Nhap ten cua sinh vien thu [%d]: ",i + 1);
			name[i]= scanner.nextLine();
			System.out.printf("Nhap diem cua sinh vien thu [%d]: ",i + 1);
			diem[i] = Double.parseDouble(scanner.nextLine());
			System.out.println("");
		}
		for(int i = 0;i < soluong;i++)
		{	
		System.out.println("Ho ten: "+ name[i]);
		System.out.println("Diem: "+ diem[i]);
			if (diem[i] >= 9) {
			     System.out.println("Hoc luc: Xuat xac!");
			 } else if (diem[i] >= 7.5) {
			      System.out.println("Hoc luc: Gioil");
			 } else if (diem[i] >= 6.5) {
			     System.out.println("Hoc Luc: Kha!");
			} else if (diem[i] >= 5) {
			     System.out.println("Hoc luc: Trung bình!");   
			 } else {
			     System.out.println("Hoc luc: Yeu!");
			}
			System.out.println();
		}
	}
}
