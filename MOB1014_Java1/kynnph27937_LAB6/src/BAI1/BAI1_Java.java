package BAI1;

import java.util.Scanner;

public class BAI1_Java {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhap ho ten: ");
	        String hoTen = scanner.nextLine();
	        hoTen.trim();
	        
	        String ho = hoTen.substring(0, hoTen.indexOf(" "));
	        String tenDem = hoTen.substring(hoTen.indexOf(" "), hoTen.lastIndexOf(" "));
	        String ten = hoTen.substring(hoTen.lastIndexOf(" "));

	        System.out.printf("%s %s %s", ho.toUpperCase(), tenDem, ten.toUpperCase());
	    }
}
