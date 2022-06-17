package BAI2;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<SanPham> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            SanPham sp = new SanPham();
            sp.nhap();
            list.add(sp);
        }

        for (SanPham sp: list) {
            if (sp.getHang().equalsIgnoreCase("Nokia")) {
                sp.xuat();
                System.out.println();
            }

        }
	}
}
