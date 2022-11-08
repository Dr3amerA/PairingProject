package com.Pairing.PairingProject;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class NameCountService {

     private ArrayList<String> names = new ArrayList<>();

     public String countNames(String name, String language){

         if (name.isEmpty()) {
             return "";
         }
         String lowerName = name.toLowerCase();

         names.add(lowerName);
         int count = 0;

         for (String string : names){
             if (string.equals(lowerName)){
                count++;
             }
         }

         String countString = "";
         return countString = langCounter(name, language, count);

     }


     public String langCounter(String name, String language, int count){

         if (language.equals("en") || language.isEmpty()) {
             return "Times called for " + name + ": " + count + ".";
         } else if (language.equals("el")) {
             return "Το όνομα " + name + " εμφανίζεται " + count + " φορές.";
         } else if (language.equals("es")) {
             return "El nombre " + name + " se aparece " + count + " veces.";
         } else {
             return "";
         }
     }
}
