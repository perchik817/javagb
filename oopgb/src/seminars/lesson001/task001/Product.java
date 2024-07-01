package seminars.lesson001.task001;

import java.time.LocalDate;

/*
* Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, содержащий в себе методы
initProducts (List <Product>) сохраняющий в себе список исходных продуктов и getProduct(String name)
* */
public class Product {
    private String name;
    private double price;
    private LocalDate releaseDate;

    public Product(String name, double price, LocalDate releaseDate) {
        this.name = name;
        this.price = price;
        this.releaseDate = releaseDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }
}
