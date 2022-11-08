package com.Pairing.PairingProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

public class GreetingsControllerService {
    private LangService langService;
    private NameCountService nameCountService;

    @Autowired
    public void GreetingsControllerService(NameCountService nameCountService, LangService langService) {
        this.nameCountService = nameCountService;
        this.langService = langService;
    }

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
    public String greetings(@RequestParam String name, String language) {
        String greetings = langService.translate(name, language);
        return greetings;
    }
}
