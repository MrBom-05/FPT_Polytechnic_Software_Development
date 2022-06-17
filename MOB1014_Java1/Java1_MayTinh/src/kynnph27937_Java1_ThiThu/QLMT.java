package kynnph27937_Java1_ThiThu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QLMT {
	ArrayList<MayTinh> list = new ArrayList<>();
	private Scanner scanner;
	
	public QLMT() {
		scanner = new Scanner(System.in);
	}
	
	public void nhap() {
		while (true) {
			list.add(new MayTinh(getInput("Title: "), getInput("Hang: "), Double.parseDouble(getInput("Can Nang: "))));
			
			System.out.print("Ban co muon nhap tiep khong (y/n)? ");
			if (scanner.nextLine().equalsIgnoreCase("n")) {
				System.out.println("Ban da nhap thanh cong!");
				break;
			}
		}
	}
	public void xuat() {
		if (list.isEmpty()) {
			System.out.println("Danh sach May Tinh trong!");
		}
		else {
			System.out.println("Danh sach May Tinh la: ");
			int count = 1;
			for (MayTinh mayTinh : list) {
				System.out.print("May Tinh Thu "+count);
				mayTinh.inThongTin();
				count++;
			}
		}
	}
	public void tim() {
		if (list.isEmpty()) {
			System.out.println("Danh sach May Tinh trong!");
		}
		else {
			String maTitle = getInput("Title can tim: ");
			MayTinh mt = null;
			for (MayTinh mayTinh : list) {
				if (mayTinh.getTitle().equalsIgnoreCase(maTitle)) {
					mt = mayTinh;
					break;
				}
			}
			if (mt != null) {
				mt.inThongTin();
			}
			else {
				System.out.println("Khong tim thay Title");
			}
		}
	}
	public void timCanNang() {
        double min = Double.parseDouble(getInput("can nang thap nhat: "));
        double max = Double.parseDouble(getInput("can nang cao nhat: "));
        boolean tim = false;
        for (MayTinh mayTinh: list) {
            if (min <= mayTinh.getCanNang()  &&  mayTinh.getCanNang() <= max){
                mayTinh.inThongTin();
                tim = true;
            }
        }
        if (tim = false){
            System.out.println("Khong co may tinh nao co can nang trong khoang can tim");}
	}

	public void sapXepTen() {
		Comparator<MayTinh> comp = new Comparator<MayTinh>() {
			@Override
			public int compare(MayTinh o1, MayTinh o2) {
				return o1.getHang().compareTo(o2.getHang());
			}
		};
		Collections.sort(list, comp);
		xuat();
	}
	public void sapXepCanNang() {
		Comparator<MayTinh> comp = new Comparator<MayTinh>() {
            @Override
            public int compare(MayTinh o1, MayTinh o2) {
                return Double.compare(o1.getCanNang(), o2.getCanNang());
            }
        };
        Collections.sort(list, comp);
        xuat();
	}
	
	
	private String getInput(String x) {
		System.out.print("Nhap vao "+x);
		return scanner.nextLine();
	}
}
