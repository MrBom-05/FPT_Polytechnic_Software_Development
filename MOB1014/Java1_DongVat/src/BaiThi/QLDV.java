package BaiThi;

import java.util.ArrayList;
import java.util.Scanner;

public class QLDV {
	ArrayList<DongVat> list = new ArrayList<>();
	private Scanner scanner;
	
	public QLDV() {
		scanner = new Scanner(System.in);
	}
	//NHAP
	public void nhap() {
		while (true) {
			list.add(new DongVat(Integer.parseInt(getInput("ID: ")), getInput("Ma Dong Vat: "), getInput("Chung Loai: ")));
			
			System.out.print("Ban co muon nhap tiep khong (y/n)? ");
			if (scanner.nextLine().equalsIgnoreCase("n")) {
				System.out.println("Ban da nhap thanh cong!");
				break;
			}
		}
	}
	//XUAT
	public void xuat() {
		if (list.isEmpty()) {
			System.out.println("Danh sach Dong Vat trong!");
		}
		else {
			int count = 1;
			for (DongVat dongVat : list) {
				System.out.println("------------------------------------");
				System.out.println("Dong vat thu "+count);
				dongVat.inThongTin();
				count++;
			}
		}
	}
	//XUAT ID CHAN
	public void xuatIDchan() {
		if (list.isEmpty()) {
			System.out.println("Danh sach Dong Vat trong!");
		}
		else {
			for (DongVat dongVat : list) {
				if (dongVat.getID() % 2 == 0) {
					dongVat.inThongTin();
				}
			}
		}
	}
	//TIM 
	public void tim() {
		if (list.isEmpty()) {
			System.out.println("Danh sach Dong Vat trong!");
		}
		else {
			String mdv = getInput("Chu hoac Tu bat dau cua Ma: ");
			DongVat dv = null;
			for (DongVat dongVat : list) {
	            if (dongVat.getMaDV().substring(0, 1).equalsIgnoreCase(mdv)) {
	            	dv = dongVat;
	                break;
	            }
	        }
			if (dv != null) {
				dv.inThongTin();
			}
			else {
				System.out.println("Khong tim thay Dong Vat!");
			}
		}
	}
	//KE THUA
	public void keThua() {
		System.out.println("Nhap Su Tu");
		while (true) {
			SuTu st = new SuTu(Integer.parseInt(getInput("ID: ")), getInput("Ma Dong Vat: "), getInput("Chung Loai: "), getInput("Ten: "), Float.parseFloat(getInput("Can nang: ")));
			System.out.println("Thong tin vua nhap");
			st.inThongTin();
		}
	}
	public String getInput(String x) {
		System.out.print("Moi nhap "+x);
		return scanner.nextLine();
	}
}
