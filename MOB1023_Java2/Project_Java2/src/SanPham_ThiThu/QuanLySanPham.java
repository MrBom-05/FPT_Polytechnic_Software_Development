package SanPham_ThiThu;

import java.util.ArrayList;

public class QuanLySanPham implements SanPhamDAOInterface{
    private ArrayList<SanPham> list;
    
    public QuanLySanPham(){
        this.list = new ArrayList<>();
    }

    @Override
    public void insert(SanPham sanPham) {
        this.list.add(sanPham);
    }

    @Override
    public void update(int viTri, SanPham sanPham) {
        this.list.set(viTri, sanPham);
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
