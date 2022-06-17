package Product;


import java.util.ArrayList;

public interface Product_DAO_Interface {
    public void insert(Product product);

    public void update(int viTri, Product product);

    public void delete(int viTri);

    public ArrayList<Product> getList();

    public Product getByID(int viTri);
    
    public void setList(ArrayList<Product> list);
}
