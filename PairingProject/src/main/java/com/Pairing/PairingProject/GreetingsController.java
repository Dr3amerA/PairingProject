package com.Pairing.PairingProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingsController {

    @GetMapping("/")
    @ResponseBody
    public String post(){
        return "<form action=\"/greetings\" method=\"POST\">\n" +
                "<input name=\"name\" placeholder=\"Your name\">\n" +
                "<input name=\"language\" placeholder=\"language\">\n" +
                "<button>Go</button>\n" +
                "</form>";
    }

    @PostMapping("/greetings")
    @ResponseBody
    public String greetings(@RequestParam String name, String language){
        if (name.isEmpty()){
            return "Please give me your name";
        }

        if (language.equals("en") || language.isEmpty()){
            return "My name is " + name + ".";
        } else if (language.equals("el")){
            return "Με λένε " + name + ".";
        } else if (language.equals("es")){
            return "Me llamo " + name + ".";
        } else {
            return "Does not compute. Please try again";
        }
    }

}
