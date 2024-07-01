package seminars.lesson001.task001;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products = new ArrayList<>();
    public List<Product> getProducts() {
        return products;
    }
    public  void initProducts(List<Product> products){
        this.products.addAll(products);
    }
    public Product getProduct(String name) {
        return products.stream()
                .filter(product -> product.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
}
