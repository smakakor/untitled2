package product;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws ProductAlreadyExistsException {
        tackProduct();
    }


    public static void tackProduct() throws ProductAlreadyExistsException {

        Product apple = new Product("apple", 50.0f, 2);
        Product banana = new Product("banana", 30.0f, 6);
        ProductList productList = new ProductList();
        productList.addProduct(apple);
        productList.addProduct(banana);
        System.out.println(productList);

        productList.removeProduct(banana.getProduct());
        System.out.println(productList);

    }


    public static void tackNumber() {
        Random random = new Random();
        Set<Integer> numbers = new HashSet<>(20);
        while (numbers.size() < 20) {
            numbers.add(random.nextInt(1000+1));
        }

        System.out.println(numbers);
        Iterator<Integer> iterator =numbers.iterator();
        while (iterator.hasNext()) {
            int numberIter = iterator.next();
            if (numberIter%2 != 0 ) {
                iterator.remove();
            }
        }
        System.out.println(numbers);

    }
}