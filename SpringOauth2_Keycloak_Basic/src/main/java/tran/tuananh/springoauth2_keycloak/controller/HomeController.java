package tran.tuananh.springoauth2_keycloak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("")
    public String home() {
        return "home";
    }
}