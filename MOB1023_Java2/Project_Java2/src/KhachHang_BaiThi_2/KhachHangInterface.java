package KhachHang_BaiThi_2;

import java.util.ArrayList;

public interface KhachHangInterface {

    public void insert(KhachHang khachhang);

    public void delete(int viTri);

    public ArrayList<KhachHang> getList();

    public KhachHang getByID(int viTri);

    public void setList(ArrayList<KhachHang> list);
}
