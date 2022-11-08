package com.Pairing.PairingProject;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class NameCountService {

     private ArrayList<String> names = new ArrayList<>();

     public int countNames(String name){
         names.add(name);
         int count = 0;

         for (String string : names){
             if (string.equals(name)){
                count++;
             }
         }
         return count;
     }
}
