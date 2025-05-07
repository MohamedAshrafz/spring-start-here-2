package start.here.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import start.here.Models.Product;
import start.here.services.ProductServices;

@Controller
public class MainController {

    private final ProductServices productServices;

    public MainController(ProductServices productServices) {
        this.productServices = productServices;
    }

    @GetMapping("/products")
    private String getProducts(Model model) {
        model.addAttribute("products", productServices.getAllProducts());

        return "products.html";
    }

    @PostMapping("/products")
    private String addProduct(
            @RequestParam String name,
            @RequestParam float price,
            Model model
    ) {
        Product newProduct = new Product(name, price);
        productServices.insertProduct(newProduct);

        model.addAttribute("products", productServices.getAllProducts());

        return "products.html";
    }

    @PostMapping("/deleteProduct")
    private String removeProduct(
            @RequestParam String uuid,
            Model model
    ) {
        productServices.removeProductWithUUID(uuid);

        model.addAttribute("products", productServices.getAllProducts());

        return "products.html";
    }
}
