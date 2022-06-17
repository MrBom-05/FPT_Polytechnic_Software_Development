package Demo_FileIOStream;

public class Nguoi {
    private String hoTen;
    private int gioiTinh;
    private String diaChi;

    public Nguoi() {
    }

    public Nguoi(String hoTen, int gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    public String xuatThongTin()
    {
        String gt = "";
        
//        if (this.gioiTinh == 1) {
//            gt = "Nam";
//        } else {
//            gt = "Nữ";
//        }
        
        // (điều kiện) == true ? MD1 : MD2;
        gt = (this.gioiTinh == 1) ? "Nam" : "Nữ";
        
        String info = this.hoTen + "-" + this.diaChi +
            "-" + gt;
        
        return info;
    }
}
