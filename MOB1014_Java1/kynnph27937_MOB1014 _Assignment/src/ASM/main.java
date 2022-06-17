package ASM;


import java.util.Scanner;

// Menu
public class main {
      public static void main(String arg[]) {
          DanhSachNhanVien ds = new DanhSachNhanVien();
       Scanner sc=new Scanner(System.in);
       try{
        while(true){
            System.out.println("*------------------------------------------------------------*");
            System.out.println("|                            Menu                            |");
            System.out.println("|        1. Nhap danh sach nhan vien tu ban phim             |");
            System.out.println("|        2. Xuat danh sach nhan vien tu ban phim             |");
            System.out.println("|    3. Tim va hien thi nhan vien theo ma nhap tu ban phim   |");
            System.out.println("|        4. Xoa nhan vien theo ma nhap tu ban phim           |");
            System.out.println("|   5. Cap nhat thong tin nhan vien theo ma nhap tu ban phim |");
            System.out.println("|    6. Tim cac nhan vien theo khoang luong nhap tu ban phim |");
            System.out.println("|          7. Sap xep nhan vien theo ho va ten               |");
            System.out.println("|          8. Sap xep nhan vien theo thu nhap                |");
            System.out.println("|        9. Xuat 5 nhan vien co thu nhap cao nhat            |");
            System.out.println("|                     10. Ket Thuc                           |");
            System.out.println("*------------------------------------------------------------*");
            System.out.println("Moi ban chon chuc nang: ");
            int chon=sc.nextInt();
            sc.nextLine();
            if (chon == 0) {
                System.exit(0);
            }
        switch(chon){
            case 1:
                ds.nhap();
                break;
            case 2:
                ds.xuat();
                break;
            case 3:
                ds.timVaHienThiTheoMa(sc);
                break;
            case 4:
            	ds.xoaNhanVientheoMa(sc);
                break;
            case 5:
                ds.capNhatTheoMa(sc);
                break;
            case 6:
                ds.timNhanVienTheoKhoangLuong(sc);
                break;
            case 7:
                ds.sapXepTheoTen();
                break;
            case 8:
                ds.sapXepTheoThuNhap();
                break;
            case 9:
                ds.xuatTop5NhanVien();
                break;
            case 10:
                 System.exit(0);
                break;
        	}
        System.out.println("Nhan Enter de tiep tuc");
            sc.nextLine();
        }
       }catch(Exception ex){
            System.out.print("Hay Nhap So!\n");
        }
              
     }
}           
        


