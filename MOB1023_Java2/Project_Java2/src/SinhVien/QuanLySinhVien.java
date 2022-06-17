package SinhVien;

import java.util.ArrayList;

public class QuanLySinhVien implements NguoiDAOInterface {
    private ArrayList<Nguoi> ds;
    
    public QuanLySinhVien() {
        this.ds = new ArrayList<Nguoi>();
    }
    
    @Override
    public void insert(Nguoi nguoi) {
        this.ds.add(nguoi);
    }
    
    @Override
    public ArrayList<Nguoi> getList()
    {
        return this.ds;
    }

    @Override
    public void update(int viTri, Nguoi nguoi) {
        this.ds.set(viTri, nguoi);
    }

    @Override
    public void delete(int viTri) {
        this.ds.remove(viTri);
    }

    @Override
    public Nguoi getByIndex(int viTri) {
        return this.ds.get(viTri);
    }

    @Override
     public void setList(ArrayList<Nguoi> ds) {
        this.ds = ds;
    }
}
