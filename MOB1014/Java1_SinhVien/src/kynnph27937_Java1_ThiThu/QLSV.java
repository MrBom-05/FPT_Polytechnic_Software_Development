package kynnph27937_Java1_ThiThu;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QLSV {
	ArrayList<SinhVien> list = new ArrayList<>();
	private Scanner scanner;
	
	public QLSV() {
		
		scanner = new Scanner(System.in);
	}
	
	public void nhap() {
		while (true) {
			
			list.add(new SinhVien(getValue("Ma Sinh Vien: "), getValue("Ten Sinh Vien: "), getValue("Chuyen Nganh: ")));
			
			System.out.print("Ban co muon tiep tuc nhap nua khong (y/n)? ");
			if(scanner.nextLine().equals("n")){
				System.out.println("Ban da nhap thanh cong!");
				break;
			}
		}	
	}
	public void xuat() {
		if(list.isEmpty()) {
			System.out.println("Danh sach sinh vien trong!");
		}
		else {
			System.out.println("Danh sach sinh vien la: ");
			int count = 1;
			for(SinhVien sinhVien: list) {
				System.out.println("Sinh vien thu: "+count);
				sinhVien.inThongTin();
				count++;
			}
		}
	}
	public void tim() {
		if(list.isEmpty()) {
			System.out.println("Danh sach sinh vien trong!");
		}else {
			String msv = getValue("Ma Sinh Vien Can Tim: ");
			SinhVien sv = null;
			for (SinhVien sinhVien : list) {
				if (sinhVien.getMaSV().equals(msv)) {
					sv = sinhVien;
					break;
				}
				
			}
			if (sv != null) {
				sv.inThongTin();
			}
			else {
				System.out.println("Khong tim thay Sinh Vien!");
			}
		}
	}
	public void sapXep() {
		Comparator<SinhVien> comp = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getChuyenNganh().compareTo(o2.getChuyenNganh());
            }
        };
        Collections.sort(list, comp);
        xuat();
	}
	public void keThua() {
		System.out.println("Nhap Vao Sinh Vien Poly");
		SinhVienPoLy svPoly = new SinhVienPoLy(getValue("Ma Sinh Vien: "), getValue("Ten Sinh Vien: "), getValue("Chuyen Nganh: "), Integer.parseInt(getValue("Chuyen Nganh Hep (1.Java, 2.C#): ")));
		System.out.println("Thong Tin Sinh Vien PoLy Vua Nhap: ");
		svPoly.inThongTin();
	}
			
	
	private String getValue(String x) {
		System.out.print("Nhap Vao "+x);
		return scanner.nextLine();
	}
}
