package HocVien_BaiThi_1;

import java.util.ArrayList;

public interface HocVienInterface {

    public void insert(HocVien hocvien);

    public void delete(int viTri);

    public ArrayList<HocVien> getList();

    public HocVien getByID(int viTri);

    public void setList(ArrayList<HocVien> list);
}
