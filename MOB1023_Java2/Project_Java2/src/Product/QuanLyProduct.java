package Product;

import java.util.ArrayList;

public class QuanLyProduct implements Product_DAO_Interface{
    private ArrayList<Product> list;

    public QuanLyProduct() {
        this.list = new ArrayList<>();
    }

    @Override
    public void insert(Product product) {
        this.list.add(product);
    }

    @Override
    public ArrayList<Product> getList() {
        return this.list;
    }

    @Override
    public void update(int viTri, Product product) {
        this.list.set(viTri, product);

    }

    @Override
    public void delete(int viTri) {
        this.list.remove(viTri);

    }

    @Override
    public Product getByID(int viTri) {

        return this.list.get(viTri);
    }

    @Override
    public void setList(ArrayList<Product> list) {
       this.list = list;
    }
}
