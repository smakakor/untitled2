package product;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProductList {
    private final Set<Product> products = new HashSet<>();


    public void addProduct(Product product) throws ProductAlreadyExistsException {
        if (product == null) {
            return;
        }
        if (this.products.contains(product)) {
            throw new ProductAlreadyExistsException();
        } else {
            this.products.add(product);
        }
    }


    public void removeProduct(String name) {
        Iterator<Product> productIterator = this.products.iterator();
        while (productIterator.hasNext()) {
            if (productIterator.next().getProduct().equals(name)) {
                productIterator.remove();
            }
            break;
        }
    }

    @Override
    public String toString() {
        return "ProductList{" +
                "products=" + products +
                '}';
    }
}
