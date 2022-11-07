package com.Pairing.PairingProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OurPairingController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam String name, String food){
        return "This is our pairing website. Welcome " + name + "! The recommended food of the day is " + food;
    }
}
