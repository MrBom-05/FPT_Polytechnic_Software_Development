package SanPham_ThiThu;

import java.util.ArrayList;

public interface SanPhamDAOInterface {
    public void insert(SanPham sanPham);
    
    public void update(int viTri, SanPham sanPham);
    
    public void delete(int viTri);
    
    public ArrayList<SanPham> getList();
    
    public SanPham getByID(int viTri);
    
    public void setList(ArrayList<SanPham> list);
}
