package com.Pairing.PairingProject;

import org.springframework.stereotype.Service;

@Service
public class LangService {

    public String translate(String name, String language){
        if (name.isEmpty()) {
            return "Please give me your name";
        }
        int count = nameCountService.countNames(name);
        if (language.equals("en") || language.isEmpty()) {
            return "My name is " + name + ".";
        } else if (language.equals("el")) {
            return "Με λένε " + name + ".";
        } else if (language.equals("es")) {
            return "Me llamo " + name + ".";
        } else {
            return "Does not compute. Please try again";
        }
    }
}
