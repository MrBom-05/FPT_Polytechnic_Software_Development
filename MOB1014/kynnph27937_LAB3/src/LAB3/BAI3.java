package LAB3;

import java.util.Scanner;

public class BAI3 {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Nhap so phan tu cua mang: ");
		 int n = scanner.nextInt();
		 int [] arr = new int [n];
		 System.out.print("Nhap phan tu cua mang: \n");
	        for (int i = 0; i < n; i++) {
	            System.out.printf("a[%d] = ", i);
	            arr[i] = scanner.nextInt();
	        }
	      sortASC(arr);
	        System.out.println("Day so duoc sap xep: ");
	       show(arr);
	       soNN(arr);
	       tbc(arr);
	}
	public static void sortASC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
	 public static void show(int [] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	 public static void soNN(int [] arr) {
		 int min = arr[0];
		 for(int i = 0; i < arr.length; i++) {
			 if(min > arr[i]) {
				 min = arr[i];
			 }
		 }
		 System.out.printf("\n So nho nhat là %d",min);
	 }
	 public static void tbc(int [] arr) {
		 double tbc, tong = 0;
		 int dem = 0;
		 for(int i = 0; i < arr.length; i++) {
			 if(arr[i] % 3 == 0) {
				 tong += arr[i];
				 dem++;
			 }
		 }
		 tbc = tong/dem;
		 System.out.printf("\n Trung binh cong mang chia het cho 3: %f", tbc);
	 }
}
