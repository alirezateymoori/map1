package com.demisco;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 20);
        map.put("Shahname", 30);
        map.put("Golestan", 25);
        map.put("Golestan", 40);
        map.put("Shahname", 45);
        Set<String> set = map.keySet();
        for (String key : set) {
            System.out.println(key + " : " + map.get(key));
        }


    }
}