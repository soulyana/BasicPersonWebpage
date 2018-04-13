package me.soulyana.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping("/")
    public String loadFormPage(Model model) {
        model.addAttribute("basicperson", new BasicPerson());
        return "basicpersonform";
    }

    @RequestMapping("/processBasicPerson")
    public String loadFromPage(@ModelAttribute BasicPerson basicPerson, Model model) {
        model.addAttribute("basicperson", basicPerson);
        return "confirmbasicperson";
    }
}
