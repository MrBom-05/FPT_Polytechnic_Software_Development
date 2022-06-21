package BaiThi;

import java.util.ArrayList;

public class QuanLySanPham implements SanPhamInterface {

    private ArrayList<SanPham> list;

    public QuanLySanPham() {
        this.list = new ArrayList<>();
    }

    @Override
    public void insert(SanPham sanpham) {
        this.list.add(sanpham);
    }

    @Override
    public void update(int viTri, SanPham sanpham) {
        this.list.set(viTri, sanpham);
    }

    @Override
    public void delete(int viTri) {
        this.list.remove(viTri);
    }

    @Override
    public ArrayList<SanPham> getList() {
        return this.list;
    }

    @Override
    public SanPham getByID(int viTri) {
        return this.list.get(viTri);
    }

    @Override
    public void setList(ArrayList<SanPham> list) {
        this.list = list;
    }

}
