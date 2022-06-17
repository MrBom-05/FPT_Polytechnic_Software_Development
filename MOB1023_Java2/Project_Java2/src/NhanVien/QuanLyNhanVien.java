package NhanVien;

import java.util.ArrayList;

public class QuanLyNhanVien implements NhanVien_DAO_interfacee {

    private ArrayList<NhanVien> list;

    public QuanLyNhanVien() {
        this.list = new ArrayList<>();
    }

    @Override
    public void insert(NhanVien nhanVien) {
        this.list.add(nhanVien);
    }

    @Override
    public void update(int viTri, NhanVien nhanVien) {
        this.list.set(viTri, nhanVien);
    }

    @Override
    public void delete(int viTri) {
        this.list.remove(viTri);
    }

    @Override
    public ArrayList<NhanVien> getList() {
        return this.list;
    }

    @Override
    public NhanVien getByID(int viTri) {
        return this.list.get(viTri);
    }

    @Override
    public void setList(ArrayList<NhanVien> list) {
        this.list = list;
    }
}
