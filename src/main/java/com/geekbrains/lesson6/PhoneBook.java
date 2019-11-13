package com.geekbrains.lesson6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    private HashMap<String, List<String>> items;
    PhoneBook(){
        items = new HashMap<>();
    }
    public void add(String name, String phone){
        List<String> phones = items.get(name);
        if (phones==null){
            phones = new ArrayList<>();
            items.put(name, phones);
        }
        phones.add(phone);
    }
    public List<String> get(String name){
        return items.get(name);
    }

    @Override
    public String toString() {
        return items.toString();
    }
}
