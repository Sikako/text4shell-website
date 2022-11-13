package net.sikako.album.controller;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.apache.commons.text.StringSubstitutor;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(

    ) {
        return "index";
    }
}
