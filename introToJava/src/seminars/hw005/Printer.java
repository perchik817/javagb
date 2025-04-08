package seminars.hw005;

import java.util.Arrays;

public class Printer {
    public static void main(String[] args) {
        Printer printer = new Printer();
        //printer.task01();
        //printer.task02();
        //printer.task03();
        printer.task04();
    }

    private void task04() {
        int[] initArray = new int[]{38, 27, 43, 3, 9, 82, 10};

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        MergeSort.mergeSort(initArray);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }

    private void task03() {
        String product1, product2, product3;
        Integer quantity1, quantity2, quantity3;
        product1 = "apple";
        quantity1 = 3;
        product2 = "banana";
        quantity2 = 2;
        product3 = "apple";
        quantity3 = 5;
        ShoppingBasket basket = new ShoppingBasket();
        basket.addProduct(product1, quantity1);
        basket.addProduct(product2, quantity2);
        basket.addProduct(product3, quantity3);
        System.out.println("Basket after adding products:");
        basket.showBasket();
        basket.removeProduct("banana");
        System.out.println("Basket after removing 'banana':");
        basket.showBasket();
        basket.updateQuantity("apple", 10);
        System.out.println("Basket after updating quantity of 'apple':");
        basket.showBasket();
        System.out.println("Quantity of 'apple': " + basket.checkProduct("apple"));
        System.out.println("Quantity of 'banana': " + basket.checkProduct("banana"));
    }

    private void task02(){
        BrowserHistory browserHistory = new BrowserHistory();
        browserHistory.visitSite("google.com");
        browserHistory.visitSite("stackoverflow.com");
        browserHistory.visitSite("github.com");
        System.out.println(browserHistory.back(2));
        System.out.println(browserHistory.getHistory());
    }

    private void task01(){
        StudentDirectory directory = new StudentDirectory();
        directory.addStudent("Alice", 90);
        directory.addStudent("Bob", 85);
        directory.addStudent("Alice", 95);
        System.out.println("Before removal:");
        System.out.println(directory.findStudent("Alice")); //[90, 95]
        System.out.println(directory.getAllStudents()); //{Bob=[85], Alice=[90, 95]}
        directory.removeStudent("Alice");
        System.out.println("After removal:");

        System.out.println(directory.findStudent("Alice")); //[]
        System.out.println(directory.getAllStudents()); //{Bob=[85]}
    }
}