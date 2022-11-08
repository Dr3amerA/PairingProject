package com.Pairing.PairingProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingsControllerService {
    private LangService langService;
    private NameCountService nameCountService;

    @Autowired
    public void GreetingsControllerService(NameCountService nameCountService, LangService langService) {
        this.nameCountService = nameCountService;
        this.langService = langService;
    }

    @GetMapping("/greetings")
    @ResponseBody
    public String post(){
        return "<form action=\"/hi\" method=\"POST\">\n" +
                "<input name=\"name\" placeholder=\"Your name\">\n" +
                "<input name=\"language\" placeholder=\"language\">\n" +
                "<button>Go</button>\n" +
                "</form>";
    }

    @PostMapping("/hi")
    @ResponseBody
    public String greetings(@RequestParam String name, String language) {
        String greetings = langService.translate(name, language);


        return greetings;
    }
}
