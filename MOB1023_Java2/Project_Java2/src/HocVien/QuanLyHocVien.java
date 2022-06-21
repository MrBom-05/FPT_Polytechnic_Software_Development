package HocVien;

import java.util.ArrayList;

public class QuanLyHocVien implements HocVienInterface{
    private ArrayList<HocVien> list;
    
    public QuanLyHocVien(){
        this.list = new ArrayList<>();
    }

    @Override
    public void insert(HocVien hocvien) {
        this.list.add(hocvien);
    }

    @Override
    public void delete(int viTri) {
        this.list.remove(viTri);
    }

    @Override
    public ArrayList<HocVien> getList() {
        return this.list;
    }

    @Override
    public HocVien getByID(int viTri) {
        return this.list.get(viTri);
    }

    @Override
    public void setList(ArrayList<HocVien> list) {
        this.list = list;
    }
    
    
}
