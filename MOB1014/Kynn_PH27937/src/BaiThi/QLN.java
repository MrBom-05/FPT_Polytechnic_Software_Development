package BaiThi;

import java.util.ArrayList;
import java.util.Scanner;

public class QLN {
	ArrayList<Nguoi> list = new ArrayList<>();
	private Scanner scanner;
	
	public QLN() {
		scanner = new Scanner(System.in);
	}
	public void nhap() {
		while (true) {
			list.add(new Nguoi(Integer.parseInt(getInput("ID: ")), getInput("Ten: "), getInput("SDT: ")));
			
			System.out.print("Ban co muon tiep tuc nhap nua khong (y/n)? ");
			if(scanner.nextLine().equals("n")){
				System.out.println("Ban da nhap thanh cong!");
				break;
			}
		}
	}
	public void xuat() {
		if(list.isEmpty()) {
			System.out.println("Danh sach Nguoi trong!");
		}
		else {
			System.out.println("Danh sach Nguoi la: ");
			int count = 1;
			for(Nguoi nguoi: list) {
				System.out.println("Nguoi thu: "+count);
				nguoi.inThongTin();
				count++;
			}
		}
	}
	public void xuatTheoSDT() {
		 for (Nguoi nguoi : list) {
	            if (nguoi.getsDT().substring(0, 2).equalsIgnoreCase("09")) {
	                nguoi.inThongTin();
	            }
	        }
	}
	public void xoa() {
		if(list.isEmpty()) {
			System.out.println("Danh sach Nguoi trong!");
		}else {
			String sdt = getInput("SDT can tim: ");
			Nguoi n = null;
			for (Nguoi nguoi : list) {
				if (nguoi.getsDT().equals(sdt)) {
					n = nguoi;
					break;
				}
				
			}
			if (n != null) {
	            list.remove(n);
	            System.out.println("Da xoa Nguoi");
	        }else {
	            System.out.println("Khong tim thay Nguoi");
	        }
		}
	}
	
	public void keThua() {
		System.out.println("Nhap vao Giang Vien");
		GiangVien gv = new GiangVien(Integer.parseInt(getInput("ID: ")), getInput("Ten: "), getInput("SDT: "), getInput("Ten: "), Float.parseFloat(getInput("Can Nang: ")));
		System.out.println("Thong Tin Sinh Vien PoLy Vua Nhap: ");
		gv.inThongTin();
	}
	private String getInput(String x) {
		System.out.print("Nhap Vao "+x);
		return scanner.nextLine();
	}
}
