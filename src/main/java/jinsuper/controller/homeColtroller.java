package main.java.jinsuper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeColtroller {

    @RequestMapping(value = "/home")
    public String showHome(){
        return "home";
    }
}
