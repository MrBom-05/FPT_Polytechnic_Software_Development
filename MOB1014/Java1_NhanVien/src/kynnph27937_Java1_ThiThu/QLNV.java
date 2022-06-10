package kynnph27937_Java1_ThiThu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class QLNV {
	ArrayList<NhanVien> list = new ArrayList<>();
	private Scanner scanner;
	
	public QLNV() {
		scanner = new Scanner(System.in);
	}
	
	public void nhap() {
		while (true) {
			list.add(new NhanVien(getInput("Ma Nhan Vien: "), getInput("Ten Nhan Vien: "), getInput("Phone: "), Double.parseDouble(getInput("Luong: "))));
			
			System.out.print("Ban co muon tiep tuc nhap nua khong (y/n)? ");
			if (scanner.nextLine().equalsIgnoreCase("n")) {
				System.out.println("Ban da nhap thanh cong!");
				break;
			}
		}
	}
	public void xuat() {
		if (list.isEmpty()) {
			System.out.println("Danh sach Nhan Vien trong!");
		}
		else {
			System.out.println("Danh sach Nhan Vien la: ");
			int count = 1;
			for (NhanVien nhanVien : list) {
				System.out.println("Nhan Vien thu: "+count);
				nhanVien.inThongTin();
				count++;
			}
		}
	}
	public void tim() {
		if (list.isEmpty()) {
			System.out.println("Danh sach Nhan Vien trong!");
		}
		else {
			String mnv = getInput("Ma Nhan Vien Can Tim: ");
			NhanVien nv = null;
			for (NhanVien nhanVien : list) {
				if (nhanVien.getMaNV().equals(mnv)) {
					nv = nhanVien;
					break;
				}
			}
			if (nv != null) {
				nv.inThongTin();
			}
			else {
				System.out.println("Khong tim thay Nhan Vien!");
			}
		}
	}
	public void sapXep() {
		Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return Double.compare(o1.getLuong(), o2.getLuong());
            }
        };
        Collections.sort(list, comp);
        xuat();
	}
	public void timNVphone() {
		Scanner sc = new Scanner(System.in);
        System.out.print("Nhap phone nhan vien can tim: ");
        String timPhone = sc.nextLine();
        
        NhanVien nv = null;

        for (NhanVien nv1 : list) {
            if (nv1.getPhone().equals(timPhone)) {
                nv = nv1;
                break;
            }
        }
        if (nv != null) {
        	nv.inThongTin();
        }else {
            System.out.println("Khong tim thay Nhan Vien");
        }
	}
	private String getInput(String x) {
		System.out.print("Nhap vao "+x);
		return scanner.nextLine();
	}
	
}

