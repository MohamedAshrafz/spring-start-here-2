package start.here.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("abc")
    public String abc() {
        return "home.html";
    }
}
