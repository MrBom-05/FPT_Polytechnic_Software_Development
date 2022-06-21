package BaiThi;

import java.util.ArrayList;

public interface SanPhamInterface {

    public void insert(SanPham sanpham);

    public void update(int viTri, SanPham sanpham);

    public void delete(int viTri);

    public ArrayList<SanPham> getList();

    public SanPham getByID(int viTri);

    public void setList(ArrayList<SanPham> list);
}
