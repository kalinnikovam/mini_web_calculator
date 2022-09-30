package springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Objects;

@Controller
public class FirstController {

    @GetMapping("/calculator")
    public String calculator(@RequestParam(value = "a", required = false) int a,
                             @RequestParam(value = "b", required = false) int b,
                             @RequestParam(value = "action", required = false) String action,
                             Model model) {
        double result = 0;
        if (action != null) {
            switch (action) {
                case "multiplication":
                    result = a * b;
                    model.addAttribute("result", "result is " + result);
                    break;
                case "addition":
                    result = a + b;
                    model.addAttribute("result", "result is " + result);
                    break;
                case "subtraction" :
                    result = a - b;
                    model.addAttribute("result", "result is " + result);
                    break;
                case "division":
                    result = a / (double) b;
                    model.addAttribute("result", "result is " + result);
                    break;
            }
        }

        return "first/calculator";
    }

}
