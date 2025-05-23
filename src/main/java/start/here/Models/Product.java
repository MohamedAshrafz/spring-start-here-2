package start.here.Models;

import java.util.UUID;

public class Product {

    private String uuid;
    private String name;
    private float price;

    public Product(String name, float price) {
        this.uuid = String.valueOf(UUID.randomUUID());

        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getUuid() {
        return uuid;
    }
}
