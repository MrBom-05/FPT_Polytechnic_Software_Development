package BAI3;

import java.util.Scanner;

public class SinhVien {
	private String hoTen;
	private String email;
	private String sdt;
	private String cmnd;
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("Nhập Họ Tên Sinh Viên: ");
		    hoTen = scanner.nextLine();
		    if (hoTen == null | hoTen.equals("")) {
				System.out.println("Ho ten khong hop le!");
			}
		    else {
				break;
			}
		} while (true);
		Data ds = new Data();
		do {
			System.out.print("Nhập Email: ");
		    email = scanner.nextLine();
		    if (ds.isemail(email)) {
				break;
			}
		    System.out.println("Email khong hop le!");
		} while (true);
		
		do {
			System.out.print("Nhập số điện thoại: ");
		    sdt = scanner.nextLine();
		    if (ds.issdt(sdt)) {
				break;
			}
		    System.out.println("So dien thoai khong hop le!");
		} while (true);
	    
	    do {
	    	System.out.print("Nhập số CMND: ");
		    cmnd = new Scanner(System.in).nextLine();
		    if (ds.iscmnd(cmnd)) {
				break;
			}
		    System.out.println("So CMND khong hop le!");
		} while (true);
	    
	}
	public void xuat() {
		System.out.println("-----------------------------");
        System.out.printf("Ho ten: %s - Email: %s - So dien thoai: %s - CMND: %s\n", hoTen, email, sdt, cmnd);
        
	}
	public SinhVien () {
		
	}
}
