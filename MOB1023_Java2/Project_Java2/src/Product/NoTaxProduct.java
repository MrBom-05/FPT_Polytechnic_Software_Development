package Product;

import java.io.Serializable;

public class NoTaxProduct extends Product implements Serializable{
    public NoTaxProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public double getImportTax() {
        return 0;
    }
}
