package start.here.services;

import org.springframework.stereotype.Service;
import start.here.Models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class ProductServices {
    List<Product> productList = new ArrayList<>();

    public List<Product> getAllProducts() {
        return productList;
    }

    public boolean insertProduct(Product product) {
        return productList.add(product);
    }

    public boolean removeProductWithUUID(String productUUID) {
        return productList.removeIf((Product p) -> Objects.equals(productUUID, p.getUuid()));
    }
}
