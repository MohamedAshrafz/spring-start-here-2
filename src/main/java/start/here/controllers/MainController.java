package start.here.controllers;

import jakarta.websocket.server.PathParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {

    @RequestMapping("/abc/{name}") // Or @GetMapping("/abc") is often preferred for GET requests
    public String abc(Model page,
                      @PathVariable("name") String name, // using path parameter instead of query parameter
                      @RequestParam(required = false) String color // using query parameter
                      // and you may make it not required
    ) {
        // Existing attributes
        page.addAttribute("username", name);
        page.addAttribute("color", color);

        // 1. Create the list of hobbies
        List<String> hobbies = Arrays.asList("Reading", "Hiking", "Coding", "Gaming");
        // Alternatively:
        // List<String> hobbies = new ArrayList<>();
        // hobbies.add("Reading");
        // hobbies.add("Hiking");
        // hobbies.add("Coding");
        // hobbies.add("Gaming");


        // 2. Add the list to the model with a key (e.g., "hobbies")
        page.addAttribute("hobbies", hobbies);

        // 3. Return the view name
        return "home.html"; // Or just "home" if you have view resolvers configured
    }
}
