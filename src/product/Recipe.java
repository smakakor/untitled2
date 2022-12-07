package product;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Recipe {

    private final String name;
    private final Map<Product,  Integer> products = new HashMap<>();

    public Recipe(String name) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Не заполнены все поля");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addProduct(Product product, int amount) {
        if (amount<=0) {
            amount = 1;
        }
        if (this.products.containsKey(product)) {
            this.products.put(product, this.products.get(product) + amount);
        } else {
            this.products.put(product, amount);
        }
    }

    public float getRecipePrice() {
        float sum = 0;
        for (Map.Entry<Product, Integer> product : this.products.entrySet()) {
            sum += product.getKey().getPrice() * product.getValue();
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}

