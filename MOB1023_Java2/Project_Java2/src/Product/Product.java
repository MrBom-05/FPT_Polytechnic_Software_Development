package Product;

import java.io.Serializable;

public class Product implements Serializable{
    private String name;
    private double price;

    public Product() {

    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    Product(String tenSP, double donGia, int thue) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getImportTax() {
        return price * 0.1;
    }

    public String xuatThongTin() {
        String info = "Name: " + this.name + "   Price   " + this.price + "   Tax   " + this.getImportTax();
        return info;
    }
}
