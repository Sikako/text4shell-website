package net.sikako.album.controller;
import org.apache.commons.text.StringSubstitutor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ResultController {
    @GetMapping("/result")
    public String sploit(
                         @RequestParam(defaultValue = "") String s,
                         @RequestParam(defaultValue = "false", required = false) String u,
                         Model model) {
        String prefix = s;
        String title = interpolate(prefix);

        model.addAttribute("t", title);
        model.addAttribute("u", u);
        return "result";
        
    }
    private String interpolate(String input) {
        final StringSubstitutor interpolator = StringSubstitutor.createInterpolator();
        String out = interpolator.replace(input);
        return out;
    }
}