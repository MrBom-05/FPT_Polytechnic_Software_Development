package KhachHang_BaiThi_2;

import java.util.ArrayList;

public class QuanLyKhachHang implements KhachHangInterface {

    private ArrayList<KhachHang> list;

    public QuanLyKhachHang() {
        this.list = new ArrayList<>();
    }

    @Override
    public void insert(KhachHang khachhang) {
        this.list.add(khachhang);
    }

    @Override
    public void delete(int viTri) {
        this.list.remove(viTri);
    }

    @Override
    public ArrayList<KhachHang> getList() {
        return this.list;
    }

    @Override
    public KhachHang getByID(int viTri) {
        return this.list.get(viTri);
    }

    @Override
    public void setList(ArrayList<KhachHang> list) {
        this.list = list;
    }

}
