package KhanhHang;

import java.util.ArrayList;

public class QLKH implements KhachHangDAOInterface{
    private ArrayList<KhachHang> list;
    
    public QLKH(){
        this.list = new ArrayList<>();
    }
    
    @Override
    public void insert(KhachHang khachHang) {
       this.list.add(khachHang);
    }

    @Override
    public void delete(int viTri) {
        this.list.remove(viTri);
    }

    @Override
    public ArrayList<KhachHang> getlist() {
        return this.list;
    }

    @Override
    public KhachHang getByID(int viTri) {
        return this.list.get(viTri);
    }

    @Override
    public void setList(ArrayList<KhachHang> list) {
        this.list = list;
    }
    
}
