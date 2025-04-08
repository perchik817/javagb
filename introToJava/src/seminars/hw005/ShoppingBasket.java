package seminars.hw005;

import java.util.HashMap;

public class ShoppingBasket {
    private HashMap<String, Integer> basket = new HashMap<>();
    public void addProduct(String product, Integer quantity) {
        if(!basket.containsKey(product)) basket.put(product, quantity);
        else basket.put(product, basket.get(product) + quantity);
    }
    public void removeProduct(String product) {
        if (basket.containsKey(product)) basket.remove(product);
        else System.out.println("Product not found");
    }
    public void updateQuantity(String product, Integer
            quantity) {
        if(basket.containsKey(product)) basket.put(product, quantity);
        else System.out.println("Product not found");
    }
    public int checkProduct(String product) {
        return basket.getOrDefault(product, 0);
    }
    public void showBasket() {
        if(basket.isEmpty()) {
            System.out.println("Basket is empty");
        }else {
            for (HashMap.Entry<String, Integer> entry : basket.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }

}
