package KhanhHang;

import java.util.ArrayList;

public interface KhachHangDAOInterface {
    public void insert(KhachHang khachHang);
    
    public void delete(int viTri);
    
    public ArrayList<KhachHang> getlist();
    
    public KhachHang getByID(int viTri);
    
    public void setList(ArrayList<KhachHang> list);
}
