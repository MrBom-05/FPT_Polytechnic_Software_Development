package QuanLyNhanVien;

import java.util.ArrayList;

public interface NhanVienDAOInterface {
    public void insert(NhanVien nhanVien);

    public void update(int viTri, NhanVien nhanVien);

    public void delete(int viTri);

    public ArrayList<NhanVien> getList();

    public NhanVien getByID(int viTri);

    public void setList(ArrayList<NhanVien> list);
}
